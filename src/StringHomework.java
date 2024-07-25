import java.util.Set;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;


public class ProgrammingExercises24thJuly {
    public static void main(String[] args) {
        System.out.println(Reverse("Hello"));
        int arr[]={1,2,3,4,2,22,5,3,2,1,4};
        System.out.println(MakeUnique(arr));
        FindCount("Rudra Sharma");
        FindLargest(arr);
        SortArray(arr);
        FindAvgSum(arr);

    }
    public static String Reverse(String str){
        //Reverse String
        String rev=" ";
        for(int i=str.length()-1;i>=0;i--){
            rev+=str.charAt(i);
        }
       return rev.trim();
    }
    public static ArrayList<Integer> MakeUnique(int arr[]){ 
      // Remove duplicates from an array
      ArrayList<Integer> unique_arr=new ArrayList<>();
      HashSet<Integer> set=new HashSet<>();
      for(int i=0;i<arr.length;i++){
          set.add(arr[i]);
      }
      Iterator<Integer> iterator = set.iterator();

      while(iterator.hasNext()){
            unique_arr.add(iterator.next());
      }
        return unique_arr;
    }
    public static void FindCount(String str){
     int arr[]=new int[26];
     str=str.toLowerCase();
     for(int i=0;i<str.length();i++){
         if(str.charAt(i)!=' '){
             arr[str.charAt(i)-'a']++;
         }
     }
     for(int i=0;i<arr.length;i++){
         if(arr[i]>=1){
             System.out.println((char)(i+'a')+" is occuring "+arr[i]+"   times");
         }
     }
    }
    public static void FindLargest(int arr[]){
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            max=Math.max(max,arr[i]);
        }
       }
       public static void FindSmallest(int arr[]){
        int min=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            min=Math.max(min,arr[i]);
        }
       }

       //Sort the array
       public static void SortArray(int arr[]) {
        if (arr == null || arr.length == 0) {
            return;
        }
        mergeSort(arr, 0, arr.length - 1);
    }
    
    public static void mergeSort(int[] arr, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;
            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);
            merge(arr, left, mid, right);
        }
    }
    
    public static void merge(int[] arr, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;
    
        int[] leftArray = new int[n1];
        int[] rightArray = new int[n2];
    
        for (int i = 0; i < n1; i++) {
            leftArray[i] = arr[left + i];
        }
        for (int j = 0; j < n2; j++) {
            rightArray[j] = arr[mid + 1 + j];
        }
    
        int i = 0, j = 0;
        int k = left;
        while (i < n1 && j < n2) {
            if (leftArray[i] <= rightArray[j]) {
                arr[k] = leftArray[i];
                i++;
            } else {
                arr[k] = rightArray[j];
                j++;
            }
            k++;
        }
    
        while (i < n1) {
            arr[k] = leftArray[i];
            i++;
            k++;
        }
    
        while (j < n2) {
            arr[k] = rightArray[j];
            j++;
            k++;
        }
    }

    public static void FindAvgSum(int arr[]){
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        System.out.println("Sum is "+Average/arr.length);
    }
}
