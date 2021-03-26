package com.five.monkey.vi.vhr.dal.mapper.base;

import com.five.monkey.vi.vhr.dal.entity.OccurDetail;
import com.five.monkey.vi.vhr.dal.entity.OccurDetailExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OccurDetailMapper {
    long countByExample(OccurDetailExample example);

    int deleteByExample(OccurDetailExample example);

    int deleteByPrimaryKey(Long id);

    int insert(OccurDetail record);

    int insertSelective(OccurDetail record);

    List<OccurDetail> selectByExample(OccurDetailExample example);

    OccurDetail selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") OccurDetail record, @Param("example") OccurDetailExample example);

    int updateByExample(@Param("record") OccurDetail record, @Param("example") OccurDetailExample example);

    int updateByPrimaryKeySelective(OccurDetail record);

    int updateByPrimaryKey(OccurDetail record);
}