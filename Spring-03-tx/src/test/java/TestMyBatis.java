import com.wak.config.SpringConfig;
import com.wak.domain.Account;
import com.wak.mapper.AccountMapper;
import com.wak.service.AccountService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * @author wak
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {SpringConfig.class})
public class TestMyBatis {

    @Autowired
    private AccountMapper accountMapper;

    @Autowired
    private AccountService accountService;

    @Test
    public void testMyBatis() {
        List<Account> accounts = accountMapper.selectAll();
        System.out.println(accounts);

        accountService.transfer(1L, 2L, 500);
    }

    @Test
    public void testReadOnly() {
        Account account = accountService.selectById(1L);
        System.out.println(account);
    }

}
