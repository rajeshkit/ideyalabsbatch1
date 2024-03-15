package org.ideyalabs.pms.exception;

import jakarta.servlet.http.HttpServletRequest;
import org.ideyalabs.pms.dto.ApiError;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestControllerAdvice
public class ApplicationGlobalExceptionHandler {
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity methodArgumentNotValidExceptionHandler(MethodArgumentNotValidException e,
                                                                 HttpServletRequest request,
                                                                 WebRequest webRequest){
        // System.out.println("exception is occurred"+e+" "+e.getMessage());
        List<FieldError> fieldErrorList = e.getBindingResult().getFieldErrors();
        List<String> listOfErrors=new ArrayList<>();
        for (FieldError fieldError: fieldErrorList) {

            listOfErrors.add(fieldError.getField()+":"+fieldError.getDefaultMessage());
        }
        ApiError apiError= ApiError.builder()
                .path(request.getRequestURI())
                .message(listOfErrors)
                .when(LocalDateTime.now()).build();
        return new ResponseEntity(apiError, HttpStatus.NOT_ACCEPTABLE);
    }
    @ExceptionHandler(ProductIdDoesNotExistException.class)
    public ResponseEntity<?> productIdDoesNotExistExceptionHandler
            (ProductIdDoesNotExistException e,
             HttpServletRequest request){
        ApiError apiError=ApiError.builder()
                .path(request.getRequestURI())
                .message(Arrays.asList(e.getLocalizedMessage()))
                .when(LocalDateTime.now())
                .build();
        return new ResponseEntity<>(apiError,HttpStatus.NOT_FOUND);
    }
}
