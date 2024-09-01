package com.trasky.ecommerceapplication.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;

@Entity
@Data
@AllArgsConstructor
@Table(name ="address")
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "door_no")
    private String doorNo;
    @Column(name = "street")
    private String street;
    @Column(name = " city")
    private String city;
    @Column(name = "state")
    private  String state;

}
