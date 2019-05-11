package com.tsingglobal.wares.warescommodityclass.service.impl;
import com.tsingglobal.wares.warescommodityclass.repository.WarescommodityclassRepository;
import com.tsingglobal.wares.warescommodityclass.service.IWarescommodityclassService;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import com.tsingglobal.wares.warescommodityclass.dto.WarescommodityclassDTO;
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
public class WarescommodityclassServiceImpl implements IWarescommodityclassService {

    @Autowired
    private WarescommodityclassRepository warescommodityclassRepository;

    @Override
    public WarescommodityclassDTO loadWarescommodityclass(long id)throws Exception {
     
     	return warescommodityclassRepository.load(id); 
    }
    
    public void deleteWarescommodityclass(long id) throws Exception {
     
     	warescommodityclassRepository.delete(id); 
    }

    @Override
    public WarescommodityclassDTO saveWarescommodityclass(final WarescommodityclassDTO warescommodityclassDTO) throws Exception {
        
        if( null == warescommodityclassDTO ){
        	
        	return null;
        }
        
        WarescommodityclassDTO warescommodityclass = new WarescommodityclassDTO();
        
        warescommodityclass.setId(new SnowflakeIdWorker(0, 0).nextId());
        
        warescommodityclassRepository.save( warescommodityclass );
        
        return loadWarescommodityclass( warescommodityclass.getId() );
    }

    @Override
    public WarescommodityclassDTO updateWarescommodityclass(final WarescommodityclassDTO warescommodityclassDTO)throws Exception {
        
         if( (null == warescommodityclassDTO)  || (0 == warescommodityclassDTO.getId())){
        	
        	return null;
        }
        
        WarescommodityclassDTO warescommodityclass = loadWarescommodityclass( warescommodityclassDTO.getId() );
        
        BeanUtils.copyProperties(warescommodityclass,warescommodityclassDTO);
        
        warescommodityclassRepository.update( warescommodityclass );
        
        return warescommodityclass;
    }
    
    public List<WarescommodityclassDTO> listWarescommodityclasss( final Map<String,Object> map) throws Exception {
    
		return warescommodityclassRepository.queryList(map);
	}
  }
