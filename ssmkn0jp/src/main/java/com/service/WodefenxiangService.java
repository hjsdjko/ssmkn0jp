package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.WodefenxiangEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.WodefenxiangVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.WodefenxiangView;


/**
 * 我的分享
 *
 * @author 
 * @email 
 * @date 2021-04-10 20:14:33
 */
public interface WodefenxiangService extends IService<WodefenxiangEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<WodefenxiangVO> selectListVO(Wrapper<WodefenxiangEntity> wrapper);
   	
   	WodefenxiangVO selectVO(@Param("ew") Wrapper<WodefenxiangEntity> wrapper);
   	
   	List<WodefenxiangView> selectListView(Wrapper<WodefenxiangEntity> wrapper);
   	
   	WodefenxiangView selectView(@Param("ew") Wrapper<WodefenxiangEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<WodefenxiangEntity> wrapper);
   	
}

