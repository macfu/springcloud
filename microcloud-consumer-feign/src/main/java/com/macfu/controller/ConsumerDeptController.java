package com.macfu.controller;

import com.macfu.po.Dept;
import com.macfu.service.IDeptService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @Author: liming
 * @Date: 2018/12/11 10:51
 * @Description:
 */
@RestController
@RequestMapping("/consumer/dept")
public class ConsumerDeptController {
    @Resource
    private IDeptService deptService;

    @RequestMapping("/get")
    public Object getDept(long id) {
        return this.deptService.get(id);
    }

    @RequestMapping("/list")
    public Object listDept() {
        return this.deptService.list();
    }

    @RequestMapping("/add")
    public Object addDept(Dept dept) {
        return this.deptService.add(dept);
    }
}
