package com.generator.dao;

import com.generator.pojo.device;
import com.generator.pojo.deviceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface deviceMapper {
    int countByExample(deviceExample example);

    int deleteByExample(deviceExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(device record);

    int insertSelective(device record);

    List<device> selectByExample(deviceExample example);

    device selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") device record, @Param("example") deviceExample example);

    int updateByExample(@Param("record") device record, @Param("example") deviceExample example);

    int updateByPrimaryKeySelective(device record);

    int updateByPrimaryKey(device record);
}