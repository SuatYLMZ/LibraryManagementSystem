package com.suatylmz.librarymanagementsystem.controller;

import com.suatylmz.librarymanagementsystem.payload.request.AdminRequest;
import com.suatylmz.librarymanagementsystem.payload.response.AdminResponse;
import com.suatylmz.librarymanagementsystem.payload.response.ResponseMessage;
import com.suatylmz.librarymanagementsystem.service.AdminService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/admin")
@RequiredArgsConstructor
public class AdminController {

    private final AdminService adminService;

    @PostMapping("/saveAdmin")
    public ResponseMessage<AdminResponse> saveAdmin(@RequestBody @Valid AdminRequest adminRequest){
        return adminService.saveAdmin(adminRequest);
    }
}
