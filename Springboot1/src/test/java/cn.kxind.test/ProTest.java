package cn.kxind.test;

import cn.kxind.configure.MyWebConfig;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.internal.exceptions.ExceptionIncludingMockitoWarnings;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by Administrator on 2016/12/8.
 */
/*
springboot进行单元测试
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class ProTest {
    @Value("${test.msg}")
    private String msg;
    @Autowired
    private MyWebConfig myWebConfig;
@Test
    public  void test() throws Exception{
        System.out.println("=中文+"+msg);
        System.out.println("=="+myWebConfig.getTitle());
    }
}
