package com.adri.AdriInternship_Mattikan.Tongsai;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="user")
public class AdriUser {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column( name="user_id")
    private long id;

    @Column( name="user_name",nullable = false, unique = true)
    private String userName;
    
    @Column(name="email", nullable = false)
    private String email;

    @Column(name="information", nullable = false)
    private String information;

    public long getId() {
        return id;
    }
    public String getUserName(){
        return userName;
    }
    public String getEmail(){
        return email;
    }
    public String getInformation(){
        return information;
    }
}
