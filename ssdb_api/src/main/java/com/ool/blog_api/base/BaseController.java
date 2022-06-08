package com.ool.blog_api.base;

import com.ool.blog_api.base.api.ApiResult;
import org.springframework.validation.BindException;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MissingRequestValueException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.util.HashMap;
import java.util.Map;


@ControllerAdvice//可拦截异常
public class BaseController {
    @ExceptionHandler(Exception.class)
    public ApiResult errorHandler(Exception ex){
        ex.printStackTrace();
        return ApiResult.API_UNKNOW();
    }

    @ExceptionHandler(BindException.class)
    public ApiResult checkArgHandler(BindException ex){
        ex.printStackTrace();
        Map<String,String> errorMap = new HashMap<>();
//        errorMap.put(ex.getFieldError().getField(),ex.getFieldError().getDefaultMessage());
        if(ex.hasErrors()){
            for (FieldError fielderror :
                    ex.getFieldErrors()) {
                errorMap.put(fielderror.getField(),fielderror.getDefaultMessage());
            }
        }
        return ApiResult.Ill_Arg(errorMap);
    }

    @ExceptionHandler(MissingRequestValueException.class)
    public ApiResult checkParHandler(Exception ex){
        ex.printStackTrace();
        System.out.println("1111");
        return ApiResult.Ill_Arg();
    }
}
