package lab01;

public class StaffManager {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Staff James = new Staff("James Wright", 29, "Accounting", 365, 15);
		Staff Peter = new Staff("Peter Coolidge", 32, "R&D", 1095, 7);
		Staff Amy = new Staff("Amy Smith", 27);

		System.out.println(James.toString());
		System.out.println(Peter.toString());
		System.out.println(Amy.toString());

		System.out.println("---");

		System.out.println("Same Career?");
		if (Peter.sameCareer(Amy))
			System.out.printf("%s and %s, Same.\n", Peter.getter(), Amy.getter());
		else
			System.out.printf("%s and %s, Not exactly same.\n", Peter.getter(), Amy.getter());

		Amy.setter("R&D", 1095);
		System.out.println("...A Few years later...");

		if (Peter.sameCareer(Amy))
			System.out.printf("%s and %s, Same.\n", Peter.getter(), Amy.getter());
		else
			System.out.printf("%s and %s, Not exactly same.\n", Peter.getter(), Amy.getter());

		System.out.println("---");

		James.vacation(10);
		Amy.vacation(20);
		Amy.vacation(1);
	}

}
