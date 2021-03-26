package com.five.monkey.vi.vhr.dal.mapper.base;

import com.five.monkey.vi.vhr.dal.entity.SalaryInfo;
import com.five.monkey.vi.vhr.dal.entity.SalaryInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SalaryInfoMapper {
    long countByExample(SalaryInfoExample example);

    int deleteByExample(SalaryInfoExample example);

    int deleteByPrimaryKey(Long id);

    int insert(SalaryInfo record);

    int insertSelective(SalaryInfo record);

    List<SalaryInfo> selectByExample(SalaryInfoExample example);

    SalaryInfo selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") SalaryInfo record, @Param("example") SalaryInfoExample example);

    int updateByExample(@Param("record") SalaryInfo record, @Param("example") SalaryInfoExample example);

    int updateByPrimaryKeySelective(SalaryInfo record);

    int updateByPrimaryKey(SalaryInfo record);
}