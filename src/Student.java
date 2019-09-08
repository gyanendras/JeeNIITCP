
public class Student {
	int rollnum;
	Address addr;
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + rollnum;
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (rollnum != other.rollnum)
			return false;
		return true;
	}


	String name;
	

	public int getRollnum() {
		return rollnum;
	}


	public void setRollnum(int rollnum) {
		this.rollnum = rollnum;
	}


	public Address getAddr() {
		return addr;
	}


	public void setAddr(Address addr) {
		this.addr = addr;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}
  
	static void fun(Integer K, int Y ){
		
	}

	public static void main(String[] args) {
		Student st1 = new Student();//2
		Student st2 = new Student();//3
		int y=3;
		Integer x= Integer.valueOf(4);
		
		int j =y+x;
		
		Integer k =j;
		
		
		st2=st1;
		
		st1.setRollnum(10);
		st2.setRollnum(20);
		st1.equals(st1);
		fun(3,x);

	}

}
