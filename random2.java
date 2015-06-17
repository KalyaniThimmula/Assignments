import java.util.Scanner;
class random_number
{
	public static void main(String[] args) 
	{
		int n,g,r;
		System.out.println("Enter N value::");
		Scanner scan=new Scanner(System.in);
		n=scan.nextInt();
		System.out.println("Guess anumber::");
		g=scan.nextInt();
		System.out.println("computer guesses::");
		do
		{
		r=(int)(n*Math.random());
		if(g<r)//comparing guessed number with random number
		{	
			System.out.println(r+"--too high");
		}
		else if(g>r)
		{
			System.out.println(r+"--too low");
		}
		else
		{
			System.out.println(r+"--found");
		}
		}while(g!=r);
	}
}
