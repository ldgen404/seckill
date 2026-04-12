package com.ldgen.seckill.user.service;

import com.ldgen.seckill.common.utils.Response;
import com.ldgen.seckill.user.model.vo.LoginUserReqVO;
import com.ldgen.seckill.user.model.vo.LoginUserRspVO;
import com.ldgen.seckill.user.model.vo.RegisterUserReqVO;

/**
 *
 */
public interface UserService {

    /**
     * 用户注册
     * @param registerUserReqVO
     * @return
     */
    Response<?> register(RegisterUserReqVO registerUserReqVO);

    /**
     * 用户登录
     * @param loginUserReqVO
     * @return
     */
    Response<LoginUserRspVO> login(LoginUserReqVO loginUserReqVO);
}
