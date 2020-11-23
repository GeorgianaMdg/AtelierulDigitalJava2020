package lab2.ch1;

import lab2.ch1.Fighters;

public class BoxingMatch {
    private Fighters f1;
    private Fighters f2;
    public BoxingMatch(Fighters f1, Fighters f2){
            this.f1=f1;
            this.f2=f2;

    }
    public String fight(){
        while(f1.getHealth()>0 && f2.getHealth()>0){
            f1.attack(f2);
            if(f2.getHealth()<=0){
                return f1.getName();
            }


        }
        return f2.getName();
    }
}
