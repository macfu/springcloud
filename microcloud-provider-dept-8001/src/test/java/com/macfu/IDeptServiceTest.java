package com.macfu;

import com.macfu.service.IDeptService;
import com.macfu.po.Dept;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import javax.annotation.Resource;

/**
 * @Author: liming
 * @Date: 2018/12/3 15:22
 * @Description: 测试程序
 */
@SpringBootTest(classes = Dept_8001_StartSpringCloudApplication.class)
@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
public class IDeptServiceTest {
    @Resource
    private IDeptService deptService ;
    @Test
    public void testGet() {
        System.out.println(this.deptService.get(1L));
    }

    @Test
    public void testAdd() {
        Dept dept = new Dept() ;
        dept.setDname("测试部-" + System.currentTimeMillis());
        System.out.println(this.deptService.add(dept));
    }

    @Test
    public void testList() {
        System.out.println(this.deptService.list());
    }

}
