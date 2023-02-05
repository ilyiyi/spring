import com.wak.config.SpringConfig;
import com.wak.domain.Item;
import com.wak.service.ItemService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author wak
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {SpringConfig.class})
public class ItemTest {

    @Autowired
    private ItemService itemService;

    @Test
    public void testSave() {
        Item item = new Item();
        item.setName("单元测试");
        item.setType("单元测试");
        item.setRemark("单元测试");
        System.out.println(itemService.save(item));
    }

    @Test
    public void testUpdate() {
        Item item = new Item();
        item.setId(5L);
        item.setName("单元测试1");
        item.setType("单元测试1");
        item.setRemark("单元测试1");
        System.out.println(itemService.update(item));
    }

    @Test
    public void testGetById() {
        System.out.println(itemService.getById(5L));
    }

    @Test
    public void testDelete() {
        System.out.println(itemService.delete(5L));
    }


}
