package com.ool.blog_api.base.api;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor(access = AccessLevel.PRIVATE)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class ApiResult {
    private Integer code;
    private String message;

    public static ApiResult success(){
        return SUCCESS_NULL_DATA;
    }

    public static ApiResult success(Object data){
        return new ApiResultWithData(SUCCESS,data);
    }

    public static ApiResult failed(){
        return FAILED;
    }

    public static ApiResult Ill_Arg(Object data){
        return new ApiResultWithData(ILL_ARG,data);
    }

    public static ApiResult AlreadyExists(){
        return FAILED_ALREADY_EXIsTS;
    }

    public static ApiResult missmatch(){
        return FAILED_PaU_MISSMATCH;
    }

    public static ApiResult Ill_Arg(){return ILL_ARG;}

    public static ApiResult API_UNKNOW(){return FAILED_API_UNKNOW;}



    private static final ApiResult SUCCESS = new ApiResult(1,"success");
    private static final ApiResult SUCCESS_NULL_DATA = new ApiResult(101,"success,no result");
    private static final ApiResult FAILED_PaU_MISSMATCH = new ApiResult(201,"wrong password");
    private static final ApiResult FAILED_ALREADY_EXIsTS = new ApiResult(202,"Already Exists");
    private static final ApiResult FAILED = new ApiResult(-1,"failed");
    private static final ApiResult ILL_ARG = new ApiResult(400,"Arguments Error");
    private static final ApiResult FAILED_API_UNKNOW = new ApiResult(300,"no such sever");

    private static class ApiResultWithData extends ApiResult{
        public Object data;

        public ApiResultWithData(ApiResult apiResult,Object data){
            super(apiResult.getCode(),apiResult.getMessage());
            this.data = data;
        }
    }

}
