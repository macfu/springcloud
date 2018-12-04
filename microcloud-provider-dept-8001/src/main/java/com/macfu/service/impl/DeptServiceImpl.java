package com.macfu.service.impl;

import com.macfu.dao.IDeptDao;
import com.macfu.service.IDeptService;
import com.macfu.po.Dept;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author: liming
 * @Date: 2018/12/3 14:53
 * @Description: deptService实现类
 */
@Service
public class DeptServiceImpl implements IDeptService {
    @Resource
    private IDeptDao deptDao;

    @Override
    public Dept get(Long id) {
        return this.deptDao.findById(id);
    }

    @Override
    public boolean add(Dept dept) {
        return this.deptDao.doCreate(dept);
    }

    @Override
    public List<Dept> list() {
        return this.deptDao.findAll();
    }
}
