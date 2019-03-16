package com.tsingglobal.wares.waressteppricesale.service.impl;
import com.tsingglobal.wares.waressteppricesale.repository.WaressteppricesaleRepository;
import com.tsingglobal.wares.waressteppricesale.service.IWaressteppricesaleService;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import com.tsingglobal.wares.waressteppricesale.dto.WaressteppricesaleDTO;
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
public class WaressteppricesaleServiceImpl implements IWaressteppricesaleService {

    @Autowired
    private WaressteppricesaleRepository waressteppricesaleRepository;

    @Override
    public WaressteppricesaleDTO loadWaressteppricesale(long id)throws Exception {
     
     	return waressteppricesaleRepository.load(id); 
    }
    
    public void deleteWaressteppricesale(long id) throws Exception {
     
     	waressteppricesaleRepository.delete(id); 
    }

    @Override
    public WaressteppricesaleDTO saveWaressteppricesale(final WaressteppricesaleDTO waressteppricesaleDTO) throws Exception {
        
        if( null == waressteppricesaleDTO ){
        	
        	return null;
        }
        
        WaressteppricesaleDTO waressteppricesale = new WaressteppricesaleDTO();
        
        waressteppricesale.setId(new SnowflakeIdWorker(0, 0).nextId());
        
        waressteppricesaleRepository.save( waressteppricesale );
        
        return loadWaressteppricesale( waressteppricesale.getId() );
    }

    @Override
    public WaressteppricesaleDTO updateWaressteppricesale(final WaressteppricesaleDTO waressteppricesaleDTO)throws Exception {
        
         if( (null == waressteppricesaleDTO)  || (0 == waressteppricesaleDTO.getId())){
        	
        	return null;
        }
        
        WaressteppricesaleDTO waressteppricesale = loadWaressteppricesale( waressteppricesaleDTO.getId() );
        
        BeanUtils.copyProperties(waressteppricesale,waressteppricesaleDTO);
        
        waressteppricesaleRepository.update( waressteppricesale );
        
        return waressteppricesale;
    }
    
    public List<WaressteppricesaleDTO> listWaressteppricesales( final Map<String,Object> map) throws Exception {
    
		return waressteppricesaleRepository.queryList(map);
	}
  }
