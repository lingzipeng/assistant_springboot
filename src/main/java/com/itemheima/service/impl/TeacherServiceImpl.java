package com.itemheima.service.impl;

import com.itemheima.mapper.TeacherMapper;
import com.itemheima.pojo.Teacher;
import com.itemheima.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;


@Service
public class TeacherServiceImpl  implements TeacherService {

    @Autowired
    private TeacherMapper teacherMapper;

    @Override
    public List<Teacher> list(){
        return teacherMapper.findAll();
    }

    @Override
    public void delete(Integer id) {
        teacherMapper.delete(id);
    }

    @Override
    public void add(Teacher teacher) {
        teacher.setCreateTime(LocalDateTime.now());
        teacher.setUpdateTime(LocalDateTime.now());

        teacherMapper.add(teacher);
    }

    @Override
    public void update(Teacher teacher) {
        teacher.setUpdateTime(LocalDateTime.now());
        teacherMapper.update(teacher);
    }
}
