public class day2 {
    //Task one rotate array left by 1
    public static int[] leftrotate(int arr[]){
        int[] temp = new int[arr.length];
        for(int i = 1; i<arr.length;i++){
            temp[i-1]=arr[i];
        }
        temp[temp.length-1]=arr[0];
        for(int i = 0; i<temp.length;i++){
            arr[i]=temp[i];
        }
        
   return arr;
 }
   //Task 2 rotate array right by 1
   public static int[] rotateright(int[] arr){
    int[] temp = new int[arr.length];
        for(int i = 0; i<arr.length-1;i++){
            temp[i+1]=arr[i];
        }
        temp[0]=arr[temp.length-1];

        for(int i = 0; i<temp.length;i++){
            arr[i]=temp[i];
        }
        return arr; }
     //task 3 shift zeros to end
    public static int[] zerotoend(int[] arr){
        int var1=0;
        boolean var2;
        int[] temp = new int[arr.length];
        for(int i = 0;i<arr.length;i++){
            var2 = false;
            if(arr[i]==0){
                var2 = true;
                ;
            }
            if(!var2){
                temp[var1]=arr[i];
                var1++;
            }
        }
        int var3 = arr.length-var1;
        for(int i =0; i<var3;i++){
            temp[var1]=0;
            var1++;   }
    return temp;}
       //task 4 Remove duplicate from sorted array
       public static int[] dupli(int arr[]){
        int[] temp = new int[arr.length];
        int counter =0;
        for(int i =1;i<arr.length;i++){
            if(arr[i]!=arr[i-1]){
                temp[counter]=arr[i];
                counter++;
                        }
        }
        
      return temp; }
      //Task 5 rotate by k
      public static int[] rotatebyk(int[] arr , int k){
        int[] temp = new int[arr.length];
        int counter=0;
        for(int i = k;i<arr.length;i++){
            temp[counter]= arr[i];
            counter++;
        }
        for(int i = 0;i<k;i++){
            temp[counter]= arr[i];
        }
        for(int i = 0; i<arr.length;i++){
            arr[i]=temp[i];
        }
      return arr;}
    //task 6 print spiral matrix
    public static void spiral(int[][] arr){
        int top =0;
        int bottom = arr.length-1;
        int left = 0;
        int right = arr[0].length-1;
        while(top<=bottom && left<=right){
            for(int i= left;i<=right;i++) {
                System.out.print(arr[top][i]+" ");
            }

            top++;
           
                for(int i = top; i<= bottom;i++){
                    System.out.print(arr[i][right]+" ");
                }right--;
            if(left<=right){
                for(int i =right;i>=left;i-- ){
                    System.out.print(arr[bottom][i]+" ");
                }
            }bottom--;
                 if(top<=bottom){
                for(int i =bottom;i>=top;i-- ){
                    System.out.print(arr[i][left]+" ");
                }
            }left++;

        }

    }
    //task no 7 transpose of matrix
    public static int[][] transpose(int[][] arr){
        int trans[][] = new int[arr[0].length][arr.length];
        for(int i =0;i<arr.length;i++){
            for(int j = 0;j<arr[0].length;j++){
                trans[j][i]=arr[i][j];
            }
        }

    return trans;}
    //task no 8 rotate by 90 degree
    public static int[][] ninety(int[][] arr){
        int[][] rot = new int[arr.length][arr[0].length];
        for(int i = 0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                rot[i][j]=arr[arr.length-j-1][i];
            }
        }

      return rot;  }
    }


