package com.tsingglobal.wares.warescommodityclassproperty.service;
import com.tsingglobal.wares.warescommodityclassproperty.dto.WarescommodityclasspropertyDTO;
import java.util.List;
import java.util.Map;
/**
* 描述：请修改类、方法注释 服务实现层接口
* @author Team
* @date Mon Mar 25 00:07:55 CST 2019
*/
public interface IWarescommodityclasspropertyService {

    /**
    * 描述：根据Id获取DTO
    * @param id
    */
    WarescommodityclasspropertyDTO loadWarescommodityclassproperty(long id)throws Exception;

    WarescommodityclasspropertyDTO saveWarescommodityclassproperty(WarescommodityclasspropertyDTO warescommodityclasspropertyDTO) throws Exception;

    void deleteWarescommodityclassproperty(long id) throws Exception;

    WarescommodityclasspropertyDTO updateWarescommodityclassproperty(WarescommodityclasspropertyDTO warescommodityclasspropertyDTO) throws Exception;
    
    List<WarescommodityclasspropertyDTO> listWarescommodityclasspropertys(final Map<String,Object> map) throws Exception;
}