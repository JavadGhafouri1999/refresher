package lambdasone;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.function.Supplier;

public class Lesson6Part2 {

  static void main(String[] args) {

	List<String> names = new ArrayList<>(List.of("John", "Mack", "Leila", "Julie"));
	for (String name : names) {
	  System.out.println(name);
	}
	System.out.println("------------");
	names.forEach(name->System.out.println(name));
	System.out.println("------------");
	names.forEach(System.out::println);
	System.out.println("------Function------");

	Function<String, Integer> length = String::length;
	String name = names.get(2);
	System.out.printf("Name %s has %d characters%n", name, length.apply(name));

	System.out.println("------Supplier------");
	Supplier<ArrayList<String>> maker = ArrayList::new;
	System.out.println(maker.get());

	System.out.println("------Comparator------");
	System.out.println("------Sort By Length------");
	names.sort(Comparator.comparing(String::length));
	System.out.println(names);

	System.out.println("------Natural Order------");

	names.sort(Comparator.naturalOrder());
	System.out.println(names);
  }
}

