package co.grandcircus.WeatherApi;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ApiController {
	
	@Autowired
	private WeatherApiService service;
	
	
	@RequestMapping("/")
	public String repsonse(Model model) {
		List<DailyWeather> forcast = service.showWeather();
		model.addAttribute("forcast",forcast);
		
		return "/display";
		
	}
}
	





