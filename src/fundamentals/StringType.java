package fundamentals;

public class StringType {

	public static void main(String[] args) {

		var h = "Hello World";
		System.out.println(h.charAt(2));

		String s = "Good afternoon";
		System.out.println(s.concat("!!!"));
		System.out.println(s + "!!!");
		System.out.println(s.toLowerCase().startsWith("good"));
		System.out.println(s.toUpperCase().endsWith("MORNING"));
		System.out.println(s.length());
		System.out.println(s.toLowerCase().equals("Good afternoon"));
		System.out.println(s.equalsIgnoreCase("good afternoon"));

		var name = "John";
		var lastName = "Doe";
		var age = 32;
		var salary = 12345.987;

		String firstPhrase = "Name: " + name + "Last Name: " + lastName
				+ "\nAge: " + age + "\nSalary: " + salary + "\n\n";
		System.out.println(firstPhrase);

		System.out.printf("Mr. %s %s have %d years old and earns $%.2f.", name, lastName, age, salary);

		String secondPhrase = String.format("\nMr. %s %s have %d years old and earns $%.2f.", name, lastName, age, salary);
		System.out.println(secondPhrase);

		String randomPhrase = "Random phrase";
		System.out.println(randomPhrase.toLowerCase().contains("phrase"));
		System.out.println(randomPhrase.indexOf("p"));
		System.out.println(randomPhrase.substring(4));
		System.out.println(randomPhrase.substring(1, 3));
		System.out.println(randomPhrase.replace("phrase", "word"));
	}
}
