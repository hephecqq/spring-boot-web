package dagong.spring_boot_application.service.impl;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import dagong.spring_boot_application.domain.City;
import dagong.spring_boot_application.domain.CityRepository;
import dagong.spring_boot_application.service.CityService;

@Service("cityService")
@Transactional
public class CityServiceImpl implements CityService{

	@Autowired
	private CityRepository cityRepository;
	
	@Override
	public Page<City> findAll(Pageable pageable) {
		return cityRepository.findAll(pageable);
	}

	@Override
	public City findByNameAndCountryAllIgnoringCase(String country) {
		return cityRepository.findByNameAndCountryAllIgnoringCase(country);
	}

}
