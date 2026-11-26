package com.spring.zepto.Controller;

import com.spring.zepto.Entity.User;
import com.spring.zepto.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserService userService;
    @PostMapping("/insertall")
    public List<User> insertall(@RequestBody List<User> user){
        return userService.insertall(user);
    }

    @GetMapping("/fetchall")
    public List<User>fetchall(){
        return userService.fetchall();
    }
    @GetMapping("/fetchby/{id}")
    public User fetchbyid(@PathVariable Integer id){
        return userService.fetchbyid(id);
    }
    @PutMapping("updateby/{id}")
    public  User updatebyid(@RequestBody User user ,@PathVariable Integer id){
        return  userService.updatebyid(id,user);
    }
    @DeleteMapping("deleteby/{id}")
    public User deletebyid(@PathVariable Integer id){
        return  userService.deletebyid(id);
    }


}
