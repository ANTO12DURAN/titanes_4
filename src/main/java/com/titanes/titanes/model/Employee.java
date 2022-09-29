package com.titanes.titanes.model;

import com.titanes.titanes.enums.Enum_RoleName;
import lombok.*;

import javax.persistence.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    //atributos

    private String email;


    @OneToOne(cascade = CascadeType.ALL)
    private Profile profile; //relacion


    @Enumerated(EnumType.STRING)
    @Column(name = "role")
    private Enum_RoleName role;


    @ManyToOne
    @JoinColumn(name = "enterprise_id")
    private Enterprise enterprise; //relacion



}
