package com.uscraft.account.dao;

import com.uscraft.account.domain.Account;

public interface AccountDao {

    Account queryById(Integer id);

}
