package com.spring.zepto.Repository;

import com.spring.zepto.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository  extends JpaRepository <User,Integer> {


}
