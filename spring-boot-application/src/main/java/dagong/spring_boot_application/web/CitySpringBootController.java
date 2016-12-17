package dagong.spring_boot_application.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import dagong.spring_boot_application.domain.City;
import dagong.spring_boot_application.service.CityService;

@RestController
public class CitySpringBootController {

	@Autowired
	private CityService cityService;
	
	@RequestMapping(value="/city",method=RequestMethod.GET)
	public City cityInfo(@RequestParam("countryo") String country){
		return cityService.findByNameAndCountryAllIgnoringCase(country);
	}
}
