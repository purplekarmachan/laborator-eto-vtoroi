import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti numarul de procese");
        int n = scanner.nextInt();
        Proces[] processes = new Proces[n];
        for (int i = 0; i < n; i++){
            processes[i] = new Proces();
            processes[i].in();
        }

        System.out.println("Procesul cel mai lung:");
        Proces.longest(processes).out();
        System.out.println("Procesul cel mai scurt:");
        Proces.shortest(processes).out();

        System.out.println("Introduceti cuantumul de timp");
        int time = scanner.nextInt();
        System.out.println("Alegeti modul:\n1 - FIFO\n2 - LIFO");
        int temp = scanner.nextInt();
        switch (temp){
            case 1: {
                System.out.println("FIFO");
                FIFO fifo = new FIFO(time);
                fifo.exec(processes);
            } break;
            case 2: {
                System.out.println("LIFO");
                LIFO lifo = new LIFO(time);
                lifo.exec(processes);
            } break;
            default:{
                System.out.println("Alegeti intre 1 sau 2");
            }
        }

    }
}