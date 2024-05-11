package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.YouxiuzuozheEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.YouxiuzuozheVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.YouxiuzuozheView;


/**
 * 优秀作者
 *
 * @author 
 * @email 
 * @date 2021-04-10 20:14:33
 */
public interface YouxiuzuozheService extends IService<YouxiuzuozheEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<YouxiuzuozheVO> selectListVO(Wrapper<YouxiuzuozheEntity> wrapper);
   	
   	YouxiuzuozheVO selectVO(@Param("ew") Wrapper<YouxiuzuozheEntity> wrapper);
   	
   	List<YouxiuzuozheView> selectListView(Wrapper<YouxiuzuozheEntity> wrapper);
   	
   	YouxiuzuozheView selectView(@Param("ew") Wrapper<YouxiuzuozheEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<YouxiuzuozheEntity> wrapper);
   	
}

