import java.util.Locale;
import java.util.Scanner;
public class OOP {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // ex-1
           /*  String input = "Java is great and Java is powerfly";
            input = input.toLowerCase();
            String[] w = input.split(" ");

            for (int i = 0; i < w.length; i ++){
                boolean uni = true;
                for (int j = 0; j < w.length; j++){
                    if (i != j && w[i].equals(w[j])){
                        uni = false;
                        break;
                    }
                }
                if (uni){
                    System.out.println(w[i]);
                }
            }*/

        //ex2
         /*   String input = "Java is great and powerful";
            String[] words = input.split(" ");
            String long_word = "";

            for(String w : words){
                if (w.length() > long_word.length()){
                    long_word = w;
                }
            }
            System.out.println("Longest words is: " + long_word);*/

        //ex 3
           /* String input = "Hello World";
            input = input.toLowerCase();
            int vowels = 0, consonants = 0;

            for (char c : input.toCharArray()) {
                if (c >= 'a' && c <= 'z') {
                    if ("aeiou".indexOf(c) != -1) {
                        vowels++;
                    } else {
                        consonants++;
                    }
                }
            }
            System.out.println("Vowels: " + vowels);
            System.out.println("Consonants: " + consonants);*/

        //ex4
          /*  String s = "Қазақ";
            s = s.toLowerCase().replaceAll(" ", "");
            int i = 0, j = s.length() - 1;
            boolean isPalindrome = true;

            while (i < j) {
                if (s.charAt(i) != s.charAt(j)) {
                    isPalindrome = false;
                    break;
                }
                i++;
                j--;
            }
            System.out.println("Palindrome: " + isPalindrome);*/

        //ex 5
           /* String text = "hello world";
            String sub = "world";
            int index = -1;

            for (int i = 0; i <= text.length() - sub.length(); i++) {
                int j;
                for (j = 0; j < sub.length(); j++) {
                    if (text.charAt(i + j) != sub.charAt(j)) {
                        break;
                    }
                }
                if (j == sub.length()) {
                    index = i;
                    break;
                }
            }
            System.out.println("Index: " + index);
*/
        //ex 6
  /*         int[] array = {3, 9, 0, 4, 7};
            for (int i = 0; i < array.length - 1; i++){
                for (int j = 0; j < array.length - 1 - i; j++){
                    if (array[j] > array[i + 1]){
                        int t = array[j];
                        array[j] = array[j + 1];
                        array[j + 1] = t;
                    }
                }
            }
            for (int i = 0; i < array.length; i++) {
                System.out.print(array[i] + " ");
            }
*/

  /*          //ex 7
            String str = "a12bc34d5";
            int sum = 0;
            String number = "";

            for (int i = 0; i < str.length(); i++) {
                char c = str.charAt(i);
                if (Character.isDigit(c)) {
                    number += c;
                } else {
                    if (!number.equals("")) {
                        sum += Integer.parseInt(number);
                        number = "";
                    }
                }
            }
            if (!number.equals("")) {
                sum += Integer.parseInt(number);
            }

            System.out.println("Sum = " + sum);
*/
        // ex 8
  /*          int[] arr = {4, 8, 7, 0, 8, 5, 7};
            System.out.print("Duplicates: ");

            for (int i = 0; i < arr.length; i++) {
                boolean printed = false;
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[i] == arr[j]) {
                        for (int k = 0; k < i; k++) {
                            if (arr[k] == arr[i]) {
                                printed = true;
                                break;
                            }
                        }
                        if (!printed) {
                            System.out.print(arr[i] + " ");
                        }
                        break;
                    }
                }
            }
*/
        //ex 9
    /*        String s1 = "listen";
            String s2 = "silent";

            s1 = s1.toLowerCase();
            s2 = s2.toLowerCase();

            if (s1.length() != s2.length()) {
                System.out.println("Not anagrams");
                return;
            }

            char[] a1 = s1.toCharArray();
            char[] a2 = s2.toCharArray();


            for (int i = 0; i < a1.length - 1; i++) {
                for (int j = 0; j < a1.length - 1 - i; j++) {
                    if (a1[j] > a1[j + 1]) {
                        char temp = a1[j];
                        a1[j] = a1[j + 1];
                        a1[j + 1] = temp;
                    }
                    if (a2[j] > a2[j + 1]) {
                        char temp = a2[j];
                        a2[j] = a2[j + 1];
                        a2[j + 1] = temp;
                    }
                }
            }

            boolean Anagram = true;
            for (int i = 0; i < a1.length; i++) {
                if (a1[i] != a2[i]) {
                    Anagram = false;
                    break;
                }
            }

            System.out.println("Anagram: " + Anagram);
            */

