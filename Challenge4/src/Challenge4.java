public class Challenge4 {
    static int pairOfThree(int[] numere){
        int size = numere.length;
        int count=0;
        for(int i=0;i<size-2;i++){
            for(int j=i+1;j<size-1;j++) {
                for (int k = j + 1; k < size; k++) {
                    if (numere[i] + numere[j] + numere[k] == 0) {
                        numere[j] = Integer.MAX_VALUE;
                        numere[k] = Integer.MAX_VALUE;
                        count++;
                    }
                }
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int numere [] = {-1,-1,-1,2};
        int pairs = pairOfThree(numere);
        System.out.println(pairs);

    }
}