import com.wak.interceptor.CglibInterceptor;
import com.wak.service.StudentService;
import com.wak.service.impl.StudentServiceImpl;
import com.wak.transaction.DaoTransaction;
import net.sf.cglib.core.DebuggingClassWriter;
import net.sf.cglib.proxy.Enhancer;
import org.junit.Test;

/**
 * @author wak
 */
public class TestStudent {
    @Test
    public void testSave() {
        //生成目标代理类
        System.setProperty(DebuggingClassWriter.DEBUG_LOCATION_PROPERTY, "C:\\workspace\\wakcode\\spring\\cglib-proxy-03\\src\\");
        //得到方法拦截器
        CglibInterceptor interceptor = new CglibInterceptor(new DaoTransaction());
        //使用cglib框架生成目标类的子类(代理类)实现增强
        Enhancer enhancer = new Enhancer();
        //设置父类(被代理的类)字节码
        enhancer.setSuperclass(StudentServiceImpl.class);
        //设置拦截处理
        enhancer.setCallback(interceptor);
        StudentService studentService = (StudentService) enhancer.create();
        studentService.save();
    }

    private void saveProxyClass(String path) {


    }
}
