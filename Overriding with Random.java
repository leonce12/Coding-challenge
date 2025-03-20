import java.util.Random;
public class WeatherForecast {
public static void main(String[] args) {
Random random = new Random();
int temperature = random.nextInt(-5, 40);
System.out.println("Today's temperature: " + temperature + "°C");
}
}