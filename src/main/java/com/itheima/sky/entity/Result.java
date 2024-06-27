package com.itheima.sky.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/**
 * 封装返回结果
 */
@Data
public class Result implements Serializable {

    private Integer code; //编码：1成功，0和其它数字为失败

    private String msg; //错误信息

    private Object data; //数据

    private Map map = new HashMap(); //动态数据

    public static Result success(Object object) {
        Result r = new Result();
        r.data = object;
        r.code = 1;
        return r;
    }

    public static Result error(String msg) {
        Result r = new Result();
        r.msg = msg;
        r.code = 0;
        return r;
    }

    public Result add(String key, Object value) {
        this.map.put(key, value);
        return this;
    }
}
