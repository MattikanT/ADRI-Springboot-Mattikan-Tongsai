package com.adri.AdriInternship_Mattikan.Tongsai;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.ResponseBody;
//import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class controller {
    @GetMapping("/hello")
    public String greeting(){
        return "Hello message";
    }

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/{user_name}")
    public AdriUser findOne(@PathVariable String user_name){
        return userRepository.findByUserName(user_name);
    }

    
    @PostMapping
    //@ResponseStatus(HttpSta.CREATED)
    public AdriUser create(@RequestBody AdriUser user) {
        return userRepository.save(user);
    }

    @PutMapping("/update_user")
    public AdriUser updateUser(@RequestBody AdriUser user, @RequestParam Long id) {
        if (user.getId() != id) {
          throw new IllegalArgumentException("User Id doesnt exist");
        }
        userRepository.findById(id)
          .orElseThrow(IllegalArgumentException::new);
        return userRepository.save(user);
    }


}
