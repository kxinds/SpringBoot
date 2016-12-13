package cn.kxind.bean;

import java.util.Date;

/**
 * Created by Administrator on 2016/12/11.
 */
public class User {
     private  int id;
     private  String name;
     private Date date;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Date getDate() {
        return date;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
