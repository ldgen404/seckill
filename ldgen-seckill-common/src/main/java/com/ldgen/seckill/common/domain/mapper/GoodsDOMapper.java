package com.ldgen.seckill.common.domain.mapper;


import com.ldgen.seckill.common.domain.dataobject.GoodsDO;

import java.util.List;

public interface GoodsDOMapper {
    // 省略...
    
    /**
     * 根据主键批量查询商品
     */
    List<GoodsDO> selectByIds(List<Long> ids);

}
