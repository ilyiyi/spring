package druid;

import com.alibaba.druid.pool.DruidDataSource;
import com.wak.druid.Emp;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.sql.SQLException;

/**
 * @author wak
 */
public class TestDruid {
    @Test
    public void testDruidConnection() throws SQLException {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("druidBeans.xml");
        DruidDataSource dataSource = (DruidDataSource) ctx.getBean("druid");
        System.out.println(dataSource.getConnection());
    }

    @Test
    public void testEmp() {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("druidBeans.xml");
        Emp emp = ctx.getBean("emp", Emp.class);
        System.out.println(emp);
    }
}
