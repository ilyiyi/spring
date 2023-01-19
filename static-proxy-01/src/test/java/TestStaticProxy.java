import com.wak.proxy.ProxyStudent;
import com.wak.service.impl.StudentServiceImpl;
import com.wak.transaction.DaoTransaction;
import org.junit.Test;

/**
 * @author wak
 */
public class TestStaticProxy {
    @Test
    public void testSave() {
        DaoTransaction tx = new DaoTransaction();
        StudentServiceImpl studentService = new StudentServiceImpl();
        //获取代理类对象
        ProxyStudent proxyStudent = new ProxyStudent(studentService, tx);
        proxyStudent.save();
        proxyStudent.query(123L);
    }
}
