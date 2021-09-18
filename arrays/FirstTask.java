package arrays;

public class FirstTask{
    private short[] arr;

    private final int MIN = 1;
    private final int MAX = 23;

    public FirstTask() {
        fill(MIN, MAX);
    }

    public short[] getArr() {
        return arr;
    }

    private void fill(int min, int max){
        arr = new short[(max - min) / 2 + 1];
        for (int i = min; i <= max; i += 2){
            arr[i / 2] = (short)i;
        }
    }

    public void printArray(){
        for (short el : arr)
            System.out.print(el + " ");
    }
}