package com.orange.service;

import com.orange.entity.Student;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @className: UserService
 * @description: TODO 类描述
 * @author: Txc
 * @date: 2022/12/14 15:20
 **/
public interface StudentService {

    List<Student> getStudent();

    List<Student> getStudentTwo();

}
