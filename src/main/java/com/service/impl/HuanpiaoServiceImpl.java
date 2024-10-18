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


import com.dao.HuanpiaoDao;
import com.entity.HuanpiaoEntity;
import com.service.HuanpiaoService;
import com.entity.vo.HuanpiaoVO;
import com.entity.view.HuanpiaoView;

@Service("huanpiaoService")
public class HuanpiaoServiceImpl extends ServiceImpl<HuanpiaoDao, HuanpiaoEntity> implements HuanpiaoService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<HuanpiaoEntity> page = this.selectPage(
                new Query<HuanpiaoEntity>(params).getPage(),
                new EntityWrapper<HuanpiaoEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<HuanpiaoEntity> wrapper) {
		  Page<HuanpiaoView> page =new Query<HuanpiaoView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<HuanpiaoVO> selectListVO(Wrapper<HuanpiaoEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public HuanpiaoVO selectVO(Wrapper<HuanpiaoEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<HuanpiaoView> selectListView(Wrapper<HuanpiaoEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public HuanpiaoView selectView(Wrapper<HuanpiaoEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
