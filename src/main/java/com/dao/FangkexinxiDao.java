package com.dao;

import com.entity.FangkexinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.FangkexinxiVO;
import com.entity.view.FangkexinxiView;


/**
 * 访客信息
 * 
 * @author 
 * @email 
 * @date 2021-01-30 19:50:51
 */
public interface FangkexinxiDao extends BaseMapper<FangkexinxiEntity> {
	
	List<FangkexinxiVO> selectListVO(@Param("ew") Wrapper<FangkexinxiEntity> wrapper);
	
	FangkexinxiVO selectVO(@Param("ew") Wrapper<FangkexinxiEntity> wrapper);
	
	List<FangkexinxiView> selectListView(@Param("ew") Wrapper<FangkexinxiEntity> wrapper);

	List<FangkexinxiView> selectListView(Pagination page,@Param("ew") Wrapper<FangkexinxiEntity> wrapper);
	
	FangkexinxiView selectView(@Param("ew") Wrapper<FangkexinxiEntity> wrapper);
	
}
