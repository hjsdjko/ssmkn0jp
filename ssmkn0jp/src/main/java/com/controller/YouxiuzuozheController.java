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

import com.entity.YouxiuzuozheEntity;
import com.entity.view.YouxiuzuozheView;

import com.service.YouxiuzuozheService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;


/**
 * 优秀作者
 * 后端接口
 * @author 
 * @email 
 * @date 2021-04-10 20:14:33
 */
@RestController
@RequestMapping("/youxiuzuozhe")
public class YouxiuzuozheController {
    @Autowired
    private YouxiuzuozheService youxiuzuozheService;
    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,YouxiuzuozheEntity youxiuzuozhe, 
		HttpServletRequest request){

        EntityWrapper<YouxiuzuozheEntity> ew = new EntityWrapper<YouxiuzuozheEntity>();
		PageUtils page = youxiuzuozheService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, youxiuzuozhe), params), params));
        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,YouxiuzuozheEntity youxiuzuozhe, HttpServletRequest request){
        EntityWrapper<YouxiuzuozheEntity> ew = new EntityWrapper<YouxiuzuozheEntity>();
		PageUtils page = youxiuzuozheService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, youxiuzuozhe), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( YouxiuzuozheEntity youxiuzuozhe){
       	EntityWrapper<YouxiuzuozheEntity> ew = new EntityWrapper<YouxiuzuozheEntity>();
      	ew.allEq(MPUtil.allEQMapPre( youxiuzuozhe, "youxiuzuozhe")); 
        return R.ok().put("data", youxiuzuozheService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(YouxiuzuozheEntity youxiuzuozhe){
        EntityWrapper< YouxiuzuozheEntity> ew = new EntityWrapper< YouxiuzuozheEntity>();
 		ew.allEq(MPUtil.allEQMapPre( youxiuzuozhe, "youxiuzuozhe")); 
		YouxiuzuozheView youxiuzuozheView =  youxiuzuozheService.selectView(ew);
		return R.ok("查询优秀作者成功").put("data", youxiuzuozheView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        YouxiuzuozheEntity youxiuzuozhe = youxiuzuozheService.selectById(id);
		youxiuzuozhe.setClicktime(new Date());
		youxiuzuozheService.updateById(youxiuzuozhe);
        return R.ok().put("data", youxiuzuozhe);
    }

    /**
     * 前端详情
     */
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        YouxiuzuozheEntity youxiuzuozhe = youxiuzuozheService.selectById(id);
		youxiuzuozhe.setClicktime(new Date());
		youxiuzuozheService.updateById(youxiuzuozhe);
        return R.ok().put("data", youxiuzuozhe);
    }
    


    /**
     * 赞或踩
     */
    @RequestMapping("/thumbsup/{id}")
    public R thumbsup(@PathVariable("id") String id,String type){
        YouxiuzuozheEntity youxiuzuozhe = youxiuzuozheService.selectById(id);
        if(type.equals("1")) {
        	youxiuzuozhe.setThumbsupnum(youxiuzuozhe.getThumbsupnum()+1);
        } else {
        	youxiuzuozhe.setCrazilynum(youxiuzuozhe.getCrazilynum()+1);
        }
        youxiuzuozheService.updateById(youxiuzuozhe);
        return R.ok();
    }

    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody YouxiuzuozheEntity youxiuzuozhe, HttpServletRequest request){
    	youxiuzuozhe.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(youxiuzuozhe);

        youxiuzuozheService.insert(youxiuzuozhe);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody YouxiuzuozheEntity youxiuzuozhe, HttpServletRequest request){
    	youxiuzuozhe.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(youxiuzuozhe);

        youxiuzuozheService.insert(youxiuzuozhe);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody YouxiuzuozheEntity youxiuzuozhe, HttpServletRequest request){
        //ValidatorUtils.validateEntity(youxiuzuozhe);
        youxiuzuozheService.updateById(youxiuzuozhe);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        youxiuzuozheService.deleteBatchIds(Arrays.asList(ids));
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
		
		Wrapper<YouxiuzuozheEntity> wrapper = new EntityWrapper<YouxiuzuozheEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}


		int count = youxiuzuozheService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	
	/**
     * 前端智能排序
     */
	@IgnoreAuth
    @RequestMapping("/autoSort")
    public R autoSort(@RequestParam Map<String, Object> params,YouxiuzuozheEntity youxiuzuozhe, HttpServletRequest request,String pre){
        EntityWrapper<YouxiuzuozheEntity> ew = new EntityWrapper<YouxiuzuozheEntity>();
        Map<String, Object> newMap = new HashMap<String, Object>();
        Map<String, Object> param = new HashMap<String, Object>();
		Iterator<Map.Entry<String, Object>> it = param.entrySet().iterator();
		while (it.hasNext()) {
			Map.Entry<String, Object> entry = it.next();
			String key = entry.getKey();
			String newKey = entry.getKey();
			if (pre.endsWith(".")) {
				newMap.put(pre + newKey, entry.getValue());
			} else if (StringUtils.isEmpty(pre)) {
				newMap.put(newKey, entry.getValue());
			} else {
				newMap.put(pre + "." + newKey, entry.getValue());
			}
		}
		params.put("sort", "clicktime");
        
        params.put("order", "desc");
		PageUtils page = youxiuzuozheService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, youxiuzuozhe), params), params));
        return R.ok().put("data", page);
    }


}
