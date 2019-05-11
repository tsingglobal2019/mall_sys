package com.tsingglobal.wares.warescontentsale.service;
import com.tsingglobal.wares.warescontentsale.dto.WarescontentsaleDTO;
import java.util.List;
import java.util.Map;
/**
* 描述：请修改类、方法注释 服务实现层接口
* @author Team
* @date Mon Mar 25 00:07:55 CST 2019
*/
public interface IWarescontentsaleService {

    /**
    * 描述：根据Id获取DTO
    * @param id
    */
    WarescontentsaleDTO loadWarescontentsale(long id)throws Exception;

    WarescontentsaleDTO saveWarescontentsale(WarescontentsaleDTO warescontentsaleDTO) throws Exception;

    void deleteWarescontentsale(long id) throws Exception;

    WarescontentsaleDTO updateWarescontentsale(WarescontentsaleDTO warescontentsaleDTO) throws Exception;
    
    List<WarescontentsaleDTO> listWarescontentsales(final Map<String,Object> map) throws Exception;
}