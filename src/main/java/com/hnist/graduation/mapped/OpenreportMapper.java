package com.hnist.graduation.mapped;

import com.hnist.graduation.entity.Openreport;
import com.hnist.graduation.entity.OpenreportExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OpenreportMapper {
    int countByExample(OpenreportExample example);

    int deleteByExample(OpenreportExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Openreport record);

    int insertSelective(Openreport record);

    List<Openreport> selectByExample(OpenreportExample example);

    Openreport selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Openreport record, @Param("example") OpenreportExample example);

    int updateByExample(@Param("record") Openreport record, @Param("example") OpenreportExample example);

    int updateByPrimaryKeySelective(Openreport record);

    int updateByPrimaryKey(Openreport record);
}