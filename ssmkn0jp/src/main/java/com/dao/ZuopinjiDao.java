package com.dao;

import com.entity.ZuopinjiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ZuopinjiVO;
import com.entity.view.ZuopinjiView;


/**
 * 作品集
 * 
 * @author 
 * @email 
 * @date 2021-04-10 20:14:33
 */
public interface ZuopinjiDao extends BaseMapper<ZuopinjiEntity> {
	
	List<ZuopinjiVO> selectListVO(@Param("ew") Wrapper<ZuopinjiEntity> wrapper);
	
	ZuopinjiVO selectVO(@Param("ew") Wrapper<ZuopinjiEntity> wrapper);
	
	List<ZuopinjiView> selectListView(@Param("ew") Wrapper<ZuopinjiEntity> wrapper);

	List<ZuopinjiView> selectListView(Pagination page,@Param("ew") Wrapper<ZuopinjiEntity> wrapper);
	
	ZuopinjiView selectView(@Param("ew") Wrapper<ZuopinjiEntity> wrapper);
	
}
