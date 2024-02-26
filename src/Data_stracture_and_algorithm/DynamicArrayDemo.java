package Data_stracture_and_algorithm;
import java.awt.List;
import java.util.*;
class DynamicArray<T>{ //variables and methods
	private static int initialCapacity=8;
	private T arr[];
	private int size;
	private int capacity;
	//Constructor
	@SuppressWarnings("unchecked")
	DynamicArray(){
		//value initialization
		size=0;
		arr=(T[])new Object[initialCapacity];
		capacity=initialCapacity;
	}
	public void add(T val) {
		if(size==capacity) 
		     expandArray();
		arr[size++]=val;
	}
	
	private void  expandArray() {
		capacity*=2;
		java.util.Arrays.copyOf(arr,capacity);
	}
	public void display() {
		System.out.println("Elements in the List :");
		for(int i=0;i<size;i++) 
			System.out.print(arr[i]+" ");
	}
	public void insretatpos(int pos,T val) {
		if (size==capacity)
			expandArray();
		for(int i=size-1;i>=size;i--)
			arr[i+1]=arr[i];
		arr[pos]=val;
		size++; 
	}
	public void deleteatpos(int pos) {
		for(int i=pos+1;i<=size;i++)
			arr[i+1]=arr[i];
		size--;
		
		if (capacity > initialCapacity && capacity>3*size)
			shrinkArray();
		
	}
	public void shrinkArray() {
		capacity/=2;
		arr=java.util.Arrays.copyOf(arr, capacity);
	}
	public int length() {
		return size;
	}
	public void deleteatend() {
		System.out.println( "ArrayCapacity :"+capacity );
		System.out.println( "Arraysize :"+size );
		 size= capacity-1;
		 size--;
		System.out.println("size"+size);
	}
	
}
public class DynamicArrayDemo {

	public static void main(String[] args) {
		
		int val,pos;
		DynamicArray <Integer>list = new DynamicArray<Integer>();
		 Scanner scn = new Scanner(System.in);
		while(true) {
			System.out.println("\n-----------LiST MENU-----------\n");
			System.out.println("1.Insert At End\n ");
			System.out.println("2.Display The List\n");
			System.out.println("3.Insert in Specified position\n");
			System.out.println("4.Delete in Specified position\n");
			System.out.println("5.Delete at the end\n");
			System.out.println("6.Exit\n");
			System.out.println("\n-------------------------------------\n");
			System.out.println("Enter your choice: \t");
			int choice = scn.nextInt();
			switch(choice) {
			case 1:System.out.println("Enter the Data: ");
			val = scn.nextInt();
			list.add(val);
			break;
			case 2:list.display();
			break;
			case 3:System.out.println("Enter the specific position (start from 0 :)");
			pos=scn.nextInt();
			if(pos<0) {
				System.out.println("invalid position:");
				break;
			}
			System.out.println("Enter your Data :");
			val = scn.nextInt();
			list.insretatpos(pos,val);
			break;
			case 4:System.out.println("Enter the specific position (start from 0 :)");
			pos=scn.nextInt();
			if(pos<0) {
				System.out.println("invalid position:");
				break;
			}
			list.deleteatpos(pos);
			break;
			case 5:list.deleteatend();
			break;
			case 6:System.exit(0);
			default:System.out.println("invalid choice ");
			}
			
		}
	}

}
