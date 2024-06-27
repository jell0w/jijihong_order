package com.itheima.sky.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * 分页结果封装对象
 */
@Data
public class PageResult implements Serializable {
    private Long total; // 总记录数
    private List records; // 当前页结果

    public PageResult(Long total, List records) {
        this.total = total;
        this.records = records;
    }
}
