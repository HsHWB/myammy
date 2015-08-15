package com.ommay.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ommay.dao.AccountDao;
import com.ommay.entity.Account;
import com.ommay.service.BaseService;

@Service
public class AccountServiceImpl implements BaseService{

	@Autowired
	private AccountDao accountDao;
	public AccountDao getAccountDao() {
		return accountDao;
	}

	public void setAccountDao(AccountDao accountDao) {
		this.accountDao = accountDao;
	}

	@Override
	public List<Account> getAll() {
		// TODO Auto-generated method stub
		List<Account> list = accountDao.queryAll();
		return list;
	}

	@Override
	public Object findUserByName(String name) {
		// TODO Auto-generated method stub
		Account account = (Account)accountDao.findByName(name);
		return account;
	}

	@Override
	public void save(Object obj) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Object obj) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(int Id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean verify(Object object) {
		// TODO Auto-generated method stub
		return false;
	}

}
