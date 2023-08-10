package com.products.SpringBootWithMySql.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "COURSE_DETAILS")
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer courseID;
    private String name;
    private String price;


}
