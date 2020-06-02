package co.grandcircus.WeatherApi;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class WeatherApiService {

	private RestTemplate rest = new RestTemplate();
	
	public List<DailyWeather> showWeather(){
		
		String url = "https://forecast.weather.gov/MapClick.php?lat=38.4247341&lon=-86.9624086&FcstType=json";
		JsonOutmost response = rest.getForObject(url, JsonOutmost.class);
		
		Time times = response.getTime();
		Data datas = response.getData();
		
		List<String> startPeriodName = times.getStartPeriodName();
		List<String> tempLabel = times.getTempLabel();
		List<String> temperature = datas.getTemperature();
		List<String> weather = datas.getWeather();
		
		List<DailyWeather> returnList = new ArrayList<>();
		
		
		for(int i = 0; i < temperature.size(); i++) {	
			DailyWeather today = new DailyWeather();
			today.setDay(startPeriodName.get(i));
			today.setLow(tempLabel.get(i));
			today.setTemp(temperature.get(i));
			today.setWeather(weather.get(i));
			
			returnList.add(today);
		}
		
		return returnList;
	}
	
	
}
