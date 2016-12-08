package cn.kxind.controller;

import cn.kxind.configure.MyWebConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2016/12/8.
 */
@RestController
@RequestMapping(value = "config")
public class ConfigController {
    @Autowired
    private MyWebConfig myWebConfig;
    @RequestMapping(value ="index",method = RequestMethod.GET)
    public  String index(){
        return "webName"+myWebConfig.getName()+",wenVersion"+myWebConfig.getVersion()
                +",webTitle"+myWebConfig.getTitle();
    }
}
