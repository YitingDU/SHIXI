package com.yiting.shixi1.repository;

import com.yiting.shixi1.entity.UserInfo;
import org.springframework.data.jpa.repository.JpaRepository;

//在SpringData JPA中,我们通常为每个实体类创建一个对应的Repository接口,用于执行数据库操作。
//SpringData JPA会在运行时自动生成这些接口的实现类
public interface UserInfoRepository extends JpaRepository<UserInfo, String> {

}
