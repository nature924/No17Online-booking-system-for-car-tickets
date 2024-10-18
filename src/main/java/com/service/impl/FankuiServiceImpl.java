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


import com.dao.FankuiDao;
import com.entity.FankuiEntity;
import com.service.FankuiService;
import com.entity.vo.FankuiVO;
import com.entity.view.FankuiView;

@Service("fankuiService")
public class FankuiServiceImpl extends ServiceImpl<FankuiDao, FankuiEntity> implements FankuiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<FankuiEntity> page = this.selectPage(
                new Query<FankuiEntity>(params).getPage(),
                new EntityWrapper<FankuiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<FankuiEntity> wrapper) {
		  Page<FankuiView> page =new Query<FankuiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<FankuiVO> selectListVO(Wrapper<FankuiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public FankuiVO selectVO(Wrapper<FankuiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<FankuiView> selectListView(Wrapper<FankuiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public FankuiView selectView(Wrapper<FankuiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
