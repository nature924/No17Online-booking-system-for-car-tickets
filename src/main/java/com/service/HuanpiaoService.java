package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.HuanpiaoEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.HuanpiaoVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.HuanpiaoView;


/**
 * 换票
 *
 * @author 
 * @email 
 * @date 2021-04-24 23:05:57
 */
public interface HuanpiaoService extends IService<HuanpiaoEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<HuanpiaoVO> selectListVO(Wrapper<HuanpiaoEntity> wrapper);
   	
   	HuanpiaoVO selectVO(@Param("ew") Wrapper<HuanpiaoEntity> wrapper);
   	
   	List<HuanpiaoView> selectListView(Wrapper<HuanpiaoEntity> wrapper);
   	
   	HuanpiaoView selectView(@Param("ew") Wrapper<HuanpiaoEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<HuanpiaoEntity> wrapper);
   	
}

