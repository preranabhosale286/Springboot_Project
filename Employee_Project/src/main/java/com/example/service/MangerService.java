package com.example.service;

import java.util.List;

import com.example.enitity.Manger;



public interface MangerService {
Manger saveManger(Manger  manger);
    
Manger  findByMangerMId(int MId );
    
    List<Manger> getAllManger ();

	String deleteManger(int MId);
	
	Manger  updateManger(Manger manger , int MId);

}
