package com.dao;

import com.entity.DiscusszuopinjiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscusszuopinjiVO;
import com.entity.view.DiscusszuopinjiView;


/**
 * 作品集评论表
 * 
 * @author 
 * @email 
 * @date 2021-04-10 20:14:33
 */
public interface DiscusszuopinjiDao extends BaseMapper<DiscusszuopinjiEntity> {
	
	List<DiscusszuopinjiVO> selectListVO(@Param("ew") Wrapper<DiscusszuopinjiEntity> wrapper);
	
	DiscusszuopinjiVO selectVO(@Param("ew") Wrapper<DiscusszuopinjiEntity> wrapper);
	
	List<DiscusszuopinjiView> selectListView(@Param("ew") Wrapper<DiscusszuopinjiEntity> wrapper);

	List<DiscusszuopinjiView> selectListView(Pagination page,@Param("ew") Wrapper<DiscusszuopinjiEntity> wrapper);
	
	DiscusszuopinjiView selectView(@Param("ew") Wrapper<DiscusszuopinjiEntity> wrapper);
	
}
