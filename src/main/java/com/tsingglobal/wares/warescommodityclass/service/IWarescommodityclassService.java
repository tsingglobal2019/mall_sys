package com.tsingglobal.wares.warescommodityclass.service;
import com.tsingglobal.wares.warescommodityclass.dto.WarescommodityclassDTO;
import java.util.List;
import java.util.Map;
/**
* 描述：请修改类、方法注释 服务实现层接口
* @author Team
* @date Mon Mar 25 00:07:55 CST 2019
*/
public interface IWarescommodityclassService {

    /**
    * 描述：根据Id获取DTO
    * @param id
    */
    WarescommodityclassDTO loadWarescommodityclass(long id)throws Exception;

    WarescommodityclassDTO saveWarescommodityclass(WarescommodityclassDTO warescommodityclassDTO) throws Exception;

    void deleteWarescommodityclass(long id) throws Exception;

    WarescommodityclassDTO updateWarescommodityclass(WarescommodityclassDTO warescommodityclassDTO) throws Exception;
    
    List<WarescommodityclassDTO> listWarescommodityclasss(final Map<String,Object> map) throws Exception;
}