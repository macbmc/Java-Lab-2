import java.util.Scanner;
public class Queue {

	 Scanner sc = new Scanner(System.in);
	int  n, front = -1, rear = -1, item;
	 int[] Ar = new int[10];
	
	Queue() {
		
	}
	
	Queue(int n){
		int choice;
		do
		  {
			System.out.printf("\n1.Enqueue\n2.Dequeue\n3.Exit\n");
			System.out.printf("Enter the choice: ");
			choice=sc.nextInt();
		    switch (choice)
		    {
		    case 1:
		      enqueue(n);
		      break;
		    case 2:
		      dequeue();
		      break;
		    default:
		      break;
		    }
		  } while (choice != 3);
	}
		
	public static void main(String[] args) {
		Scanner sc1 = new Scanner(System.in);
		int n;
		
		System.out.printf("Enter the size of Queue:");
		n=sc1.nextInt();
		
		new Queue(n);
		  
	}
	
	public  void enqueue(int n)
	{
	  if (rear >= n - 1)
	  {
	    System.out.println("Overflow");
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
	
	//Function To Delete Element In Queue
	public  void dequeue ()
	{
	  if (front == -1)
	  {
		  System.out.println("Underflow\n");
	  }
	  else
	  {
	    item = Ar[front];
	    System.out.printf("The deleted element in the queue: %d\n", item);
	    if (front == rear)
	    {
	      front = -1;
	      rear = -1;
	      System.out.printf("Queue is empty\n");
	    }
	    else
	    {
	      front++;
	      display(rear);
	    }
	  }
	}
	
	public void display(int rear)
	{
	  int i;
	  System.out.printf("\nThe elements in the queue are: \n");
	  for (i = front; i <= rear; i++)
	  {
		  System.out.printf("%d ", Ar[i]);
	  }
	  System.out.printf("\n");
	}
	
	
}
