package com.itemheima.controller;


import com.itemheima.pojo.Result;
import com.itemheima.pojo.Teacher;
import com.itemheima.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Validated
@RestController
@RequestMapping("/teacher")
public class TeacherController {
    @Autowired
    private TeacherService teacherService;

    @GetMapping
    public Result<List<Teacher>> list(){
        List<Teacher> teacher = teacherService.list();
        return Result.success(teacher);
    }

    @DeleteMapping("/delete")
    public Result delete(Integer id){
        teacherService.delete(id);
        return Result.success();
    }

    @PostMapping("/add")
    public Result add(@RequestBody Teacher teacher){
        teacherService.add(teacher);
        return Result.success();
    }

    @PutMapping("/update")
    public Result update(@RequestBody Teacher teacher){
        teacherService.update(teacher);
        return Result.success();
    }


}
