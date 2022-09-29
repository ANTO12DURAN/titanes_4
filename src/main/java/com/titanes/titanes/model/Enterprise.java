package com.titanes.titanes.model;

import lombok.*;

import javax.persistence.*;

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


  //  @ManyToOne
  //  @JoinColumn(name = "transaction_id")
  //  private Transaction transaction;

}
