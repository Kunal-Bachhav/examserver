package com.exam.model;

@jakarta.persistence.Entity
@jakarta.persistence.Table(name="users")
public class User {

    @jakarta.persistence.Id
    @jakarta.persistence.GeneratedValue(strategy = jakarta.persistence.GenerationType.AUTO)
    private  Long id;
    private  String userName;
    private String password;
    private String firstName;
    private String lastName;
    private String email;
    private String phone;
    private boolean enabled= true;

    private String profile;

    public User() {
    }

    //User has many Roles
    @jakarta.persistence.OneToMany(cascade = jakarta.persistence.CascadeType.ALL,fetch = jakarta.persistence.FetchType.EAGER,mappedBy = "user")
    @com.fasterxml.jackson.annotation.JsonIgnore
    private java.util.Set<UserRole> userRoles = new java.util.HashSet<>();


    public User(Long id, String userName, String password, String firstName, String lastName, String email, String phone, boolean enabled, String profile) {
        this.id = id;
        this.userName = userName;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phone = phone;
        this.enabled = enabled;
        this.profile = profile;
    }

    public java.util.Set<UserRole> getUserRoles() {
        return userRoles;
    }

    public void setUserRoles(java.util.Set<UserRole> userRoles) {
        this.userRoles = userRoles;
    }

    public String getProfile() {
        return profile;
    }

    public void setProfile(String profile) {
        this.profile = profile;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }
}
