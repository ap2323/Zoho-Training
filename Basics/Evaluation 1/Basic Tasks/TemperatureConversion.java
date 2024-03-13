import java.util.Scanner;

//temperature conversion
class TemperatureConversion {
	
	float celsius =0.0f, fahrenheit=0.0f;
	Scanner scanner = new Scanner(System.in);
	
	void celsiusToFahrenheit(float celsius) {
		
		System.out.println("Fahrenheit: " + ((celsius *9/5) + 32));
		Options();
		
	}
	
	void fahrenheitToCelsius(float fahrenheit) {
		
		System.out.println("Celsius: " + ((fahrenheit - 32) * 5/9));
		Options();
		
	}
	
	void Options(){
		
			System.out.println("\n1. Celsius to Fahrenheit");
			System.out.println("2. Fahrenheit to Celsius");
			System.out.println("3. Exit");
			System.out.println("Enter Your Choice: ");
		
			int choice = scanner.nextInt();
			
			switch(choice) {
				case 1:
					System.out.println("Enter Celsius :");
					celsius = scanner.nextFloat();
					
					celsiusToFahrenheit(celsius);
					break;
				case 2:
					System.out.println("Enter Fahrenheit :");
					fahrenheit = scanner.nextFloat();
					
					fahrenheitToCelsius(fahrenheit);
					break;
					
				case 3: 
					System.exit(0);
				
				default:
					System.out.println("Invalid Option!");
					Options();
					break;
					
			}
		
		
		
	}
		
		
	
	public static void main(String[] args) {
		
		TemperatureConversion temperatureConversion = new TemperatureConversion();
		temperatureConversion.Options();
		
	}
	
}
