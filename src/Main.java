import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		int n,r,total1 = 1,total2 = 1,total3 = 1,kombinasyon;
		Scanner inp = new Scanner(System.in);
		n = inp.nextInt();
		r = inp.nextInt();
		
		for (int i = 1; i <=n; i++) {
			total1*=i;
		}
		for (int j = 1; j <=r; j++) {
			total2*=j;
			total3*=n-r;			
		}
		kombinasyon = total1/(total2*total3);
		System.out.println("Kombinasyon sonucu: "+kombinasyon);
		

	}

}
