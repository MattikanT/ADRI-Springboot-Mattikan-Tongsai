package com.adri.AdriInternship_Mattikan.Tongsai;

import org.springframework.data.repository.CrudRepository;



public interface UserRepository extends CrudRepository<user, Long>{
    user findByUser_name(String user_name);
    
}
