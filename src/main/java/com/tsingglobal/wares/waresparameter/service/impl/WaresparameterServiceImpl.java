package com.tsingglobal.wares.waresparameter.service.impl;
import com.tsingglobal.wares.waresparameter.repository.WaresparameterRepository;
import com.tsingglobal.wares.waresparameter.service.IWaresparameterService;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import com.tsingglobal.wares.waresparameter.dto.WaresparameterDTO;
import com.common.utils.SnowflakeIdWorker;
import org.springframework.beans.BeanUtils;

import java.util.List;
import java.util.Map;

/**
* 描述：请修改类、方法注释 服务实现层
* @author Team
* @date Fri Feb 22 04:50:50 CST 2019
*/
@Service
public class WaresparameterServiceImpl implements IWaresparameterService {

    @Autowired
    private WaresparameterRepository waresparameterRepository;

    @Override
    public WaresparameterDTO loadWaresparameter(long id)throws Exception {
     
     	return waresparameterRepository.load(id); 
    }
    
    public void deleteWaresparameter(long id) throws Exception {
     
     	waresparameterRepository.delete(id); 
    }

    @Override
    public WaresparameterDTO saveWaresparameter(final WaresparameterDTO waresparameterDTO) throws Exception {
        
        if( null == waresparameterDTO ){
        	
        	return null;
        }
        
        WaresparameterDTO waresparameter = new WaresparameterDTO();
        
        waresparameter.setId(new SnowflakeIdWorker(0, 0).nextId());
        
        waresparameterRepository.save( waresparameter );
        
        return loadWaresparameter( waresparameter.getId() );
    }

    @Override
    public WaresparameterDTO updateWaresparameter(final WaresparameterDTO waresparameterDTO)throws Exception {
        
         if( (null == waresparameterDTO)  || (0 == waresparameterDTO.getId())){
        	
        	return null;
        }
        
        WaresparameterDTO waresparameter = loadWaresparameter( waresparameterDTO.getId() );
        
        BeanUtils.copyProperties(waresparameter,waresparameterDTO);
        
        waresparameterRepository.update( waresparameter );
        
        return waresparameter;
    }
    
    public List<WaresparameterDTO> listWaresparameters( final Map<String,Object> map) throws Exception {
    
		return waresparameterRepository.queryList(map);
	}
  }
