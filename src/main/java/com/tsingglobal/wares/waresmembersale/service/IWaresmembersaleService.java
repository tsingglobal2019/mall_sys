package com.tsingglobal.wares.waresmembersale.service;
import com.tsingglobal.wares.waresmembersale.dto.WaresmembersaleDTO;
import java.util.List;
import java.util.Map;
/**
* 描述：请修改类、方法注释 服务实现层接口
* @author Team
* @date Mon Mar 25 00:07:55 CST 2019
*/
public interface IWaresmembersaleService {

    /**
    * 描述：根据Id获取DTO
    * @param id
    */
    WaresmembersaleDTO loadWaresmembersale(long id)throws Exception;

    WaresmembersaleDTO saveWaresmembersale(WaresmembersaleDTO waresmembersaleDTO) throws Exception;

    void deleteWaresmembersale(long id) throws Exception;

    WaresmembersaleDTO updateWaresmembersale(WaresmembersaleDTO waresmembersaleDTO) throws Exception;
    
    List<WaresmembersaleDTO> listWaresmembersales(final Map<String,Object> map) throws Exception;
}