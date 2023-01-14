package xmlAnnotation;

import com.wak.xmlAnnotation.mapper.UserMapper;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author wak
 */
public class TestXmlAndAnnotation {
    @Test
    public void testComponent() {
        ApplicationContext context = new ClassPathXmlApplicationContext("xmlAndAnnotation.xml");
        UserMapper bean = context.getBean(UserMapper.class);
        System.out.println(bean);

        UserMapper u = context.getBean("u", UserMapper.class);
        u.save();
    }
}
