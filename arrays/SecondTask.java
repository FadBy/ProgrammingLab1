package arrays;

public class SecondTask {
    private float[] arr;
    private final int LENGTH = 18;
    private final float MAX = 10;
    private final float MIN = -15;

    public SecondTask(){
        fill(LENGTH, MIN, MAX);
    }

    public float[] getArr(){
        return arr;
    }

    private void fill(int length, float min, float max){
        arr = new float[length];
        for (int i = 0; i < length; i++){
            arr[i] = getRandomNumber(min, max);
        }
    }

    private float getRandomNumber(float min, float max){
        return (float)Math.random() * (max - min) + min;
    }

    public void printArray(){
        for (float el : arr)
            System.out.print(el + " ");
    }
}
