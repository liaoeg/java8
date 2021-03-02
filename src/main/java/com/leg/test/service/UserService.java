package com.leg.test.service;

import com.leg.test.pojo.User;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author 廖恩光
 * @since 2021-01-22
 */
public interface UserService extends IService<User>  {
    List<User> query();
}
