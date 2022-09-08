package cn.edu.svtcc.config;

import cn.edu.svtcc.vo.Student;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/*
* Configuration表示当前类是一个配置类，用来配置容器的
* SpringConfig相当于beans.xml文件
* */
@Configuration
public class SpringConfig {
    /**
     * 创建方法，方法返回值是对象，在方法上面加入@Bean
     * 方法的返回值对象就自动注入到容器中了
     * @Bean的作用相当于<bean></bean>标签
     * 其使用位置是在方法的上面
     */
    @Bean
    public Student createStudent(){
        Student s1=new Student();
        s1.setName("张三");
        s1.setAge(20);
        s1.setSex("男");

        return s1;
    }

    /**
     * 制定对象在容器中的名称，相当于是bean标签的id属性
     */
    @Bean(name="student1")
    public Student createStudent2(){
        Student s1=new Student();
        s1.setName("张三");
        s1.setAge(20);
        s1.setSex("男");

        return s1;
    }

}
