package com.exam.service.impl;

@org.springframework.stereotype.Service
public class UserServiceImpl implements com.exam.service.UserService {

    @org.springframework.beans.factory.annotation.Autowired
    private com.exam.repo.UserRepository userRepository;
    @org.springframework.beans.factory.annotation.Autowired
    private com.exam.repo.RoleRepository roleRepository;
    @Override
    public com.exam.model.User createUser(com.exam.model.User user , java.util.Set<com.exam.model.UserRole> userRoles) throws Exception {
        com.exam.model.User local =  this.userRepository.findByUserName(user.getUserName());
        if (local != null){
            System.out.println("User  is allready there !!");
            throw  new Exception("User Allready Present");
        }else {
            for (com.exam.model.UserRole ur : userRoles)
            {
                roleRepository.save(ur.getRole());
            }
            user.getUserRoles().addAll(userRoles);
            local =this.userRepository.save(user);
        }
        return local;
    }

}
