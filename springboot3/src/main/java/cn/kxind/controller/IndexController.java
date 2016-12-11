package cn.kxind.controller;

import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.HashMap;

/**
 * Created by Administrator on 2016/12/11.
 */
@RestController
public class IndexController {


    @Value(value = "${kxind.number}")
    private  String id;

     @Value(value ="${kxind.desc}")
     private  String desc;

     @Value(value = "${kxind.secret}")
     private  String  secret;

    @RequestMapping()
    public  String index(){
        return  "hello world";
    }
    //简单类型绑定，返回一个map 类似于json
    @RequestMapping(value = "/get")
    public HashMap<String,Object> get(@RequestParam String name){
        HashMap<String,Object> map=new HashMap<String,Object>();
        map.put("title","hello world");
        map.put("name",name);
        map.put("secret",secret);
        map.put("id",id);
        map.put("desc",desc);
      return  map;
    }
    //@PathVariable 获得请求url中的动态参数
    @RequestMapping(value = "/get/{id}/{name}")
    public cn.kxind.bean.User getUser(@PathVariable int id,@PathVariable String name)
    {
        cn.kxind.bean.User user=new cn.kxind.bean.User();
        user.setDate(new Date());
        user.setName(name);
        user.setId(id);
        return  user;
    }






}
