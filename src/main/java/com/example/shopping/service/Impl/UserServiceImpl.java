package com.example.shopping.service.Impl;

import com.example.shopping.common.ServerResponse;
import com.example.shopping.dao.UserMapper;
import com.example.shopping.pojo.User;
import com.example.shopping.service.IUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserServiceImpl implements IUserService {
    @Resource
    UserMapper userMapper;

    @Override
    public ServerResponse login(String username, String password) {

        /**
         * 1.参数的非空校验
         * 2.检查用户名是否存在
         * 3.根据用户名和密码查找用户信息
         * 4.返回结构
         * */
        //1.参数的非空校验
        if (username == null || username.equals("")){
            return ServerResponse.serverResponseByError("用户名不能为空");
        }
        if (password == null || password.equals("")){
            return  ServerResponse.serverResponseByError("密码不能为空");
        }

        //2.检查用户名是否存在
        int result = userMapper.selectByUsername(username);
        if (result == 0){
            return ServerResponse.serverResponseByError("用户名不存在");
        }

        //3.根据用户名和密码查找用户信息
       User user = userMapper.selectUserByUsernameAndPassword(username, password);
        if (user == null){
            return ServerResponse.serverResponseByError("密码错误");
        }

        //4.返回结果
        return ServerResponse.serverResponseBySuccess(user);
    }                                           
}
