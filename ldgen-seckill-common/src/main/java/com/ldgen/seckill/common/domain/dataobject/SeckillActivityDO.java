package com.ldgen.seckill.common.domain.dataobject;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

/**
 * @Author: ldgen
 * @Date: 2026/4/29 10:00
 * @Version: v1.0.0
 * @Description: 秒杀活动表 DO
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class SeckillActivityDO {
    private Long id;

    private String activityName;

    private LocalDateTime beginTime;

    private LocalDateTime endTime;

    private Integer status;

    private String description;

    private LocalDateTime createTime;

    private LocalDateTime updateTime;
}