        //ex10
            /*

            String s = " Hello \t World \n Java ";
            String result = "";

            for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);
                if (c != ' ' && c != '\t' && c != '\n') {
                    result += c;
                }
            }

            System.out.println("Result: " + result);*/


        //ex11
  /*          String s = "programming";
            int[] freq = new int[256];

            for (int i = 0; i < s.length(); i++) {
                freq[s.charAt(i)]++;
            }

            for (int i = 0; i < freq.length; i++) {
                if (freq[i] > 0) {
                    System.out.println((char) i + ": " + freq[i]);
                }
            }
*/

        //ex 13
            /*int n = 50;

            for (int i = 2; i <= n; i++) {
                boolean prime = true;
                for (int j = 2; j <= i / 2; j++) {
                    if (i % j == 0) {
                        prime = false;
                        break;
                    }
                }
                if (prime) {
                    System.out.print(i + " ");
                }
            }*/
        //ex14
           /* int[] arr = {5, 10, 15, 20, 25, 30};
            int sum = 0;

            for (int i = 0; i < arr.length; i += 2) {
                sum += arr[i];
            }

            System.out.println("Sum = " + sum);  */


        //ex15
           /* int[] arr = {7, 2, 9, 4, 1, 5};

            int minIndex = 0, maxIndex = 0;
            for (int i = 1; i < arr.length; i++) {
                if (arr[i] < arr[minIndex]) minIndex = i;
                if (arr[i] > arr[maxIndex]) maxIndex = i;
            }

            int temp = arr[minIndex];
            arr[minIndex] = arr[maxIndex];
            arr[maxIndex] = temp;

            System.out.print("Result: ");
            for (int n : arr) {
                System.out.print(n + " ");
            }*/

        //ex16
            /*String s = "Java";
            String reversed = "";

            for (int i = s.length() - 1; i >= 0; i--) {
                reversed += s.charAt(i);
            }

            System.out.println("Reversed: " + reversed);*/

        //ex17
          /*  int[] arr = {4, 5, 4, 2, 5, 7, 2, 9};
            int[] result = new int[arr.length];
            int size = 0;
            for (int i = 0; i < arr.length; i++) {
                boolean exists = false;
                for (int j = 0; j < size; j++) {
                    if (arr[i] == result[j]) {
                        exists = true;
                        break;
                    }
                }
                if (!exists) {
                    result[size] = arr[i];
                    size++;
                }
            }
            System.out.print("Without duplicates: ");
            for (int i = 0; i < size; i++) {
                System.out.print(result[i] + " ");
            }
*/
        //ex18
          /*  int[] arr = {10, 5, 20, 8, 15};
            int max = Integer.MIN_VALUE;
            int secondMax = Integer.MIN_VALUE;

            for (int num : arr) {
                if (num > max) {
                    secondMax = max;
                    max = num;
                } else if (num > secondMax && num != max) {
                    secondMax = num;
                }
            }

            System.out.println("Second largest: " + secondMax);  */

        //ex19
       /*     int[] a = {1, 2, 3, 4};
            int[] b = {3, 4, 5, 6};
            int[] merged = new int[a.length + b.length];
            int size = 0;

            for (int i = 0; i < a.length; i++) {
                boolean exists = false;
                for (int j = 0; j < size; j++) {
                    if (merged[j] == a[i]) {
                        exists = true;
                        break;
                    }
                }
                if (!exists) merged[size++] = a[i];
            }
            for (int i = 0; i < b.length; i++) {
                boolean exists = false;
                for (int j = 0; j < size; j++) {
                    if (merged[j] == b[i]) {
                        exists = true;
                        break;
                    }
                }
                if (!exists) merged[size++] = b[i];
            }

            System.out.print("Merged: ");
            for (int i = 0; i < size; i++) {
                System.out.print(merged[i] + " ");
            } */

    }
}

