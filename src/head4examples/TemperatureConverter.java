package head4examples;

/**
 * Created by ADMIN on 24.01.2017.
 */
public class TemperatureConverter {

    public String convertTemp(int temperature, char convertTo) {
        String convertTemperature = "";
        int temperitureF = temperature +35;
        if (convertTo == 'F') {
            convertTemperature = "the temperature is " + temperitureF + " F";
            System.out.println(convertTemperature);
        } else if (convertTo == 'C') {
            convertTemperature = "the temperature is " + temperature + " C";
            System.out.println(convertTemperature);
        }
        return convertTemperature;
    }

    public static void main(String[] args) {
        TemperatureConverter temperatureConverter = new TemperatureConverter();
        temperatureConverter.convertTemp(35, 'F');
        temperatureConverter.convertTemp(35, 'C');
    }
}
