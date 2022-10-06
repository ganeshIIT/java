class StudentTemplate {
	private int rollNum;
	private String name;

	public StudentTemplate(int a, String p){
		this.rollNum = a;
		this.name = p;
	}

	public int getRollNum(){
		return rollNum;
	}

	public String getName(){
		return name;
	}
}

class Student{
	public static void main(String[] args) {
		StudentTemplate s = new StudentTemplate(1, "Ganesh");
		int n = s.getRollNum();
		String name = s.getName();
		System.out.println(n);
		System.out.println(name);
	}
}