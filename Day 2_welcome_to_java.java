# day3 Affiqhyalrifadz_D0221120_A day3_welcome_to_javaimport java .
  import java.util.*;

public class day3_Java_if_else{
	private static final Scanner scanner  = new Scanner(System.in);
	
	public static void main(String[] args) {
		int N = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
		if (N%2 != 0){
			System.out.println ("Weird");
		}else if (N >=2 && N <=5){
			System.out.println ("Not Weird");
		}else if (N >=6 && N<=20){
			System.out.println ("Weird");
		}else if (N >20){
			System.out.println("Not Weird");
        }
    }
}
