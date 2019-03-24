package com.tsingglobal.wares.waressaletype.service;
import com.tsingglobal.wares.waressaletype.dto.WaressaletypeDTO;
import java.util.List;
import java.util.Map;
/**
* 描述：请修改类、方法注释 服务实现层接口
* @author Team
* @date Sun Mar 24 17:27:31 CST 2019
*/
public interface IWaressaletypeService {

    /**
    * 描述：根据Id获取DTO
    * @param id
    */
    WaressaletypeDTO loadWaressaletype(long id)throws Exception;

    WaressaletypeDTO saveWaressaletype(WaressaletypeDTO waressaletypeDTO) throws Exception;

    void deleteWaressaletype(long id) throws Exception;

    WaressaletypeDTO updateWaressaletype(WaressaletypeDTO waressaletypeDTO) throws Exception;
    
    List<WaressaletypeDTO> listWaressaletypes(final Map<String,Object> map) throws Exception;
}