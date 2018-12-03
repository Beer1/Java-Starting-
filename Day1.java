public class Day1{
    public static void main(String[] args){
        System.out.print(jieCheng(20));
    }
    public static long jieCheng(int i){
        if (i == 1){
            return 1L;
        }else{
            return i * jieCheng(i-1);
        }
    }
}
