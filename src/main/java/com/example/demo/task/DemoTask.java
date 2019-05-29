
package com.example.demo.task;


import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * 定时任务
 * @author TJj
 *
 */
//@Component
public class DemoTask {

    // 每分钟启动
//	@Scheduled(cron = "0 0/1 * * * ?")
    public void run() {
        System.out.println("这是一个定时任务每分钟执行一次");
    }
}
