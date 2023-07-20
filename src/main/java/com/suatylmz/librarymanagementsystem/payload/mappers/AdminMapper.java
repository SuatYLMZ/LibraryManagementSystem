package com.suatylmz.librarymanagementsystem.payload.mappers;

import com.suatylmz.librarymanagementsystem.entity.concretes.Admin;
import com.suatylmz.librarymanagementsystem.payload.request.AdminRequest;
import com.suatylmz.librarymanagementsystem.payload.response.AdminResponse;
import org.springframework.stereotype.Component;

@Component
public class AdminMapper {

    public Admin mapAdminRequestToAdmin(AdminRequest adminRequest){
        return Admin.builder()
                .username(adminRequest.getUsername())
                .name(adminRequest.getName())
                .surname(adminRequest.getSurname())
                .email(adminRequest.getEmail())
                .password(adminRequest.getPassword())
                .gender(adminRequest.getGender())
                .build();
    }

    public AdminResponse mapAdminToAdminResponse(Admin admin){
        return AdminResponse.builder()
                .id(admin.getId())
                .username(admin.getUsername())
                .name(admin.getName())
                .surname(admin.getSurname())
                .email(admin.getEmail())
                .gender(admin.getGender())
                .build();
    }
}
