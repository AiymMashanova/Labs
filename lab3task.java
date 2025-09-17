import java.util.Scanner;

public class lab3task {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Әріп енгізіңіз: ");
        String word = scanner.nextLine();


        char last = scanner.next().charAt(word.length()-1);
        int asci = (int) last;

        System.out.println("ASCII value of that is: " + asci);

    }
}
















