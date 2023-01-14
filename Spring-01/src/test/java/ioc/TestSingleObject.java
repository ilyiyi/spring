package ioc;

import com.wak.ioc.domain.Student;
import com.wak.ioc.util.BeanStaticFactory;
import com.wak.ioc.util.SingleObject;
import com.wak.ioc.util.SingleObjectE;
import org.junit.Test;

/**
 * @author wak
 */
public class TestSingleObject {
    @Test
    public void testSingle() {
        SingleObject instance = SingleObject.getInstance();
        SingleObject instance1 = SingleObject.getInstance();
        SingleObject instance2 = SingleObject.getInstance();
        System.out.println(instance);
        System.out.println(instance1);
        System.out.println(instance2);
    }

    @Test
    public void testSingleObjectE() {
        SingleObjectE instance = SingleObjectE.getInstance();
        SingleObjectE instance1 = SingleObjectE.getInstance();
        SingleObjectE instance2 = SingleObjectE.getInstance();
        System.out.println(instance);
        System.out.println(instance1);
        System.out.println(instance2);
    }

    @Test
    public void testFactory() {
        Student student = (Student) BeanStaticFactory.getBean("Student");
    }

}
