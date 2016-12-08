package cn.kxind.configure;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Controller;

/**
 * Created by Administrator on 2016/12/8.
 */
@ConfigurationProperties(locations = "classpath:config/my-web.properties",prefix = "web")
@Controller
public class MyWebConfig {
    private String name;
    private String version;
    private String author;
    private String title;

    public String getName() {
        return name;
    }

    public String getVersion() {
        return version;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
