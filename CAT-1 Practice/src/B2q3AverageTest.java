public class B2q3AverageTest extends B2q3ArithematicAverage{
public static void main(String args[]) {
	int n=arravg.length;
	int sum=0;
	for(int i=0;i<n;i++) {
		sum+=arravg[i];
	}
	double avg=sum/n;
	System.out.println("Average is :"+avg);
}
}