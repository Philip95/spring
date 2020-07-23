package com.spring.application.globalInterface;

public interface Global <T>{
	
	public void create();
	
	public void update(T t);
	
	public void deleteAll();
	public void deleteById(T t);
	
	public void show();
	
}
