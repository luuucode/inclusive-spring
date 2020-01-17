package com.uscraft.account.dao.impl;

import com.uscraft.account.dao.AccountDao;
import com.uscraft.account.domain.Account;
import com.uscraft.account.mapper.AccountMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AccountDaoImpl implements AccountDao {

    @Autowired
    AccountMapper accountMapper;

    @Override
    public Account queryById(Integer id) {
        return accountMapper.queryById(id);
    }
}
