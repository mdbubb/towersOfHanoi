import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner input= new Scanner(System.in);
        System.out.println("How many disk(s)");
        int n = input.nextInt();
        towersOfHanoi h = new towersOfHanoi(n, "1" , "2" , "3");
        h.solve(n, "1" , "2" , "3");
    }
}
