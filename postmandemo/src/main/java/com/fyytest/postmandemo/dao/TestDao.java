package com.fyytest.postmandemo.dao;

import com.fyytest.postmandemo.pojo.Test;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface TestDao {
    //    插入数据
    public void insertTest(Test test);

    public Integer select();

    public void delete(Test test);
}
