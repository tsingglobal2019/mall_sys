package com.tsingglobal.wares.warescontentsale.service.impl;
import com.tsingglobal.wares.warescontentsale.repository.WarescontentsaleRepository;
import com.tsingglobal.wares.warescontentsale.service.IWarescontentsaleService;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import com.tsingglobal.wares.warescontentsale.dto.WarescontentsaleDTO;
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
public class WarescontentsaleServiceImpl implements IWarescontentsaleService {

    @Autowired
    private WarescontentsaleRepository warescontentsaleRepository;

    @Override
    public WarescontentsaleDTO loadWarescontentsale(long id)throws Exception {
     
     	return warescontentsaleRepository.load(id); 
    }
    
    public void deleteWarescontentsale(long id) throws Exception {
     
     	warescontentsaleRepository.delete(id); 
    }

    @Override
    public WarescontentsaleDTO saveWarescontentsale(final WarescontentsaleDTO warescontentsaleDTO) throws Exception {
        
        if( null == warescontentsaleDTO ){
        	
        	return null;
        }
        
        WarescontentsaleDTO warescontentsale = new WarescontentsaleDTO();
        
        warescontentsale.setId(new SnowflakeIdWorker(0, 0).nextId());
        
        warescontentsaleRepository.save( warescontentsale );
        
        return loadWarescontentsale( warescontentsale.getId() );
    }

    @Override
    public WarescontentsaleDTO updateWarescontentsale(final WarescontentsaleDTO warescontentsaleDTO)throws Exception {
        
         if( (null == warescontentsaleDTO)  || (0 == warescontentsaleDTO.getId())){
        	
        	return null;
        }
        
        WarescontentsaleDTO warescontentsale = loadWarescontentsale( warescontentsaleDTO.getId() );
        
        BeanUtils.copyProperties(warescontentsale,warescontentsaleDTO);
        
        warescontentsaleRepository.update( warescontentsale );
        
        return warescontentsale;
    }
    
    public List<WarescontentsaleDTO> listWarescontentsales( final Map<String,Object> map) throws Exception {
    
		return warescontentsaleRepository.queryList(map);
	}
  }
