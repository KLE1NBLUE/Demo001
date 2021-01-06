package com.zane.demo01.user.controller;

import com.zane.demo01.user.entity.UserEntity;
import com.zane.demo01.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

//重定向技术
@Controller
@RequestMapping("user")
public class UserController {

    @Autowired
    UserService userService;

    @ResponseBody
    @RequestMapping("/getAll")
    public List<UserEntity> getAll(Map map) {
        return userService.getAll(map);
    }

    @RequestMapping("/delById")
    public String delById(Integer id) {
        userService.delById(id);
        //重定向回首页
        return "redirect:/index.html";
    }

    //保存用户
    @RequestMapping("/save")
    @ResponseBody//
    public String save(@RequestBody  UserEntity userEntity){
        userService.save(userEntity);
        return "success";
    }
}

