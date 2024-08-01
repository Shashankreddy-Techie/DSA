public class swap {
    public static void main(String[] args) {
        int [] a={1,5,9,7,8};
        swap(a,1,2);
        System.out.println("Array after swapping :");
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
    }
    static void swap(int []a,int index1,int index2){
        int temp=a[index1];
        a[index1]=a[index2];
        a[index2]=temp;
    }
}
