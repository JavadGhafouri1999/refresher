package streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StreamPart1 {
  static void main() {
	List<String> names = new ArrayList<>(
			List.of("Ali", "Ben", "Carl", "Johnson", "Teddy", "Chris", "Ada", "Lee")
	);

	System.out.println("Stream size : "+ names.stream().count());
	System.out.println(names.stream().toList());

	List<String> longName = names.stream().filter(n->n.length()>3).toList();

	System.out.println(longName);

	List<String> uppercasedNames = names.stream().map(String::toUpperCase).toList();
	System.out.println(uppercasedNames);

//	List<char[]> toCharArrayNames = names.stream().map(String::toCharArray).toList();
//	for (char[] toCharArrayName : toCharArrayNames) {
//	  System.out.println(Arrays.toString(toCharArrayName));
//	}

	names.stream()
			.map(String::toCharArray)
			.map(Arrays::toString)
			.forEach(System.out::println);
  }
}
