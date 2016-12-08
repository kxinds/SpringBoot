package cn.kxind.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.couchbase.CouchbaseProperties;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2016/12/8.
 */
@RestController
public class WebController {
    @Value("${test.msg}")
    private String msg;

    @RequestMapping(value = "index",method = RequestMethod.GET)
     private  String index(){
        System.out.println(msg);
        return "The Way 1"+msg;
    }

    @Autowired
    private Environment en;

    @RequestMapping(value = "index2",method = RequestMethod.GET)
    public  String index2(){
        System.out.println(en.getProperty("test.msg"));
        return  "The Way 2:"+en.getProperty("test.msg");
    }

}
