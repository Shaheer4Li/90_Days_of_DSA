public class day3 {
    //task no 1 normal to fabionacci
public static int[] sumtoelement(int[] arr){
    int[] temp = new int[arr.length];
    temp[0]=arr[0];
    for(int i = 1;i<arr.length;i++){
        temp[i]= temp[i-1]+arr[i];
    }
return temp;}
public static int sumltor(int[] arr, int l,int r){
    int sum = 0;
    if(l<r && l<arr.length && l >= 0 && r >0 && r <arr.length ){
    for(int i =l;i<=r;i++){
       sum+=arr[i];
    }
return sum;}



return -1;}

}
