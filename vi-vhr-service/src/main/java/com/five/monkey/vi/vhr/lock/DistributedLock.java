package com.five.monkey.vi.vhr.lock;

import java.util.UUID;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.script.DefaultRedisScript;
import org.springframework.data.redis.core.script.RedisScript;
import org.springframework.stereotype.Component;

import com.five.monkey.vi.vhr.common.exception.MyRuntimeException;

/**
 * redis实现分布式锁
 * @author jim
 * @date 2021/3/27 9:35
 */
@Component
public final class DistributedLock {

	private static final Logger		logger		= LoggerFactory.getLogger(DistributedLock.class);

	private static final String		script		= "if redis.call('get', KEYS[1]) == ARGV[1] then return redis.call('del', KEYS[1]) else return 0 end";

	private RedisScript<Boolean>	redisScript	= new DefaultRedisScript<>(script);

	@Autowired
	private StringRedisTemplate		stringRedisTemplate;

	public String lock(String key) {
		String value = UUID.randomUUID().toString();
		boolean lockFlag = stringRedisTemplate.opsForValue().setIfAbsent(key, value, 1000L, TimeUnit.MILLISECONDS);
		if (!lockFlag) {
			logger.error("分布式锁加锁失败,key={}", key);
			throw new MyRuntimeException("分布式锁加锁失败,key=" + key);
		}
		return value;
	}

	public boolean unLock(String key, String value) {
		boolean unLockFlag = stringRedisTemplate.execute(redisScript, Stream.of(key).collect(Collectors.toList()), value);
		if (!unLockFlag) {
			logger.error("分布式锁解锁失败,key={},value={}", key, value);
		}
		return unLockFlag;
	}
}
