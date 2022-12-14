package com.orange.controller;

import com.orange.entity.Student;
import com.orange.service.StudentService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @className: UserController
 * @description: TODO 类描述
 * @author: Txc
 * @date: 2022/12/14 15:20
 **/
@RestController
public class StudentController {

    private static final Logger logger = LoggerFactory.getLogger(StudentController.class);


    @Autowired
    private StudentService userService;

    @RequestMapping("/getUsers")
    public List<Student> getUsers(){
        logger.info("获取用户信息");
        return userService.getStudent();
    }

    @RequestMapping("/getUsersTwo")
    public List<Student> getUsersTwo(){
        logger.info("获取用户信息Two");
        return userService.getStudentTwo();
    }

    @RequestMapping("/test")
    public String getTest(){
        return "111";
    }

}
