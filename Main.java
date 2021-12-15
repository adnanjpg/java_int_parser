public class Main {
    public static void main(String[] args) {

        int valid = customIntParser("1234");
        int invalid = customIntParser("12r64");

        System.out.println(valid);
        System.out.println(invalid);

    }

    // what we're gonna do here is simply loop each character
    // and do a manual check to see the equivalent int value.
    //
    // may return -1 in case any character is not an int
    public static int customIntParser(String input) {
        int degree = 1;

        int total = 0;

        // we're gonna loop the input backwards, so we would go like
        // 1234 = 4, 30, 200, 1000
        for (int i = input.length() - 1; i >= 0; i--) {
            char c = input.charAt(i);

            int curr = fromChar(c);

            if (curr == -1) {
                return curr;
            }

            total += curr * degree;

            degree *= 10;

        }

        return total;

    }

    public static int fromChar(char c) {
        switch (c) {
            case '0':
                return 0;
            case '1':
                return 1;
            case '2':
                return 2;
            case '3':
                return 3;
            case '4':
                return 4;
            case '5':
                return 5;
            case '6':
                return 6;
            case '7':
                return 7;
            case '8':
                return 8;
            case '9':
                return 9;
        }

        return -1;

    }
}
