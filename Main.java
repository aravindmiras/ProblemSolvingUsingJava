public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
        fun(5);
    }
    public static void fun(int n){
        if(n>0){
             System.out.print(n+" ");
        fun(n-1);
        System.out.print(n+" ");
        }
        else {
            return;
        }
    }
}