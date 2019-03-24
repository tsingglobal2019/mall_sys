package com.tsingglobal.wares.waresstandardvalue.service;
import com.tsingglobal.wares.waresstandardvalue.dto.WaresstandardvalueDTO;
import java.util.List;
import java.util.Map;
/**
* 描述：请修改类、方法注释 服务实现层接口
* @author Team
* @date Sun Mar 24 17:27:31 CST 2019
*/
public interface IWaresstandardvalueService {

    /**
    * 描述：根据Id获取DTO
    * @param id
    */
    WaresstandardvalueDTO loadWaresstandardvalue(long id)throws Exception;

    WaresstandardvalueDTO saveWaresstandardvalue(WaresstandardvalueDTO waresstandardvalueDTO) throws Exception;

    void deleteWaresstandardvalue(long id) throws Exception;

    WaresstandardvalueDTO updateWaresstandardvalue(WaresstandardvalueDTO waresstandardvalueDTO) throws Exception;
    
    List<WaresstandardvalueDTO> listWaresstandardvalues(final Map<String,Object> map) throws Exception;
}