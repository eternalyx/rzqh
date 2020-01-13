package me.zhengjie.modules.system.repository;

import me.zhengjie.modules.system.domain.Province;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

/**
 * @author zhoudanwei
 * @date 2020-01-08
 * @description 省市县乡镇对应关系表
 */
public interface ProvinceRepository extends JpaRepository<Province, Integer>, JpaSpecificationExecutor<Province> {

    /**
     * 查询所有的省份
     *
     * @return
     */
    @Query(value = "select * from province where city = '0' and area='0' and town='0'", nativeQuery = true)
    List<Province> findAllProvince();

    /**
     * 查询某省下的市
     *
     * @param pid
     * @return
     */
    @Query(value = "select * from province where province = ?1 and city != '0' and area='0' and town='0'", nativeQuery = true)
    List<Province> findCityByProvince(String pid);

    /**
     * 查询某市下的区县
     *
     * @param pid 省份ID
     * @param cid 城市ID
     * @return
     */
    @Query(value = "select * from province where province = ?1 and city = ?2 and area!='0' and town='0'", nativeQuery = true)
    List<Province> findAreaByCity(String pid, String cid);

    /**
     * 查询某区县下的集镇
     *
     * @param pid
     * @param cid
     * @param aid
     * @return /
     */
    @Query(value = "select * from province where province = ?1 and city = ?2 and area=?3 and town!='0'", nativeQuery = true)
    List<Province> findTownByArea(String pid, String cid, String aid);
}