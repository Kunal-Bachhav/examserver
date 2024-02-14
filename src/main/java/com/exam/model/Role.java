package com.exam.model;
@jakarta.persistence.Entity
@jakarta.persistence.Table(name = "roles")
public class Role {
    @jakarta.persistence.Id
    private Long roleId;
    private String roleName;

    @jakarta.persistence.OneToMany(cascade = jakarta.persistence.CascadeType.ALL,fetch = jakarta.persistence.FetchType.LAZY,mappedBy = "role")
    private java.util.Set<UserRole> userRoles = new java.util.HashSet<>();

    public Role(Long roleId, String roleName) {
        this.roleId = roleId;
        this.roleName = roleName;
    }

    public java.util.Set<UserRole> getUserRoles() {
        return userRoles;
    }

    public void setUserRoles(java.util.Set<UserRole> userRoles) {
        this.userRoles = userRoles;
    }

    public Role() {
    }

    public Long getRoleId() {
        return roleId;
    }

    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }
}
