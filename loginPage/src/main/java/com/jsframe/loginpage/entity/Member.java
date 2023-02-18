package com.jsframe.loginpage.entity;


import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Member {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long mno;

    @Column(nullable = false, length = 10)
    private String mname;

    @Column(nullable = false, length = 30)
    private String mid;

    @Column(nullable = false, length = 30)
    private String mpwd;

    @Column(nullable = true, length = 30)
    private String memail;

}
