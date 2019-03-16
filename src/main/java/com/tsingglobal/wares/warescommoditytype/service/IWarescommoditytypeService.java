package com.tsingglobal.wares.warescommoditytype.service;
import com.tsingglobal.wares.warescommoditytype.dto.WarescommoditytypeDTO;
import java.util.List;
import java.util.Map;
/**
* 描述：请修改类、方法注释 服务实现层接口
* @author Team
* @date Fri Feb 22 04:50:50 CST 2019
*/
public interface IWarescommoditytypeService {

    /**
    * 描述：根据Id获取DTO
    * @param id
    */
    WarescommoditytypeDTO loadWarescommoditytype(long id)throws Exception;

    WarescommoditytypeDTO saveWarescommoditytype(WarescommoditytypeDTO warescommoditytypeDTO) throws Exception;

    void deleteWarescommoditytype(long id) throws Exception;

    WarescommoditytypeDTO updateWarescommoditytype(WarescommoditytypeDTO warescommoditytypeDTO) throws Exception;
    
    List<WarescommoditytypeDTO> listWarescommoditytypes(final Map<String,Object> map) throws Exception;
}