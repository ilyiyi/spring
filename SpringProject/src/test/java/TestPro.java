import com.wak.config.SpringConfig;
import com.wak.mapper.ProductMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author wak
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = SpringConfig.class)
public class TestPro {

    @Autowired
    private ProductMapper productMapper;

    @Test
    public void test() {
        System.out.println(productMapper.list("a"));
    }
}
