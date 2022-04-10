public class exercise65 {
    public static void main(String[] args){
        int[] my_array1 = {1789, 2035, 1899, 1456, 2013};
        for(int i=0; i<5; i++){
            int a = 0;
            for(int j=i; j<5; j++){
                if(my_array1[j]<my_array1[i]){
                    a = my_array1[j];
                    my_array1[j] = my_array1[i];
                    my_array1[i] = a;
                }
            }
        }
        int sum = 0;
        for(int k=0; k<5;k++){
            System.out.println("Element "+k+": "+my_array1[k]);
            sum+=my_array1[k];
        }
        double avrg = (sum/5);
        System.out.println("The sum of all element: "+ sum);
        System.out.println("The average value: "+avrg);
    }
}
