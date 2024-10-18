package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.FankuiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.FankuiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.FankuiView;


/**
 * 反馈
 *
 * @author 
 * @email 
 * @date 2021-04-24 23:05:57
 */
public interface FankuiService extends IService<FankuiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<FankuiVO> selectListVO(Wrapper<FankuiEntity> wrapper);
   	
   	FankuiVO selectVO(@Param("ew") Wrapper<FankuiEntity> wrapper);
   	
   	List<FankuiView> selectListView(Wrapper<FankuiEntity> wrapper);
   	
   	FankuiView selectView(@Param("ew") Wrapper<FankuiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<FankuiEntity> wrapper);
   	
}

