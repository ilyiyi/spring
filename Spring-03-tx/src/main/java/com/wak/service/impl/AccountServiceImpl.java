package com.wak.service.impl;

import com.wak.domain.Account;
import com.wak.mapper.AccountMapper;
import com.wak.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.support.JdbcTransactionManager;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.lang.annotation.Repeatable;
import java.sql.SQLException;

/**
 * @author wak
 */
@Service
public class AccountServiceImpl implements AccountService {

    @Autowired
    private AccountMapper accountMapper;

    @Override
    @Transactional(isolation = Isolation.REPEATABLE_READ)
    public void transfer(Long srcId, Long dstId, int money) {
        accountMapper.outAccount(srcId, money);

        accountMapper.inAccount(dstId, money);
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public Account selectById(Long id) {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return accountMapper.selectByPrimaryKey(id);
    }


}
