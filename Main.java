//6510450658 Pinpawat Limsuwat

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner intScanner = new Scanner(System.in);
        int totalGumball = 0;
        System.out.print("How many Gumballs? : ");
        totalGumball = intScanner.nextInt();
        GumballMachine gumballMachine = new GumballMachine(totalGumball);
        Scanner stringScanner = new Scanner(System.in);
        String buffer = "";
        boolean flag = true;
        while (gumballMachine.getCount() > 0) {
            System.out.println("--------------------------------------------------------------------");
            System.out.println("Mighty Gumball, Inc.");
            System.out.println("There are " + gumballMachine.getCount() + " gumballs left.");
            System.out.print("Insert Quarter[I], Eject Quarter[E], Turn Crank[T], Choose Color[C]: ");
            buffer = stringScanner.nextLine();
            switch (buffer.toLowerCase().charAt(0)) {
                case 'i':
                    gumballMachine.insertQuarter();
                    break;
                case 'e':
                    gumballMachine.ejectQuarter();
                    break;
                case 't':
                    gumballMachine.turnCrank();
                    break;
                case 'c':
                    System.out.print("Choose the color: ");
                    buffer = stringScanner.nextLine();
                    gumballMachine.choose(buffer);
                    break;
            }
        }
    }
}

