import arrays.*;

public class Print{
    private static final int COUNT_AFTER_COMMA = 4;

    public static void main(String[] args){
        
        FirstTask first = new FirstTask();
        SecondTask second = new SecondTask();
        ThirdTask third = new ThirdTask(first, second);

        printArray(third, COUNT_AFTER_COMMA);
    }

    private static void printArray(ThirdTask task, int countAfterComma){
        task.printArray(countAfterComma);
    }

    

    
}