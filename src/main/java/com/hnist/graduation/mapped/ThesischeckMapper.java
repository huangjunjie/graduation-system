package com.hnist.graduation.mapped;

import com.hnist.graduation.entity.Thesischeck;
import com.hnist.graduation.entity.ThesischeckExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ThesischeckMapper {
    int countByExample(ThesischeckExample example);

    int deleteByExample(ThesischeckExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Thesischeck record);

    int insertSelective(Thesischeck record);

    List<Thesischeck> selectByExample(ThesischeckExample example);

    Thesischeck selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Thesischeck record, @Param("example") ThesischeckExample example);

    int updateByExample(@Param("record") Thesischeck record, @Param("example") ThesischeckExample example);

    int updateByPrimaryKeySelective(Thesischeck record);

    int updateByPrimaryKey(Thesischeck record);
}