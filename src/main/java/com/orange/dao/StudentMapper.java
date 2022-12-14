package com.orange.dao;

import com.orange.entity.Student;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @className: UserDao
 * @description: TODO 类描述
 * @author: Txc
 * @date: 2022/12/14 15:20
 **/
@Mapper
//@Repository
public interface StudentMapper {

    List<Student> getStudent();

    @Select("select * from student")
    List<Student> getStudentTwo();

}
