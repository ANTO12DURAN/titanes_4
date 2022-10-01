package com.titanes.titanes.model;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Enterprise {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    @JoinColumn(unique = true)
    private String name;

    private String document;
    private String phone;
    private String address;

    @OneToMany(mappedBy="enterprise")
    private List<Employee> listEmployee;

    @OneToMany(mappedBy="enterprise")
    private List<Transaction> listTransaction;


}
