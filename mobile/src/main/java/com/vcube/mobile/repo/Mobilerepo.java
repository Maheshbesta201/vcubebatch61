package com.vcube.mobile.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vcube.mobile.model.Mobile;

public interface Mobilerepo extends JpaRepository<Mobile, Integer>{
	
	Mobile mobilename(String mobilename); 

}
