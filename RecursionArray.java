import java.util.ArrayList;
public class RecursionArray {
    public static void main(String args[]) {
        int[] arr = {3, 2, 1, 18, 9,10,9};
        int target = 15;
        ArrayList<Integer> result=findAllIndex(arr,9,0,new ArrayList<>());
        System.out.println(result);
    }
// How to find whether the given array is sorted or not using RECURSION
    public static boolean sorted(int[] arr, int index) {
        //BASE
        if (index == arr.length - 1) {
            return true;
        }
        return arr[index] < arr[index + 1] && sorted(arr, index + 1);
    }

    // How to search a targeted element in an array using RECURSION
    public static boolean searchanelement(int[] arr, int target, int index) {
        //BASE
        if (index == arr.length) {
            return false;
        }
        return arr[index] == target || searchanelement(arr, target, index + 1);

    }
    // How to find all the index of targeted value using RECURSION
    public static ArrayList<Integer> findAllIndex(int[] arr, int target, int index, ArrayList<Integer> list){
        if(index==arr.length){
            return list;
        }
        if(arr[index]==target){
            list.add(index);
        }
        return findAllIndex(arr,target,index+1,list);
    }
    //
}
