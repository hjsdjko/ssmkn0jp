package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.DiscussyouxiuzuozheDao;
import com.entity.DiscussyouxiuzuozheEntity;
import com.service.DiscussyouxiuzuozheService;
import com.entity.vo.DiscussyouxiuzuozheVO;
import com.entity.view.DiscussyouxiuzuozheView;

@Service("discussyouxiuzuozheService")
public class DiscussyouxiuzuozheServiceImpl extends ServiceImpl<DiscussyouxiuzuozheDao, DiscussyouxiuzuozheEntity> implements DiscussyouxiuzuozheService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscussyouxiuzuozheEntity> page = this.selectPage(
                new Query<DiscussyouxiuzuozheEntity>(params).getPage(),
                new EntityWrapper<DiscussyouxiuzuozheEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscussyouxiuzuozheEntity> wrapper) {
		  Page<DiscussyouxiuzuozheView> page =new Query<DiscussyouxiuzuozheView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscussyouxiuzuozheVO> selectListVO(Wrapper<DiscussyouxiuzuozheEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscussyouxiuzuozheVO selectVO(Wrapper<DiscussyouxiuzuozheEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscussyouxiuzuozheView> selectListView(Wrapper<DiscussyouxiuzuozheEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscussyouxiuzuozheView selectView(Wrapper<DiscussyouxiuzuozheEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
