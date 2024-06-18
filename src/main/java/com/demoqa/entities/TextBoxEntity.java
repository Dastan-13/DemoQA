package com.demoqa.entities;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode
@Builder

public class TextBoxEntity {
    private String fullName;
    private String email;
    private String currentAddress;
    private String permanentAddress;
    private String submitBtn;
//    private String firstName;
//    private String lastName;
//    private String userMail;
//    private String mobileNumber;
//    private String date;
//    private String subjects;
//    private String address;
}


