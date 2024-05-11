package com.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

import com.utils.ValidatorUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.annotation.IgnoreAuth;

import com.entity.DiscussyouxiuzuozheEntity;
import com.entity.view.DiscussyouxiuzuozheView;

import com.service.DiscussyouxiuzuozheService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;


/**
 * 优秀作者评论表
 * 后端接口
 * @author 
 * @email 
 * @date 2021-04-10 20:14:33
 */
@RestController
@RequestMapping("/discussyouxiuzuozhe")
public class DiscussyouxiuzuozheController {
    @Autowired
    private DiscussyouxiuzuozheService discussyouxiuzuozheService;
    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,DiscussyouxiuzuozheEntity discussyouxiuzuozhe, 
		HttpServletRequest request){

        EntityWrapper<DiscussyouxiuzuozheEntity> ew = new EntityWrapper<DiscussyouxiuzuozheEntity>();
		PageUtils page = discussyouxiuzuozheService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, discussyouxiuzuozhe), params), params));
        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,DiscussyouxiuzuozheEntity discussyouxiuzuozhe, HttpServletRequest request){
        EntityWrapper<DiscussyouxiuzuozheEntity> ew = new EntityWrapper<DiscussyouxiuzuozheEntity>();
		PageUtils page = discussyouxiuzuozheService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, discussyouxiuzuozhe), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( DiscussyouxiuzuozheEntity discussyouxiuzuozhe){
       	EntityWrapper<DiscussyouxiuzuozheEntity> ew = new EntityWrapper<DiscussyouxiuzuozheEntity>();
      	ew.allEq(MPUtil.allEQMapPre( discussyouxiuzuozhe, "discussyouxiuzuozhe")); 
        return R.ok().put("data", discussyouxiuzuozheService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(DiscussyouxiuzuozheEntity discussyouxiuzuozhe){
        EntityWrapper< DiscussyouxiuzuozheEntity> ew = new EntityWrapper< DiscussyouxiuzuozheEntity>();
 		ew.allEq(MPUtil.allEQMapPre( discussyouxiuzuozhe, "discussyouxiuzuozhe")); 
		DiscussyouxiuzuozheView discussyouxiuzuozheView =  discussyouxiuzuozheService.selectView(ew);
		return R.ok("查询优秀作者评论表成功").put("data", discussyouxiuzuozheView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        DiscussyouxiuzuozheEntity discussyouxiuzuozhe = discussyouxiuzuozheService.selectById(id);
        return R.ok().put("data", discussyouxiuzuozhe);
    }

    /**
     * 前端详情
     */
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        DiscussyouxiuzuozheEntity discussyouxiuzuozhe = discussyouxiuzuozheService.selectById(id);
        return R.ok().put("data", discussyouxiuzuozhe);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody DiscussyouxiuzuozheEntity discussyouxiuzuozhe, HttpServletRequest request){
    	discussyouxiuzuozhe.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(discussyouxiuzuozhe);

        discussyouxiuzuozheService.insert(discussyouxiuzuozhe);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody DiscussyouxiuzuozheEntity discussyouxiuzuozhe, HttpServletRequest request){
    	discussyouxiuzuozhe.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(discussyouxiuzuozhe);

        discussyouxiuzuozheService.insert(discussyouxiuzuozhe);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody DiscussyouxiuzuozheEntity discussyouxiuzuozhe, HttpServletRequest request){
        //ValidatorUtils.validateEntity(discussyouxiuzuozhe);
        discussyouxiuzuozheService.updateById(discussyouxiuzuozhe);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        discussyouxiuzuozheService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
    /**
     * 提醒接口
     */
	@RequestMapping("/remind/{columnName}/{type}")
	public R remindCount(@PathVariable("columnName") String columnName, HttpServletRequest request, 
						 @PathVariable("type") String type,@RequestParam Map<String, Object> map) {
		map.put("column", columnName);
		map.put("type", type);
		
		if(type.equals("2")) {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Calendar c = Calendar.getInstance();
			Date remindStartDate = null;
			Date remindEndDate = null;
			if(map.get("remindstart")!=null) {
				Integer remindStart = Integer.parseInt(map.get("remindstart").toString());
				c.setTime(new Date()); 
				c.add(Calendar.DAY_OF_MONTH,remindStart);
				remindStartDate = c.getTime();
				map.put("remindstart", sdf.format(remindStartDate));
			}
			if(map.get("remindend")!=null) {
				Integer remindEnd = Integer.parseInt(map.get("remindend").toString());
				c.setTime(new Date());
				c.add(Calendar.DAY_OF_MONTH,remindEnd);
				remindEndDate = c.getTime();
				map.put("remindend", sdf.format(remindEndDate));
			}
		}
		
		Wrapper<DiscussyouxiuzuozheEntity> wrapper = new EntityWrapper<DiscussyouxiuzuozheEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}


		int count = discussyouxiuzuozheService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	


}
