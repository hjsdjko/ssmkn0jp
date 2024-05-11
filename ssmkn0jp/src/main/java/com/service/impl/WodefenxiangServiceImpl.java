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


import com.dao.WodefenxiangDao;
import com.entity.WodefenxiangEntity;
import com.service.WodefenxiangService;
import com.entity.vo.WodefenxiangVO;
import com.entity.view.WodefenxiangView;

@Service("wodefenxiangService")
public class WodefenxiangServiceImpl extends ServiceImpl<WodefenxiangDao, WodefenxiangEntity> implements WodefenxiangService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<WodefenxiangEntity> page = this.selectPage(
                new Query<WodefenxiangEntity>(params).getPage(),
                new EntityWrapper<WodefenxiangEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<WodefenxiangEntity> wrapper) {
		  Page<WodefenxiangView> page =new Query<WodefenxiangView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<WodefenxiangVO> selectListVO(Wrapper<WodefenxiangEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public WodefenxiangVO selectVO(Wrapper<WodefenxiangEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<WodefenxiangView> selectListView(Wrapper<WodefenxiangEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public WodefenxiangView selectView(Wrapper<WodefenxiangEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
