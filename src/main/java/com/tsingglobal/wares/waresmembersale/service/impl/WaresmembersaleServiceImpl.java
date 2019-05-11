package com.tsingglobal.wares.waresmembersale.service.impl;
import com.tsingglobal.wares.waresmembersale.repository.WaresmembersaleRepository;
import com.tsingglobal.wares.waresmembersale.service.IWaresmembersaleService;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import com.tsingglobal.wares.waresmembersale.dto.WaresmembersaleDTO;
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
public class WaresmembersaleServiceImpl implements IWaresmembersaleService {

    @Autowired
    private WaresmembersaleRepository waresmembersaleRepository;

    @Override
    public WaresmembersaleDTO loadWaresmembersale(long id)throws Exception {
     
     	return waresmembersaleRepository.load(id); 
    }
    
    public void deleteWaresmembersale(long id) throws Exception {
     
     	waresmembersaleRepository.delete(id); 
    }

    @Override
    public WaresmembersaleDTO saveWaresmembersale(final WaresmembersaleDTO waresmembersaleDTO) throws Exception {
        
        if( null == waresmembersaleDTO ){
        	
        	return null;
        }
        
        WaresmembersaleDTO waresmembersale = new WaresmembersaleDTO();
        
        waresmembersale.setId(new SnowflakeIdWorker(0, 0).nextId());
        
        waresmembersaleRepository.save( waresmembersale );
        
        return loadWaresmembersale( waresmembersale.getId() );
    }

    @Override
    public WaresmembersaleDTO updateWaresmembersale(final WaresmembersaleDTO waresmembersaleDTO)throws Exception {
        
         if( (null == waresmembersaleDTO)  || (0 == waresmembersaleDTO.getId())){
        	
        	return null;
        }
        
        WaresmembersaleDTO waresmembersale = loadWaresmembersale( waresmembersaleDTO.getId() );
        
        BeanUtils.copyProperties(waresmembersale,waresmembersaleDTO);
        
        waresmembersaleRepository.update( waresmembersale );
        
        return waresmembersale;
    }
    
    public List<WaresmembersaleDTO> listWaresmembersales( final Map<String,Object> map) throws Exception {
    
		return waresmembersaleRepository.queryList(map);
	}
  }
