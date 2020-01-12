package me.zhengjie.modules.system.service.impl;

import me.zhengjie.modules.system.domain.Province;
import me.zhengjie.modules.system.repository.ProvinceRepository;
import me.zhengjie.modules.system.service.ProvinceService;
import me.zhengjie.modules.system.service.mapper.ProvinceMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author zhoudanwei
 * @date 2020/1/10
 * @description
 **/
@Service
@CacheConfig(cacheNames = "province")
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true, rollbackFor = Exception.class)
public class ProvinceServiceImpl implements ProvinceService {

    @Autowired
    private ProvinceRepository provinceRepository;

    @Autowired
    private ProvinceMapper provinceMapper;

    /**
     * 获取所有的省份
     *
     * @return
     */
    @Override
    public List<Province> findAllProvince() {
        return provinceRepository.findAllProvince();
    }

    /**
     * 查询某省下的市
     *
     * @param pid
     * @return
     */
    @Override
    public List<Province> findCityByProvince(String pid) {
        return provinceRepository.findCityByProvince(pid);
    }

    /**
     * 查询某市下的区县
     *
     * @param pid 省份ID
     * @param cid 城市ID
     * @return
     */
    @Override
    public List<Province> findAreaByCity(String pid, String cid) {
        return provinceRepository.findAreaByCity(pid, cid);
    }

    /**
     * 查询某区县下的集镇
     *
     * @param pid
     * @param cid
     * @param aid
     * @return /
     */
    @Override
    public List<Province> findTownByArea(String pid, String cid, String aid) {
        return provinceRepository.findTownByArea(pid, cid, aid);
    }
}