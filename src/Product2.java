
public class Product2 {
     private  String id;
    private  String username;
    private  String password;
    private  String first_name;
    private  String last_name;
    private String email;
   public Product2(String id, String username, String password,String first_name,String last_name,String email) {
       this.id=id;
       this.username=username;
       this.password=password;
       this.first_name=first_name;
       this.last_name=last_name;
       this.email=email;
    }
    public String getid(){
        return id;
    }
    public String getusername(){
        return username;
    }
    public String getpassword(){
        return password;
    }
    public String getfirst_name(){
        return first_name;
    }
    public String getlast_name(){
        return last_name;
    }
    public String getemail(){
        return email;
    }
}
