package co.grandcircus.WeatherApi;
public class DailyWeather {
		private String day;
		private String temp;
		private String low;
		private String weather;
		
		public String getDay() {
			return day;
		}
		public void setDay(String day) {
			this.day = day;
		}
		public String getTemp() {
			return temp;
		}
		public void setTemp(String temp) {
			this.temp = temp;
		}
		public String getLow() {
			return low;
		}
		public void setLow(String low) {
			this.low = low;
		}
		public String getWeather() {
			return weather;
		}
		public void setWeather(String weather) {
			this.weather = weather;
		}
		@Override
		public String toString() {
			return "[day=" + day + ", temp=" + temp + ", low=" + low + ", weather=" + weather + "]";
		}
		

		
	}