package com.ldgen.seckill.common.domain.mapper;

import com.ldgen.seckill.common.domain.dataobject.GoodsDetailDO;

public interface GoodsDetailDOMapper {
    /**
     * 根据商品 ID 查询商品详情
     */
    GoodsDetailDO selectByGoodsId(Long goodsId);
}
