package com.hnist.graduation.mapped;

import com.hnist.graduation.entity.Teacherinfo;
import com.hnist.graduation.entity.TeacherinfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TeacherinfoMapper {
    int countByExample(TeacherinfoExample example);

    int deleteByExample(TeacherinfoExample example);

    int deleteByPrimaryKey(String tid);

    int insert(Teacherinfo record);

    int insertSelective(Teacherinfo record);

    List<Teacherinfo> selectByExample(TeacherinfoExample example);

    Teacherinfo selectByPrimaryKey(String tid);

    int updateByExampleSelective(@Param("record") Teacherinfo record, @Param("example") TeacherinfoExample example);

    int updateByExample(@Param("record") Teacherinfo record, @Param("example") TeacherinfoExample example);

    int updateByPrimaryKeySelective(Teacherinfo record);

    int updateByPrimaryKey(Teacherinfo record);
}