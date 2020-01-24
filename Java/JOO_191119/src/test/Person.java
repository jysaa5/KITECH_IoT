package test;

public class Person implements Comparable<Person> {

	
	String name;
	int age;
	
	public Person (String name, int age) {
		
		this.name = name; 
		this.age = age;
		
	}
	
	public void showData() {
		System.out.println("이름: "+name+ ", 나이:"+age);
	}
	
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}

	@Override
	public int compareTo(Person o) {
	/*	if (age > o.age) {
			return 1;
		}else if(age<o.age) {
			return -1;
		}else {
			return 0;
		}*/
		
		//return age-o.age;  //오름차순
		return (age-o.age)*(-1); //내림차순
	}

}
