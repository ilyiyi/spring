package com.wak.service;

import com.wak.domain.Account;

/**
 * @author wak
 */
public interface AccountService {
    /**
     * 转账
     *
     * @param srcId 转出账户id
     * @param dstId 转入账户id
     * @param money 金额
     */
    void transfer(Long srcId, Long dstId, int money);

    /**
     * 根据id查询账户
     *
     * @param id id
     * @return Account
     */
    Account selectById(Long id);
}
