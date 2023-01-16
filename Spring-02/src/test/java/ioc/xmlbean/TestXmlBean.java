package ioc.xmlbean;

import com.wak.ioc.xmlbean.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author wak
 */
public class TestXmlBean {
    @Test
    public void testXmlBean(){
        ApplicationContext app = new ClassPathXmlApplicationContext("xmlBeans.xml");
        Student stu = app.getBean("stu", Student.class);
        System.out.println(stu);
    }
}
