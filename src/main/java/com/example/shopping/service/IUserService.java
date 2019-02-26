package com.example.shopping.service;

import com.example.shopping.common.ServerResponse;

public interface IUserService {
    /*登录接口*/
    ServerResponse login(String username,String password);
}
