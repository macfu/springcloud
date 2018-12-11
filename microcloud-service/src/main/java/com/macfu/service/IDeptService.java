package com.macfu.service;

import com.macfu.config.FeignClientConfig;
import com.macfu.po.Dept;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * @Author: liming
 * @Date: 2018/12/11 10:35
 * @Description:
 */
@FeignClient(value = "MICROCLOUD-PROVIDER-DEPT",configuration = FeignClientConfig.class)
public interface IDeptService {
    @RequestMapping(method = RequestMethod.GET, value = "/dept/get/{id}")
    Dept get(@PathVariable("id") long id);
    @RequestMapping(method = RequestMethod.GET, value = "/dept/list")
    List<Dept> list();
    @RequestMapping(method = RequestMethod.POST, value = "/dept/add")
    boolean add(Dept dept);
}
