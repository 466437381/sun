package com.itheima.dao;

import com.itheima.domain.Account;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface AccountDao {
    @Insert(value = "insert into account (name,money) values (#{name},#{money})")
    public void saveAccount(Account account);

    @Select("select * from account")
    public List<Account> findAll();
}
