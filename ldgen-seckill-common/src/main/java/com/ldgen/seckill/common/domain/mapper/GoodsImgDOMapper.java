package com.ldgen.seckill.common.domain.mapper;


import com.ldgen.seckill.common.domain.dataobject.GoodsImgDO;

import java.util.List;

public interface GoodsImgDOMapper {

    /**
     * 根据商品 ID 查询轮播图列表（按 sort 升序排列）
     */
    List<GoodsImgDO> selectByGoodsId(Long goodsId);

}
