package com.ldgen.seckill.common.domain.mapper;

import com.ldgen.seckill.common.domain.dataobject.SeckillGoodsDO;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SeckillGoodsDOMapper {

    /**
     * 根据活动 ID 查询该活动下的秒杀商品列表（按 sort 排序）
     *
     * @param activityId
     * @return
     */
    List<SeckillGoodsDO> selectByActivityId(@Param("activityId") Long activityId);

}
