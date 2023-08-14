public class Algo_8 {
    public static void main(String[] args) {
        int[] numA = {5, 7, -2, 3, 4, 6, -8};
        int[] numB = {7, 8, -8, 2, 1, -9, 6};

        String intersection = "";

        for (int i = 0; i < numA.length; i++) {
            int a = numA[i];

            for (int j = 0; j < numB.length; j++) {
                int b = numB[j];
                if(a==b){
                    intersection = intersection + a;
                    
                }
         
                
            }
            char[] intersectionArr = intersection.toCharArray();
            int[] new1 = new int[numA.length+numB.length-intersection.length()];
            
            
        }
        System.out.println(intersection);
    }
}
