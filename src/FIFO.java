public class FIFO extends Proces {
    int time;

    public FIFO(int time){
        this.time=time;
    }
    public void exec(Proces[] processes){
        boolean temp = true;
        while (temp){
            temp = false;
            for (int i = 0; i < processes.length; i++){
                Proces process = processes[i];
                if(process.timeRemaining > 0){
                    temp = true;
                    process.exec(time);
                }
            }
        }
    }
}
