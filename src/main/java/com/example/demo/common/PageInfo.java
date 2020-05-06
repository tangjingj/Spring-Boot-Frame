package com.example.demo.common;

import lombok.Data;
import org.springframework.data.domain.Page;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;

/*
 *@name: PageInfo
 *@description: 分页设置
 *@author: tjj
 *@time: 2020/5/6 14:38
 */
@SuppressWarnings({"rawtypes", "unchecked"})
@Data
public class PageInfo<T> implements Serializable {
    private static final long serialVersionUID = 1L;
    //当前页
    private int current;
    //每页的数量
    private int size;
    //总记录数
    private long total;
    //总页数
    private int pages;
    //结果集
    private List<T> records;
    //是否为第一页
    private boolean isFirstPage = false;
    //是否为最后一页
    private boolean isLastPage = false;


    public PageInfo() {
    }

    /**
     * 包装Page对象
     *
     * @param records
     */
    public PageInfo(List<T> records) {
        if (records instanceof Page) {
            Page page = (Page) records;
            this.current = page.getNumber();
            this.size = page.getSize();

            this.pages = page.getNumberOfElements();
            this.records = page.getContent();
            this.total = page.getTotalPages();
        } else if (records instanceof Collection) {
            this.current = 1;
            this.size = records.size();

            this.pages = 1;
            this.records = records;
            this.total = records.size();
        }
        if (records instanceof Collection) {
            //判断页面边界
            judgePageBoudary();
        }
    }

    /**
     * 判定页面边界
     */
    private void judgePageBoudary() {
        isFirstPage = current == 1;
        isLastPage = current == pages;
    }

}

