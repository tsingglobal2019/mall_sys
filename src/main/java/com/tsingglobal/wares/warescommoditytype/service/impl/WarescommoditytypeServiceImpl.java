package com.tsingglobal.wares.warescommoditytype.service.impl;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import com.common.utils.SnowflakeIdWorker;
import com.tsingglobal.wares.warescommoditytype.dto.WarescommoditytypeDTO;
import com.tsingglobal.wares.warescommoditytype.repository.WarescommoditytypeRepository;
import com.tsingglobal.wares.warescommoditytype.service.IWarescommoditytypeService;

/**
* 描述：请修改类、方法注释 服务实现层
* @author Team
* @date Fri Feb 22 04:50:50 CST 2019
*/
@Service
public class WarescommoditytypeServiceImpl implements IWarescommoditytypeService {

    @Autowired
    private WarescommoditytypeRepository warescommoditytypeRepository;

    @Override
    public WarescommoditytypeDTO loadWarescommoditytype(long id)throws Exception {
     
     	return warescommoditytypeRepository.load(id); 
    }
    
    public void deleteWarescommoditytype(long id) throws Exception {
     
     	warescommoditytypeRepository.delete(id); 
    }

    @Override
    public WarescommoditytypeDTO saveWarescommoditytype(final WarescommoditytypeDTO warescommoditytypeDTO) throws Exception {
        
        if( null == warescommoditytypeDTO ){
        	
        	return null;
        }
        
        WarescommoditytypeDTO warescommoditytype = new WarescommoditytypeDTO();
        
        warescommoditytype.setId(new SnowflakeIdWorker(0, 0).nextId());
        
        warescommoditytypeRepository.save( warescommoditytype );
        
        return loadWarescommoditytype( warescommoditytype.getId() );
    }

    @Override
    public WarescommoditytypeDTO updateWarescommoditytype(final WarescommoditytypeDTO warescommoditytypeDTO)throws Exception {
        
         if( (null == warescommoditytypeDTO)  || (0 == warescommoditytypeDTO.getId())){
        	
        	return null;
        }
        
        WarescommoditytypeDTO warescommoditytype = loadWarescommoditytype( warescommoditytypeDTO.getId() );
        
        BeanUtils.copyProperties(warescommoditytype,warescommoditytypeDTO);
        
        warescommoditytypeRepository.update( warescommoditytype );
        
        return warescommoditytype;
    }
    
    public List<WarescommoditytypeDTO> listWarescommoditytypes( final Map<String,Object> map) throws Exception {
    
		return warescommoditytypeRepository.queryList(map);
	}
    
    @Cacheable(value="listWarescommoditytypes", key="111")
    public List<WarescommoditytypeDTO> listWarescommoditytypes() throws Exception {
    	
    	final Map<String,Object> map = new HashMap<String,Object>();
    	
    	map.put("commoditytypeLevel", 1);
    	
		return warescommoditytypeRepository.queryList(map);
	}
  }
