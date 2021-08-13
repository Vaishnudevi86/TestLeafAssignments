package assignments;

public class ArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n = 153, calc =0, remainder, originalNumber;
originalNumber = n;

while (originalNumber != 0)
{
    remainder = originalNumber % 10;
    calc += Math.pow(remainder, 3);
    originalNumber /= 10;
}

if(calc == n)
    System.out.println(n + " is an Armstrong number.");
else
    System.out.println(n + " is not an Armstrong number.");
}
}