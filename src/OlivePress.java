// testing encapsulation with random classes
public class OlivePress{
	private String name;
	private String surname;
	private int age;
	
	public String getName(){
		return name;
	}
	
	public String getSurname(){
		return surname;
	}

	public int getAge(){
		return age;
	}

	public void setName(String newName){
		name = newName;
	}

	public void setSurname(String newSurname){
		surname = newSurname;
	}

	public void setAge(int newAge){
		age = newAge;
	}
}