package com.suatylmz.librarymanagementsystem;

import com.suatylmz.librarymanagementsystem.entity.enums.RoleType;
import com.suatylmz.librarymanagementsystem.service.AdminService;
import com.suatylmz.librarymanagementsystem.service.UserRoleService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LibraryManagementSystemApplication implements CommandLineRunner {


    private final UserRoleService userRoleService;
    private final AdminService adminService;

    public LibraryManagementSystemApplication(UserRoleService userRoleService, AdminService adminService) {
        this.userRoleService = userRoleService;
        this.adminService = adminService;
    }

    public static void main(String[] args) {
        SpringApplication.run(LibraryManagementSystemApplication.class, args);
    }

    @Override
    public void run(String... args) {
        if (userRoleService.getAllUserRole().isEmpty()) {
            userRoleService.save(RoleType.ADMIN);
            userRoleService.save(RoleType.MANAGER);
            userRoleService.save(RoleType.TEACHER);
            userRoleService.save(RoleType.STUDENT);
            userRoleService.save(RoleType.GUEST_USER);
        }



    }
}
