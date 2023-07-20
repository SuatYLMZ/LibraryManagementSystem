package com.suatylmz.librarymanagementsystem.service.validator;

import com.suatylmz.librarymanagementsystem.exception.ConflictException;
import com.suatylmz.librarymanagementsystem.payload.messages.ErrorMessages;
import com.suatylmz.librarymanagementsystem.repository.AdminRepository;
import com.suatylmz.librarymanagementsystem.repository.DeanRepository;
import com.suatylmz.librarymanagementsystem.repository.StudentRepository;
import com.suatylmz.librarymanagementsystem.repository.TeacherRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class UniquePropertyValidator {

    private final AdminRepository adminRepository;

    private final DeanRepository deanRepository;

    private final StudentRepository studentRepository;

    private final TeacherRepository teacherRepository;


    public void checkDuplication(String... values) {
        String username = values[0];
        String email = values[1];


        if (adminRepository.existsByUsername(username)) {
            throw new ConflictException(String.format(ErrorMessages.ALREADY_REGISTER_MESSAGE_USERNAME, username));
        } else if (adminRepository.existsByEmail(email)) {
            throw new ConflictException(String.format(ErrorMessages.ALREADY_REGISTER_MESSAGE_EMAIL, email));
        }

    }
}
