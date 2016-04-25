// The prompt for this programming problem can be found at https://projecteuler.net/problem=8
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;


public class Main {
	public static void main(String[] args){
		long [] numberArray = new long [1000];
		try {
			for (String line : Files.readAllLines(Paths.get("./Numbers.txt"))){
				for (int index = 0; index < line.length(); index++){
					long number = Character.getNumericValue(line.charAt(index));
					numberArray[index] = number;
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		long topProduct=0;
		System.out.println(numberArray);
		for (int count = 0; count <987; count ++){
			long product = 1;
			for ( int thirteen =0; thirteen <13; thirteen ++){
				product *= numberArray[thirteen+count];
				
			}
			System.out.println(product);
			if(product> topProduct){
				topProduct = product;
			}
		}

		
		System.out.println(topProduct);
	}
}
