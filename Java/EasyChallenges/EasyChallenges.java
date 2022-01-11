public class EasyChallenges {
	long sub(int a, int b) { return a - b; }
	
	String concatNames(String name1, String name2) { return name1 + " " + name2; }
	
	long divRemainder(int a, int b) { return a % b; }
	
	String lessOrMoreThanZero(int number) {
		return number > 0 ? "Greater than zero" : number < 0 ? "Less than zero" : "Equal to zero";
	}
	
	double average(int[] array) {
		int total = 0;
		for (int i : array)
			total += i;
		return (double) total / array.length;
	}
	
	String isSame(String name1, String name2) {
		return name1.equals(name2) ? "متشابهتين" : "غير متشابهتين";
	}
	
	int num_elements(int[] array) { return array.length; }
	
	int[] cumulativeAddition(int[] array) {
		int[] result = new int[2];
		for (int i : array) result[0] += i;
		result[1] = array.length;
		return result;
	}
	
	String oddEven(int number) { return number % 2 == 0 ? "زوجي" : "فردي"; }
	
	String inputType(String value) {
		try {
			Integer.parseInt(value);
			return "integer";
		} catch (NumberFormatException e) {
			try {
				Double.parseDouble(value);
				return "double";
			} catch (NumberFormatException err) { return "string"; }
		}
	}
	
	int lastElm(int[] arr) { return arr[arr.length - 1]; }
	
	int[] deleteElementInArray(int[] arr, int index) {
		int[] result = new int[arr.length - 1];
		for (int i = 0, j = 0; i < arr.length; i++) {
			if (i == index) continue;
			result[j++] = arr[i];
		}
		return result;
	}
	
	int factorial(int number) {
		if (number == 0) return 1;
		return number * factorial(number - 1);
	}
	
	String wordRepeat(String word, int n) {
		if (n == 0) return "";
		return word + " " + wordRepeat(word, (n - 1));
	}
	
	boolean match_array(String[] array1, String[] array2) {
		if (array1.length != array2.length) return false;
		boolean isMatch = false;
		for (String a : array1) {
			isMatch = false;
			for (String b : array2) if (a.equals(b)) isMatch = true;
			if (!isMatch) break;
		}
		return isMatch;
	}
	
	String numbers_range(int number) {
		if (number == 0) return Integer.toString(number);
		return numbers_range(--number) + " " + Integer.toString(++number);
	}
	
	int exponent_squared(int number) { return (int) Math.pow(number, 2); }
	
	int exponent_cube(int number) { return (int) Math.pow(number, 3); }
	
	int exponent_x(int number, int exponent) { return (int) Math.pow(number, exponent); }
	
	String countDown(int number) {
		if (number == 0) return Integer.toString(number);
		return Integer.toString(number) + " " + countDown(--number);
	}

	int countChar(String sentence, String ch) {
		int count = 0;
		for (int i = 0; i < sentence.length(); i++)
			if (sentence.charAt(i) == ch.charAt(0))
				count++;
		return count;
	}

	String reverseWords(String str1, String str2) { return str2 + ", " + str1; }
	
	int decimalPlaces(String num) {
		if(num.indexOf(".") == -1) return 0;
		return (num.length() - 1) - num.indexOf(".");
	}
	
	String reverseCase(String str) {
		char[] chars = str.toCharArray();
		for (char c : chars)
			chars[str.indexOf(c)] = Character.isUpperCase(c) ? Character.toLowerCase(c) : Character.toUpperCase(c);
		return new String(chars);
	}
	
	String sayHiBye(String name, int num) {
		return num == 0 ? "Bye " + name : num == 1 ? "Hi " + name : null;
	}

	int sumTwoSmallestNums(int[] arr) {
		int first = Integer.MAX_VALUE, second = Integer.MAX_VALUE;
		for (int i = 0; i < arr.length; i++) {
			int current = arr[i];
			second = first > current ? first : second > current ? current : second;
			first = first > current ? current : first;
		}
		return first + second;
	}

	int areaOfRectangle(int width, int height) { return width * height; }

	int convertToSeconds(int hours) { return hours * 3600; }

	double squares(double num) { return Math.sqrt(num); }

	double cubes(int num) { return Math.cbrt(num); }
	
	int rootCheck(double sqr, int num) { return Math.sqrt(sqr) == num ? num : 0; }
	
	int areaOfSquare(int length) { return length * length; }
	
	double areaOfParallelogram(double height, double base) { return height * base; }
	
	double perimeterOfPrallelogram(double base, double length) { return 2 * (base + length); }
	
	double areaOfRhombus(double height, double length) { return height * length / 2; }
	
	int sumEven(int[] arr) {
		int sum = 0;
		for (int i : arr) if (i % 2 == 0) sum += i;
		return sum;
	}
	
	int sumOdd(int[] arr) {
		int sum = 0;
		for (int i : arr) if (i % 2 != 0) sum += i;
		return sum;
	}
	
	int numberSum(int num) {
		if (num == 0) return 0;
		return num + numberSum(--num);
	}
	
	int[] removeDuplicate(int[] arr) {
		int tmp[] = new int[arr.length], idx = 0;
		for (int i = 0; i < arr.length; i++)
			for (int j = 0; j < arr.length; j++)
				if (arr[i] == tmp[j]) break;
				else if (j == arr.length - 1) tmp[idx++] = arr[i];
		int[] result = new int[idx];
		for (int i = 0; i < result.length; i++) result[i] = tmp[i];
		return result;
	}
	
	int[] getDuplicateElements(int[] arr) {
		int tmp[] = new int[arr.length], idx = 0;
		// ========= SOLUTION 1 ========= //
		for (int i = 0; i < arr.length; i++)
			for (int j = i + 1; j < arr.length; j++)
				if (arr[i] == arr[j]) {
					for (int k = 0; k <= idx; k++)
						if (arr[i] == tmp[k]) break;
						else if (k == idx) { tmp[idx++] = arr[i]; break; }
					break;
				}
		// ============================== //
		// ========= SOLUTION 2 ========= //
		// for (int i = 0; i < arr.length; i++)
		// 	for (int j = 0; j < arr.length; j++)
		// 		if (arr[i] == tmp[j]) break;
		// 		else if (arr[i] == arr[j] && i != j) { tmp[idx++] = arr[i]; break; }
		// ============================== //
		int[] result = new int[idx];
		for (int i = 0; i < result.length; i++) result[i] = tmp[i];
		return result;
	}
	
	String isEvenOrOdd(int num) { return num % 2 == 0 ? "even" : "odd"; }
	
	boolean equalCheck(int num1, int num2) { return num1 == num2; }
	
	boolean divisibleByFive(int num) { return num % 5 == 0; }
	
	boolean isEmpty(String str) { return str.length() == 0; }
	
	boolean and(boolean a, boolean b) { return a && b; }
	
	boolean stringCheck(String[] value) {
		for (int i = 1; i < value.length; i++) if (!value[i - 1].equals(value[i])) return false;
		return true;
	}
	
	double convertPercent(String percentage) {
		return Integer.parseInt(percentage.substring(0, percentage.length() - 1)) / 100.0;
	}

	int search(String str, String character) {
		for (int i = 0; i < str.length(); i++) if (character.charAt(0) == str.charAt(i)) return i;
		return -1;
	}
	
	int[] cleanArray(Integer[] arr) {
		int count = 0;
		for (Integer i : arr) if (i == null) count++;
		int[] result = new int[arr.length - count];
		count = 0;
		for (Integer i : arr) if (i != null) result[count++] = i;
		return result;
	}
	
	double coneVolume(double radius, double height) {
		return 3.14 * Math.pow(radius, 2) * height / 3;
	}

	double calculateCircumference(double radius) { return 2 * 3.14 * radius; }
	
	double findCircleArea(double radius) { return 3.14 * Math.pow(radius, 2); }
	
	double circumferenceOfRhombus(double length) { return 4 * length; }
	
	double raduis(double circumference) { return circumference / (2 * 3.14); }
	
	String hashtagIt(String[] array) {
		String result = "";
		for(String i : array) result += "#" + i + " ";
		return result;
	}
	
	long nameCharLength(String name) { return name.length(); }
}
