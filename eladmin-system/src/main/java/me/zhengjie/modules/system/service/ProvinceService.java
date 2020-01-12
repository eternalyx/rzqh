package me.zhengjie.modules.system.service;

import me.zhengjie.modules.system.domain.Province;

import java.util.List;

/**
 * @author zhoudanwei
 * @date 2020-01-10
 */
public interface ProvinceService {
    /**
     * 获取所有的省份
     *
     * @return
     */
    public List<Province> findAllProvince();

    /**
     * 查询某省下的市
     *
     * @param pid
     * @return
     */
    List<Province> findCityByProvince(String pid);

    /**
     * 查询某市下的区县
     *
     * @param pid 省份ID
     * @param cid 城市ID
     * @return
     */
    List<Province> findAreaByCity(String pid, String cid);

    /**
     * 查询某区县下的集镇
     *
     * @param pid
     * @param cid
     * @param aid
     * @return /
     */
    List<Province> findTownByArea(String pid, String cid, String aid);
}