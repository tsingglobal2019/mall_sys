package com.tsingglobal.wares.waresbrand.service.impl;
import com.tsingglobal.wares.waresbrand.repository.WaresbrandRepository;
import com.tsingglobal.wares.waresbrand.service.IWaresbrandService;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import com.tsingglobal.wares.waresbrand.dto.WaresbrandDTO;
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
public class WaresbrandServiceImpl implements IWaresbrandService {

    @Autowired
    private WaresbrandRepository waresbrandRepository;

    @Override
    public WaresbrandDTO loadWaresbrand(long id)throws Exception {
     
     	return waresbrandRepository.load(id); 
    }
    
    public void deleteWaresbrand(long id) throws Exception {
     
     	waresbrandRepository.delete(id); 
    }

    @Override
    public WaresbrandDTO saveWaresbrand(final WaresbrandDTO waresbrandDTO) throws Exception {
        
        if( null == waresbrandDTO ){
        	
        	return null;
        }
        
        WaresbrandDTO waresbrand = new WaresbrandDTO();
        
        waresbrand.setId(new SnowflakeIdWorker(0, 0).nextId());
        
        waresbrandRepository.save( waresbrand );
        
        return loadWaresbrand( waresbrand.getId() );
    }

    @Override
    public WaresbrandDTO updateWaresbrand(final WaresbrandDTO waresbrandDTO)throws Exception {
        
         if( (null == waresbrandDTO)  || (0 == waresbrandDTO.getId())){
        	
        	return null;
        }
        
        WaresbrandDTO waresbrand = loadWaresbrand( waresbrandDTO.getId() );
        
        BeanUtils.copyProperties(waresbrand,waresbrandDTO);
        
        waresbrandRepository.update( waresbrand );
        
        return waresbrand;
    }
    
    public List<WaresbrandDTO> listWaresbrands( final Map<String,Object> map) throws Exception {
    
		return waresbrandRepository.queryList(map);
	}
  }
