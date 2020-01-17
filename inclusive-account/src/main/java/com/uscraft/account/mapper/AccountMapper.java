package com.uscraft.account.mapper;

import com.uscraft.account.domain.Account;
import tk.mybatis.mapper.common.Mapper;

public interface AccountMapper extends Mapper<Account> {


    Account queryById(Integer accountId);
}