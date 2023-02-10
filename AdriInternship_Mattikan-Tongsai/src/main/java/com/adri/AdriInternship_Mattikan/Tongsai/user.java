package com.adri.AdriInternship_Mattikan.Tongsai;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class user {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column( nullable = false, unique = true)
    private String user_name;
    
    @Column(nullable = false)
    private String email;

    @Column(nullable = false)
    private String information;

    public long getId() {
        return id;
    }
}