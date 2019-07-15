package workstring;

public class StringVarArg {

    public static void main(String[] args) {

        String s = j('_', "my", "name", "is", "Maks");
        System.out.println(s);

    }

    public static String j(char c, String... ar) {
        String result = "";
        for (int i = 0; i < ar.length; i++) {

            if (i == ar.length - 1) {
                result = result + ar[i];

            } else {
                result = result + ar[i] + c;
            }

        }
        return result;
    }
}
