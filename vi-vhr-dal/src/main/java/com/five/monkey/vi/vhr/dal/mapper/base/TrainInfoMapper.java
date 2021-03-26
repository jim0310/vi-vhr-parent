package com.five.monkey.vi.vhr.dal.mapper.base;

import com.five.monkey.vi.vhr.dal.entity.TrainInfo;
import com.five.monkey.vi.vhr.dal.entity.TrainInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TrainInfoMapper {
    long countByExample(TrainInfoExample example);

    int deleteByExample(TrainInfoExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TrainInfo record);

    int insertSelective(TrainInfo record);

    List<TrainInfo> selectByExample(TrainInfoExample example);

    TrainInfo selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TrainInfo record, @Param("example") TrainInfoExample example);

    int updateByExample(@Param("record") TrainInfo record, @Param("example") TrainInfoExample example);

    int updateByPrimaryKeySelective(TrainInfo record);

    int updateByPrimaryKey(TrainInfo record);
}