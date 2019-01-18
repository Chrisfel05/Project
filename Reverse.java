import java.util.Scanner;
public class Reverse {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String Input;
		Scanner STRING = new Scanner(System.in);
		System.out.println("ENTER A PHRASE OR WORD: ");
		Input = STRING.nextLine();
		String [] c = Input.split(" ");
		String Reversed = " ";
		for(int i = 0; i <c.length; i++) {
			String Reverse = c[i];
			String r = " ";
			
		for(int k = Reverse.length() - 1; k>=0; k--) {
			r = r + Reverse.charAt(k);
			}
			Reversed = Reversed + r + " ";
		}
		System.out.println(Reversed);

	}

}
