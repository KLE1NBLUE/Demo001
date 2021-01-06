package com.zane.demo01.user.service;

import com.zane.demo01.user.entity.UserEntity;
import org.apache.catalina.User;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.Map;

public interface UserService {
    List<UserEntity> getAll(Map map);

    void delById(Integer id);

    //保存用户
    public void save(UserEntity userEntity);

    //根据id查询用户数据
    public UserEntity getUserById(Integer id);

    //根据id修改数据
    public void updateUserById (UserEntity userEntity);
}
