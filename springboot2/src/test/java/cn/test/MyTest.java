package cn.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by Administrator on 2016/12/9.
 */
@SpringBootConfiguration
@RunWith(SpringRunner.class)
@SpringBootTest
public class MyTest {
    @Value("${test.msg}")
    private  String msg;

    @Test
    public  void testConfig(){
        System.out.println("cur msg is :"+msg);
    }

}
