import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ZigZag
{
    public static void main(String[] args) {
        int[] arr= new int[]{1,5,6,8,4,7};
        boolean flag = true;
        int temp =0;
        for (int i=0; i<=arr.length-2; i++)
        {
            if (flag)
            {
                if (arr[i] > arr[i+1])
                {
                    temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                }
            }
            else
            {
                if (arr[i] < arr[i+1])
                {
                    temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                }
            }
            flag = !flag;
        }
        System.out.println(Arrays.toString(arr));

    }


}
