package cn.kxind.service;

import cn.kxind.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Administrator on 2016/12/13.
 */
public interface IUserService extends JpaRepository<User,Integer> {



}
