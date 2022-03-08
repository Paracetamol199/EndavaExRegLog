package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexExamples {
    public static void simpleMatch() {
        Pattern pattern = Pattern.compile("abc\\d{2}");
        Matcher matcher = pattern.matcher("dabc123");

        if (matcher.find()) {
            System.out.println(matcher.group());
            System.out.println(matcher.start());
            System.out.println(matcher.end());
        }
    }

    public static void simpleStringSplit() {
        String testString = "this is a test  string";
        System.out.println(testString.matches("\\w.*"));
        String[] splitString = testString.split("\\s+");
        for (String string : splitString) {
            System.out.println(string);
        }
        String replacedString = testString.replaceAll("\\s+", "_");
        System.out.println(replacedString);
    }

    public static void emailRegex() {
        String input = "My email address is marian.gafitescu@endava.com. " +
                "You can also find me at dummy@domain.tld if you want";
        String regex = "\\b[\\w.%+-]+@[\\w.-]+\\.[a-zA-Z]{2,6}\\b";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(input);
        while (m.find()) {
            System.out.println(m.group());
        }
    }

    public static void captureGroups() {
        Pattern pattern = Pattern.compile("(\\d+).*(\\d+).*");
        Matcher matcher = pattern.matcher("2 birds are singing 3 songs.");

        if (matcher.find()) {
            System.out.println(matcher.group(1));
//            for (int i = 0; i <= matcher.groupCount(); i++) {
//                System.out.println(matcher.group(i));
//            }
        }

    }

    public static void quantifierExample() {
        Pattern pattern = Pattern.compile(".*+foo");
        //.*foo - greedy
        //.*?foo - reluctant
        //.*+foo - possessive

        Matcher matcher =
                pattern.matcher("xfooxxxxxxfoo");

        boolean found = false;
        while (matcher.find()) {
            System.out.println("I found the text " + matcher.group() +
                                       " starting at index " + matcher.start() +
                                       " and ending at index " + matcher.end());
            found = true;
        }
        if (!found) {
            System.out.println("No match found.");
        }
    }


    public static void main(String[] args) {
//        simpleMatch();
//        simpleStringSplit();
//        emailRegex();
//        captureGroups();
        quantifierExample();
    }
}
