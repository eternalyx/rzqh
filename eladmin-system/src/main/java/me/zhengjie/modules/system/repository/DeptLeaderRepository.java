package me.zhengjie.modules.system.repository;

import me.zhengjie.modules.system.domain.DeptLeader;
import me.zhengjie.modules.system.domain.Job;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
* @author liucw
* @date 2019-03-29
*/
public interface DeptLeaderRepository extends JpaRepository<DeptLeader, String>, JpaSpecificationExecutor<DeptLeader> {
}
