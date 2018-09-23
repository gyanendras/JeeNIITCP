public class SlidingNumber {

	public static void main(String[] args) {
		SlidingNumber sn = new SlidingNumber();
		System.out.println(sn.isSliding(1012));

	}

	boolean isSliding(int n){
		int i=n;
		int tmp1,tmp2;
		boolean isSliding;
		while(i>0) {
			 tmp1= i%10;
			 i=i/10;
			 tmp2= i%10;
			 if(i==0)break;
			 System.out.println(tmp1+" "+tmp2+" "+i);
			 if (Math.abs(tmp1-tmp2)!=1) {
				 isSliding= false;
				 return isSliding;
					 
		}
			 
		}
		return true;
		
	}
}
