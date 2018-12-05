package com.macfu.controller;

import com.macfu.po.Dept;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
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

//    @Resource
//    private RestTemplate restTemplate;
//
//    @RequestMapping("/get")
//    public Object getDept(long id) {
//        Dept dept = this.restTemplate.getForObject(DEPT_GET_URL + id, Dept.class);
//        return dept;
//    }
//
//    @RequestMapping("/list")
//    public Object listDept() {
//        System.out.println("123242424");
//        List<Dept> allDepts = this.restTemplate.getForObject(DEPT_LIST_URL, List.class);
//        return allDepts;
//    }
//
//    @RequestMapping("/add")
//    public Object addDept(Dept dept) {
//        Boolean flag = this.restTemplate.postForObject(DEPT_ADD_URL, dept, Boolean.class);
//        return flag;
//    }


    /**
     * 加入SpringSecurity之后的消费端
     */
    @Resource
    private RestTemplate restTemplate;
    @Resource
    private HttpHeaders headers;

    @RequestMapping("/get")
    public Object getDept(long id) {
        Dept dept = this.restTemplate.exchange(DEPT_GET_URL + id, HttpMethod.GET, new HttpEntity<Object>(this.headers), Dept.class).getBody();
        return dept;
    }

    @RequestMapping("/list")
    public Object listDept() {
        System.out.println("123242424");
        List<Dept> allDepts = this.restTemplate.exchange(DEPT_LIST_URL, HttpMethod.GET, new HttpEntity<Object>(this.headers), List.class).getBody();
        return allDepts;
    }

    @RequestMapping("/add")
    public Object addDept(Dept dept) throws Exception {
        Boolean flag = this.restTemplate.exchange(DEPT_ADD_URL, HttpMethod.GET, new HttpEntity<Object>(dept, this.headers), Boolean.class).getBody();
        return flag;
    }

}
