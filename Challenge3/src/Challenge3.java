public class Challenge3 {
    static int pairOfTwo(int[] numere){
        int size = numere.length;
        int count=0;
        for(int i=0;i<size-1;i++){
            for(int j=i+1;j<size;j++){
                if(numere[i]+numere[j]==0){
                    numere[j]=Integer.MAX_VALUE;
                    count++;
                }
            }

        }
         return count;
    }
    public static void main(String[] args) {
        int numere [] = {3,2,-3,-2,3,0};
        int pairs = pairOfTwo(numere);
        System.out.println(pairs);

    }
}
