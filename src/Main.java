import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

@FunctionalInterface
interface stringOp {
	String apply(String s);
}

class Lesson6 {
  static void main(String[] args) {
	concept1Lambda();
	concept2FunctionalInterfaces();
	concept3MethodReference();
	System.out.println("-----------------");
	concept4Comparator();
  }

  static void concept1Lambda(){
	stringOp upperCased = s->s.toUpperCase();
	System.out.println(upperCased.apply("Hello how are you doing?"));
  }

  static void concept2FunctionalInterfaces() {
	Function<String, Integer> len = s->s.length();
	Predicate<String> empty = s ->  s.isEmpty();
	Supplier<String> hello= ()->"Hello";
	Consumer<String> print = s-> System.out.println(s);

	System.out.println(len.apply("Hello there"));
	System.out.println(empty.test(""));
	System.out.println(hello.get());
	print.accept("Printing something");
  }

  static void concept3MethodReference() {
	Function<String, Integer> len = String::length;
	Predicate<String> empty = String::isEmpty;
	Function<String, Integer> parse = Integer::parseInt;
	System.out.println(len.apply("Hello there"));
	System.out.println(empty.test("Hi"));
	System.out.println(parse.apply("2") + 1);
  }

  static void concept4Comparator() {
	List<String> names = new ArrayList<>(List
			.of("Joe Biden", "Alen Wake", "Carl Johnson", "Clark Kent", "Bruce Wayne"));

	System.out.printf("No order :%5s%s%n", "", names);

	names.sort(Comparator.comparing(String::length).thenComparing(Comparator.naturalOrder()));

	System.out.printf("Ordered (Length) :%5s%s%n", "", names);
  }
}