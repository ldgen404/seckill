package com.ldgen.seckill.common.domain.mapper;

import com.ldgen.seckill.common.domain.dataobject.SeckillGoodsDO;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SeckillGoodsDOMapper {

    /**
     * 根据主键 ID 删除秒杀商品
     * @param id
     * @return
     */
    int deleteByPrimaryKey(Long id);

    /**
     * 插入秒杀商品信息
     * @param record
     * @return
     */
    int insert(SeckillGoodsDO record);

    /**
     * 插入秒杀商品信息（仅插入非空字段）
     * @param record
     * @return
     */
    int insertSelective(SeckillGoodsDO record);

    /**
     * 根据主键 ID 查询秒杀商品
     * @param id
     * @return
     */
    SeckillGoodsDO selectByPrimaryKey(Long id);

    /**
     * 根据活动 ID 查询该活动下的秒杀商品列表（按 sort 排序）
     *
     * @param activityId
     * @return
     */
    List<SeckillGoodsDO> selectByActivityId(@Param("activityId") Long activityId);

    /**
     * 根据活动 ID 和商品 ID 查询秒杀商品
     *
     * @param activityId
     * @param goodsId
     * @return
     */
    SeckillGoodsDO selectByActivityIdAndGoodsId(@Param("activityId") Long activityId,
                                                @Param("goodsId") Long goodsId);

    /**
     * 根据活动 ID 查询秒杀商品的库存（仅查询 id 和 seckill_stock 字段）
     *
     * @param activityId
     * @return
     */
    List<SeckillGoodsDO> selectStockByActivityId(@Param("activityId") Long activityId);

    /**
     * 根据活动 ID 和商品 ID 查询秒杀商品库存（仅查询 id 和 seckill_stock 字段）
     *
     * @param activityId
     * @param goodsId
     * @return
     */
    SeckillGoodsDO selectStockByActivityIdAndGoodsId(@Param("activityId") Long activityId,
                                                     @Param("goodsId") Long goodsId);

    /**
     * 根据主键 ID 更新秒杀商品信息（仅更新非空字段）
     * @param record
     * @return
     */
    int updateByPrimaryKeySelective(SeckillGoodsDO record);

    /**
     * 根据主键 ID 更新秒杀商品信息
     * @param record
     * @return
     */
    int updateByPrimaryKey(SeckillGoodsDO record);

    /**
     * 扣减秒杀库存
     *
     * @param id 秒杀商品关联表主键 ID
     * @return 影响行数
     */
    int deductStock(@Param("id") Long id);
}