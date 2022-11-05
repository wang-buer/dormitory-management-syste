package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.FangkexinxiDao;
import com.entity.FangkexinxiEntity;
import com.service.FangkexinxiService;
import com.entity.vo.FangkexinxiVO;
import com.entity.view.FangkexinxiView;

@Service("fangkexinxiService")
public class FangkexinxiServiceImpl extends ServiceImpl<FangkexinxiDao, FangkexinxiEntity> implements FangkexinxiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<FangkexinxiEntity> page = this.selectPage(
                new Query<FangkexinxiEntity>(params).getPage(),
                new EntityWrapper<FangkexinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<FangkexinxiEntity> wrapper) {
		  Page<FangkexinxiView> page =new Query<FangkexinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<FangkexinxiVO> selectListVO(Wrapper<FangkexinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public FangkexinxiVO selectVO(Wrapper<FangkexinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<FangkexinxiView> selectListView(Wrapper<FangkexinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public FangkexinxiView selectView(Wrapper<FangkexinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
