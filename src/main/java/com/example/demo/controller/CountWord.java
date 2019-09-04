package com.example.demo.controller;


import com.example.demo.model.ParkUser;
import org.apache.lucene.analysis.tokenattributes.CharTermAttribute;
import org.wltea.analyzer.core.IKSegmenter;
import org.wltea.analyzer.core.Lexeme;

import java.io.*;
import java.net.URL;
import java.util.*;

/**
 * 统计一个文件中各词出现的频率，并打印出前10位
 *
 * @author ZHUKE
 *
 */
public class CountWord {
    /**
     * @Description 获得高频词汇集合
     * @Date 2018/3/9 11:28
     * @Param [text 要分词的文本]
     * @Return java.util.Map<java.lang.String, java.lang.Integer>
     * @Throws IOException
     */
//    public static Map<String, Integer> getHighFrequencyVocabularyMap(String text) throws IOException {
//
//        Analyzer anal = new IKAnalyzer(true);
//
//        StringReader reader = new StringReader(text);
//
//        TokenStream ts = anal.tokenStream("", reader);
//        ts.reset();
//        CharTermAttribute term = ts.getAttribute(CharTermAttribute.class);
//
//        Map<String, Integer> map = new HashMap<>();
//
//        while (ts.incrementToken()) {
//            map.put(term.toString(), map.containsKey(term.toString()) ? map.get(term.toString()) + 1 : 1);
//        }
//
//        reader.close();
//
//        return map;
//    }
    public static void main(String[] args) throws Exception {
        System.out.println(mapSort(getHighFrequencyVocabulary("D:\\code\\demo\\src\\main\\resources\\IKAnalyzer\\test.txt")));
        segment("我爱中国");
    }
    /**
     * 对语句进行分词
     *
     * @param text 语句
     * @return 分词后的集合
     * @throws IOException
     */
    private static List segment(String text) throws IOException {
        List<String> list = new ArrayList<>();
        StringReader re = new StringReader(text);
        IKSegmenter ik = new IKSegmenter(re, true);
        Lexeme lex;
        while ((lex = ik.next()) != null) {
            list.add(lex.getLexemeText());
            System.out.println(list);
        }
        return list;
    }

    /**
     * @Description 获得高频词汇
     * @Date 2018/3/9 11:30
     * @Param [list 要分词的语句]
     * @Return java.util.Map<java.lang.String, java.lang.Integer>
     * @Throws Exception
     */
    public static Map<String, Integer> getHighFrequencyList(List<ParkUser> list) throws Exception {

        StringBuilder sb = new StringBuilder();
        list.stream().forEach(s->{
            sb.append(s.getNickname());
        });

        Map<String, Integer> map = new HashMap<>();

        StringReader re = new StringReader(sb.toString());

        //其中IKSegmenter是分词的主要类,构造函数ture代表只能分词，改成false则为最细粒度分词
        IKSegmenter ik = new IKSegmenter(re, true);
        Lexeme lex;
        while ((lex = ik.next()) != null) {
            map.put(lex.getLexemeText(), map.containsKey(lex.getLexemeText()) ? map.get(lex.getLexemeText()) + 1 : 1);
        }
        return map;
    }

    /**
     * @Description 获得高频词汇
     * @Date 2018/3/9 11:30
     * @Param [fileName 要分词的文件]
     * @Return java.util.Map<java.lang.String, java.lang.Integer>
     * @Throws Exception
     */
    public static Map<String, Integer> getHighFrequencyVocabulary(String fileName) throws Exception {

        StringBuilder sb = new StringBuilder();

        BufferedReader in = new BufferedReader(new InputStreamReader(new FileInputStream(new File(fileName)), "UTF8"));

        String str;
        while ((str = in.readLine()) != null) {
            sb.append(str);
        }
        in.close();

        Map<String, Integer> map = new HashMap<>();

        StringReader re = new StringReader(sb.toString());

        //其中IKSegmenter是分词的主要类,构造函数ture代表只能分词，改成false则为最细粒度分词
        IKSegmenter ik = new IKSegmenter(re, true);
        Lexeme lex;
        while ((lex = ik.next()) != null) {
            map.put(lex.getLexemeText(), map.containsKey(lex.getLexemeText()) ? map.get(lex.getLexemeText()) + 1 : 1);
        }
        return map;
    }


    public static List<Map.Entry<String, Integer>> mapSort(Map<String, Integer> map) {

        List<Map.Entry<String, Integer>> list = new ArrayList<>(map.entrySet());

        //然后通过比较器来实现排序

        //升序排序  使用IKAnalyzer中文分词器进行分词统计词频
        //list.sort(Comparator.comparing(Map.Entry::getValue));
        //list.sort(Comparator.comparingInt(Map.Entry::getValue));

        //降序排序
        list.sort((e1, e2) -> e2.getValue() - e1.getValue());

        return list;
    }
}
