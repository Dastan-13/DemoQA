package com.demoqa.entities;

import lombok.*;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@Builder
@ToString

public class EmployeeEntity {
    private String firstname;
    private String lastname;
    private int age;
    private String email;
    private long salary;
    private String department;

}
