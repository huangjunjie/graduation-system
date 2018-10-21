package com.hnist.graduation.mapped;

import com.hnist.graduation.entity.Upload;
import com.hnist.graduation.entity.UploadExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UploadMapper {
    int countByExample(UploadExample example);

    int deleteByExample(UploadExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Upload record);

    int insertSelective(Upload record);

    List<Upload> selectByExample(UploadExample example);

    Upload selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Upload record, @Param("example") UploadExample example);

    int updateByExample(@Param("record") Upload record, @Param("example") UploadExample example);

    int updateByPrimaryKeySelective(Upload record);

    int updateByPrimaryKey(Upload record);
}