package lifecycle;

import com.wak.lifecycle.User;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author wak
 */
public class TestLifecycle {
    @Test
    public void testLifecycle() {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("lifecycleBeans.xml");
        User user = ctx.getBean("user", User.class);
        System.out.println(user);
        ctx.close();
    }
}
