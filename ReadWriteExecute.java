
public class ReadWriteExecute {
    public static int symbolicToOctal(String permString) {

        StringBuilder val = new StringBuilder();
        int value = 0;
        for (int a = 1; a < permString.length(); a++) {
            switch (permString.charAt(a-1)) {
                case 'r' -> value += 4;
                case 'w' -> value += 2;
                case 'x' -> value += 1;
            }
            if (a % 3 == 0 || a == permString.length() -1) {
                val.append(value);
                value = 0;
            }

        }
        return Integer.parseInt(val.toString());
    }

    public static void main(String[] args) {
        // Should write 752
        System.out.println(ReadWriteExecute1.symbolicToOctal("rwxr-x-w-"));
    }
}
