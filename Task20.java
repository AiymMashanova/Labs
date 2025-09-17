public class Task20 {
    public static String[] mySplit(String s, char delimiter) {
        String[] parts = new String[s.length()];
        int size = 0;
        String temp = "";

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == delimiter) {
                parts[size++] = temp;
                temp = "";
            } else {
                temp += c;
            }
        }
        parts[size++] = temp;


        String[] result = new String[size];
        for (int i = 0; i < size; i++) {
            result[i] = parts[i];
        }
        return result;
    }

    public static void main(String[] args) {
        String text = "Java-is-great";
        String[] words = mySplit(text, '-');

        for (String w : words) {
            System.out.println(w);
        }
    }
}
