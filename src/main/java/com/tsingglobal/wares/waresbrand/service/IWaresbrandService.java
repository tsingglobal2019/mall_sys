package com.tsingglobal.wares.waresbrand.service;
import com.tsingglobal.wares.waresbrand.dto.WaresbrandDTO;
import java.util.List;
import java.util.Map;
/**
* 描述：请修改类、方法注释 服务实现层接口
* @author Team
* @date Mon Mar 25 00:07:55 CST 2019
*/
public interface IWaresbrandService {

    /**
    * 描述：根据Id获取DTO
    * @param id
    */
    WaresbrandDTO loadWaresbrand(long id)throws Exception;

    WaresbrandDTO saveWaresbrand(WaresbrandDTO waresbrandDTO) throws Exception;

    void deleteWaresbrand(long id) throws Exception;

    WaresbrandDTO updateWaresbrand(WaresbrandDTO waresbrandDTO) throws Exception;
    
    List<WaresbrandDTO> listWaresbrands(final Map<String,Object> map) throws Exception;
}