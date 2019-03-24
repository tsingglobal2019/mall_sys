package com.tsingglobal.wares.warescommodity.service;
import com.tsingglobal.wares.warescommodity.dto.WarescommodityDTO;
import java.util.List;
import java.util.Map;
/**
* 描述：请修改类、方法注释 服务实现层接口
* @author Team
* @date Sun Mar 24 17:27:31 CST 2019
*/
public interface IWarescommodityService {

    /**
    * 描述：根据Id获取DTO
    * @param id
    */
    WarescommodityDTO loadWarescommodity(long id)throws Exception;

    WarescommodityDTO saveWarescommodity(WarescommodityDTO warescommodityDTO) throws Exception;

    void deleteWarescommodity(long id) throws Exception;

    WarescommodityDTO updateWarescommodity(WarescommodityDTO warescommodityDTO) throws Exception;
    
    List<WarescommodityDTO> listWarescommoditys(final Map<String,Object> map) throws Exception;
}