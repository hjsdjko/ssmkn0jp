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


import com.dao.YouxiuzuozheDao;
import com.entity.YouxiuzuozheEntity;
import com.service.YouxiuzuozheService;
import com.entity.vo.YouxiuzuozheVO;
import com.entity.view.YouxiuzuozheView;

@Service("youxiuzuozheService")
public class YouxiuzuozheServiceImpl extends ServiceImpl<YouxiuzuozheDao, YouxiuzuozheEntity> implements YouxiuzuozheService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<YouxiuzuozheEntity> page = this.selectPage(
                new Query<YouxiuzuozheEntity>(params).getPage(),
                new EntityWrapper<YouxiuzuozheEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<YouxiuzuozheEntity> wrapper) {
		  Page<YouxiuzuozheView> page =new Query<YouxiuzuozheView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<YouxiuzuozheVO> selectListVO(Wrapper<YouxiuzuozheEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public YouxiuzuozheVO selectVO(Wrapper<YouxiuzuozheEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<YouxiuzuozheView> selectListView(Wrapper<YouxiuzuozheEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public YouxiuzuozheView selectView(Wrapper<YouxiuzuozheEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
