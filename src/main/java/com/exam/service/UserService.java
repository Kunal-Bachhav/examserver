package com.exam.service;

public interface UserService {
    public com.exam.model.User createUser(com.exam.model.User user , java.util.Set<com.exam.model.UserRole> userRoles) throws Exception;

}
