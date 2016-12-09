package cn.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by Administrator on 2016/12/9.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@ActiveProfiles("test")
public class MyTest2 {
    @Value("${test.msg}")
    private  String msg;
    @Test
    public  void testConfig(){
        System.out.println("cur msg is :"+msg);
    }

}
