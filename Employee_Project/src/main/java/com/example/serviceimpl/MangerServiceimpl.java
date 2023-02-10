package com.example.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.enitity.Manger;
import com.example.repository.MangerRepository;
import com.example.service.MangerService;
@Service

public abstract class MangerServiceimpl implements MangerService {
	@Autowired
	private MangerRepository mangerRepository;
	
	public List<Manger> getAllManger() {
		// TODO Auto-generated method stub
		return mangerRepository.findAll();
	}

	
	public Manger updateManger1(Manger manger, int MId) {
		
	
	// TODO Auto-generated method stub
		Manger manger1 = mangerRepository.findById(MId).get();
		manger1.setMName(manger1.getMName());
	    return mangerRepository.save(manger);
	}

	
	public String deleteManger(int MId) {
		// TODO Auto-generated method stub
		mangerRepository.deleteById(MId);
		return "the Manger with id " + MId + " has been deleted...";
	}

	
	public Manger saveExam(Manger manger) {
		// TODO Auto-generated method stub
		return mangerRepository.save(manger);
	}

	
	public Manger findByMangerMId(int mangerMId) {
		// TODO Auto-generated method stub
		return mangerRepository.findById(mangerMId).get();
	}


	
	}
