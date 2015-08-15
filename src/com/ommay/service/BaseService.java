package com.ommay.service;

import java.util.List;

public interface BaseService {
	public List  getAll();
	public Object findUserByName(String name);
	public void save(Object obj);
	public void update(Object obj);
	public void delete(int Id);
	public boolean verify(Object object);
}
