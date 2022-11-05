package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.FangkexinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.FangkexinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.FangkexinxiView;


/**
 * 访客信息
 *
 * @author 
 * @email 
 * @date 2021-01-30 19:50:51
 */
public interface FangkexinxiService extends IService<FangkexinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<FangkexinxiVO> selectListVO(Wrapper<FangkexinxiEntity> wrapper);
   	
   	FangkexinxiVO selectVO(@Param("ew") Wrapper<FangkexinxiEntity> wrapper);
   	
   	List<FangkexinxiView> selectListView(Wrapper<FangkexinxiEntity> wrapper);
   	
   	FangkexinxiView selectView(@Param("ew") Wrapper<FangkexinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<FangkexinxiEntity> wrapper);
   	
}

