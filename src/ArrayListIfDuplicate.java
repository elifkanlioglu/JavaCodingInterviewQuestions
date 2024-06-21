import java.util.*;
import java.util.stream.Collectors;

public class ArrayListIfDuplicate {
	public static void main(String[] args) {
		List<Integer> list1 = new ArrayList<>(); // accepts duplicates, keeps insertion order, has index
		list1.addAll(Arrays.asList(10, 200, 300, 40, 90, 90, 10, 10));

		// Create a Set from the list to remove duplicates
		Set<Integer> distinctSet = new HashSet<>(list1);

		// Convert the Set back to a List
		List<Integer> distinctList = new ArrayList<>(distinctSet);

		// Check if the original list size is different from the size of the distinct list
		if (list1.size() != distinctList.size()) {
			System.out.println("Distinct list: " + distinctList);
		}



		List<Integer> list2 = new ArrayList<>(); // accepts duplicates, keeps insertion order, has index
		list2.addAll(Arrays.asList(10, 200, 300, 40, 90, 90, 10, 10));

		long distinctCount = list2.stream().distinct().count();

		if (list2.size() != distinctCount) {
			List<Integer> distinctList2 = list2.stream().distinct().collect(Collectors.toList());
			System.out.println("Distinct list: " + distinctList2);
		}
	}
	}



}
