package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscusszuopinjiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscusszuopinjiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscusszuopinjiView;


/**
 * 作品集评论表
 *
 * @author 
 * @email 
 * @date 2021-04-10 20:14:33
 */
public interface DiscusszuopinjiService extends IService<DiscusszuopinjiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscusszuopinjiVO> selectListVO(Wrapper<DiscusszuopinjiEntity> wrapper);
   	
   	DiscusszuopinjiVO selectVO(@Param("ew") Wrapper<DiscusszuopinjiEntity> wrapper);
   	
   	List<DiscusszuopinjiView> selectListView(Wrapper<DiscusszuopinjiEntity> wrapper);
   	
   	DiscusszuopinjiView selectView(@Param("ew") Wrapper<DiscusszuopinjiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscusszuopinjiEntity> wrapper);
   	
}

