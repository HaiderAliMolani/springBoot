package spring.framework.spring_boot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import user.User;
import user.UserRepository;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

@Component
public class ApplicationStartup implements CommandLineRunner {
    @Autowired
    private UserDetailService userDetailService;
    @Override
    public void run(String... args) throws Exception {
//        User user1 = new User("Aahil","aahil@samsung.com");
//        User user2 = new User("Hasan","hasan@samsung.com");
//        userDetailService.saveUser(user1);
//        userDetailService.saveUser(user2);
//       Optional<User> userData = userDetailService.getUser(1L);
//       if(userData.isPresent()){
//           User userValue = userData.get();
//           System.out.println(userValue);
//       }
//       else{
//           System.out.println("User is not present for this id");
//       }
//       List<User>userList = userDetailService.getallUser();
//       userList.forEach(System.out::println);
    }
}
