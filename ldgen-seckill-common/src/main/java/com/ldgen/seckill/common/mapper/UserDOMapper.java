package com.ldgen.seckill.common.mapper;

import com.ldgen.seckill.common.dataobject.UserDO;

public interface UserDOMapper {
    /**
     * 根据主键ID删除用户记录
     *
     * @param id 用户主键ID
     * @return 受影响的行数
     */
    int deleteByPrimaryKey(Long id);

    /**
     * 插入用户记录（包含所有字段）
     * <p>即使字段值为null也会插入</p>
     *
     * @param record 用户数据对象，包含昵称、密码、手机号、头像、状态等信息
     * @return 受影响的行数
     */
    int insert(UserDO record);

    /**
     * 插入用户记录（选择性插入）
     * <p>只插入非null字段，null字段将被忽略</p>
     *
     * @param record 用户数据对象，包含需要插入的字段
     * @return 受影响的行数
     */
    int insertSelective(UserDO record);

    /**
     * 根据主键ID查询用户信息
     *
     * @param id 用户主键ID
     * @return 用户数据对象，包含用户的完整信息；如果不存在则返回null
     */
    UserDO selectByPrimaryKey(Long id);

    /**
     * 根据主键选择性更新用户记录
     * <p>只更新非null字段，null字段不会被更新</p>
     *
     * @param record 用户数据对象，必须包含id字段，其他需要更新的字段设置为非null值
     * @return 受影响的行数
     */
    int updateByPrimaryKeySelective(UserDO record);

    /**
     * 根据主键更新用户记录（包含所有字段）
     * <p>所有字段都会被更新，包括null值</p>
     *
     * @param record 用户数据对象，必须包含id字段，其他字段无论是否为null都会被更新
     * @return 受影响的行数
     */
    int updateByPrimaryKey(UserDO record);

    /**
     * 根据手机号查询用户 ID（仅判断手机号是否已注册，不返回完整用户信息）
     *
     * @param mobile
     * @return
     */
    Long selectIdByMobile(String mobile);

    /**
     * 根据手机号查询用户信息
     *
     * @param mobile
     * @return
     */
    UserDO selectByMobile(String mobile);
}