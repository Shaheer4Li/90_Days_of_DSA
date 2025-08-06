//day one all task these might seems simple but its just to revise java syntax
public class day1 {
    public static int maxnum(int[] arr) {
        int nax = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > nax) {
                nax = arr[i];
            }

        }
        return nax;
    }

    // task no 2
    public static int minumum(int arr[]) {
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[1] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    // task 3
    public static int sum(int[] arr) {
        int i = 0;
        for (int j = 0; j < arr.length; j++) {
            i +=arr[j] ;
        }
        return i;
    }

    // task no 4
    public static Float avg(int[] arr) {
        float i = 0;
        for (int j = 0; j < arr.length; j++) {
            i += arr[j];
        }
        i = i / arr.length;
        return i;
    }

    // task no 5
    public static int search(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }

    // task no 6
    public static int[] evenodd(int[] arr) {
        int num[] = { 0, 0 };
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                num[0]++;
            } else {
                num[1]++;
            }
        }
        return num;
    }

    // task no 7
    public static int[] reverse(int[] arr) {
        int[] temp = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            temp[arr.length - 1 - i] = arr[i];
        }

        return temp;
    }

    // task no 8
    public static boolean isAscending(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i - 1]) {
                return false;
            }
        }
        return true;
    }

    // task no 9
    public static int[] duplicatehunter(int[] arr) {
        int[] temp1 = new int[arr.length];
        int var1=0;
        boolean var2;
        for (int i = 0; i < arr.length; i++) {
            var2 = false;
            for(int j=0; j <var1 ;j++){
                if(arr[i]==temp1[j]){
                    var2 = true;
                }
            }
        if(!var2){
            temp1[var1]=arr[i];
            var1++;
        }
        }
        int[] res = new int[var1];
        for(int i =0; i<var1;i++){
            res[i]=temp1[i];
        }return res;
    }
//Task no 10
     public static int secondlargest(int[] arr){
        int max=Integer.MIN_VALUE,secondmax=Integer.MIN_VALUE;
        for(int i =0;i<arr.length;i++){
         if(arr[i]> max){
            max = arr[i];
         }
         if(arr[i]<max && arr[i]>secondmax){
            secondmax=arr[i];
         }
        }
     return secondmax;
    }

}
