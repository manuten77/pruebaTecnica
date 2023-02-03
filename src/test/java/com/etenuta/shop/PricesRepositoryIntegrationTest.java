package com.etenuta.shop;
import com.etenuta.shop.Persistence.*;
import com.etenuta.shop.Repository.PriceRepository;
import com.etenuta.shop.Service.PriceService;
import org.junit.runner.RunWith;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.hamcrest.core.Is.is;
import static org.mockito.BDDMockito.given;
import static org.springframework.http.MediaType.APPLICATION_JSON;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@DataJpaTest
public class PricesRepositoryIntegrationTest {
	Logger logger = LoggerFactory.getLogger(PricesRepositoryIntegrationTest.class);
	@Autowired
	   private TestEntityManager entityManager;
	@Autowired
	   private PriceRepository priceRepository;
	@Test
	   public void getPriceByAppDateTime() throws Exception {
	        String test1 ="2020-06-14 10:00:00", test2="2020-06-14 16:00:00",
					test3="2020-06-14 21:00:00", test4="2020-06-15 10:00:00",
					test5="2020-06-16 21:00:00";
			//Test 1
			Prices found= priceRepository.findPriceByDateTime(test1);
			logger.info("Test 1: fecha app: "+test1+" producto: "+found.getProductId()+ " brand: "+found.getBrandId()+" price: "+found.getPrice()+" €");
			assertThat(found.getPrice()).isEqualTo(35.50F);
			//Test 2
			found=priceRepository.findPriceByDateTime(test2);
			logger.info("Test 2: fecha app: "+test2+" producto: "+found.getProductId()+ " brand: "+found.getBrandId()+" price: "+found.getPrice()+" €");
			assertThat(found.getPrice()).isEqualTo(25.45F);
			//Test 3
			found=priceRepository.findPriceByDateTime(test3);
			logger.info("Test 3: fecha app: "+test3+" producto: "+found.getProductId()+ " brand: "+found.getBrandId()+" price: "+found.getPrice()+" €");
			assertThat(found.getPrice()).isEqualTo(35.50F);
			//Test 4
			found=priceRepository.findPriceByDateTime(test4);
			logger.info("Test 4: fecha app: "+test4+" producto: "+found.getProductId()+ " brand: "+found.getBrandId()+" price: "+found.getPrice()+" €");
			assertThat(found.getPrice()).isEqualTo(30.50F);
			//Test 5
			found=priceRepository.findPriceByDateTime(test5);
			logger.info("Test 5: fecha app: "+test5+" producto: "+found.getProductId()+ " brand: "+found.getBrandId()+" price: "+found.getPrice()+" €");
			assertThat(found.getPrice()).isEqualTo(38.95F);

	   }


}
