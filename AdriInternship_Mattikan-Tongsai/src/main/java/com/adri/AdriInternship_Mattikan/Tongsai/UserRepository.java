package com.adri.AdriInternship_Mattikan.Tongsai;

import org.springframework.data.repository.CrudRepository;



public interface UserRepository extends CrudRepository<user, Long>{
    user findByUserName(String user_name);
    
}
