package autowired;

import com.wak.autowired.EmployeeService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author wak
 */
public class TestAutowired {
    @Test
    public void testAutowired() {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("autowiredBeans.xml");
        EmployeeService empService = (EmployeeService) ctx.getBean("empService");
        empService.delete(1L);
    }
}
