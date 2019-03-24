package com.tsingglobal.wares.warescommodityclassparameter.service;
import com.tsingglobal.wares.warescommodityclassparameter.dto.WarescommodityclassparameterDTO;
import java.util.List;
import java.util.Map;
/**
* 描述：请修改类、方法注释 服务实现层接口
* @author Team
* @date Sun Mar 24 17:27:31 CST 2019
*/
public interface IWarescommodityclassparameterService {

    /**
    * 描述：根据Id获取DTO
    * @param id
    */
    WarescommodityclassparameterDTO loadWarescommodityclassparameter(long id)throws Exception;

    WarescommodityclassparameterDTO saveWarescommodityclassparameter(WarescommodityclassparameterDTO warescommodityclassparameterDTO) throws Exception;

    void deleteWarescommodityclassparameter(long id) throws Exception;

    WarescommodityclassparameterDTO updateWarescommodityclassparameter(WarescommodityclassparameterDTO warescommodityclassparameterDTO) throws Exception;
    
    List<WarescommodityclassparameterDTO> listWarescommodityclassparameters(final Map<String,Object> map) throws Exception;
}