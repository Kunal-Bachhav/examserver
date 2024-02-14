package com.exam.model;
@jakarta.persistence.Entity
public class UserRole {
    @jakarta.persistence.Id
    @jakarta.persistence.GeneratedValue(strategy = jakarta.persistence.GenerationType.AUTO)
    private Long userRoleId;

    @jakarta.persistence.ManyToOne(fetch = jakarta.persistence.FetchType.EAGER)
    private User user;

    @jakarta.persistence.ManyToOne()
    private Role role;

    public UserRole() {
    }

    public Long getUserRoleId() {
        return userRoleId;
    }

    public void setUserRoleId(Long userRoleId) {
        this.userRoleId = userRoleId;
    }

    public com.exam.model.User getUser() {
        return user;
    }

    public void setUser(com.exam.model.User user) {
        this.user = user;
    }

    public com.exam.model.Role getRole() {
        return role;
    }

    public void setRole(com.exam.model.Role role) {
        this.role = role;
    }

}
