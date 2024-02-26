package Fromstart;

/* 
 * linked  list
 * 
 * insert at beginning 
 * display
 * insert at ant position
 * delete at position
 * */


public class LinkedList {
	node head; //variable deceleration
		
		class node{//Constructor inilitiation
			
			int data;
			node next;
			node(int val){
				data= val;
				next=null;
			}
		}
//Constructed
		LinkedList(){
			head=null;
		}
		
		public void insertAtBeginning(int val) {
			
			node NewNode = new node(val);
			//when list ids empty
			if(head==null)
				head=NewNode;
			else {//list is not empty
				NewNode.next=head;
				head = NewNode;
				
			}
				
		}
		public void display() {
			node temp = head;
			while(temp!=null) {
				System.out.print(temp.data +" ");
			temp = temp.next;//jump
			
			}
		}
		public void indertatpos(int val,int pos) {
			
		}
		
}