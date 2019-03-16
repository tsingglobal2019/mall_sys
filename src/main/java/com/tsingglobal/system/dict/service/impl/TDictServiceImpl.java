package com.tsingglobal.system.dict.service.impl;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.common.utils.SnowflakeIdWorker;
import com.tsingglobal.system.dict.dto.TDictDTO;
import com.tsingglobal.system.dict.repository.TDictRepository;
import com.tsingglobal.system.dict.service.ITDictService;

/**
* 描述：数据字典 服务实现层
* @author Ay
* @date Thu Nov 29 00:41:57 CST 2018
*/
@Service
public class TDictServiceImpl implements ITDictService {

    @Autowired
    private TDictRepository tDictRepository;

    @Override
    public TDictDTO loadTDict(long id)throws Exception {
     
     	return tDictRepository.load(id); 
    }
    
    public void deleteTDict(long id) throws Exception {
     
     	tDictRepository.delete(id); 
    }

    @Override
    public TDictDTO saveTDict(final TDictDTO tDictDTO) throws Exception {
        
        if( null == tDictDTO ){
        	
        	return null;
        }
        
        TDictDTO tDict = new TDictDTO();
        
        tDict.setId(new SnowflakeIdWorker(0, 0).nextId());
        
        tDictRepository.save( tDict );
        
        return loadTDict( tDict.getId() );
    }

    @Override
    public TDictDTO updateTDict(final TDictDTO tDictDTO)throws Exception {
        
         if( (null == tDictDTO)  || (0 == tDictDTO.getId())){
        	
        	return null;
        }
        
        TDictDTO tDict = loadTDict( tDictDTO.getId() );
        
        BeanUtils.copyProperties(tDict,tDictDTO);
        
        tDictRepository.update( tDict );
        
        return tDict;
    }
  }
