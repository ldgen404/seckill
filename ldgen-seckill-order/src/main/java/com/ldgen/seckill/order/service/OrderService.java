package com.ldgen.seckill.order.service;

import com.ldgen.seckill.common.utils.Response;
import com.ldgen.seckill.order.model.vo.DoSeckillReqVO;
import com.ldgen.seckill.order.model.vo.DoSeckillRspVO;

/**
 * @Author: 犬小哈
 * @Date: 2026/5/8 10:00
 * @Version: v1.0.0
 * @Description: 订单模块业务
 **/
public interface OrderService {

    /**
     * 秒杀下单
     *
     * @param reqVO
     * @return
     */
    Response<DoSeckillRspVO> doSeckill(DoSeckillReqVO reqVO);
}
