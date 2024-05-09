package com.Portal.JobPortal.Services;

import com.Portal.JobPortal.Constants.UserRole;
import com.Portal.JobPortal.Entities.User;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
@Component
public class UserService {
    private static List<User> users = new ArrayList<>();
    static {
         users.add(new User(1L,"pavan4517patel","1234","Pavan4517patel@gmail.com","Pavan","Patel",UserRole.EMPLOYER,"6263291951","Indore"));
        users.add(new User(2L,"brajesh1234","1234","brajesh321@gmail.com","Brajesh","Ruhela",UserRole.EMPLOYER,"7909705380","Indore"));
        users.add(new User(3L,"sp10","1234","patidarsp10@gmail.com","Sawan","Patidar", UserRole.EMPLOYER,"7909569277","Indore"));
    }
    public List<User> getAllUsers(){
        return users;
    }
    public User getUserById(int id){
        User user = null;
        user = users.stream().filter(e->e.getUserId() == id).findFirst().get();
        return user;
    }

}
