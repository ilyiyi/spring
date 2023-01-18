import com.wak.config.SpringConfig;
import com.wak.mapper.StudentMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author wak
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {SpringConfig.class})
public class TestStudent {

    @Autowired
    private StudentMapper studentMapper;

    @Autowired
    private JdbcTemplate jdbcTemplate;


    @Test
    public void testStudentMapper() {
        studentMapper.save();
    }

    @Test
    public void testJdbcTemplate() {
        System.out.println(jdbcTemplate);
    }
}
