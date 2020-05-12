package com.mcheberiaka.cusr.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.mcheberiaka.cusr.model.User;


@Repository
public interface UserRepository extends JpaRepository<User, Long> {
	@Query("SELECT u from User u WHERE u.email = ?1")
	User findUserByEmail(String EMAIL);
}