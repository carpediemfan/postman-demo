package com.fyytest.postmandemo.service;

import com.fyytest.postmandemo.pojo.Test;
import org.springframework.web.bind.annotation.RequestBody;

public interface TestService {
    public void insertTest(Test test);

    public Integer select();

    //    删除
    public void delete(Test test);
}
