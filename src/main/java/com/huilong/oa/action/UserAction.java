package com.huilong.oa.action;

import com.huilong.oa.entity.UserEntity;
import com.huilong.oa.service.UserService;
import com.opensymphony.xwork2.ActionSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

@Controller("userAction")
@Scope("prototype")
public class UserAction extends ActionSupport {
    private UserEntity userEntity;
    private int  id;
    private String name;

    public UserService getUserService() {
        return userService;
    }

    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMessage1() {
        return message1;
    }

    public void setMessage1(int message1) {
        this.message1 = message1;
    }

    public String getMessage2() {
        return message2;
    }

    public void setMessage2(String message2) {
        this.message2 = message2;
    }

    private int message1;
    private String message2;
    @Autowired
     private UserService userService;

     public String saveUser(){
     userEntity=new UserEntity(id,name);
     message1=id;
     message2=name;
     userService.save(userEntity);

      return SUCCESS;
    }

    public UserEntity getUserEntity() {
        return userEntity;
    }

    public void setUserEntity(UserEntity userEntity) {
        this.userEntity = userEntity;
    }

}
