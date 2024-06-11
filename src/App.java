import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
public class App {
    public static int min (ArrayList<Integer> numbers) {	
	    int min = Collections.min(numbers);
	    return min;
    }
	
    public static int max (ArrayList<Integer> numbers) {	
	    int max = Collections.max(numbers);
	    return max;
    }
	
    public static BigInteger sum (ArrayList<Integer> numbers) {
	    BigInteger sum = BigInteger.ZERO;
	    for (int i = 0; i < numbers.size(); i++) {
	   	    sum = sum.add(BigInteger.valueOf(numbers.get(i)));
	    }
	    return sum;
    }
	
    public static BigInteger mult (ArrayList<Integer> numbers) {
	    BigInteger mult = BigInteger.ONE;
	    for (int i = 0; i < numbers.size(); i++) {
		    mult = mult.multiply(BigInteger.valueOf(numbers.get(i)));
   	    }
   	    return mult;
    }

	public static void main(String[] args) {
		String fileName = "D:\\numbers.txt";
		File file = new File(fileName);
		ArrayList<Integer> arrayA = new ArrayList<>();
		try {
			Scanner sc = new Scanner(file);
			while (sc.hasNextInt()) {
				int number = sc.nextInt();
				
				arrayA.add(number);
				System.out.print(number + " ");
			}
			sc.close();			
			System.out.println("Минимальное: " + min(arrayA));
			System.out.println("Максимальное: " + max(arrayA));
			System.out.println("Сумма: " + sum(arrayA));
			System.out.println("Произведение: " + mult(arrayA));
			String className = App.class.getSimpleName();
            System.out.println(className);
		}
		catch (FileNotFoundException e) {
			System.out.println("Ошибка чтения файла " + fileName);
		}
	}
}