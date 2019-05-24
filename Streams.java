import java.util.ArrayList;
import java.util.Comparator;
import java.util.stream.Collectors;

public class Streams {
	public static void main(String[] args) {

		ArrayList<Integer> newList = new ArrayList<Integer>();
		for (int i = 0; i < 50; i++) {
			newList.add(i);
		}
		System.out.println(SearchStream(4, newList));

		ArrayList<String> newWordList = new ArrayList<String>();
		for (int i = 0; i < 50; i++) {
			newWordList.add(Integer.toString(i));
		}
		System.out.println(SearchWordStream("4", newWordList));

		System.out.println(ModifyContent(newList));

		System.out.println(CountOccurences(newWordList, "2"));

		System.out.println(SumValues(newList));

		System.out.println(GetBiggest(newList));

		System.out.println(FilterEven(newList));

		System.out.println(SortAsc(newList));

	}

	public static boolean SearchStream(int findMe, ArrayList<Integer> newList) {
		return newList.contains(findMe);
	}

	public static boolean SearchWordStream(String findMe, ArrayList<String> newList) {
		return newList.contains(findMe);
	}

	public static ArrayList<Integer> ModifyContent(ArrayList<Integer> newList) {
		return (ArrayList<Integer>) newList.stream().filter(i -> i % 5 == 0).map(i -> i * 10)
				.collect(Collectors.toList());
	}

	public static int CountOccurences(ArrayList<String> newList, String findMe) {
		return (int) newList.stream().filter(i -> i.contains(findMe)).count();
	}

	public static int SumValues(ArrayList<Integer> newList) {
		return newList.stream().reduce(0, Integer::sum);
	}

	public static int GetBiggest(ArrayList<Integer> newList) {
		return newList.stream().reduce(0, Integer::max);
	}

	public static ArrayList<Integer> FilterEven(ArrayList<Integer> newList) {
		return (ArrayList<Integer>) newList.stream().filter(i -> i % 2 == 0).collect(Collectors.toList());
	}

	public static ArrayList<Integer> SortAsc(ArrayList<Integer> newList) {
		return (ArrayList<Integer>) newList.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
	}
}
