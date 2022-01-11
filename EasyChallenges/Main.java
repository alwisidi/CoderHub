import java.util.Arrays;

public class Main {
	public static void print(Object s) { System.out.println(s); }
	public static void main(String[] args) {
		EasyChallenges ch = new EasyChallenges();
		print(ch.sub(10, 5));
		print(ch.concatNames("nawaf", "alwisidi"));
		print(ch.divRemainder(9, 5));
		print(ch.lessOrMoreThanZero(5));
		print(ch.average(new int[] { 0, 44, 9, 3, 8 }));
		print(ch.isSame("nawaf", "nawaF"));
		print(ch.num_elements(new int[] { 0, 44, 9, 3, 8 }));
		print(Arrays.toString(ch.cumulativeAddition(new int[] { 0, 44, 9, 3, 8 })));
		print(ch.oddEven(3));
		print(ch.inputType("1.5"));
		print(ch.lastElm(new int[] { 0, 44, 9, 3, 8 }));
		print(Arrays.toString(ch.deleteElementInArray(new int[] { 0, 44, 9, 3, 8 }, 2)));
		print(ch.factorial(4));
		print(ch.wordRepeat("foo", 3));
		print(ch.match_array( new String[] { "word1", "wo", "word2" }, new String[] { "word2", "word1", "wo" } ));
		print(ch.numbers_range(3));
		print(ch.exponent_squared(3));
		print(ch.exponent_cube(2));
		print(ch.exponent_x(2, 4));
		print(ch.countDown(5));
		print(ch.countChar("nawaf", "a"));
		print(ch.reverseWords("nawaf", "alwisidi"));
		print(ch.decimalPlaces("32.53342"));
		print(ch.reverseCase("WeLcomE"));
		print(ch.sayHiBye("nawaf", 1));
		print(ch.sumTwoSmallestNums(new int[] { 9, 3, 32, 5, 4, 98 }));
		print(ch.areaOfRectangle(3, 4));
		print(ch.convertToSeconds(3));
		print(ch.squares(16));
		print(ch.cubes(8));
		print(ch.rootCheck(16, 4));
		print(ch.areaOfSquare(3));
		print(ch.areaOfParallelogram(2, 4));
		print(ch.perimeterOfPrallelogram(2, 4));
		print(ch.areaOfRhombus(5, 3));
		print(ch.sumEven(new int[] {1, 2, 3, 4}));
		print(ch.sumOdd(new int[] {1, 2, 3, 4}));
		print(ch.numberSum(3));
		print(Arrays.toString(ch.removeDuplicate(new int[] { 1, 3, 2, 3, 1, 3 })));
		print(Arrays.toString(ch.getDuplicateElements(new int[] { 1, 2, 3, 3 })));
		print(ch.isEvenOrOdd(3));
		print(ch.equalCheck(32, 23));
		print(ch.divisibleByFive(25));
		print(ch.isEmpty(" "));
		print(ch.and(true, false));
		print(ch.stringCheck(new String[] { "&&", "&&&", "&&", "&&" }));
		print(ch.convertPercent("20%"));
		print(ch.search("python", "n"));
		print(Arrays.toString(ch.cleanArray(new Integer[] { null, 7, 8, null, 9 })));
		print(ch.coneVolume(3, 5));
		print(ch.calculateCircumference(2));
		print(ch.findCircleArea(2));
		print(ch.circumferenceOfRhombus(3));
		print(ch.raduis(16));
		print(ch.hashtagIt(new String[] { "stay_home", "coronavirus" }));
		print(ch.nameCharLength("nawaf alwisidi"));
	}
}
