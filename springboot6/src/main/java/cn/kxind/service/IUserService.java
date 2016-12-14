package cn.kxind.service;

import cn.kxind.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by Administrator on 2016/12/13.
 */
public interface IUserService extends JpaRepository<User, Integer> {
    User findById(Integer id);

    User findByUserName(String userName);

    User findByUserNameAndPassword(String username);

    List<User> findByUserNameLike(String username);

    List<User> findByUserNameNotLike(String username);

    List<User> findByUserNameNot(String username);

    @Query("FROM User  AS u WHERE  u.userName=?1 AND u.password IS NOT NULL")
    List<User> findAll(String  userName);

    @Query("update User as u set u.password=?2 where u.userName=?1")
    @Modifying    //spring data jpa  更改某个用户
    @Transactional
    void updatePwd(String userName,String pwd);


    @Query("delete  from User u where u.userName=?1")
    @Modifying      //spring data jpa  删除某个用户
    @Transactional
    void deleteByUserName(String userName);
    @Query("UPDATE  User u SET u.email=:email where u.userName=:user")
    void updateEmail(@Param("user") String userName,@Param("email") String email);


}
