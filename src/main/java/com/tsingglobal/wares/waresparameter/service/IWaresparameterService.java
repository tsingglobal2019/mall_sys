package com.tsingglobal.wares.waresparameter.service;
import com.tsingglobal.wares.waresparameter.dto.WaresparameterDTO;
import java.util.List;
import java.util.Map;
/**
* 描述：请修改类、方法注释 服务实现层接口
* @author Team
* @date Sun Mar 24 17:27:31 CST 2019
*/
public interface IWaresparameterService {

    /**
    * 描述：根据Id获取DTO
    * @param id
    */
    WaresparameterDTO loadWaresparameter(long id)throws Exception;

    WaresparameterDTO saveWaresparameter(WaresparameterDTO waresparameterDTO) throws Exception;

    void deleteWaresparameter(long id) throws Exception;

    WaresparameterDTO updateWaresparameter(WaresparameterDTO waresparameterDTO) throws Exception;
    
    List<WaresparameterDTO> listWaresparameters(final Map<String,Object> map) throws Exception;
}