package spring.cloud.eureka.provider.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import spring.cloud.eureka.provider.bean.User;

@Repository
public interface UserJpaRepository extends JpaRepository<User, Integer>{

}
