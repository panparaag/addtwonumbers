package addtwonumers;
import java.util.Scanner;
import java.util.LinkedList;
import java.util.ListIterator;
import java.lang.Math;
public class solution {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	int firstNum = sc.nextInt();
	int secondNum = sc.nextInt();
	
	int sum;
	LinkedList<Integer> l1= new LinkedList<Integer>();
	LinkedList<Integer> l2= new LinkedList<Integer>();
	LinkedList<Integer> l3= new LinkedList<Integer>();
	if(firstNum==0||secondNum==0) {
		System.out.println("Sorry boss");
	}
	else {
	while(firstNum!=0)
	{
		int x = firstNum%10;
		firstNum=firstNum/10;
		l1.add(x);
		
	}
	
	while(secondNum!=0)
	{
		int x = secondNum%10;
		secondNum = secondNum/10;
		l2.add(x);
	}
	}
    ListIterator<Integer> iter =  l1.listIterator(); 
    ListIterator<Integer> itr =  l2.listIterator();  
	int x=0;
	int a=10;
	int b=0;
	int y=0;
	System.out.println(l1+" "+l2);
	while(iter.hasNext()) {
		 x = x+iter.next()*(int)Math.pow(a, b);
		b++;
	}
	 b=0;
	while(itr.hasNext()) {
		y = y+itr.next()*(int)Math.pow(a, b);
		b++;
	}
	sum = x + y;
	System.out.println(sum);
	while(sum!=0)
	{
		int z = sum%10;
		sum=sum/10;
		l3.add(z);
	}
	System.out.println(l3);
}
	 
}
