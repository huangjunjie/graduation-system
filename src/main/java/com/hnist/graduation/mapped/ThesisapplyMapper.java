package com.hnist.graduation.mapped;

import com.hnist.graduation.entity.Thesisapply;
import com.hnist.graduation.entity.ThesisapplyExample;
import com.hnist.graduation.entity.ThesisapplyKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ThesisapplyMapper {
    int countByExample(ThesisapplyExample example);

    int deleteByExample(ThesisapplyExample example);

    int deleteByPrimaryKey(ThesisapplyKey key);

    int insert(Thesisapply record);

    int insertSelective(Thesisapply record);

    List<Thesisapply> selectByExample(ThesisapplyExample example);

    Thesisapply selectByPrimaryKey(ThesisapplyKey key);

    int updateByExampleSelective(@Param("record") Thesisapply record, @Param("example") ThesisapplyExample example);

    int updateByExample(@Param("record") Thesisapply record, @Param("example") ThesisapplyExample example);

    int updateByPrimaryKeySelective(Thesisapply record);

    int updateByPrimaryKey(Thesisapply record);
}