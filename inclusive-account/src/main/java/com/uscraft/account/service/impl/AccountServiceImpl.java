package com.uscraft.account.service.impl;

import com.uscraft.account.dao.AccountDao;
import com.uscraft.account.domain.Account;
import com.uscraft.account.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountServiceImpl implements AccountService {

    @Autowired
    AccountDao accountDao;

    @Override
    public Account queryById(Integer id) {
        return accountDao.queryById(id);
    }
}
