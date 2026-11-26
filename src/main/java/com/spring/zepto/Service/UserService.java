package com.spring.zepto.Service;

import com.spring.zepto.Entity.User;
import com.spring.zepto.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    UserRepository userRepository;

    public List<User> insertall(List<User> user) {
        return userRepository.saveAll(user);
    }


    public List<User> fetchall() {
        return userRepository.findAll();
    }


    public User fetchbyid(Integer id) {
        return  userRepository.findById(id).orElse(null);


    }

    public User updatebyid(Integer id,User user) {
        User user1 = userRepository.findById(id).orElse(null);
        if(user1 != null){
            user1.setUseraddress(user.getUseraddress());
            user1.setUsername(user.getUsername());
            user1.setUserphonenum(user.getUserphonenum());
            return userRepository.save(user1);
        }
        return null;
    }

    public User deletebyid(Integer id) {
       if(userRepository.existsById(id)) {
           userRepository.deleteById(id);
       }
       return null;
    }
}
