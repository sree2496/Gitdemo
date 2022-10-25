package sel2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.testng.Assert;

public class StreamsExample {

	public static void main(String[] args) {

		/*
		 * int[] a = { 9, 8, 7, 1, 4, 5, 9, 6, 5 }; for (int i = 0; i < a.length; i++) {
		 * System.out.print(a[i] + " ");
		 * 
		 * } System.out.println();
		 * 
		 * Arrays.sort(a); for (int i = 0; i < a.length; i++) {
		 * 
		 * System.out.print(a[i] + " ");
		 * 
		 * }
		 */
		// String[] ac = { "sree", "abilash", "zebra" };

		/*
		 * String[] bc = { "vathsan", "sdfsdf", "fdsgdfg" }; List<String> l =
		 * Arrays.asList(bc); boolean f = l.stream().anyMatch(s ->
		 * s.equalsIgnoreCase("vathsan")); Assert.assertTrue(f, "illa daaa"); //
		 * List<String> m = Arrays.asList(bc); // Stream<String> z = l.stream(); //
		 * Stream.of(9, 8, 7, 1, 4, 5, 9, 6, 5).sorted().forEach(s -> //
		 * System.out.println(s)); // Stream<String> q = Stream.concat(m.stream(),
		 * m.stream()); // q.sorted().forEach(s -> System.out.println(s)); /* String[]
		 * ac = { "sree", "abilash", "zebra" }; List<String> l = Arrays.asList(ac); //
		 * creating object of ArrayList class /* ArrayList<String> list = new
		 * ArrayList<String>(); // adding elements to the ArrayList
		 * list.add("Volkswagen"); list.add("Toyota"); list.add("Porsche");
		 * list.add("Ferrari"); list.add("Mercedes-Benz"); list.add("Audi");
		 * list.add("Rolls-Royce"); list.add("BMW");
		 * 
		 * // printing the unsorted ArrayList System.out.println("Before Sorting: " +
		 * l); // Sorting ArrayList in ascending Order Collections.sort(l); // printing
		 * the sorted ArrayList System.out.println("After Sorting : " + l); // again
		 * reverse Collections.sort(l, Collections.reverseOrder());
		 * System.out.println("After Sorting in reverse: " + l);
		 * 
		 * Stream.of("ANNAMALAI", "AMERICA", "AUSTRALIA", "VADI").filter(s ->
		 * s.startsWith("A")).sorted() .map(s -> s.toLowerCase()).forEach(s ->
		 * System.out.println(s));
		 * 
		 * 
		 * List<String> t = Arrays.asList(a); long q = t.stream().filter(s ->
		 * s.startsWith("Sr")).count(); System.out.println(q); // t.stream().filter(s ->
		 * s.length() > 4).forEach(s -> System.out.println(s)); t.stream().filter(s ->
		 * s.length() > 5).limit(1).forEach(s -> System.out.println(s));
		 * 
		 * //COUNT OF NAMES START WITH "A" /* long f = Stream.of("AA1", "AA2",
		 * "AA3").filter(s -> s.startsWith("A")).count(); System.out.println(f);
		 */

		/*
		 *
		 */
		//Stream.of("Sree", "Sudd", "Ravi", "Sambu").filter(s -> s.startsWith("S")).limit(3).map(s -> s.toUpperCase())	.forEach(s -> System.out.println(s));
		// List<String> oo = Stream.of("Sree", "Sudd", "Ravi", "Sambu").filter(s ->
		// s.startsWith("S")) .map(s -> s.toUpperCase()).collect(Collectors.toList());
		// System.out.println(oo.get(0));

		List<Integer> b = Arrays.asList(9, 9, 8, 8, 7, 7, 6, 6, 5, 4, 4, 3, 3, 2, 2, 1, 1);
		// b.stream().distinct().forEach(s -> System.out.print(s + " "));
		//b.stream().distinct().sorted().forEach(s -> System.out.print(s + " "));
	//	System.out.println();
		List<Integer> c = b.stream().distinct().sorted().collect(Collectors.toList());
		System.out.println(c);

	}
}