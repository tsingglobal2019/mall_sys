package com.tsingglobal.wares.warescommodity.service.impl;
import com.tsingglobal.wares.warescommodity.repository.WarescommodityRepository;
import com.tsingglobal.wares.warescommodity.service.IWarescommodityService;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import com.tsingglobal.wares.warescommodity.dto.WarescommodityDTO;
import com.common.utils.SnowflakeIdWorker;
import org.springframework.beans.BeanUtils;

import java.util.List;
import java.util.Map;

/**
* 描述：请修改类、方法注释 服务实现层
* @author Team
* @date Fri Feb 22 04:50:49 CST 2019
*/
@Service
public class WarescommodityServiceImpl implements IWarescommodityService {

    @Autowired
    private WarescommodityRepository warescommodityRepository;

    @Override
    public WarescommodityDTO loadWarescommodity(long id)throws Exception {
     
     	return warescommodityRepository.load(id); 
    }
    
    public void deleteWarescommodity(long id) throws Exception {
     
     	warescommodityRepository.delete(id); 
    }

    @Override
    public WarescommodityDTO saveWarescommodity(final WarescommodityDTO warescommodityDTO) throws Exception {
        
        if( null == warescommodityDTO ){
        	
        	return null;
        }
        
        WarescommodityDTO warescommodity = new WarescommodityDTO();
        
        warescommodity.setId(new SnowflakeIdWorker(0, 0).nextId());
        
        warescommodityRepository.save( warescommodity );
        
        return loadWarescommodity( warescommodity.getId() );
    }

    @Override
    public WarescommodityDTO updateWarescommodity(final WarescommodityDTO warescommodityDTO)throws Exception {
        
         if( (null == warescommodityDTO)  || (0 == warescommodityDTO.getId())){
        	
        	return null;
        }
        
        WarescommodityDTO warescommodity = loadWarescommodity( warescommodityDTO.getId() );
        
        BeanUtils.copyProperties(warescommodity,warescommodityDTO);
        
        warescommodityRepository.update( warescommodity );
        
        return warescommodity;
    }
    
    public List<WarescommodityDTO> listWarescommoditys( final Map<String,Object> map) throws Exception {
    
		return warescommodityRepository.queryList(map);
	}
  }
