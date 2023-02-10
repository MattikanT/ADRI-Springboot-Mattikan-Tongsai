package com.adri.AdriInternship_Mattikan.Tongsai;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.ResponseBody;
//import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class controller {
    @GetMapping("/")
    public String greeting(){
        return "Hello message 65";
    }

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/{user_name}")
    public user findOne(@PathVariable String user_name){
        return userRepository.findByUser_name(user_name);
    }

    
    @PostMapping
    //@ResponseStatus(HttpSta.CREATED)
    public user create(@RequestBody user user) {
        return userRepository.save(user);
    }

    @PutMapping("/{id}")
    public user updateUser(@RequestBody user user, @PathVariable Long id) {
        if (user.getId() != id) {
          throw new IllegalArgumentException("User Id doesnt exist");
        }
        userRepository.findById(id)
          .orElseThrow(IllegalArgumentException::new);
        return userRepository.save(user);
    }


}