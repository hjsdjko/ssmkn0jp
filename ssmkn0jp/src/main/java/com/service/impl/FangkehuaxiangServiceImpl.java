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


import com.dao.FangkehuaxiangDao;
import com.entity.FangkehuaxiangEntity;
import com.service.FangkehuaxiangService;
import com.entity.vo.FangkehuaxiangVO;
import com.entity.view.FangkehuaxiangView;

@Service("fangkehuaxiangService")
public class FangkehuaxiangServiceImpl extends ServiceImpl<FangkehuaxiangDao, FangkehuaxiangEntity> implements FangkehuaxiangService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<FangkehuaxiangEntity> page = this.selectPage(
                new Query<FangkehuaxiangEntity>(params).getPage(),
                new EntityWrapper<FangkehuaxiangEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<FangkehuaxiangEntity> wrapper) {
		  Page<FangkehuaxiangView> page =new Query<FangkehuaxiangView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<FangkehuaxiangVO> selectListVO(Wrapper<FangkehuaxiangEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public FangkehuaxiangVO selectVO(Wrapper<FangkehuaxiangEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<FangkehuaxiangView> selectListView(Wrapper<FangkehuaxiangEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public FangkehuaxiangView selectView(Wrapper<FangkehuaxiangEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
