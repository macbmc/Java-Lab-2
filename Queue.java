import java.util.Scanner;

public class Queue {

    static Scanner sc = new Scanner(System.in);
      static int  n, front = -1, rear = -1, item;
      static int[] Ar = new int[10];
      static int p = 1;
	
	Queue() {
		
	}
	
	Queue(int n){
		int ch;
		do
		  {
			System.out.println("1.Enqueue(to insert elements)");
			System.out.println("2.Dequeue(to remove elements)");
			System.out.println("3. Display(to view existing entered elements)");
			System.out.println("4.Exit");
			
			System.out.println("Enter your choice:");
			ch=sc.nextInt();
		    switch (ch)
		    {
		    case 1:
		      enqueue(n);
		      break;
		    case 2:
		      dequeue();
		      break;
		    case 3:
		      display(rear);
		      break;
		      
		    default:
		      break;
		    }
		  } while (ch < 4);
	}
		
	public static void main(String[] args) {
		Scanner sc1 = new Scanner(System.in);
		int n;
		
		
		System.out.println("Enter the size of Queue:");
		n=sc1.nextInt();
		
		new Queue(n);
		  
	}
	
	
	public static void enqueue(int n)
	{
	  if (rear >= n - 1)
	  {
	    System.out.println("Queue is overflow");
	  }
	  else
	  {
	    if (front == -1 && rear == -1)
	    {
	      front++;
	    }
	    System.out.println("Enter the element to be inserted:");
	    item= sc.nextInt();
	    rear++;
	    Ar[rear] = item;
	  }
	  display(rear);
	}
	

	public static void dequeue ()
	{
	  if (front == -1)
	  {
		  System.out.println("Queue Underflow");
	  }
	  else
	  {
	    item = Ar[front];
	    System.out.printf("\nThe element deleted is %d\n", item);
	    if (front == rear){
	  
	      front = -1;
	      rear = -1;
	      System.out.println("Error! Queue is empty");
	    }
	    else
	    {
	      front++;
	      display(rear);
	    }
	  }
}
	
	
	
	public static void display(int rear)
	{
	  int i;
	  System.out.printf("\nThe current Queue is\n");
	  for (i = front; i <= rear; i++)
	  {
		  System.out.printf("\n%d ", Ar[i]);
	  }
	  System.out.printf("\n");
	}
	
	
}