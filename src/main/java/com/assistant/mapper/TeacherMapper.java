package com.itemheima.mapper;

import com.itemheima.pojo.Teacher;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface TeacherMapper {

    //查询
    @Select("select * from teacher")
    List<Teacher> findAll();

    //删除
    @Delete("delete from teacher where id = #{id}")
    void delete(Integer id);

    //增加
    @Insert("insert into teacher(id,username,birthday,age,phone_Number,position,password,create_Time,update_time)"+
    "values (#{id},#{username},#{birthday},#{age},#{phoneNumber},#{position},#{password},#{createTime},#{updateTime})")
    void add(Teacher teacher);

    //修改
    @Update("update teacher set username=#{username},birthday=#{birthday},age=#{age},phone_number=#{phoneNumber},"+
    "position=#{position},password=#{password},update_time=#{updateTime} where id=#{id}")
    void update(Teacher teacher);
}
