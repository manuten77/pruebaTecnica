package com.etenuta.shop.Controller;



import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.etenuta.shop.Persistence.Prices;
import com.etenuta.shop.Service.PriceService;


@RestController
public class PricesController {
	
	private final PriceService priceService;
	
	public PricesController (PriceService priceService) {
		this.priceService=priceService;
	}
	
	@GetMapping
	public List<Prices> findAll(){
		return this.priceService.findAll();
	}
	
	@GetMapping("/tests/{testNumber}")
	public Prices findPriceByAppDateTime(
			@PathVariable("testNumber") 
			String testNumber){
		return this.priceService.findPriceByApplDateTime(testNumber);
	}


}
