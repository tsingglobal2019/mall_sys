package com.tsingglobal.wares.waressales.service;
import com.tsingglobal.wares.waressales.dto.WaressalesDTO;
import java.util.List;
import java.util.Map;
/**
* 描述：请修改类、方法注释 服务实现层接口
* @author Team
* @date Fri Feb 22 04:50:50 CST 2019
*/
public interface IWaressalesService {

    /**
    * 描述：根据Id获取DTO
    * @param id
    */
    WaressalesDTO loadWaressales(long id)throws Exception;

    WaressalesDTO saveWaressales(WaressalesDTO waressalesDTO) throws Exception;

    void deleteWaressales(long id) throws Exception;

    WaressalesDTO updateWaressales(WaressalesDTO waressalesDTO) throws Exception;
    
    List<WaressalesDTO> listWaressaless(final Map<String,Object> map) throws Exception;
}