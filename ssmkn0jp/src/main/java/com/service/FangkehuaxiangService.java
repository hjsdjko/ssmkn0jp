package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.FangkehuaxiangEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.FangkehuaxiangVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.FangkehuaxiangView;


/**
 * 访客画像
 *
 * @author 
 * @email 
 * @date 2021-04-10 20:14:33
 */
public interface FangkehuaxiangService extends IService<FangkehuaxiangEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<FangkehuaxiangVO> selectListVO(Wrapper<FangkehuaxiangEntity> wrapper);
   	
   	FangkehuaxiangVO selectVO(@Param("ew") Wrapper<FangkehuaxiangEntity> wrapper);
   	
   	List<FangkehuaxiangView> selectListView(Wrapper<FangkehuaxiangEntity> wrapper);
   	
   	FangkehuaxiangView selectView(@Param("ew") Wrapper<FangkehuaxiangEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<FangkehuaxiangEntity> wrapper);
   	
}

