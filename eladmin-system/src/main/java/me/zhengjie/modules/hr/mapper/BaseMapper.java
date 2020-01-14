package me.zhengjie.modules.hr.mapper;

import java.util.List;
import java.util.Map;

/**
 * @author zhoudanwei
 * @description
 * @date 2020/1/14 22:48
 */
public interface BaseMapper<T> {
    T queryObject(String t);

    List<T> queryList(Map<String, Object> map);

    int queryTotal(Map<String, Object> map);

    void save(T hrWorkExperience);

    void update(T hrWorkExperience);

    void delete(String id);

    void deleteBatch(String[] ids);
}
