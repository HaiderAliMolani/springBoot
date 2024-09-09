package spring.framework.spring_boot;

import org.springframework.stereotype.Service;
import user.User;
import user.UserRepository;

import java.util.List;
import java.util.Optional;

@Service
public class UserDetailService {
    private final UserRepository userRepository;

    public UserDetailService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
    public void saveUser(User user){
        userRepository.save(user);
    }
    public Optional<User> getUser(Long id){
         return userRepository.findById(id);
    }
    public List<User> getallUser(){
        return (List<User>) userRepository.findAll();
    }
    public void deleteUser(Long id){
        userRepository.deleteById(id);
    }
    public void updateUser(User userData){
        Optional<User> user = userRepository.findById(userData.getId());
        if(user.isPresent()){
            User us = user.get();
            us.setName(userData.getName());
            userRepository.save(us);
        }
    }

}
