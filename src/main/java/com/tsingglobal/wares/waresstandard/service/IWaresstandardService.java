package com.tsingglobal.wares.waresstandard.service;
import com.tsingglobal.wares.waresstandard.dto.WaresstandardDTO;
import java.util.List;
import java.util.Map;
/**
* 描述：请修改类、方法注释 服务实现层接口
* @author Team
* @date Fri Feb 22 04:50:50 CST 2019
*/
public interface IWaresstandardService {

    /**
    * 描述：根据Id获取DTO
    * @param id
    */
    WaresstandardDTO loadWaresstandard(long id)throws Exception;

    WaresstandardDTO saveWaresstandard(WaresstandardDTO waresstandardDTO) throws Exception;

    void deleteWaresstandard(long id) throws Exception;

    WaresstandardDTO updateWaresstandard(WaresstandardDTO waresstandardDTO) throws Exception;
    
    List<WaresstandardDTO> listWaresstandards(final Map<String,Object> map) throws Exception;
}