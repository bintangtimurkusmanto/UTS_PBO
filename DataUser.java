package gamemath;

/**
 *
 * @author rifai K3518051
 */
public class DataUser {
    private int nyawa, skor;
    private double level;
    
    // overloading set level
    public void setLevel(int lv){
        level = lv;
    }
    
    public void setLevel(double lv){
        level = lv;
    }
    
    public double getLevel(){
        return level;
    }
    
    // set nyawa
    public void setNyawa(int ny){
        nyawa = ny;
    }
            
    public int getNyawa(){
        return nyawa;
    }
    
    // set skor
    public void setSkor(int skr){
        skor = skr;
    }
    
    public int getSkor(){
        return skor;
    }
}
