package com.ommay.dao.impl;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.ommay.dao.AccountDao;
import com.ommay.dao.BaseDao;
import com.ommay.entity.Account;

@Repository
public class AccountDaoImpl extends BaseDao  implements AccountDao {

	@Override
	public List<Account> queryAll() {
		// TODO Auto-generated method stub
		Map<String, Object> map = null;
		String table = "from Account";
		return super.queryAll(table, map);
	}

	@Override
	public void save(Object object) {
		// TODO Auto-generated method stub

	}

	@Override
	public void update(Object object) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(Object object) {
		// TODO Auto-generated method stub

	}

	@Override
	public Object findByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean verify(Object objectt) {
		// TODO Auto-generated method stub
		return false;
	}

}