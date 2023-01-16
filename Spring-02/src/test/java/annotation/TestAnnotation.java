package annotation;

import com.wak.annotation.config.SpringConfig;
import com.wak.annotation.mapper.StudentMapper;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author wak
 */
public class TestAnnotation {
    @Test
    public void testAnnotation(){
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        System.out.println(context);
        StudentMapper bean = context.getBean(StudentMapper.class);
        System.out.println(bean);
    }
}
