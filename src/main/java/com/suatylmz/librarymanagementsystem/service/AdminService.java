package com.suatylmz.librarymanagementsystem.service;

import com.suatylmz.librarymanagementsystem.entity.concretes.Admin;
import com.suatylmz.librarymanagementsystem.entity.enums.RoleType;
import com.suatylmz.librarymanagementsystem.payload.mappers.AdminMapper;
import com.suatylmz.librarymanagementsystem.payload.messages.SuccessMessages;
import com.suatylmz.librarymanagementsystem.payload.request.AdminRequest;
import com.suatylmz.librarymanagementsystem.payload.response.AdminResponse;
import com.suatylmz.librarymanagementsystem.payload.response.ResponseMessage;
import com.suatylmz.librarymanagementsystem.repository.AdminRepository;
import com.suatylmz.librarymanagementsystem.service.validator.UniquePropertyValidator;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AdminService {

    private final AdminRepository adminRepository;

    private final UniquePropertyValidator uniquePropertyValidator;

    private final UserRoleService userRoleService;

    private final AdminMapper adminMapper;




    public ResponseMessage saveAdmin(AdminRequest adminRequest) {
        uniquePropertyValidator.checkDuplication(adminRequest.getUsername(), adminRequest.getEmail());

        Admin admin = adminMapper.mapAdminRequestToAdmin(adminRequest);
        admin.setUserRole(userRoleService.getUserRole(RoleType.ADMIN));

        Admin savedAdmin= adminRepository.save(admin);

        return ResponseMessage.<AdminResponse>builder()
                .message(SuccessMessages.ADMIN_CREATE)
                .object(adminMapper.mapAdminToAdminResponse(savedAdmin))
                .build();

    }
}
