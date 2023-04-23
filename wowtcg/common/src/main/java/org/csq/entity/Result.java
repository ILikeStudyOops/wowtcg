package org.csq.entity;

import lombok.Data;

import java.io.Serializable;

@Data
public class Result<T> implements Serializable {

    private Boolean success = true;
    private String message = "操作成功";
    private Integer code = 200;
    private T data;
    private Long timestamp = System.currentTimeMillis();

    public Result(){}

    public Result<T> back(Integer code,String message,Boolean success){
        this.success = success;
        this.code = code;
        this.message = message;
        return this;
    }

    public Result<T> back(Integer code,String message,Boolean success,T data){
        this.success = success;
        this.code = code;
        this.message = message;
        this.data = data;
        return this;
    }
}
