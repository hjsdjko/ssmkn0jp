package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ZuopinjiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ZuopinjiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ZuopinjiView;


/**
 * 作品集
 *
 * @author 
 * @email 
 * @date 2021-04-10 20:14:33
 */
public interface ZuopinjiService extends IService<ZuopinjiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ZuopinjiVO> selectListVO(Wrapper<ZuopinjiEntity> wrapper);
   	
   	ZuopinjiVO selectVO(@Param("ew") Wrapper<ZuopinjiEntity> wrapper);
   	
   	List<ZuopinjiView> selectListView(Wrapper<ZuopinjiEntity> wrapper);
   	
   	ZuopinjiView selectView(@Param("ew") Wrapper<ZuopinjiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ZuopinjiEntity> wrapper);
   	
}

