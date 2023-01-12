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
    public void testApplication(){
        ApplicationContext app = new ClassPathXmlApplicationContext("beans.xml");
        System.out.println(app);

        ApplicationContext app1 = new FileSystemXmlApplicationContext("C:\\workspace\\wakcode\\spring\\Spring-01\\src\\main\\resources\\beans.xml");
        System.out.println(app1);
    }
}
