package ioc;

import com.wak.ioc.domain.*;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * @author wak
 */
public class BeanTest {
    /**
     * 获取Spring容器
     */
    @Test
    public void testApplication() {
        ApplicationContext app = new ClassPathXmlApplicationContext("beans.xml");
        System.out.println(app);

        ApplicationContext app1 = new FileSystemXmlApplicationContext("C:\\workspace\\wakcode\\spring\\Spring-01\\src\\main\\resources\\beans.xml");
        System.out.println(app1);
    }

    /**
     * 获取bean
     */
    @Test
    public void testGetBean() {
        ApplicationContext app = new ClassPathXmlApplicationContext("beans.xml");
        Student student = (Student) app.getBean("student");
        System.out.println(student);

        Student stu = app.getBean("student", Student.class);
        System.out.println(stu);

        Student s = app.getBean(Student.class);
        System.out.println(s);

        System.out.println(stu == s && s == student);
    }

    /**
     * 通过构造函数实例化
     */
    @Test
    public void testConstructorInit() {
        ApplicationContext app = new ClassPathXmlApplicationContext("beans.xml");
        Person person = app.getBean("person", Person.class);
        System.out.println(person);
    }

    /**
     * 通过静态工厂方法实例化
     */
    @Test
    public void testFactoryStaticMethodInit() {
        ApplicationContext app = new ClassPathXmlApplicationContext("beans.xml");
        ClientServer clientServer = app.getBean("clientServer", ClientServer.class);

    }

    /**
     * 通过实例工厂方法实例化
     */
    @Test
    public void testInstanceFactory() {
        ApplicationContext app = new ClassPathXmlApplicationContext("beans.xml");
        ClientService clientService = app.getBean("clientService", ClientService.class);
    }

    /**
     * 通过实现FactoryBean实例化
     */
    @Test
    public void testFactoryBeanInit() {
        ApplicationContext app = new ClassPathXmlApplicationContext("beans.xml");
        Employee emp = (Employee) app.getBean("employee");
        Employee emp1 = (Employee) app.getBean("employee");
        System.out.println(emp);
        System.out.println(emp1);
    }
}
