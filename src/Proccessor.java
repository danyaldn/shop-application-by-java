
import java.util.ArrayList;


public class Proccessor {
    private final  int numpayghiri;
    private final  String id;
    private final  String name;
    private final  String ghaymat;
    private final  int tedad;
    private final  String noamahsol;
    private final  String saledate;
    
   public Proccessor(int numpayghiri,String id, String name, String ghaymat,int tedad,String noamahsol,String saledate) {
       this.numpayghiri=numpayghiri;
       this.id=id;
       this.name=name;
       this.ghaymat=ghaymat;
       this.tedad=tedad;
       this.noamahsol=noamahsol;
       this.saledate=saledate;
    }
    public int getnumpayghiri(){
        return numpayghiri;
    }
    public String getid(){
        return id;
    }
    public String getname(){
        return name;
    }
    public String getghaymet(){
        return ghaymat;
    }
    public int gettedad(){
        return tedad;
    }
    public String getnoamahsol(){
        return noamahsol;
    }
    public String getsaledate(){
        return saledate;
    }
}
