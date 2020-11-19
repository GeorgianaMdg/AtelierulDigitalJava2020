package Challenges;

import java.util.ArrayList;

public class Challenge2 {
    static String compute (int numar) {
        StringBuilder sir = new StringBuilder(new String());
        if (numar % 3 == 0)
            sir.append("Foo");
        if (numar % 5 == 0)
            sir.append("Bar");
        if (numar % 7 == 0)
            sir.append("Qix");
        String temp;
        ArrayList<String> cifre = new ArrayList<>();
        while(numar!=0){
            if(numar%10==3){
                temp = "Foo";
                cifre.add(temp);
            }
            else if(numar%10==5){
                temp = "Bar";
                cifre.add(temp);
            }
            else if(numar%10==7){
                temp = "Qix";
                cifre.add(temp);
            }
            else if (numar%10 == 0){
                temp = "*";
                cifre.add(temp);
            }
            else{
                int aux = numar%10;
                cifre.add(String.valueOf(aux));
            }
            numar/=10;
        }
        for (int i = cifre.size()-1; i>=0; i--){
            sir.append(cifre.get(i));
        }
        return sir.toString();
    }

    public static void main(String[] args) {
        String sir=compute(101);
        System.out.println(sir);
    }
}
