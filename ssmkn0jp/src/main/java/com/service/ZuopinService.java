package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ZuopinEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ZuopinVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ZuopinView;


/**
 * 作品
 *
 * @author 
 * @email 
 * @date 2021-04-10 20:14:33
 */
public interface ZuopinService extends IService<ZuopinEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ZuopinVO> selectListVO(Wrapper<ZuopinEntity> wrapper);
   	
   	ZuopinVO selectVO(@Param("ew") Wrapper<ZuopinEntity> wrapper);
   	
   	List<ZuopinView> selectListView(Wrapper<ZuopinEntity> wrapper);
   	
   	ZuopinView selectView(@Param("ew") Wrapper<ZuopinEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ZuopinEntity> wrapper);
   	
}

