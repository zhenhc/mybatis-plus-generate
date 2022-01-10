package com.hong.generate.generatedemo.demo.service.impl;

import com.hong.generate.generatedemo.demo.entity.User;
import com.hong.generate.generatedemo.demo.dao.UserMapper;
import com.hong.generate.generatedemo.demo.service.UserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author liyh
 * @since 2020-12-22
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

}
