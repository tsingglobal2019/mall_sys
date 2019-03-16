package com.tsingglobal.system.role.service.impl;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.common.utils.SnowflakeIdWorker;
import com.tsingglobal.system.role.dto.TRoleDTO;
import com.tsingglobal.system.role.repository.TRoleRepository;
import com.tsingglobal.system.role.service.ITRoleService;

/**
* 描述：质量问题 服务实现层
* @author Ay
* @date Thu Nov 29 00:34:17 CST 2018
*/
@Service
public class TRoleServiceImpl implements ITRoleService {

    @Autowired
    private TRoleRepository tRoleRepository;

    @Override
    public TRoleDTO loadTRole(long id)throws Exception {
     
     	return tRoleRepository.load(id); 
    }
    
    public void deleteTRole(long id) throws Exception {
     
     	tRoleRepository.delete(id); 
    }

    @Override
    public TRoleDTO saveTRole(final TRoleDTO tRoleDTO) throws Exception {
        
        if( null == tRoleDTO ){
        	
        	return null;
        }
        
        TRoleDTO tRole = new TRoleDTO();
        
        tRole.setId(new SnowflakeIdWorker(0, 0).nextId());
        
        tRoleRepository.save( tRole );
        
        return loadTRole( tRole.getId() );
    }

    @Override
    public TRoleDTO updateTRole(final TRoleDTO tRoleDTO)throws Exception {
        
         if( (null == tRoleDTO)  || (0 == tRoleDTO.getId())){
        	
        	return null;
        }
        
        TRoleDTO tRole = loadTRole( tRoleDTO.getId() );
        
        BeanUtils.copyProperties(tRole,tRoleDTO);
        
        tRoleRepository.update( tRole );
        
        return tRole;
    }
  }
