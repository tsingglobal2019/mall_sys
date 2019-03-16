package com.tsingglobal.wares.warespreferentialsale.service.impl;
import com.tsingglobal.wares.warespreferentialsale.repository.WarespreferentialsaleRepository;
import com.tsingglobal.wares.warespreferentialsale.service.IWarespreferentialsaleService;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import com.tsingglobal.wares.warespreferentialsale.dto.WarespreferentialsaleDTO;
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
public class WarespreferentialsaleServiceImpl implements IWarespreferentialsaleService {

    @Autowired
    private WarespreferentialsaleRepository warespreferentialsaleRepository;

    @Override
    public WarespreferentialsaleDTO loadWarespreferentialsale(long id)throws Exception {
     
     	return warespreferentialsaleRepository.load(id); 
    }
    
    public void deleteWarespreferentialsale(long id) throws Exception {
     
     	warespreferentialsaleRepository.delete(id); 
    }

    @Override
    public WarespreferentialsaleDTO saveWarespreferentialsale(final WarespreferentialsaleDTO warespreferentialsaleDTO) throws Exception {
        
        if( null == warespreferentialsaleDTO ){
        	
        	return null;
        }
        
        WarespreferentialsaleDTO warespreferentialsale = new WarespreferentialsaleDTO();
        
        warespreferentialsale.setId(new SnowflakeIdWorker(0, 0).nextId());
        
        warespreferentialsaleRepository.save( warespreferentialsale );
        
        return loadWarespreferentialsale( warespreferentialsale.getId() );
    }

    @Override
    public WarespreferentialsaleDTO updateWarespreferentialsale(final WarespreferentialsaleDTO warespreferentialsaleDTO)throws Exception {
        
         if( (null == warespreferentialsaleDTO)  || (0 == warespreferentialsaleDTO.getId())){
        	
        	return null;
        }
        
        WarespreferentialsaleDTO warespreferentialsale = loadWarespreferentialsale( warespreferentialsaleDTO.getId() );
        
        BeanUtils.copyProperties(warespreferentialsale,warespreferentialsaleDTO);
        
        warespreferentialsaleRepository.update( warespreferentialsale );
        
        return warespreferentialsale;
    }
    
    public List<WarespreferentialsaleDTO> listWarespreferentialsales( final Map<String,Object> map) throws Exception {
    
		return warespreferentialsaleRepository.queryList(map);
	}
  }
