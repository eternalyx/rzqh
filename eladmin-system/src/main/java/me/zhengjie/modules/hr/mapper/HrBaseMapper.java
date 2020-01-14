package me.zhengjie.modules.hr.mapper;

import javafx.scene.control.Pagination;
import org.springframework.data.domain.Sort;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * @author liuyi
 * @date 2020-01-14 15:57:31
 */
public interface HrBaseMapper<T> {
    /***
     * 保存一个对象
     * @param t
     */
    void save(T t);

    /***
     * 根据id从几何中查询对象
     * @param id
     * @return
     */
    T queryById(String id);

    /**
     * 根据条件查询集合
     *
     * @param object
     * @param selectFields 指定要查询的字段，不指定则查询全部字段
     * @return
     */
    List<T> queryList(T object, List<String> selectFields);

    /**
     * 根据条件查询只返回一个文档
     *
     * @param object
     * @return
     */
    T queryOne(T object);

    /***
     * 根据条件分页查询
     * @param object
     * @param pagination 分页对象
     * @param selectFields  指定要查询的字段，不指定则查询全部字段
     * @return
     */
    List<T> getPage(T object, Pagination pagination, List<String> selectFields);

    /**
     * 根据查询条件、过滤条件分页查询
     *
     * @param object
     * @param pagination   分页对象
     * @param ordersMap    排序设置
     * @param selectFields 指定要查询的字段，不指定则查询全部字段
     * @return
     */
    List<T> getPage(T object, Pagination pagination, LinkedHashMap<String, Sort.Direction> ordersMap, List<String> selectFields);


    /***
     * 根据条件查询库中符合条件的记录数量
     * @param object
     * @return
     */
    Long getCount(T object);

    /***
     * 删除对象
     * @param t
     * @return
     */
    int delete(T t);

    /**
     * 根据id删除
     *
     * @param id
     */
    int deleteById(Object id);

    /**
     * 更新指定id的记录
     *
     * @param id        要更新的记录ID
     * @param targetObj 更新的内容
     * @return
     */
    long update(Object id, T targetObj);

    /**
     * 更新指定id的记录
     *
     * @param id        要更新的记录ID
     * @param fieldsMap 待更新的field 和 value
     * @return
     */
    long update(Object id, Map<String, Object> fieldsMap);

    /**
     * 更新指定id的记录
     *
     * @param id    要更新的记录ID
     * @param field 要更新的字段
     * @param value 要设置的字段值
     * @return
     */
    long update(Object id, String field, Object value);
}
