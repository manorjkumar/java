package Fromstart;

public class Left_dec_ince_trisngle {

	public static void main(String[] args) {
		 System.out.println("left incresing star pattern");
		int n=5;
	for(int i=1;i<=n;i++) {
		for(int j=1;j<=i;j++) {
			System.out.print("* ");
		}
		System.out.println();
	}
	System.out.println("left decresing star pattern");
	int m=5;
	for(int i=1;i<=m;i++) {
		for(int j=n;j>=i;j--) {
			System.out.print("* ");
		}
		System.out.println();
	}
	
	}
	
}
