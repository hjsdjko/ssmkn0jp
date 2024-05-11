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


import com.dao.DiscusszuopinjiDao;
import com.entity.DiscusszuopinjiEntity;
import com.service.DiscusszuopinjiService;
import com.entity.vo.DiscusszuopinjiVO;
import com.entity.view.DiscusszuopinjiView;

@Service("discusszuopinjiService")
public class DiscusszuopinjiServiceImpl extends ServiceImpl<DiscusszuopinjiDao, DiscusszuopinjiEntity> implements DiscusszuopinjiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscusszuopinjiEntity> page = this.selectPage(
                new Query<DiscusszuopinjiEntity>(params).getPage(),
                new EntityWrapper<DiscusszuopinjiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscusszuopinjiEntity> wrapper) {
		  Page<DiscusszuopinjiView> page =new Query<DiscusszuopinjiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscusszuopinjiVO> selectListVO(Wrapper<DiscusszuopinjiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscusszuopinjiVO selectVO(Wrapper<DiscusszuopinjiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscusszuopinjiView> selectListView(Wrapper<DiscusszuopinjiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscusszuopinjiView selectView(Wrapper<DiscusszuopinjiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
