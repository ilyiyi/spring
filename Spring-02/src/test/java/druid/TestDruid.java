package druid;

import com.wak.druid.SpringConfig;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import javax.sql.DataSource;
import java.sql.SQLException;

/**
 * @author wak
 */
public class TestDruid {
    @Test
    public void testBean() throws SQLException {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig.class);
        SpringConfig bean = ctx.getBean(SpringConfig.class);

    }

    @Test
    public void testImport() {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig.class);
        DataSource bean = ctx.getBean(DataSource.class);
        System.out.println(bean);
    }

}
