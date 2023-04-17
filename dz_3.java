import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;

class dz_3 {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11));
        removeEvenNumber(numbers);
        System.out.println(numbers);
        ArrayList<String> strings = new ArrayList<>();
        strings.add("string");
        strings.add("40");
        strings.add("-5");
        strings.add("my_string");
        removeIntegers(strings);
        System.out.println(strings);
    }

    static void removeEvenNumber(List<Integer> numbers) {
        numbers.removeIf(s -> s % 2 == 0);
    }

    static void removeIntegers(List<String> strings) {
        strings.removeIf(s -> isNumeric1(s));

    }

    static boolean isNumeric1(String str) {
        if (str == null) {
            return false;
        }
        try {
            int n = Integer.parseInt(str);
        } catch (NumberFormatException nfe) {
            return false;
        }
        return true;
    }

    static boolean isNumeric2(String str) {
        Pattern pattern = Pattern.compile("-?\\d+(\\.\\d+)?");
        if (str == null) {
            return false;
        }
        return pattern.matcher(str).matches();
    }

    static boolean isNumeric3(String str) {
        char[] charArray = str.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            if (!Character.isDigit(charArray[i])) {
                if (i == 0 && charArray[i] == '-' && charArray.length > 1) {
                    continue;
                }
                return false;

            }
        }
        return true;
    }

}