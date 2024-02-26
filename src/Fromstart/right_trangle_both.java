package Fromstart;

public class right_trangle_both {

	public static void main(String[] args) {
		System.out.println("right decresing star pattern");
		int o=5;
		for(int i=1;i<=o;i++) {
			for(int j=o;j>i;j--) {
				System.out.print(" ");
			}
			for(int k =1;k<=i;k++) {
				System.out.print("7 ");
			}
			System.out.println();
		}
	}

}
