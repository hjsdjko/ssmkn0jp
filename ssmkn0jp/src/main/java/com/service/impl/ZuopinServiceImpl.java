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


import com.dao.ZuopinDao;
import com.entity.ZuopinEntity;
import com.service.ZuopinService;
import com.entity.vo.ZuopinVO;
import com.entity.view.ZuopinView;

@Service("zuopinService")
public class ZuopinServiceImpl extends ServiceImpl<ZuopinDao, ZuopinEntity> implements ZuopinService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ZuopinEntity> page = this.selectPage(
                new Query<ZuopinEntity>(params).getPage(),
                new EntityWrapper<ZuopinEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ZuopinEntity> wrapper) {
		  Page<ZuopinView> page =new Query<ZuopinView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ZuopinVO> selectListVO(Wrapper<ZuopinEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ZuopinVO selectVO(Wrapper<ZuopinEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ZuopinView> selectListView(Wrapper<ZuopinEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ZuopinView selectView(Wrapper<ZuopinEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
