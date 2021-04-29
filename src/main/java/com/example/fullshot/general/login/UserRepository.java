package com.example.fullshot.general.login;

import com.example.fullshot.general.login.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

/* JpaRepository를 User테이블 상속하면 CRUD가 가능하다 */
/* 스프링 프레임워크에서 JPA를 편리하게 사용할 수 있도록 하기 위해 제공하는 모듈인데 이를 Spring Data JPA라 한다. */
public interface UserRepository extends JpaRepository<User, Long> {

}
