package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscusszuopinEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscusszuopinVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscusszuopinView;


/**
 * 作品评论表
 *
 * @author 
 * @email 
 * @date 2021-04-10 20:14:33
 */
public interface DiscusszuopinService extends IService<DiscusszuopinEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscusszuopinVO> selectListVO(Wrapper<DiscusszuopinEntity> wrapper);
   	
   	DiscusszuopinVO selectVO(@Param("ew") Wrapper<DiscusszuopinEntity> wrapper);
   	
   	List<DiscusszuopinView> selectListView(Wrapper<DiscusszuopinEntity> wrapper);
   	
   	DiscusszuopinView selectView(@Param("ew") Wrapper<DiscusszuopinEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscusszuopinEntity> wrapper);
   	
}

