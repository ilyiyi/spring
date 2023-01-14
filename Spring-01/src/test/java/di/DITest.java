package di;

import com.wak.di.collections.CollectionsDemo;
import com.wak.di.constructor.service.StudentService;
import com.wak.di.setter.service.EmployeeService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author wak
 */
public class DITest {
    @Test
    public void testDIConstructor() {
        ApplicationContext app = new ClassPathXmlApplicationContext("DiConstructorBeans.xml");
        StudentService studentService = (StudentService) app.getBean("studentService");
        System.out.println(studentService);
        studentService.delete(1L);
    }

    @Test
    public void testSetDi() {
        ApplicationContext app = new ClassPathXmlApplicationContext("DiSetterBeans.xml");
        EmployeeService empService = (EmployeeService) app.getBean("empService");
        empService.delete(2L);
    }

    @Test
    public void testCollectionsDi() {
        ApplicationContext app = new ClassPathXmlApplicationContext("CollectionsBeans.xml");
        CollectionsDemo collectionsDemo = (CollectionsDemo) app.getBean("collectionsDemo");
        collectionsDemo.print();
    }
}
