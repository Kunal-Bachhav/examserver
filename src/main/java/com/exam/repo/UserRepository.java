package com.exam.repo;

public interface UserRepository extends org.springframework.data.jpa.repository.JpaRepository<com.exam.model.User,Long> {

    public com.exam.model.User findByUserName(String userName);
 }

