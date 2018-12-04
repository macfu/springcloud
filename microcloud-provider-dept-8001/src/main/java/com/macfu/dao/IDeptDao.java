package com.macfu.dao;

import com.macfu.po.Dept;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @Author: liming
 * @Date: 2018/12/3 11:22
 * @Description: deptDaoMapper类
 */
@Mapper
public interface IDeptDao {
    boolean doCreate(Dept vo);
    Dept findById(Long id);
    List<Dept> findAll();
}
