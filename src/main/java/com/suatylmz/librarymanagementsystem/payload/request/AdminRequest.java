package com.suatylmz.librarymanagementsystem.payload.request;

import com.suatylmz.librarymanagementsystem.payload.request.abstracts.BaseUserRequest;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@AllArgsConstructor
@SuperBuilder
public class AdminRequest extends BaseUserRequest {
}
