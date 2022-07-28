package com.fyytest.postmandemo.service;

import com.fyytest.postmandemo.dao.TestDao;
import com.fyytest.postmandemo.pojo.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestServiceImpl implements TestService {
    @Autowired
    TestDao testDao;

    @Override
    public void insertTest(Test test) {
        testDao.insertTest(test);
        System.out.println(123);
    }

    @Override
    public Integer select() {
        return testDao.select();
    }

    @Override
    public void delete(Test test) {
        testDao.delete(test);
    }
}
