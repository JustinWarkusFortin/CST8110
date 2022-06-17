import java.security.SecureRandom;

public class Lab6 {
	
	private static final int TOTAL_NUMBERS = 100;
	private static final int NUMBER_OF_RANGES = 6;
	
	public static void main(String[] args) {
		 
		int temperatureData[] = new int[TOTAL_NUMBERS];
		int maxTemp = Integer.MIN_VALUE;
		int minTemp = Integer.MAX_VALUE;
		int sum = 0;
		double averageTemp = 0.0;
		int frequencyOfTemp[] = new int[NUMBER_OF_RANGES];
		
		SecureRandom random = new SecureRandom();
		
		for (int i = 0;i<temperatureData.length;i++) {
            temperatureData[i] = random.nextInt(80)-40;
            sum+=temperatureData[i];
            if (temperatureData[i] < minTemp) {
                minTemp = temperatureData[i];
            }
            if (temperatureData[i] > maxTemp) {
                maxTemp = temperatureData[i];
            }
            if (temperatureData[i] < -10) {
                frequencyOfTemp[0]++;
            } else if (temperatureData[i] >= -10 && temperatureData[i] <= 0) {
                frequencyOfTemp[1]++;
            } else if (temperatureData[i] >= 0 && temperatureData[i] <= 10) {
                frequencyOfTemp[2]++;
            } else if (temperatureData[i] >= 10 && temperatureData[i] <= 20) {
                frequencyOfTemp[3]++;
            } else if (temperatureData[i] >= 20 && temperatureData[i] <= 30) {
                frequencyOfTemp[4]++;
            } else if (temperatureData[i] > 30) {
                frequencyOfTemp[5]++;
            }
        } 
		
		averageTemp = sum/TOTAL_NUMBERS;
		
		System.out.println("Minimum temperature: "+minTemp);
        System.out.println("Maximum temperature: "+maxTemp);
        System.out.println("Temperature average: "+averageTemp);

        System.out.println("\nFrequency of temperature range: ");

        print("Less than -10 ", frequencyOfTemp[0]);
        print("-10 to 0 ", frequencyOfTemp[1]);
        print("0 to 10 ", frequencyOfTemp[2]);
        print("10 to 20 ", frequencyOfTemp[3]);
        print("20 to 30 ", frequencyOfTemp[4]);
        print("Greater than 30 ", frequencyOfTemp[5]);


        final int numberOfClients = 2;
        
        Client clients[] = new Client[numberOfClients];
        
        for (int i = 0;i < numberOfClients;i++) {
            clients[i] = new Client();
        }
        
        for (int i = 0; i < numberOfClients;i++) {
            System.out.println("\n\nEnter info client "+(i+1));
            clients[i].keyboardClientInfo();
            System.out.println();
        }
        
        System.out.println("List of clients: ");
        for (int i = 0;i<numberOfClients;i++) {
            clients[i].displayClientInfo();
        }
	}

	public static void print(String message, int iterations) {
		System.out.print(message);
		for (int i = 0; i < iterations; i++) {
			System.out.print("*");
		}
		System.out.println();
	}
}
