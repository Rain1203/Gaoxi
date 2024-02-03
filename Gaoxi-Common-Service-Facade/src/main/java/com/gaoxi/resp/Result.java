package com.gaoxi.resp;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

/**
 * @description:
 * @author: Qin
 * @createTime: 2024/1/28 14:18
 */
@Setter
@Getter
public class Result<T> implements Serializable {
    private static final long serialVersionUID = 9064858331482854404L;

    //执行结果
    private boolean isSuccess;

    //错误码
    private String errorCode;

    //错误信息
    private String message;

    //返回数据
    private T data;

    /**
     * 返回成功的结果
     * @param data 需返回的结果
     * @param <T>
     * @return
     */
    public static <T> Result<T> newSuccessResult(T data){
        Result<T> result = new Result<>();
        result.isSuccess = true;
        result.data = data;
        return result;
    }

    /**
     * 返回成功的结果
     * @param <T>
     * @return
     */
    public static <T> Result<T> newSuccessResult(){
        Result<T> result = new Result<>();
        result.isSuccess = true;
        return result;
    }

}
