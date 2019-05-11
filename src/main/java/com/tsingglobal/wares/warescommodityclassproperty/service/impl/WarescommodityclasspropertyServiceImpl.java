package com.tsingglobal.wares.warescommodityclassproperty.service.impl;
import com.tsingglobal.wares.warescommodityclassproperty.repository.WarescommodityclasspropertyRepository;
import com.tsingglobal.wares.warescommodityclassproperty.service.IWarescommodityclasspropertyService;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import com.tsingglobal.wares.warescommodityclassproperty.dto.WarescommodityclasspropertyDTO;
import com.common.utils.SnowflakeIdWorker;
import org.springframework.beans.BeanUtils;

import java.util.List;
import java.util.Map;

/**
* 描述：请修改类、方法注释 服务实现层
* @author Team
* @date Mon Mar 25 00:07:55 CST 2019
*/
@Service
public class WarescommodityclasspropertyServiceImpl implements IWarescommodityclasspropertyService {

    @Autowired
    private WarescommodityclasspropertyRepository warescommodityclasspropertyRepository;

    @Override
    public WarescommodityclasspropertyDTO loadWarescommodityclassproperty(long id)throws Exception {
     
     	return warescommodityclasspropertyRepository.load(id); 
    }
    
    public void deleteWarescommodityclassproperty(long id) throws Exception {
     
     	warescommodityclasspropertyRepository.delete(id); 
    }

    @Override
    public WarescommodityclasspropertyDTO saveWarescommodityclassproperty(final WarescommodityclasspropertyDTO warescommodityclasspropertyDTO) throws Exception {
        
        if( null == warescommodityclasspropertyDTO ){
        	
        	return null;
        }
        
        WarescommodityclasspropertyDTO warescommodityclassproperty = new WarescommodityclasspropertyDTO();
        
        warescommodityclassproperty.setId(new SnowflakeIdWorker(0, 0).nextId());
        
        warescommodityclasspropertyRepository.save( warescommodityclassproperty );
        
        return loadWarescommodityclassproperty( warescommodityclassproperty.getId() );
    }

    @Override
    public WarescommodityclasspropertyDTO updateWarescommodityclassproperty(final WarescommodityclasspropertyDTO warescommodityclasspropertyDTO)throws Exception {
        
         if( (null == warescommodityclasspropertyDTO)  || (0 == warescommodityclasspropertyDTO.getId())){
        	
        	return null;
        }
        
        WarescommodityclasspropertyDTO warescommodityclassproperty = loadWarescommodityclassproperty( warescommodityclasspropertyDTO.getId() );
        
        BeanUtils.copyProperties(warescommodityclassproperty,warescommodityclasspropertyDTO);
        
        warescommodityclasspropertyRepository.update( warescommodityclassproperty );
        
        return warescommodityclassproperty;
    }
    
    public List<WarescommodityclasspropertyDTO> listWarescommodityclasspropertys( final Map<String,Object> map) throws Exception {
    
		return warescommodityclasspropertyRepository.queryList(map);
	}
  }
