package com.tsingglobal.wares.warescommoditytype.controller;

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

import com.tsingglobal.wares.warescommoditytype.service.IWarescommoditytypeService;
import com.tsingglobal.wares.warescommoditytype.dto.WarescommoditytypeDTO;
import com.common.utils.CommonUtil;
import com.common.utils.IntegerValueFilter;

/**
* 描述：请修改类、方法注释控制层
* @author Team
* @date Fri Feb 22 04:50:50 CST 2019
*/
@RestController
@RequestMapping(value="/warescommoditytype")
public class WarescommoditytypeController {

    @Autowired
    private IWarescommoditytypeService warescommoditytypeService;
    
    /**
    *列表查询
    */
     @GetMapping(value="/warescommoditytype/list")
	public void listWarescommoditytype( final int start, final int length, final int draw) throws Exception {
		
		HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();
		HttpServletResponse response = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getResponse();
		
		PageHelper.startPage(start/length+1, length);
		
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("", request.getParameter(""));
		
		PageInfo<WarescommoditytypeDTO> pageInfo = new PageInfo<WarescommoditytypeDTO>( warescommoditytypeService.listWarescommoditytypes(map) );
		
		JSONObject obj = new JSONObject();
		obj.put("draw", draw);
		obj.put("recordsTotal", pageInfo.getTotal());
		obj.put("recordsFiltered", pageInfo.getTotal());
		obj.put("data", JSONArray.parseArray( JSON.toJSONString(pageInfo.getList(),new IntegerValueFilter())));
		
		CommonUtil.sendJsonData(response, obj.toJSONString());
	}
     
     @GetMapping(value="/getWarescommoditytype")
     public void getWarescommoditytype() {
    	 try {
    		 IntegerValueFilter intFilter = new IntegerValueFilter();
    		 
			CommonUtil.success( JSONArray.parseArray( JSON.toJSONString(this.warescommoditytypeService.listWarescommoditytypes() ,intFilter)).toJSONString());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
     }

    /**
    * 描述：根据Id 查询
    * @param id  请修改类、方法注释id
    */
    @RequestMapping(value = "/warescommoditytype/view/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public void findById(@PathVariable("id") long id) throws Exception {
    
        WarescommoditytypeDTO warescommoditytypeDTO = warescommoditytypeService.loadWarescommoditytype(id);
        
        CommonUtil.sendJsonData(CommonUtil.getResponse(), JSON.toJSONString(warescommoditytypeDTO,new IntegerValueFilter()));
    }
    
     /**
    * 描述：创建信息
    * 
    */
	@GetMapping(value="/warescommoditytype/add")
	public void create() throws Exception{
		CommonUtil.success(CommonUtil.getResponse(), 
				JSON.toJSONString( new WarescommoditytypeDTO(),	new IntegerValueFilter() ));
	}

    /**
    * 描述:创建请修改类、方法注释
    * @param warescommoditytypeDTO  请修改类、方法注释DTO
    */
    @RequestMapping(value = "/warescommoditytype/save", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public void create(@RequestBody WarescommoditytypeDTO warescommoditytypeDTO) throws Exception {
        
        if( CommonUtil.isEmpty(warescommoditytypeDTO)  ) {
			
			CommonUtil.error(CommonUtil.getResponse(),"缺少要保存的数据！");
			
			return ;
		}
		
		WarescommoditytypeDTO warescommoditytypeDTO1 = warescommoditytypeService.saveWarescommoditytype( warescommoditytypeDTO );
		
		CommonUtil.success(CommonUtil.getResponse(), 
												JSON.toJSONString( warescommoditytypeDTO1,	new IntegerValueFilter() ));
    }

    /**
    * 描述：删除请修改类、方法注释
    * @param id 请修改类、方法注释id
    */
    @RequestMapping(value = "/warescommoditytype/del/{id}", method = RequestMethod.DELETE, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public void deleteById(@PathVariable("id") long id) throws Exception {
        
        warescommoditytypeService.deleteWarescommoditytype(id);
        
        CommonUtil.success( CommonUtil.getResponse(), ""+id);
    }
    
    @GetMapping(value="/warescommoditytype/edit/{id}")
	public void edit(@PathVariable  final long id) throws Exception {
		
		WarescommoditytypeDTO warescommoditytypeDTO = warescommoditytypeService.loadWarescommoditytype(id);
        
        CommonUtil.sendJsonData(CommonUtil.getResponse(), JSON.toJSONString(warescommoditytypeDTO,new IntegerValueFilter()));
	}

    /**
    * 描述：更新请修改类、方法注释
    * @param id 请修改类、方法注释id
    */
    @RequestMapping(value = "/warescommoditytype/update/{id}", method = RequestMethod.PUT, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public void updateWarescommoditytype(@PathVariable("id") long id,@RequestBody WarescommoditytypeDTO warescommoditytypeDTO) throws Exception {
        
        warescommoditytypeDTO.setId(id);
        
        warescommoditytypeService.updateWarescommoditytype(warescommoditytypeDTO);
        
        CommonUtil.success( CommonUtil.getResponse(), JSON.toJSONString(warescommoditytypeDTO));
    }

}
