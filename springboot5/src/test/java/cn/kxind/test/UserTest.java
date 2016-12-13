package cn.kxind.test;

import cn.kxind.model.User;
import cn.kxind.service.IUserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * Created by Administrator on 2016/12/13.
 */


@SpringBootTest
@RunWith(SpringRunner.class)
@ActiveProfiles()
public class UserTest {
    @Autowired
    private IUserService userService;

    @Test
    public void  testAdd(){
        User user=new User();
        user.setEmail("kxind@gmail.com");
        user.setNick_name("kxind");
        user.setUserName("kx");
        userService.save(user);
    }

    @Test
    public  void  testFind(){
        User user=userService.findOne(1);
        System.out.println("nickName 是"+user.getNick_name());

    }
    @Test
    public  void testUpdate(){
        User user=userService.findOne(1);
        user.setNick_name("kexin");
        userService.save(user);
        System.out.println("nickName : "+user.getNick_name()+", email :"+user.getEmail() );
    }
    @Test
    public void  testDelete(){
        userService.delete(1);
    }
    @Test
    public void testAddBatch(){
        for (Integer i=0;i<5;i++){
            User user = new User();
            user.setNick_name("昵称"+i);
            user.setUserName("user"+i);
            user.setEmail("email"+i+"@domain.com");
            userService.save(user);
        }

    }
@Test
    public  void testFindAll(){
    List<User> List=userService.findAll();
    for (User u:List
         ) {
        System.out.println("nickName : "+u.getNick_name());

    }

}


}
