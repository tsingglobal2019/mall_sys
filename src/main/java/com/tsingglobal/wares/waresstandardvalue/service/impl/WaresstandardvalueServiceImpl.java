package com.tsingglobal.wares.waresstandardvalue.service.impl;
import com.tsingglobal.wares.waresstandardvalue.repository.WaresstandardvalueRepository;
import com.tsingglobal.wares.waresstandardvalue.service.IWaresstandardvalueService;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import com.tsingglobal.wares.waresstandardvalue.dto.WaresstandardvalueDTO;
import com.common.utils.SnowflakeIdWorker;
import org.springframework.beans.BeanUtils;

import java.util.List;
import java.util.Map;

/**
* 描述：请修改类、方法注释 服务实现层
* @author Team
* @date Mon Mar 25 00:07:56 CST 2019
*/
@Service
public class WaresstandardvalueServiceImpl implements IWaresstandardvalueService {

    @Autowired
    private WaresstandardvalueRepository waresstandardvalueRepository;

    @Override
    public WaresstandardvalueDTO loadWaresstandardvalue(long id)throws Exception {
     
     	return waresstandardvalueRepository.load(id); 
    }
    
    public void deleteWaresstandardvalue(long id) throws Exception {
     
     	waresstandardvalueRepository.delete(id); 
    }

    @Override
    public WaresstandardvalueDTO saveWaresstandardvalue(final WaresstandardvalueDTO waresstandardvalueDTO) throws Exception {
        
        if( null == waresstandardvalueDTO ){
        	
        	return null;
        }
        
        WaresstandardvalueDTO waresstandardvalue = new WaresstandardvalueDTO();
        
        waresstandardvalue.setId(new SnowflakeIdWorker(0, 0).nextId());
        
        waresstandardvalueRepository.save( waresstandardvalue );
        
        return loadWaresstandardvalue( waresstandardvalue.getId() );
    }

    @Override
    public WaresstandardvalueDTO updateWaresstandardvalue(final WaresstandardvalueDTO waresstandardvalueDTO)throws Exception {
        
         if( (null == waresstandardvalueDTO)  || (0 == waresstandardvalueDTO.getId())){
        	
        	return null;
        }
        
        WaresstandardvalueDTO waresstandardvalue = loadWaresstandardvalue( waresstandardvalueDTO.getId() );
        
        BeanUtils.copyProperties(waresstandardvalue,waresstandardvalueDTO);
        
        waresstandardvalueRepository.update( waresstandardvalue );
        
        return waresstandardvalue;
    }
    
    public List<WaresstandardvalueDTO> listWaresstandardvalues( final Map<String,Object> map) throws Exception {
    
		return waresstandardvalueRepository.queryList(map);
	}
  }
