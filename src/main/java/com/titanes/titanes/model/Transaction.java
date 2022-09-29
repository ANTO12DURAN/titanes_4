package com.titanes.titanes.model;

import lombok.*;

import javax.persistence.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Transaction {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    private String concept;
    private Float amount;



    @ManyToOne
    @JoinColumn(name = "employee_id")
    private Employee employee;



    @ManyToOne
    @JoinColumn(name = "enterprise_id")
    private Enterprise enterprise;
}
