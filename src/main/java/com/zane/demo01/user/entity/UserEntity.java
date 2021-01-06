package com.zane.demo01.user.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserEntity {
    private Integer id;
    private String password;
    private String username;
    private Date createtime;
    private Integer status;
}
