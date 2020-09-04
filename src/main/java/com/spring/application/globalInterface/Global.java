package com.spring.application.globalInterface;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Global <T> extends JpaRepository<T, Integer>{
	
	public void create();
	
	public void update(T t);
	
	public void deleteAll();
	
	public void show();
	
}
