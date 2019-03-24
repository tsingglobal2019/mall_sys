package com.tsingglobal.wares.waresstandardvalue.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.http.MediaType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import com.tsingglobal.wares.waresstandardvalue.service.IWaresstandardvalueService;
import com.tsingglobal.wares.waresstandardvalue.dto.WaresstandardvalueDTO;
import com.common.utils.CommonUtil;
import com.common.utils.IntegerValueFilter;

/**
* 描述：请修改类、方法注释控制层
* @author Team
* @date Sun Mar 24 17:27:31 CST 2019
*/
@RestController
@RequestMapping(value="/waresstandardvalue")
public class WaresstandardvalueController {

    @Autowired
    private IWaresstandardvalueService waresstandardvalueService;
    
    /**
    *列表查询
    */
     @GetMapping(value="/waresstandardvalue/list")
	public void listWaresstandardvalue( final int start, final int length, final int draw) throws Exception {
		
		HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();
		HttpServletResponse response = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getResponse();
		
		PageHelper.startPage(start/length+1, length);
		
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("", request.getParameter(""));
		
		PageInfo<WaresstandardvalueDTO> pageInfo = new PageInfo<WaresstandardvalueDTO>( waresstandardvalueService.listWaresstandardvalues(map) );
		
		JSONObject obj = new JSONObject();
		obj.put("draw", draw);
		obj.put("recordsTotal", pageInfo.getTotal());
		obj.put("recordsFiltered", pageInfo.getTotal());
		obj.put("data", JSONArray.parseArray( JSON.toJSONString(pageInfo.getList(),new IntegerValueFilter())));
		
		CommonUtil.sendJsonData(response, obj.toJSONString());
	}

    /**
    * 描述：根据Id 查询
    * @param id  请修改类、方法注释id
    */
    @RequestMapping(value = "/waresstandardvalue/view/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public void findById(@PathVariable("id") long id) throws Exception {
    
        WaresstandardvalueDTO waresstandardvalueDTO = waresstandardvalueService.loadWaresstandardvalue(id);
        
        CommonUtil.sendJsonData(CommonUtil.getResponse(), JSON.toJSONString(waresstandardvalueDTO,new IntegerValueFilter()));
    }
    
     /**
    * 描述：创建信息
    * 
    */
	@GetMapping(value="/waresstandardvalue/add")
	public void create() throws Exception{
		CommonUtil.success(CommonUtil.getResponse(), 
				JSON.toJSONString( new WaresstandardvalueDTO(),	new IntegerValueFilter() ));
	}

    /**
    * 描述:创建请修改类、方法注释
    * @param waresstandardvalueDTO  请修改类、方法注释DTO
    */
    @RequestMapping(value = "/waresstandardvalue/save", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public void create(@RequestBody WaresstandardvalueDTO waresstandardvalueDTO) throws Exception {
        
        if( CommonUtil.isEmpty(waresstandardvalueDTO)  ) {
			
			CommonUtil.error(CommonUtil.getResponse(),"缺少要保存的数据！");
			
			return ;
		}
		
		WaresstandardvalueDTO waresstandardvalueDTO1 = waresstandardvalueService.saveWaresstandardvalue( waresstandardvalueDTO );
		
		CommonUtil.success(CommonUtil.getResponse(), 
												JSON.toJSONString( waresstandardvalueDTO1,	new IntegerValueFilter() ));
    }

    /**
    * 描述：删除请修改类、方法注释
    * @param id 请修改类、方法注释id
    */
    @RequestMapping(value = "/waresstandardvalue/del/{id}", method = RequestMethod.DELETE, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public void deleteById(@PathVariable("id") long id) throws Exception {
        
        waresstandardvalueService.deleteWaresstandardvalue(id);
        
        CommonUtil.success( CommonUtil.getResponse(), ""+id);
    }
    
    @GetMapping(value="/waresstandardvalue/edit/{id}")
	public void edit(@PathVariable  final long id) throws Exception {
		
		WaresstandardvalueDTO waresstandardvalueDTO = waresstandardvalueService.loadWaresstandardvalue(id);
        
        CommonUtil.sendJsonData(CommonUtil.getResponse(), JSON.toJSONString(waresstandardvalueDTO,new IntegerValueFilter()));
	}

    /**
    * 描述：更新请修改类、方法注释
    * @param id 请修改类、方法注释id
    */
    @RequestMapping(value = "/waresstandardvalue/update/{id}", method = RequestMethod.PUT, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public void updateWaresstandardvalue(@PathVariable("id") long id,@RequestBody WaresstandardvalueDTO waresstandardvalueDTO) throws Exception {
        
        waresstandardvalueDTO.setId(id);
        
        waresstandardvalueService.updateWaresstandardvalue(waresstandardvalueDTO);
        
        CommonUtil.success( CommonUtil.getResponse(), JSON.toJSONString(waresstandardvalueDTO));
    }

}
