package com.cydeo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "departments")
@NoArgsConstructor
@Data
public class Department extends BaseEntity {

    private String departments;
    private String division;
    @OneToOne(mappedBy = "department")
    private Employee employee;

    public Department(String departments, String divison) {
        this.departments = departments;
        this.division = divison;
    }
}
