package com.example.mybatis_plus_study.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@TableName("tb_user")
public class User {
    //不是分布式系统，可以不选择使用雪花算法，让id自增就好了  可以在yml配置文件中进行全局配置
//    @TableId(type = IdType.AUTO) //AUTO就是一个依赖数据库的自增
    private Long id;
    private String userName;
    private String password;
    private String name;
    private Integer age;

    //可以自定义映射关系 名称不相同时可以自己设置
    @TableField("address")
    private String addressStr;
}
