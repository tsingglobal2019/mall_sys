package com.tsingglobal.wares.waressaletype.service.impl;
import com.tsingglobal.wares.waressaletype.repository.WaressaletypeRepository;
import com.tsingglobal.wares.waressaletype.service.IWaressaletypeService;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import com.tsingglobal.wares.waressaletype.dto.WaressaletypeDTO;
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
public class WaressaletypeServiceImpl implements IWaressaletypeService {

    @Autowired
    private WaressaletypeRepository waressaletypeRepository;

    @Override
    public WaressaletypeDTO loadWaressaletype(long id)throws Exception {
     
     	return waressaletypeRepository.load(id); 
    }
    
    public void deleteWaressaletype(long id) throws Exception {
     
     	waressaletypeRepository.delete(id); 
    }

    @Override
    public WaressaletypeDTO saveWaressaletype(final WaressaletypeDTO waressaletypeDTO) throws Exception {
        
        if( null == waressaletypeDTO ){
        	
        	return null;
        }
        
        WaressaletypeDTO waressaletype = new WaressaletypeDTO();
        
        waressaletype.setId(new SnowflakeIdWorker(0, 0).nextId());
        
        waressaletypeRepository.save( waressaletype );
        
        return loadWaressaletype( waressaletype.getId() );
    }

    @Override
    public WaressaletypeDTO updateWaressaletype(final WaressaletypeDTO waressaletypeDTO)throws Exception {
        
         if( (null == waressaletypeDTO)  || (0 == waressaletypeDTO.getId())){
        	
        	return null;
        }
        
        WaressaletypeDTO waressaletype = loadWaressaletype( waressaletypeDTO.getId() );
        
        BeanUtils.copyProperties(waressaletype,waressaletypeDTO);
        
        waressaletypeRepository.update( waressaletype );
        
        return waressaletype;
    }
    
    public List<WaressaletypeDTO> listWaressaletypes( final Map<String,Object> map) throws Exception {
    
		return waressaletypeRepository.queryList(map);
	}
  }
