package toolbox.tp1;

import java.math.BigDecimal;
import java.util.List;

public class Staff {

	private String name;
	private int age;
	private String position;
	private BigDecimal salary;
	private List<String> skills;

	public void setName(String string) {
		name = string;

	}

	public void setAge(int i) {
		age = i;

	}

	public void setPosition(String string) {
		position = string;

	}

	public void setSalary(BigDecimal bigDecimal) {
		salary = bigDecimal;

	}

	public void setSkills(List<String> skills2) {
		skills = skills2;

	}
	
	public int getAge() {
		return age;
	}
	public String getName() {
		return name;
	}
	public String getPosition() {
		return position;
	}
	public BigDecimal getSalary() {
		return salary;
	}
	public List<String> getSkills() {
		return skills;
	}

}
// getters and setters