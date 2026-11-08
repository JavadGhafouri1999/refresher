package streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class StreamPart2 {

  static void main() {

	List<String> names = new ArrayList<>(List
			.of("Joe", "Ada", "Chris", "Leon", "Jack", "Chris", "Leon", "Jack"));
	System.out.println(" ");
	System.out.println("------Default Sort------");
	List<String> defaultSort = names.stream().sorted().toList();
	System.out.println(defaultSort);
	System.out.println("------Sort by length------");
	List<String> byLength = names.stream().sorted(Comparator.comparing(String::length)).toList();
	System.out.println(byLength);
	System.out.println("------distinct------");
	names.stream().distinct().toList().forEach(System.out::println);
	System.out.println("------Limited by 2------");
	names.stream().limit(2).toList().forEach(System.out::println);
  }
}
