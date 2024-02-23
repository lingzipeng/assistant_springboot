package com.itemheima.pojo;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

import java.time.LocalDateTime;

@Data
public class Teacher {
    @NotNull
    private Integer id;//主键ID
    private String username;//用户名
    private String birthday;//生日
    private Integer age;//年龄
    private String phoneNumber;//电话号码
    private String position;//职位
    private String password;//密码
    private LocalDateTime createTime;//创建时间
    private LocalDateTime updateTime;//更新时间
}
