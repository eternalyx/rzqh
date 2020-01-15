package me.zhengjie.modules.system.repository;

import java.util.List;

import me.zhengjie.modules.system.domain.DeptLeader;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;

/**
* @author Zheng Jie
* @date 2019-03-25
*/
@SuppressWarnings("all")
public interface SysDeptLeaderRepository extends JpaRepository<DeptLeader, String>, JpaSpecificationExecutor<DeptLeader> {

    /**
     * 根据 deptId 查询
     * @param deptId deptId
     * @return /
     */
    @Query(value = "select t1.id,t1.dept_id,t1.user_id,t1.level,t2.nickname from sys_dept_leader t1,sys_user t2,sys_dept t3 where t1.user_id = t2.id and t1.dept_id = t3.id and t3.id = ?1", nativeQuery = true)
    List<DeptLeader> findLeaderByDeptId(String deptId);

    /**
     * 根据 userId查询名称
     * @param userId userId
     * @return /
     */
    List<DeptLeader> findByUserId(String userId);
}
