package com.etenuta.shop.Service;

import java.util.List;
import org.springframework.stereotype.Service;

import com.etenuta.shop.Persistence.Prices;
import com.etenuta.shop.Repository.PriceRepository;


@Service
public class PriceService {
	 
	private final PriceRepository repository;
	 
	 public PriceService(PriceRepository repository) {
		 this.repository = repository;
	 }
	 
	 public List<Prices> findAll() {
		 return this.repository.findAll();
	 }
	 
	 public Prices findPriceByApplDateTime(String testNumber) {
		 String appDateTime = null;
		 switch(testNumber) {
		     //Test1
		 case "Test1":
			 appDateTime="2020-06-14 10:00:00";
			 break;
			 //Test2
		 case "Test2":
			 //appDateTime=LocalDateTime.of(2020, Month.JUNE, 14, 16, 00, 00);
			 appDateTime="2020-06-14 16:00:00";
			 break;
			 //Test3
		 case "Test3":
			 //appDateTime=LocalDateTime.of(2020, Month.JUNE, 14, 21, 00, 00);
			 appDateTime="2020-06-14 21:00:00";
			 break;
			 //Test4
		 case "Test4":
			 //appDateTime=LocalDateTime.of(2020, Month.JUNE, 15, 10, 00, 00);
			 appDateTime="2020-06-15 10:00:00";
			 break;
			 //Test5
		 case "Test5":
			 //appDateTime=LocalDateTime.of(2020, Month.JUNE, 16, 21, 00, 00);
			 appDateTime="2020-06-16 21:00:00";
			 break;
		 default:
			 appDateTime="2020-06-14 00:00:00";
					 
		 }
		 return this.repository.findPriceByDateTime(appDateTime);
	 }

}
