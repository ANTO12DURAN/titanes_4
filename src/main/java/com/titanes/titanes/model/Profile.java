package com.titanes.titanes.model;

import lombok.*;
import org.apache.catalina.User;

import javax.persistence.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Profile {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private String id;

    private String image;
    private String phone;
    private String user;
 // private Date updatedAt;
 // private Date createdAt;

}
