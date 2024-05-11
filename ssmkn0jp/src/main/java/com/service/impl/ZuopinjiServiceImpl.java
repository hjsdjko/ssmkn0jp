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


import com.dao.ZuopinjiDao;
import com.entity.ZuopinjiEntity;
import com.service.ZuopinjiService;
import com.entity.vo.ZuopinjiVO;
import com.entity.view.ZuopinjiView;

@Service("zuopinjiService")
public class ZuopinjiServiceImpl extends ServiceImpl<ZuopinjiDao, ZuopinjiEntity> implements ZuopinjiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ZuopinjiEntity> page = this.selectPage(
                new Query<ZuopinjiEntity>(params).getPage(),
                new EntityWrapper<ZuopinjiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ZuopinjiEntity> wrapper) {
		  Page<ZuopinjiView> page =new Query<ZuopinjiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ZuopinjiVO> selectListVO(Wrapper<ZuopinjiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ZuopinjiVO selectVO(Wrapper<ZuopinjiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ZuopinjiView> selectListView(Wrapper<ZuopinjiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ZuopinjiView selectView(Wrapper<ZuopinjiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
