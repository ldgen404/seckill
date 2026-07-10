package com.ldgen.seckill.goods.service;

import com.ldgen.seckill.common.utils.Response;
import com.ldgen.seckill.goods.model.vo.FindSeckillGoodsListReqVO;
import com.ldgen.seckill.goods.model.vo.FindSeckillGoodsListRspVO;

import java.util.List;

public interface GoodsService {

    Response<List<FindSeckillGoodsListRspVO>> findSeckillGoodsList(FindSeckillGoodsListReqVO reqVO);

}
