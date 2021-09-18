package arrays;

public class ThirdTask {
    private final int ROW = 12;
    private final int COL = 18;
    private final int CONDITION1 = 7;
    private final int[] CONDITION2 = { 1, 3, 5, 11, 17, 19 };
    private FirstTask first;
    private SecondTask second;
    private double[][] arr;

    public ThirdTask(FirstTask first, SecondTask second){
        this.first = first;
        this.second = second;
        fill(ROW, COL);
    }

    public double[][] getArr(){
        return arr;
    }

    private void fill(int row, int col){
        arr = new double[row][col];
        short[] a = first.getArr();
        float[] x = second.getArr();
        for (int i = 0; i < row; i++){
            for (int j = 0; j < col; j++){
                if (a[i] == CONDITION1){
                    arr[i][j] = Math.sin(Math.cbrt(Math.log(Math.abs(x[j]))));
                }else if (ThirdTask.isContains(CONDITION2, a[i])){
                    arr[i][j] = Math.pow(Math.pow(Math.E, Math.cos(x[j])), 2 / Math.cbrt(4 / x[j]));
                }else{
                    arr[i][j] = Math.cbrt(Math.log(Math.pow(Math.sin(Math.pow(Math.atan((x[j] - 2.5) / 25) / 2 / 3, 2)), 2)));
                }
            }
        }
    }

    public void printArray(int count){
        for (double[] i : arr){
            for (double j : i){
                System.out.print(ThirdTask.round(j, count) + "\t");
            }
            System.out.println();
        }
    }

    private static String round(double a, int count){
        return String.format("%." + count + "f", a);
    }

    private static boolean isContains(int[] arr, int a){
        for (int el : arr){
            if (a == el)
                return true;
        }
        return false;
    }
}
