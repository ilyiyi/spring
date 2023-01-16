package di.xmlAnnotation;

import com.wak.di.xmlAnnotation.config.DiConfig;
import com.wak.di.xmlAnnotation.db.DbProperties;
import com.wak.di.xmlAnnotation.mapper.EmployeeMapper;
import com.wak.di.xmlAnnotation.service.EmployeeService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author wak
 */
public class TestDi {
    @Test
    public void TestDi() {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(DiConfig.class);

        EmployeeService bean = ctx.getBean(EmployeeService.class);
        bean.save();
    }

    @Test
    public void TestProperty() {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(DiConfig.class);
        DbProperties bean = ctx.getBean(DbProperties.class);
        bean.print();
    }
}
