package com.ldgen.seckill.common.domain.mapper;

import com.ldgen.seckill.common.domain.dataobject.SeckillActivityDO;

public interface SeckillActivityDOMapper {

    /**
     * 根据主键获取秒杀活动
     *
     * @param id
     * @return
     */
    SeckillActivityDO selectByPrimaryKey(Long id);


}
