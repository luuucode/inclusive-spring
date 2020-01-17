package com.uscraft.account;

import com.uscraft.account.service.AccountService;
import com.uscraft.account.domain.Account;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class AccountUnitTests extends BaseTest{

    @Autowired
    AccountService accountService;

    @Test
    public void test(){
        Account account = accountService.queryById(1);
        Assert.assertNotNull(account);
    }
}
