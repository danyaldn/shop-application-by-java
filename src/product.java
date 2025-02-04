
class product {

    private  String id;
    private  String name;
    private  String ghaymat;
    private  int tedad;
    private  String noamahsol;
   public product(String id, String name, String ghaymat,int tedad,String noamahsol) {
       this.id=id;
       this.name=name;
       this.ghaymat=ghaymat;
       this.tedad=tedad;
       this.noamahsol=noamahsol;
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
}
