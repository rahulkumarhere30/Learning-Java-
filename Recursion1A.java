import java.util.Scanner;
public class Recursion1A {

    // Print all permutations of a string
    public static int count = 0;
    public static void printPerm(String str, String permutations){
        //Base case
        if(str.length() == 0){
            System.out.println(permutations);
            count++;
            return;
        }

        //Kaam
        for(int i=0; i<str.length(); i++){
            char currChar = str.charAt(i);
            String newStr = str.substring(0, i) + str.substring(i+1);
            printPerm(newStr, permutations + currChar);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String str = sc.nextLine();

        printPerm(str, "");
        System.out.println("Total permutations: " + count);
        sc.close(); 
    }
}
