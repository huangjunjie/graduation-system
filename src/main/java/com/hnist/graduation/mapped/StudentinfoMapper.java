package com.hnist.graduation.mapped;

import com.hnist.graduation.entity.Studentinfo;
import com.hnist.graduation.entity.StudentinfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StudentinfoMapper {
    int countByExample(StudentinfoExample example);

    int deleteByExample(StudentinfoExample example);

    int deleteByPrimaryKey(String uid);

    int insert(Studentinfo record);

    int insertSelective(Studentinfo record);

    List<Studentinfo> selectByExample(StudentinfoExample example);

    Studentinfo selectByPrimaryKey(String uid);

    int updateByExampleSelective(@Param("record") Studentinfo record, @Param("example") StudentinfoExample example);

    int updateByExample(@Param("record") Studentinfo record, @Param("example") StudentinfoExample example);

    int updateByPrimaryKeySelective(Studentinfo record);

    int updateByPrimaryKey(Studentinfo record);
}