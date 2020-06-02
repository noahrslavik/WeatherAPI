package co.grandcircus.WeatherApi;

import java.util.List;

public class Data {

	private List<String> temperature;
	private List<String> weather;

	public List<String> getTemperature() {
		return temperature;
	}
	public void setTemperature(List<String> temperature) {
		this.temperature = temperature;
	}
	public List<String> getWeather() {
		return weather;
	}
	public void setWeather(List<String> weather) {
		this.weather = weather;
	}
	
	@Override
	public String toString() {
		return "Data [temperature=" + temperature + ", weather=" + weather + "]";
	}
	
	
}
