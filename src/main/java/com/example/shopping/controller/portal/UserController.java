package com.example.shopping.controller.portal;

import com.example.shopping.common.Const;
import com.example.shopping.common.ServerResponse;
import com.example.shopping.pojo.User;
import com.example.shopping.service.IUserService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

@RestController
@RequestMapping("/user")
public class UserController {
    @Resource
    IUserService userService;
    /**
     * 登录
     */
    @RequestMapping("/login.do")
    public ServerResponse login(HttpSession session, String username, String password){
        ServerResponse serverResponse = userService.login(username,password);
        if(serverResponse.isSuccess()){
            User user = (User)serverResponse.getData();
            session.setAttribute(Const.CURRENTUSER,user);
        }
        return serverResponse;
    }
}
