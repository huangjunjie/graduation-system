package com.hnist.graduation.mapped;

import java.util.List;

import com.hnist.graduation.entity.ThesisInfo;
import com.hnist.graduation.entity.ThesisapplyVo;

/**
 * @author Administrator
 * 并查集的SQl方法
 */
public interface RelationMapper {
	//联合查询Thesischeck  Thesisapply
	List<ThesisInfo> selectThesisInfo(String uid);
	
	List<ThesisapplyVo> selectThesisApply(String tid);
}
