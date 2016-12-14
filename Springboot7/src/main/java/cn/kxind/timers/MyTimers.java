package cn.kxind.timers;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Administrator on 2016/12/14.
 */
@Component
public class MyTimers {
    SimpleDateFormat sdf=new SimpleDateFormat("HH:mm:ss");
    //每三秒执行一次
    @Scheduled(fixedRate = 3000)
    public void timerRate(){
        System.out.println(sdf.format(new Date()));
    }

    //第一次延迟1秒执行，当执行完后3秒再执行
   @Scheduled(initialDelay = 1000,fixedDelay = 3000)
    public  void timerInit(){
        System.out.println("init :"+sdf.format(new Date()));
    }
    //每天23点27分50秒时执行
    @Scheduled(cron=" 50 27 23 * * ?")
    public  void timerCron(){
        System.out.println("每执行时间"+sdf.format(new Date()));
    }

}
