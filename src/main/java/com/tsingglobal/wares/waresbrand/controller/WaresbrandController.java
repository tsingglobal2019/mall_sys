package com.tsingglobal.wares.waresbrand.controller;

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

import com.tsingglobal.wares.waresbrand.service.IWaresbrandService;
import com.tsingglobal.wares.waresbrand.dto.WaresbrandDTO;
import com.common.utils.CommonUtil;
import com.common.utils.IntegerValueFilter;

/**
* 描述：请修改类、方法注释控制层
* @author Team
* @date Mon Mar 25 00:07:55 CST 2019
*/
@RestController
@RequestMapping(value="/waresbrand")
public class WaresbrandController {

    @Autowired
    private IWaresbrandService waresbrandService;
    
    /**
    *列表查询
    */
     @GetMapping(value="/waresbrand/list")
	public void listWaresbrand( final int start, final int length, final int draw) throws Exception {
		
		HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();
		HttpServletResponse response = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getResponse();
		
		PageHelper.startPage(start/length+1, length);
		
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("", request.getParameter(""));
		
		PageInfo<WaresbrandDTO> pageInfo = new PageInfo<WaresbrandDTO>( waresbrandService.listWaresbrands(map) );
		
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
    @RequestMapping(value = "/waresbrand/view/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public void findById(@PathVariable("id") long id) throws Exception {
    
        WaresbrandDTO waresbrandDTO = waresbrandService.loadWaresbrand(id);
        
        CommonUtil.sendJsonData(CommonUtil.getResponse(), JSON.toJSONString(waresbrandDTO,new IntegerValueFilter()));
    }
    
     /**
    * 描述：创建信息
    * 
    */
	@GetMapping(value="/waresbrand/add")
	public void create() throws Exception{
		CommonUtil.success(CommonUtil.getResponse(), 
				JSON.toJSONString( new WaresbrandDTO(),	new IntegerValueFilter() ));
	}

    /**
    * 描述:创建请修改类、方法注释
    * @param waresbrandDTO  请修改类、方法注释DTO
    */
    @RequestMapping(value = "/waresbrand/save", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public void create(@RequestBody WaresbrandDTO waresbrandDTO) throws Exception {
        
        if( CommonUtil.isEmpty(waresbrandDTO)  ) {
			
			CommonUtil.error(CommonUtil.getResponse(),"缺少要保存的数据！");
			
			return ;
		}
		
		WaresbrandDTO waresbrandDTO1 = waresbrandService.saveWaresbrand( waresbrandDTO );
		
		CommonUtil.success(CommonUtil.getResponse(), 
												JSON.toJSONString( waresbrandDTO1,	new IntegerValueFilter() ));
    }

    /**
    * 描述：删除请修改类、方法注释
    * @param id 请修改类、方法注释id
    */
    @RequestMapping(value = "/waresbrand/del/{id}", method = RequestMethod.DELETE, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public void deleteById(@PathVariable("id") long id) throws Exception {
        
        waresbrandService.deleteWaresbrand(id);
        
        CommonUtil.success( CommonUtil.getResponse(), ""+id);
    }
    
    @GetMapping(value="/waresbrand/edit/{id}")
	public void edit(@PathVariable  final long id) throws Exception {
		
		WaresbrandDTO waresbrandDTO = waresbrandService.loadWaresbrand(id);
        
        CommonUtil.sendJsonData(CommonUtil.getResponse(), JSON.toJSONString(waresbrandDTO,new IntegerValueFilter()));
	}

    /**
    * 描述：更新请修改类、方法注释
    * @param id 请修改类、方法注释id
    */
    @RequestMapping(value = "/waresbrand/update/{id}", method = RequestMethod.PUT, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public void updateWaresbrand(@PathVariable("id") long id,@RequestBody WaresbrandDTO waresbrandDTO) throws Exception {
        
        waresbrandDTO.setId(id);
        
        waresbrandService.updateWaresbrand(waresbrandDTO);
        
        CommonUtil.success( CommonUtil.getResponse(), JSON.toJSONString(waresbrandDTO));
    }

}
