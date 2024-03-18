package org.ideyalabs.pms.controller;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.validation.Valid;
import org.ideyalabs.pms.dto.ApiError;
import org.ideyalabs.pms.dto.ProductDto;
import org.ideyalabs.pms.dto.UserDto;
import org.ideyalabs.pms.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.WebRequest;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/user-api/v1")
public class UserController {
    @Autowired
    private UserService userService;
    @PostMapping(value = "/users")
    public UserDto userCreateProductDto(@RequestBody UserDto userDto){
        System.out.println("sfgdhdh");
        return  userService.createUser(userDto);
    }

}
