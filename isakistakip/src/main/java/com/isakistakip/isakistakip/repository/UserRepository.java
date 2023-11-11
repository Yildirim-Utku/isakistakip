 package com.isakistakip.isakistakip.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.isakistakip.isakistakip.model.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
