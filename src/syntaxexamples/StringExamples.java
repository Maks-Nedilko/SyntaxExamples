package syntaxexamples;

public class StringExamples {

    public static void main(String[] args) {

        java.lang.String s = "ITEA";
        java.lang.String s2 = "ITE";
        s2 = s2 + "a";
        if (s == s2) {
            System.out.println("----------");
        } else {
            System.out.println("+++++++++");
        }

    }
}
