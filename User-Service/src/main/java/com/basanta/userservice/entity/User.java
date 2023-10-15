package com.basanta.userservice.entity;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "tbl_user")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class User {

    @Id
    @SequenceGenerator(name = "user_seq", sequenceName = "user_seq", allocationSize = 1)
    @GeneratedValue(generator = "user_seq", strategy = GenerationType.SEQUENCE)
    private Long id;

    @Column(length = 20)
    private String name;

    @Column(length = 10)
    private String phone;

    @Column(length = 25)
    private String email;

    @Column(length = 25)
    private String address;


    @Transient
    private List<Ratings> ratings = new ArrayList<>();

}
