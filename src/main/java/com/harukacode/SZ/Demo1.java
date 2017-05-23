package com.harukacode.SZ;

/**
 * Created by Administrator on 2017-5-23.
 */

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class Demo1 {
    public static void main(String[] args) throws IOException {
//获取配置文件的输入流
        InputStream inputStream =
                Resources.getResourceAsStream("mybatis.cfg.xml");
//创建会话工厂
        SqlSessionFactory sqlSessionFactory = new
                SqlSessionFactoryBuilder().build(inputStream);
//获取会话
        SqlSession sqlSession = sqlSessionFactory.openSession();
//执行 SQL 查询，得到一个对象
        Course course = sqlSession.selectOne("mapper.findById",1);
//输出此对象
        System.out.println(course);
//执行 SQL 查询，得到一个对象
        List<Course> list = sqlSession.selectList("mapper.findAll");
        for(Course course1:list){
            System.out.println(course1);
        }
//关闭会话
        sqlSession.close();
    }
}