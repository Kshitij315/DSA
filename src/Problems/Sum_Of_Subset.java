package Problems;

public class Sum_Of_Subset {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5},sum=6;
        sum_of_subset(arr,sum);
    }
    static void sum_of_subset(int[] arr, int sum)
    {
        for (int i = 0; i < arr.length ; i++) {
            for (int j = i+1; j < arr.length ; j++) {
                if (arr[i]+arr[j]==sum)
                {
                    System.out.println("("+arr[i]+","+arr[j]+")");
                }
            }
        }

        //What is wrapper classes
        //wrapper classes is specially designed for Collection

        //error normal execution is not possible
        //exception is report of the error thrown by JVM
        //exception handling is process continuing normal execution of program
        //Tesla car
        //validation
    }
}
