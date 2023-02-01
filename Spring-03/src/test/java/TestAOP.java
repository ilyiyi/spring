import com.wak.config.AOPConfig;
import com.wak.service.StudentService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author wak
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {AOPConfig.class})
public class TestAOP {

    @Autowired
    private StudentService studentService;

    @Test
    public void test() {
        studentService.save(null);
    }

}
