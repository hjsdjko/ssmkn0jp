package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscussyouxiuzuozheEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscussyouxiuzuozheVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscussyouxiuzuozheView;


/**
 * 优秀作者评论表
 *
 * @author 
 * @email 
 * @date 2021-04-10 20:14:33
 */
public interface DiscussyouxiuzuozheService extends IService<DiscussyouxiuzuozheEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscussyouxiuzuozheVO> selectListVO(Wrapper<DiscussyouxiuzuozheEntity> wrapper);
   	
   	DiscussyouxiuzuozheVO selectVO(@Param("ew") Wrapper<DiscussyouxiuzuozheEntity> wrapper);
   	
   	List<DiscussyouxiuzuozheView> selectListView(Wrapper<DiscussyouxiuzuozheEntity> wrapper);
   	
   	DiscussyouxiuzuozheView selectView(@Param("ew") Wrapper<DiscussyouxiuzuozheEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscussyouxiuzuozheEntity> wrapper);
   	
}

