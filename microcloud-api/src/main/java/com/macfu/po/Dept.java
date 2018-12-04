package com.macfu.po;

import lombok.Data;

import java.io.Serializable;

/**
 * @Author: liming
 * @Date: 2018/12/3 11:00
 * @Description: Dept实体类
 */

@Data
public class Dept implements Serializable {
    private Long deptno;
    private String dname;
    private String loc;
}
