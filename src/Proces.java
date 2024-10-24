import java.util.Scanner;
public class Proces {
    int timeNeeded, timeRemaining;
    String name;

    public Proces(){

    }
    public Proces(String name , int timeExec){
        this.timeNeeded = timeExec;
        this.timeRemaining = timeExec;
        this.name = name;
    }
    public void out(){
        System.out.println("Numele Procesului - " + name + " / Timpul de executie - " + timeNeeded);
    }
    public void in(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nIntroduceți numele procesului: ");
        this.name = scanner.nextLine();
        System.out.print("Introduceți timpul de executie: ");
        this.timeNeeded = scanner.nextInt();
        this.timeRemaining = this.timeNeeded;
    }
    public void exec(int time){
        if (timeRemaining > 0){
            timeRemaining -= time;
            System.out.println(name);
        }
    }
    public static Proces longest(Proces[] processes){
        Proces maximum = new Proces("temp", Integer. MIN_VALUE);
        for(Proces process : processes){
            if(process.timeNeeded > maximum.timeNeeded){
                maximum = process;
            }
        }
        return maximum;
    }
    public static Proces shortest(Proces[] processes){
        Proces minimum = new Proces("temp", Integer. MAX_VALUE);
        for(Proces process : processes){
            if(process.timeNeeded < minimum.timeNeeded){
                minimum = process;
            }
        }
        return minimum;
    }

}
