package com.ldgen.seckill.goods.service;

import com.ldgen.seckill.common.utils.Response;
import com.ldgen.seckill.goods.model.vo.FindSeckillGoodsDetailReqVO;
import com.ldgen.seckill.goods.model.vo.FindSeckillGoodsDetailRspVO;
import com.ldgen.seckill.goods.model.vo.FindSeckillGoodsListReqVO;
import com.ldgen.seckill.goods.model.vo.FindSeckillGoodsListRspVO;

import java.util.List;

public interface GoodsService {

    /**
     * 根据条件查询秒杀商品列表
     * @param reqVO 查询秒杀商品列表入参
     * @return 秒杀商品列表
     */
    Response<List<FindSeckillGoodsListRspVO>> findSeckillGoodsList(FindSeckillGoodsListReqVO reqVO);

    /**
     * 根据条件查询秒杀商品详情
     * @param reqVO  查询秒杀商品详情入参
     * @return 秒杀商品详情
     */
    Response<FindSeckillGoodsDetailRspVO> findSeckillGoodsDetail(FindSeckillGoodsDetailReqVO reqVO);


    /**
     * 预热指定活动的商品缓存
     *
     * @param activityId
     * @return
     */
    Response<?> preheatActivityGoods(Long activityId);
}
