package cn.edu.svtcc;

import cn.edu.svtcc.config.SpringConfig;
import cn.edu.svtcc.vo.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    @Test
    public void test01(){
        String config="beans.xml";
        ApplicationContext ctx=new ClassPathXmlApplicationContext(config);

        Student student=(Student) ctx.getBean("myStudent");
        System.out.println("容器中的对象:"+student);
    }

    /**
     * 使用JavaConfig方式
     */
    @Test
    public void test02(){
        ApplicationContext ctx=new AnnotationConfigApplicationContext(SpringConfig.class);
        Student student=(Student)ctx.getBean("createStudent");
        System.out.println("使用JavaConfig创建的对象:"+student);
    }

    @Test
    public void test03(){
        ApplicationContext ctx=new AnnotationConfigApplicationContext(SpringConfig.class);
        Student student=(Student)ctx.getBean("student1");
        System.out.println("使用JavaConfig创建的对象:"+student);
    }
}
