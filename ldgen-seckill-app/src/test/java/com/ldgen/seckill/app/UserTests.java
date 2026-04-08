package com.ldgen.seckill.app;
import com.ldgen.seckill.common.dataobject.UserDO;
import com.ldgen.seckill.common.mapper.UserDOMapper;import jakarta.annotation.Resource;import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDateTime;


@SpringBootTest
class UserTests {

    @Resource
    private UserDOMapper userDOMapper;


    /**
     * 添加一条用户记录
     */
    @Test
    void testInsertUser() {
        userDOMapper.insert(UserDO.builder()
                        .nickname("ldgen")
                        .password("123456")
                        .mobile("18019988888")
                        .status(1)
                        .createTime(LocalDateTime.now())
                        .updateTime(LocalDateTime.now())
                        .build());
    }

}
