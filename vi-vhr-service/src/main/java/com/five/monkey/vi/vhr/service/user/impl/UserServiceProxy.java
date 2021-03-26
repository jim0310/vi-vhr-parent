package com.five.monkey.vi.vhr.service.user.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.five.monkey.vi.vhr.common.vo.user.UserVo;
import com.five.monkey.vi.vhr.service.user.UserService;

/**
 * @author jim
 * @date 2021/3/25 17:59
 */
@Service("userServiceProxy")
public class UserServiceProxy implements UserService {

	@Autowired
	@Qualifier("userServiceImpl")
	private UserService			userServiceImpl;

	@Autowired
	private StringRedisTemplate	stringRedisTemplate;

	@Override
	public List<UserVo> list(int start, int length) {
		return userServiceImpl.list(start, length);
	}

	@Override
	@Transactional(rollbackFor = Exception.class)
	public UserVo insertSelective(UserVo userVo) {
		return userServiceImpl.insertSelective(userVo);
	}
}
