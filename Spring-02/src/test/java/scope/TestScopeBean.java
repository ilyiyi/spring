package scope;

import com.wak.scope.LifeBean;
import com.wak.scope.ScopeBean;
import com.wak.scope.ScopeConfig;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author wak
 */
public class TestScopeBean {
    @Test
    public void testScope() {
        ApplicationContext context = new AnnotationConfigApplicationContext(ScopeConfig.class);
        ScopeBean bean = context.getBean(ScopeBean.class);
        ScopeBean bean1 = context.getBean(ScopeBean.class);
        System.out.println(bean);
        System.out.println(bean1);
    }

    @Test
    public void testLifecycle() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ScopeConfig.class);
        LifeBean bean = context.getBean(LifeBean.class);
        System.out.println(bean);
        context.close();
    }
}
