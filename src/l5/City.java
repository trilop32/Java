package l5;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class City {
    private String cityName;
    private String countryName;
    private int population;
    private String phoneCode;
    private List<String> districts;
    public City() {
        this.districts = new ArrayList<>();
    }
    public City(String cityName, String countryName, int population, String phoneCode, List<String> districts) {
        this.cityName = cityName;
        this.countryName = countryName;
        this.population = population;
        this.phoneCode = phoneCode;
        this.districts = districts;
    }
    public void inputData() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите название города: ");
        this.cityName = scanner.nextLine();
        System.out.print("Введите название страны: ");
        this.countryName = scanner.nextLine();
        System.out.print("Введите количество жителей: ");
        this.population = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Введите телефонный код города: ");
        this.phoneCode = scanner.nextLine();
        System.out.println("Введите названия районов города (для завершения введите 'end'):");
        String district;
        while (true) {
            district = scanner.nextLine();
            if (district.equalsIgnoreCase("end")) {
                break;
            }
            this.districts.add(district);
        }
        System.out.println("Данные города успешно введены.");
    }
    public void printData() {
        System.out.println("Название города: " + this.cityName);
        System.out.println("Название страны: " + this.countryName);
        System.out.println("Количество жителей: " + this.population);
        System.out.println("Телефонный код: " + this.phoneCode);
        System.out.println("Районы города: " + this.districts);
    }
    public String getCityName() {
        return cityName;
    }
    public void setCityName(String cityName) {
        this.cityName = cityName;
    }
    public String getCountryName() {
        return countryName;
    }
    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }
    public int getPopulation() {
        return population;
    }
    public void setPopulation(int population) {
        this.population = population;
    }
    public String getPhoneCode() {
        return phoneCode;
    }
    public void setPhoneCode(String phoneCode) {
        this.phoneCode = phoneCode;
    }
    public List<String> getDistricts() {
        return districts;
    }
    public void setDistricts(List<String> districts) {
        this.districts = districts;
    }
    public static void main(String[] args) {
        City myCity = new City();
        myCity.inputData();
        myCity.printData();
        System.out.println("Имя города: " + myCity.getCityName());
        myCity.setPopulation(1500000);
        System.out.println("Новое количество жителей: " + myCity.getPopulation());
    }
}