package com.five.monkey.vi.vhr.dal.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author jim
 * @date 2021/3/25 16:36
 */
@Configuration
@MapperScan(basePackages = {"com.five.monkey.vi.vhr.dal.mapper"})
public class MapperConfig {

}
