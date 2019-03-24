package com.tsingglobal.wares.waresstandard.service.impl;
import com.tsingglobal.wares.waresstandard.repository.WaresstandardRepository;
import com.tsingglobal.wares.waresstandard.service.IWaresstandardService;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import com.tsingglobal.wares.waresstandard.dto.WaresstandardDTO;
import com.common.utils.SnowflakeIdWorker;
import org.springframework.beans.BeanUtils;

import java.util.List;
import java.util.Map;

/**
* 描述：请修改类、方法注释 服务实现层
* @author Team
* @date Sun Mar 24 17:27:31 CST 2019
*/
@Service
public class WaresstandardServiceImpl implements IWaresstandardService {

    @Autowired
    private WaresstandardRepository waresstandardRepository;

    @Override
    public WaresstandardDTO loadWaresstandard(long id)throws Exception {
     
     	return waresstandardRepository.load(id); 
    }
    
    public void deleteWaresstandard(long id) throws Exception {
     
     	waresstandardRepository.delete(id); 
    }

    @Override
    public WaresstandardDTO saveWaresstandard(final WaresstandardDTO waresstandardDTO) throws Exception {
        
        if( null == waresstandardDTO ){
        	
        	return null;
        }
        
        WaresstandardDTO waresstandard = new WaresstandardDTO();
        
        waresstandard.setId(new SnowflakeIdWorker(0, 0).nextId());
        
        waresstandardRepository.save( waresstandard );
        
        return loadWaresstandard( waresstandard.getId() );
    }

    @Override
    public WaresstandardDTO updateWaresstandard(final WaresstandardDTO waresstandardDTO)throws Exception {
        
         if( (null == waresstandardDTO)  || (0 == waresstandardDTO.getId())){
        	
        	return null;
        }
        
        WaresstandardDTO waresstandard = loadWaresstandard( waresstandardDTO.getId() );
        
        BeanUtils.copyProperties(waresstandard,waresstandardDTO);
        
        waresstandardRepository.update( waresstandard );
        
        return waresstandard;
    }
    
    public List<WaresstandardDTO> listWaresstandards( final Map<String,Object> map) throws Exception {
    
		return waresstandardRepository.queryList(map);
	}
  }
