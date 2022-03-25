package lab01;

public class Staff {
	private String name;
	private int age;
	private String department;
	private int workDays;
	private int vacationDays;

	public Staff(String name, int age) {
		this.name = name;
		this.age = age;
		department = "None";
		workDays = 0;
		vacationDays = 20;
	}

	public Staff(String name, int age, String department, int workDays, int vacationDays) {
		this.name = name;
		this.age = age;
		this.department = department;
		this.workDays = workDays;
		this.vacationDays = vacationDays;
	}

	public String getter() {
		return this.name;
	}

	public void setter(String department, int workDays) {
		this.department = department;
		this.workDays = workDays;
	}

	public boolean sameCareer(Staff s) {
		if (this.department.equals(s.department) && this.workDays == s.workDays)
			return true;
		return false;
	}

	public String toString() {
		return "Name: " + name + ", " + "Age:" + age + ", " + "Department: " + department + ", " + "workDays: "
				+ workDays + ", " + "vacationDays: " + vacationDays;
	}

	public void vacation(int days) {
		if (vacationDays < days)
			System.out.printf("%s, 남은 휴가 일 수 부족.\n", name);
		else {
			vacationDays -= days;
			System.out.printf("%s, 휴가 %d 사용. 남은 휴가 일 수: %d\n", name, days, vacationDays);
		}
	}
}
