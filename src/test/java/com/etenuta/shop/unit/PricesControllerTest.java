package com.etenuta.shop.unit;
import com.etenuta.shop.Controller.PricesController;
import com.etenuta.shop.Persistence.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import static org.hamcrest.core.Is.is;
import static org.mockito.BDDMockito.given;
import static org.springframework.http.MediaType.APPLICATION_JSON;
import static org.springframework.security.test.web.servlet.request.SecurityMockMvcRequestPostProcessors.user;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@WebMvcTest(PricesController.class)
public class PricesControllerTest {
	@Autowired
	   private MockMvc mvc;
	@MockBean
	   private PricesController pricesController;
	@Test
	   public void getPriceByAppDateTime() throws Exception {
	       Prices price = new Prices();
	       price.setBrandId(1);
	       price.setProductId(3);
	       String test="Test1";

	       given(pricesController.findPriceByAppDateTime(test)).willReturn(price);

	       mvc.perform(get("/tests/" + test)
	               .with(user("sa").password("password"))
	               .contentType(APPLICATION_JSON))
	               .andExpect(status().isOk())
	               .andExpect(jsonPath("price", is(price.getPrice())));
	   }
}
