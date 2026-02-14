package w3_school;

// import javax.sound.sampled.SourceDataLine;

public class String_pms {
    public static void main(String[] args) {

        String s = "Java";
        // length
        System.out.println(s.length());
        // charAt
        System.out.println(s.charAt(0));
        // toUpperCase
        System.out.println(s.toUpperCase());
        // toLowerCase
        System.out.println(s.toLowerCase());
        // equals means compare contents
        String a = "Java";
        String b = "java";
        System.out.println(a.equals(b));
        // equalsIgnoreCase means compare contents ignoring case
        System.out.println(a.equalsIgnoreCase(a));
        // compareTo means compare contents and return 0 if equal, -1 if less, 1 if
        // greater
        System.out.println(a.compareTo(a));
        // contains means checks substring exists or not
        System.out.println(s.contains("Java"));
        // startWith
        System.out.println(s.startsWith("Java"));
        // endsWith
        System.out.println(s.endsWith("va"));
        // substring means extract the part of string
        System.out.println(s.substring(0, 3));
        // replace means replace the part of string
        System.out.println(s.replace("Java", "Python"));
        // concat
        System.out.println(a.concat(b));

        // regex
        // replaceAll()
        String c1 = "Java123";
        System.out.println(s.replaceAll("[0-9]", ""));

        // trim removes the spaces from start and end
        String sn = "  Java  ";
        System.out.println(sn.trim());

        // split splits the string into array of strings
        String s2 = "Java is programming languages";
        String[] arr = s.split(" ");
        for (String x : arr) {
            System.out.println(x);

        }

        // indexOf
        System.out.println(s.indent('a'));

        // lastIndexOf
        System.out.println(s.lastIndexOf('a', 0));

        // isEmpty
        String emp = " ";
        System.out.println(emp.isEmpty());

        // toCharArray()
        String snn = "Pravin";
        char[] c = snn.toCharArray();
        for (char ch : c) {
            System.out.println(ch);
        }

        // matches
        String match = "Java";
        System.out.println(match.matches("[a-z0-9]"));

    }

}
