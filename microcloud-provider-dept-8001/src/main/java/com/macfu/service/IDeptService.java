package com.macfu.service;

import com.macfu.po.Dept;

import java.util.List;

/**
 * @Author: liming
 * @Date: 2018/12/3 14:44
 * @Description: deptService接口
 */
public interface IDeptService {
    Dept get(Long id);

    boolean add(Dept dept);

    List<Dept> list();
}
