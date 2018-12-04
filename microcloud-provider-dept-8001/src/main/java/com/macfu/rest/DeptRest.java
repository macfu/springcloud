package com.macfu.rest;

import com.macfu.po.Dept;
import com.macfu.service.IDeptService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @Author: liming
 * @Date: 2018/12/4 16:48
 * @Description: DeptRest服务类
 */
@RestController
public class DeptRest {
    @Resource
    private IDeptService deptService;

    @RequestMapping(value = "/dept/get/{id}", method = RequestMethod.GET)
    public Object get(@PathVariable("id") long id) {
        return this.deptService.get(id);
    }

    @RequestMapping(value = "/dept/list", method = RequestMethod.GET)
    public Object list() {
        return this.deptService.list();
    }

    @RequestMapping(value = "/dept/add", method = RequestMethod.GET)
    public Object add(@RequestBody Dept dept) {
        return this.deptService.add(dept);
    }
}
