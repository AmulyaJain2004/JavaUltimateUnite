import java.util.Locale;

public class StringMethodsDemo {
    public static void main(String[] args) {
        // Creating Strings
        String s1 = "Hello";
        char[] ch = {'J', 'a', 'v', 'a'};
        String s2 = new String(ch);
        String s3 = new String("World");
        
        // Display initial strings
        System.out.println("s1: " + s1);
        System.out.println("s2: " + s2);
        System.out.println("s3: " + s3);

        // 1. charAt()
        System.out.println("Character at index 1 in s1: " + s1.charAt(1));

        // 2. length()
        System.out.println("Length of s1: " + s1.length());

        // 3. format()
        String formatted = String.format("%s %s!", s1, s3);
        System.out.println("Formatted String: " + formatted);

        // 4. substring()
        System.out.println("Substring from index 1: " + s1.substring(1));
        System.out.println("Substring from 1 to 4: " + s1.substring(1, 4));

        // 5. contains()
        System.out.println("Does s1 contain 'ell'?: " + s1.contains("ell"));

        // 6. join()
        String joined = String.join("-", s1, s2, s3);
        System.out.println("Joined string: " + joined);

        // 7. equals()
        System.out.println("Is s1 equal to s3?: " + s1.equals(s3));

        // 8. isEmpty()
        System.out.println("Is s1 empty?: " + s1.isEmpty());

        // 9. concat()
        System.out.println("Concatenation: " + s1.concat(" Java"));

        // 10. replace()
        System.out.println("Replace 'l' with 'p' in s1: " + s1.replace('l', 'p'));

        // 11. equalsIgnoreCase()
        System.out.println("Case insensitive equality: " + s1.equalsIgnoreCase("hello"));

        // 12. split()
        String str = "Java,Python,C++";
        String[] languages = str.split(",");
        System.out.println("Split Example:");
        for (String lang : languages) {
            System.out.println(lang);
        }

        // 13. intern()
        String internedStr = s1.intern();
        System.out.println("Interned String: " + internedStr);

        // 14. indexOf()
        System.out.println("Index of 'l' in s1: " + s1.indexOf('l'));
        System.out.println("Index of 'o' from index 2: " + s1.indexOf('o', 2));

        // 15. toLowerCase() & toUpperCase()
        System.out.println("Lowercase: " + s1.toLowerCase());
        System.out.println("Uppercase: " + s1.toUpperCase());

        // 16. trim()
        String s4 = "  Java  ";
        System.out.println("Trimmed String: " + s4.trim());

        // 17. valueOf()
        int num = 100;
        String numStr = String.valueOf(num);
        System.out.println("Value of 100: " + numStr);

        // 18. compareTo()
        System.out.println("Comparing s1 & s3: " + s1.compareTo(s3));
    }
}
