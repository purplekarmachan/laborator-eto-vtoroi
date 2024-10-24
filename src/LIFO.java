public class LIFO extends Proces{
    int time;

    public LIFO(int time){
        this.time=time;
    }
    public void exec(Proces[] processes){
        boolean temp = true;
        while (temp){
            temp = false;
            for (int i = processes.length - 1; i >= 0; i--){
                Proces process = processes[i];
                if(process.timeRemaining > 0){
                    temp = true;
                    process.exec(time);
                }
            }
        }
    }
}
