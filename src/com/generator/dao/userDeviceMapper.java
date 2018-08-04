package com.generator.dao;

import com.generator.pojo.userDevice;
import com.generator.pojo.userDeviceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface userDeviceMapper {
    int countByExample(userDeviceExample example);

    int deleteByExample(userDeviceExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(userDevice record);

    int insertSelective(userDevice record);

    List<userDevice> selectByExample(userDeviceExample example);

    userDevice selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") userDevice record, @Param("example") userDeviceExample example);

    int updateByExample(@Param("record") userDevice record, @Param("example") userDeviceExample example);

    int updateByPrimaryKeySelective(userDevice record);

    int updateByPrimaryKey(userDevice record);
}