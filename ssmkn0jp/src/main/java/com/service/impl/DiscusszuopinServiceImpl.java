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


import com.dao.DiscusszuopinDao;
import com.entity.DiscusszuopinEntity;
import com.service.DiscusszuopinService;
import com.entity.vo.DiscusszuopinVO;
import com.entity.view.DiscusszuopinView;

@Service("discusszuopinService")
public class DiscusszuopinServiceImpl extends ServiceImpl<DiscusszuopinDao, DiscusszuopinEntity> implements DiscusszuopinService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscusszuopinEntity> page = this.selectPage(
                new Query<DiscusszuopinEntity>(params).getPage(),
                new EntityWrapper<DiscusszuopinEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscusszuopinEntity> wrapper) {
		  Page<DiscusszuopinView> page =new Query<DiscusszuopinView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscusszuopinVO> selectListVO(Wrapper<DiscusszuopinEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscusszuopinVO selectVO(Wrapper<DiscusszuopinEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscusszuopinView> selectListView(Wrapper<DiscusszuopinEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscusszuopinView selectView(Wrapper<DiscusszuopinEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
