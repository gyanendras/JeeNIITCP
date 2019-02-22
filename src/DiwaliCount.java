import java.util.Scanner;
public class DiwaliCount {
	public static void main(String[] args) {
		int[] cal = new int[] { 1, 1, 1, 0, 0, 1, 1, 1, 1, 1,
				0, 0, 0, 0, 
				1, 1, 1, 0, 0, 1, 1, 1, 1, 1, 0, 0 };
		Scanner sc = new Scanner(System.in);
		int numHol = sc.nextInt();
        int postC =postCount(numHol,cal);
        int preC=preCount(numHol,cal) ;
		int maxHol =  postC> preC
				? postC : preC;
	System.out.println(maxHol);
	}

	private static int preCount(int numHol,int[] cal) {
		int count=0;
		int i=9;
		while(numHol>0) {
			if(cal[i]!=0) {numHol--;}
			count++;
			i--;
			
		}
		while(cal[i]==0) {
			count++;
			i--;
		}
		return count+4;
	}

	private static int postCount(int numHol,int[] cal) {
		int count=0;
		int i=14;
		while(numHol>0) {
			if(cal[i]!=0) {numHol--;}
			count++;
			i++;
			
		}
		
		while(cal[i]==0) {
			count++;
			i++;
		}
		return count+4;
		
	}

}
