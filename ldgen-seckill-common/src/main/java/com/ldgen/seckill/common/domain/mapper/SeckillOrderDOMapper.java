package com.ldgen.seckill.common.domain.mapper;


import com.ldgen.seckill.common.domain.dataobject.SeckillOrderDO;

/**
* @author ldgen
* @description 针对表【t_seckill_order(秒杀订单表)】的数据库操作Mapper
* @createDate 2026-07-10 16:58:45
* @Entity generator.domain.SeckillOrder
*/
public interface SeckillOrderDOMapper {


    /**
     * 插入数据
     *
     * @param seckillOrderDO
     * @return
     */
    int insert(SeckillOrderDO seckillOrderDO);




}




