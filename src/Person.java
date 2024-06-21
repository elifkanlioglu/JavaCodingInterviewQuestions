import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Person {
	private String name;
	private int age;

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	@Override
	public String toString() {
		return name + " (" + age + ")";
	}

	public static void main(String[] args) {
		List<Person> people = new ArrayList<>();
		people.add(new Person("Alice", 30));
		people.add(new Person("Bob", 25));
		people.add(new Person("Charlie", 35));

		// Sort the list of people by name using Comparator.comparing and a method reference
		people.sort(Comparator.comparing(Person::getName));

		// Print the sorted list
		for (Person person : people) {
			System.out.println(person);
		}

		// Sort the list of people by age using a lambda expression
		//people.sort((p1, p2) -> Integer.compare(p1.getAge(), p2.getAge()));

		// Sort the list of people by age using Comparator.comparing and a method reference
		people.sort(Comparator.comparing(Person::getAge));
		// Print the sorted list
		System.out.println("Sorted by age:");
		for (Person person : people) {
			System.out.println(person);
		}
	}
}
