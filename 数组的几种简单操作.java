public class Day3{
  //1.计算数组中最大值
    public static int arrayMaxElement(int[] data){
        int max = data[0];
        for (int i = 0; i< data.length; i++){
            if (data[i] > max){
                max = data[i];
            }
        } 
       return max;
   }
   
   //2.计算数组中最小值
   public static int arrayMinElement(int[] data){
       int min = data[0];
       for (int i = 0; i< data.length; i++){
           if (data[i] < min){
               min = data[i];
           }
       } 
       return min;
   }
   
   
   //3.计算数组值之和
   public static int arrayElementSum(int[] data){
       int sum = 0;
       for (int i = 0; i < data.length; i++){
           sum += data[i];
       }
       return sum;
   }
   
   //4.数组拼接
   // A {1,3,5,7,9} B {2,4,6,8,10} -> {1,3,5,7,9,2,4,6,8,10}
   public static int[] arrayJoin(int[] a, int[] b){
       int[] c = new int[a.length + b.length];
       for (int i = 0; i < c.length; i++){
           if (i < a.length){
               c[i] = a[i];
           }else{
               c[i] = b[i - a.length];
           }
       }
       return c;
   }

   //5.数组截取
   //[start, end)
   // A {1,3,5,7,9} ->(A,1,3) > {3,5}
   public static int[] arraySub(int[] data, int start , int end){
       int[] array = new int[end-start];
       int j = 0;
       for (int i = start; i < end; i++){
            array[j] = data[i];
            j++;
       }
       return array;
   }
   
   //6.数组打印
   public static void printArray(int[] data){
       for (int i = 0; i < data.length; i++){
           System.out.print(data[i] + "、");
       }
   }
   
   //7.数组反转
   public static void printReversal(int[] data){
        int left = 0;
        int right = data.length - 1;
        while (left < right){
            int tmp = data[left];
            data[left] = data[right];
            data[right] = tmp;
            left++;
            right--;
        }
   }
   
   public static void main(String[] args){
       int[] data = new int[]{1,3,5,7,9}; 
       int start = 1;
       int end = 3; 
       System.out.println(arrayMaxElement(data));
       System.out.println(arrayMinElement(data));
       printArray(data);
       System.out.println();
       int[] A = new int[]{1,2,3,4,5};
       int[] B = new int[]{6,7,8,9,0};
       printArray(arrayJoin(A, B));
       System.out.println();
       printArray(arraySub(data, start, end));
       System.out.println();
       printReversal(data);
       printArray(data);
   }    
}
