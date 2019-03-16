package com.tsingglobal.wares.waressales.service.impl;
import com.tsingglobal.wares.waressales.repository.WaressalesRepository;
import com.tsingglobal.wares.waressales.service.IWaressalesService;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import com.tsingglobal.wares.waressales.dto.WaressalesDTO;
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
public class WaressalesServiceImpl implements IWaressalesService {

    @Autowired
    private WaressalesRepository waressalesRepository;

    @Override
    public WaressalesDTO loadWaressales(long id)throws Exception {
     
     	return waressalesRepository.load(id); 
    }
    
    public void deleteWaressales(long id) throws Exception {
     
     	waressalesRepository.delete(id); 
    }

    @Override
    public WaressalesDTO saveWaressales(final WaressalesDTO waressalesDTO) throws Exception {
        
        if( null == waressalesDTO ){
        	
        	return null;
        }
        
        WaressalesDTO waressales = new WaressalesDTO();
        
        waressales.setId(new SnowflakeIdWorker(0, 0).nextId());
        
        waressalesRepository.save( waressales );
        
        return loadWaressales( waressales.getId() );
    }

    @Override
    public WaressalesDTO updateWaressales(final WaressalesDTO waressalesDTO)throws Exception {
        
         if( (null == waressalesDTO)  || (0 == waressalesDTO.getId())){
        	
        	return null;
        }
        
        WaressalesDTO waressales = loadWaressales( waressalesDTO.getId() );
        
        BeanUtils.copyProperties(waressales,waressalesDTO);
        
        waressalesRepository.update( waressales );
        
        return waressales;
    }
    
    public List<WaressalesDTO> listWaressaless( final Map<String,Object> map) throws Exception {
    
		return waressalesRepository.queryList(map);
	}
  }
