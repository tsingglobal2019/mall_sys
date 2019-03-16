package com.tsingglobal.wares.warespreferentialsale.service;
import com.tsingglobal.wares.warespreferentialsale.dto.WarespreferentialsaleDTO;
import java.util.List;
import java.util.Map;
/**
* 描述：请修改类、方法注释 服务实现层接口
* @author Team
* @date Fri Feb 22 04:50:50 CST 2019
*/
public interface IWarespreferentialsaleService {

    /**
    * 描述：根据Id获取DTO
    * @param id
    */
    WarespreferentialsaleDTO loadWarespreferentialsale(long id)throws Exception;

    WarespreferentialsaleDTO saveWarespreferentialsale(WarespreferentialsaleDTO warespreferentialsaleDTO) throws Exception;

    void deleteWarespreferentialsale(long id) throws Exception;

    WarespreferentialsaleDTO updateWarespreferentialsale(WarespreferentialsaleDTO warespreferentialsaleDTO) throws Exception;
    
    List<WarespreferentialsaleDTO> listWarespreferentialsales(final Map<String,Object> map) throws Exception;
}