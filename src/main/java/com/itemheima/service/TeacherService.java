package com.itemheima.service;

import com.itemheima.pojo.Teacher;

import java.util.List;

public interface TeacherService {

    //查询教师列表
    List<Teacher> list();

    //删除教师
    void delete(Integer id);

    //添加教师
    void add(Teacher teacher);

    //修改教师
    void update(Teacher teacher);
}
