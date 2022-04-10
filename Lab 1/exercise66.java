public class exercise66 {
    public static void main(String[] args){
        int[] arr1 = {4871, 2940, 7349, 6686, 6277};
        int[] arr2 = {6309, 5023, 4930, 2260, 1015};
        int[] sum = new int[5];
        for(int i=0; i<5; i++){
            sum[i]=arr1[i]+arr2[i];
        }
        for( int k=0; k<5; k++){
            System.out.println("The "+k+" element in the sum matrix is: "+sum[k]);
        }
    }
}
