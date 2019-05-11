package com.tsingglobal.wares.warescommodityclassparameter.service.impl;
import com.tsingglobal.wares.warescommodityclassparameter.repository.WarescommodityclassparameterRepository;
import com.tsingglobal.wares.warescommodityclassparameter.service.IWarescommodityclassparameterService;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import com.tsingglobal.wares.warescommodityclassparameter.dto.WarescommodityclassparameterDTO;
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
public class WarescommodityclassparameterServiceImpl implements IWarescommodityclassparameterService {

    @Autowired
    private WarescommodityclassparameterRepository warescommodityclassparameterRepository;

    @Override
    public WarescommodityclassparameterDTO loadWarescommodityclassparameter(long id)throws Exception {
     
     	return warescommodityclassparameterRepository.load(id); 
    }
    
    public void deleteWarescommodityclassparameter(long id) throws Exception {
     
     	warescommodityclassparameterRepository.delete(id); 
    }

    @Override
    public WarescommodityclassparameterDTO saveWarescommodityclassparameter(final WarescommodityclassparameterDTO warescommodityclassparameterDTO) throws Exception {
        
        if( null == warescommodityclassparameterDTO ){
        	
        	return null;
        }
        
        WarescommodityclassparameterDTO warescommodityclassparameter = new WarescommodityclassparameterDTO();
        
        warescommodityclassparameter.setId(new SnowflakeIdWorker(0, 0).nextId());
        
        warescommodityclassparameterRepository.save( warescommodityclassparameter );
        
        return loadWarescommodityclassparameter( warescommodityclassparameter.getId() );
    }

    @Override
    public WarescommodityclassparameterDTO updateWarescommodityclassparameter(final WarescommodityclassparameterDTO warescommodityclassparameterDTO)throws Exception {
        
         if( (null == warescommodityclassparameterDTO)  || (0 == warescommodityclassparameterDTO.getId())){
        	
        	return null;
        }
        
        WarescommodityclassparameterDTO warescommodityclassparameter = loadWarescommodityclassparameter( warescommodityclassparameterDTO.getId() );
        
        BeanUtils.copyProperties(warescommodityclassparameter,warescommodityclassparameterDTO);
        
        warescommodityclassparameterRepository.update( warescommodityclassparameter );
        
        return warescommodityclassparameter;
    }
    
    public List<WarescommodityclassparameterDTO> listWarescommodityclassparameters( final Map<String,Object> map) throws Exception {
    
		return warescommodityclassparameterRepository.queryList(map);
	}
  }
