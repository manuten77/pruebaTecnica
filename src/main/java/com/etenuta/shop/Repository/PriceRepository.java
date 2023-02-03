package com.etenuta.shop.Repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.etenuta.shop.Persistence.Prices;

public interface PriceRepository extends JpaRepository<Prices,Integer> {
	
	@Query(value="SELECT P.* FROM PRICES  P WHERE  P.START_DATE <= :appDateTime  AND P.END_DATE >= :appDateTime  ORDER  BY P.PRIORITY DESC LIMIT 1",nativeQuery=true)
    Prices findPriceByDateTime( @Param("appDateTime") String appDateTime);
}
