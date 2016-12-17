package dagong.spring_boot_application.domain;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.Repository;

public interface CityRepository extends Repository<City, Long> {
	
	/**
	 * 分页查询
	 * @param pageable
	 * @return
	 */
	Page<City> findAll(Pageable pageable);
	
	/**
	 * 根据城市名查询忽略大小写
	 */
	
	City findByNameAndCountryAllIgnoringCase(String country);
	
}
