package com.suatylmz.librarymanagementsystem.payload.response.abstracts;

import com.suatylmz.librarymanagementsystem.entity.enums.Gender;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Data
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
public abstract class BaseUserResponse {

    private Long id;
    private String username;
    private String name;
    private String surname;
    private String email;
    private Gender gender;
}
