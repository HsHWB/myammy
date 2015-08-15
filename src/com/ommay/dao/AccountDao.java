package com.ommay.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.ommay.entity.Account;
@Repository
public interface AccountDao {
	public List<Account> queryAll();
	public void save(Object object);
	public void update(Object object);
	public void delete(Object object);
	public Object findByName(String name);
	public boolean verify(Object objectt);
}
