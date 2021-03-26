package com.five.monkey.vi.vhr.dal.mapper.base;

import com.five.monkey.vi.vhr.dal.entity.RemoveInfo;
import com.five.monkey.vi.vhr.dal.entity.RemoveInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RemoveInfoMapper {
    long countByExample(RemoveInfoExample example);

    int deleteByExample(RemoveInfoExample example);

    int deleteByPrimaryKey(Long id);

    int insert(RemoveInfo record);

    int insertSelective(RemoveInfo record);

    List<RemoveInfo> selectByExample(RemoveInfoExample example);

    RemoveInfo selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") RemoveInfo record, @Param("example") RemoveInfoExample example);

    int updateByExample(@Param("record") RemoveInfo record, @Param("example") RemoveInfoExample example);

    int updateByPrimaryKeySelective(RemoveInfo record);

    int updateByPrimaryKey(RemoveInfo record);
}