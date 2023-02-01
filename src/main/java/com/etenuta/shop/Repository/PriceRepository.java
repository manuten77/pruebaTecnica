package com.etenuta.shop.Repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.etenuta.shop.Persistence.Prices;

public interface PriceRepository extends JpaRepository<Prices,Integer> {
	
	@Query(value="SELECT P.ID TARIFA,PRD.DESCRIPTION PRODUCT_NAME,BRN.DESCRIPTION BRAND_NAME,P.* FROM PRICES  P JOIN PRODUCTS PRD on (P.PRODUCT_ID= PRD.ID)	JOIN BRANDS BRN on (P.BRAND_ID= BRN.ID)	WHERE  P.START_DATE <= :appDateTime  AND P.END_DATE >= :appDateTime  ORDER  BY P.PRIORITY DESC LIMIT 1",nativeQuery=true)	
	public Prices findPriceByDateTime( @Param("appDateTime") String appDateTime);
}
