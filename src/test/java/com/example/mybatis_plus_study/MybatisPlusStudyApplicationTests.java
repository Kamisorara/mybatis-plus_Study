package com.example.mybatis_plus_study;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.mybatis_plus_study.entity.User;
import com.example.mybatis_plus_study.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@SpringBootTest
class MybatisPlusStudyApplicationTests {
    @Autowired
    UserMapper userMapper;

    @Test
    void testQueryList() {
        List<User> users = userMapper.selectList(null);
        System.out.println(users);
    }


    //测试mybatis_plus 生成的id
    @Test
    void testInsert() {
        User user = new User();
        user.setUserName("Kamisora");
        user.setPassword("11111111");
        int insert = userMapper.insert(user);
        System.out.println(insert);
    }


    //批量删除操作
    @Test
    void testDeleteBatchIds() {
        List<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(4);
        //批量删除
        int i = userMapper.deleteBatchIds(list);
        System.out.println(i);
    }

    //根据id删除
    @Test
    void testDeleteById() {
        int i = userMapper.deleteById(1);
        System.out.println(i);
    }


    //根据map删除
    @Test
    void testDeleteByMap() {
        Map<String, Object> map = new HashMap<>();
        map.put("user_name", "Kamisora"); //将叫这个名字的全部删除
        int i = userMapper.deleteByMap(map);
        System.out.println(i);
    }

    //更新操作
    @Test
    void testUpdateData() {
        User user = new User();
        user.setId(2L);
        user.setPassword("111111");
        int i = userMapper.updateById(user);
        System.out.println(i);
    }

    //测试条件构造器
    @Test
    void testWrapper() {
        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
        queryWrapper.gt("age", 10);
        queryWrapper.eq("address", "平顶山");
        List<User> users = userMapper.selectList(queryWrapper);
        System.out.println(users);
    }
}

