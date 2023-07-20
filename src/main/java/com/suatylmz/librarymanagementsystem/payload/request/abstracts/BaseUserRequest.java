package com.suatylmz.librarymanagementsystem.payload.request.abstracts;

import com.suatylmz.librarymanagementsystem.entity.enums.Gender;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import javax.persistence.MappedSuperclass;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

    @SuperBuilder
    @MappedSuperclass
    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    public abstract class BaseUserRequest {

    @NotNull(message = "Please enter your username")
    @Size(min = 4, max = 16, message = "Your username should be at least 4 chars")
    @Pattern(regexp = "\\A(?!\\s*\\Z).+", message = "Your username must consist of the characters .")
    private String username;

    @NotNull(message = "Please enter your name")
    @Size(min = 4, max = 16, message = "Your name should be at least 4 chars")
    @Pattern(regexp = "\\A(?!\\s*\\Z).+", message = "Your name must consist of the characters .")
    private String name;

    @NotNull(message = "Please enter your surname")
    @Size(min = 4, max = 16, message = "Your surname should be at least 4 chars")
    @Pattern(regexp = "\\A(?!\\s*\\Z).+", message = "Your surname must consist of the characters .")
    private String surname;

    @NotNull(message = "Please enter your email")
    @Pattern(regexp = "^(?i)[a-z0-9._%+-]+@[a-z0-9.-]+\\.[a-z]{2,}$", message = "Your email must be in the correct format")
    private String email;

    @NotNull(message = "Please enter your password")
    @Size(min = 8, max = 60, message = "Your password should be between 8 and 60 characters")
    private String password;

    @NotNull(message = "Please enter your gender")
    private Gender gender;
}
