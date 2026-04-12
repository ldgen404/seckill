package com.ldgen.seckill.user.controller;

import com.ldgen.seckill.common.aspect.ApiOperationLog;
import com.ldgen.seckill.common.utils.Response;
import com.ldgen.seckill.user.model.vo.LoginUserReqVO;
import com.ldgen.seckill.user.model.vo.LoginUserRspVO;
import com.ldgen.seckill.user.model.vo.RegisterUserReqVO;
import com.ldgen.seckill.user.service.UserService;
import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
@Slf4j
public class UserController {

    @Resource
    private UserService userService;

    /**
     * 用户注册
     * @param registerUserReqVO
     * @return
     */
    @PostMapping("/register")
    @ApiOperationLog(description = "用户注册")
    public Response<?> register(@Validated @RequestBody RegisterUserReqVO registerUserReqVO) {
        return userService.register(registerUserReqVO);
    }


    /**
     * 用户登录
     */
    @PostMapping("/login")
    @ApiOperationLog(description = "用户登录")
    public Response<LoginUserRspVO> login(@Validated @RequestBody LoginUserReqVO loginUserReqVO) {
        return userService.login(loginUserReqVO);
    }


}
