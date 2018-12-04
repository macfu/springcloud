package com.macfu.controller;

import com.macfu.po.Dept;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author: liming
 * @Date: 2018/12/4 14:13
 * @Description: deptController类
 */
@RestController
@RequestMapping("/consumer/dept")
public class DeptController {
    public static final String DEPT_GET_URL = "http://172.21.217.26:8001/dept/get/";
    public static final String DEPT_LIST_URL = "http://localhost:8001/dept/list";
    public static final String DEPT_ADD_URL = "http://172.21.217.26:8001/dept/add";

    @Resource
    private RestTemplate restTemplate;

    @RequestMapping("/get")
    public Object getDept(long id) {
        Dept dept = this.restTemplate.getForObject(DEPT_GET_URL + id, Dept.class);
        return dept;
    }

    @RequestMapping("/list")
    public Object listDept() {
        System.out.println("123242424");
        List<Dept> allDepts = this.restTemplate.getForObject(DEPT_LIST_URL, List.class);
        return allDepts;
    }

    @RequestMapping("/add")
    public Object addDept(Dept dept) {
        Boolean flag = this.restTemplate.postForObject(DEPT_ADD_URL, dept, Boolean.class);
        return flag;
    }
}
