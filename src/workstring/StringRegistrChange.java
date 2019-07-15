package workstring;

public class StringRegistrChange {

    static char[] littele = {'a', 'b', 'c', 'd', 'e', 'f', 'g',};
    static char[] big = {'A', 'B', 'C', 'D', 'E', 'F', 'G'};

    static int isLittele(char c) {

        for (int i = 0; i < littele.length; i++) {
            if (littele[i] == c) {
                return i;
            }
        }
        return -1;
    }

    static int isBig(char c) {

        for (int i = 0; i < big.length; i++) {
            if (big[i] == c) {
                return i;
            }
        }
        return -1;
    }

    static String modifyer(String s) {

        char[] array = s.toCharArray();

        for (int i = 0; i < array.length; i++) {
            if (isLittele(array[i]) != -1) {

                array[i] = big[isLittele(array[i])];
                continue;
            } else {
                if (isBig(array[i]) != -1) {

                    array[i] = littele[isBig(array[i])];
                    continue;
                }
            }

        }
        return new String(array);

    }

    public static void main(String[] args) {

        String test = "cdAEf";
        System.out.println(modifyer(test));

    }

}
