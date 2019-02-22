import java.util.ArrayList;
import java.util.Collection;

public class ClassRoom {
	static Student std0 = new Student();
	static Student std1 = new Student();
	static Student [] stdList = new Student[219];
	static Student [] stdList1= {std0,std1,std1};
	static Object[] objArr = new Object[10];
	Collection c;
	

	//int[] ab = new int[10];
	//String [] fg = new String[30];
	public static void main(String[] args) {
		ClassRoom  btec = new ClassRoom();
		
		std1.setName("Sumit");
		btec.stdList[0] = new Student();
		objArr[0]=std0;
		objArr[1]="hello";
		
		int j= btec.stdList.length;
		System.out.println(j+" "+stdList1.length);
		
		for(Student s:stdList) {
			System.out.println(s);
		}
		
		for (int i=0; i<stdList.length;i++) {
			System.out.println(stdList[i]);
		}
		
		ArrayList ls = new ArrayList();
		ls.add(std0);
		ls.add(std1);
		ls.add("hi");
		ls.add(Integer.valueOf(10));
		
		
		Collection c =new ArrayList();
		c.add(std0);
		c.add(std1);
		c.addAll(ls);
		
		for(Object st:ls) {
			System.out.println(st.toString());
		}
		
		//iterator
		

	}

}
