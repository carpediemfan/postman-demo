package com.fyytest.postmandemo.controller;


import com.fyytest.postmandemo.pojo.Test;
import com.fyytest.postmandemo.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/index")
public class TestController {
    @Resource
    TestService testService;

    @RequestMapping("/test")
    public Object test() {
        return "成功";
    }
//    十个参数及以上的时候
//    参数封装到类里

    @RequestMapping("/student")
    public Object student(@RequestBody Test test) {
//        RequestBody得用json格式传参
//        对前端传的数据不满意 更改设置
        test.setAge(22);
//        调用
        return "学生的姓名是:" + test.getName() + test.getAge();
    }

    //    插入数据库
    @RequestMapping("/insert")
    public Object insert(@RequestBody Test test) {
        testService.insertTest(test);
        return "插入成功";
    }

    //    查询
    @RequestMapping("/select")
    public Object select() {
        return "学生人数为" + testService.select();
    }

    //    更新操作  根据姓名删除
    @RequestMapping("/delete")
    public Object delete(@RequestBody Test test) {
        testService.delete(test);
        return "删除成功";
    }
}
