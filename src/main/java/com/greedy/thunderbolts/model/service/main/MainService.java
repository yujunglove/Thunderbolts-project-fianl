package com.greedy.thunderbolts.model.service.main;

import java.util.List;

import org.springframework.stereotype.Service;

import com.greedy.thunderbolts.model.dao.MainMapper;
import com.greedy.thunderbolts.model.dto.ProductDTO;

@Service
public class MainService {
	
	private final MainMapper mapper;
	
	public MainService(MainMapper mapper) {
		this.mapper = mapper;
	}

	public List<ProductDTO> findNewProduct() {
		
		List<ProductDTO> newProductList = mapper.findNewProduct();
		
		
		return newProductList;
	}
	
	public List<ProductDTO> findHotroduct() {
		
		List<ProductDTO> findHotroduct = mapper.findHotroduct();
		
		
		return findHotroduct;
	}

	public List<ProductDTO> bestHotroduct() {
		
		List<ProductDTO> bestHotroduct = mapper.bestHotroduct();
		
		
		return bestHotroduct;
	}

	

}
