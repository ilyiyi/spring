import com.wak.interceptor.TransactionHandler;
import com.wak.service.StudentService;
import com.wak.service.impl.StudentServiceImpl;
import com.wak.transaction.DaoTransaction;
import org.junit.Test;
import sun.misc.ProxyGenerator;

import java.io.File;
import java.io.FileOutputStream;
import java.lang.reflect.Proxy;

/**
 * @author wak
 */
public class TestStudent {
    @Test
    public void testSave() {
        //创建方法拦截处理器对象
        TransactionHandler handler = new TransactionHandler(new DaoTransaction(), new StudentServiceImpl());
        StudentService proxyStudentService = (StudentService) Proxy.newProxyInstance(StudentServiceImpl.class.getClassLoader(), StudentServiceImpl.class.getInterfaces(), handler);
        proxyStudentService.save();
        proxyStudentService.query(1L);
        saveProxyClass("C:\\workspace\\wakcode\\spring\\jdk-proxy-02\\src\\");
    }

    private void saveProxyClass(String path) {
        byte[] $proxy1s = ProxyGenerator.generateProxyClass("$proxy1", StudentServiceImpl.class.getInterfaces());
        try (FileOutputStream fos = new FileOutputStream(new File(path + "$proxy1.class"))) {
            fos.write($proxy1s);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
