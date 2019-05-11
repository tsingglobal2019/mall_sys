package com.tsingglobal.wares.waressteppricesale.service;
import com.tsingglobal.wares.waressteppricesale.dto.WaressteppricesaleDTO;
import java.util.List;
import java.util.Map;
/**
* 描述：请修改类、方法注释 服务实现层接口
* @author Team
* @date Mon Mar 25 00:07:56 CST 2019
*/
public interface IWaressteppricesaleService {

    /**
    * 描述：根据Id获取DTO
    * @param id
    */
    WaressteppricesaleDTO loadWaressteppricesale(long id)throws Exception;

    WaressteppricesaleDTO saveWaressteppricesale(WaressteppricesaleDTO waressteppricesaleDTO) throws Exception;

    void deleteWaressteppricesale(long id) throws Exception;

    WaressteppricesaleDTO updateWaressteppricesale(WaressteppricesaleDTO waressteppricesaleDTO) throws Exception;
    
    List<WaressteppricesaleDTO> listWaressteppricesales(final Map<String,Object> map) throws Exception;
}