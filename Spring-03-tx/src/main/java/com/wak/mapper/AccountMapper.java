package com.wak.mapper;

import com.wak.domain.Account;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
public interface AccountMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Account record);

    Account selectByPrimaryKey(Long id);

    List<Account> selectAll();

    int updateByPrimaryKey(Account record);

    void outAccount(@Param("id") Long srcId, @Param("money") int money);

    void inAccount(@Param("id") Long dstId, @Param("money") int money);
}