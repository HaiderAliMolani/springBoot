package spring.framework.spring_boot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import user.User;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/users")
@CrossOrigin(origins = "http://localhost:8081")
public class UserController {
    @Autowired
    private UserDetailService userDetailService;
    @GetMapping("/get")
    public List<User> getAllUser(){
        return  userDetailService.getallUser();
    }
    @GetMapping("/getById")
    public  Optional<User> getUserById(@RequestParam Long id){
        return  userDetailService.getUser(id);
    }
    @PostMapping("/add")
    public void addUser(@RequestBody User user){
        userDetailService.saveUser(user);
    }
    @DeleteMapping("delete")
    public void deleteUser(@RequestParam Long id){
        userDetailService.deleteUser(id);
    }
    @PutMapping("update")
    public void updateUser(@RequestBody User user){
        userDetailService.updateUser(user);
    }
}

