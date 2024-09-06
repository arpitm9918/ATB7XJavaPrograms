package august.ex10082024.encapsulation;

//Fixed Encapsulation
public class lab177 {
    public static void main(String[] args) {
        VMOlogin1 vmOlogin = new VMOlogin1("password123", "admin");
        System.out.println(vmOlogin.getUsername());
        System.out.println(vmOlogin.getPassword());
        vmOlogin.setUsername("Arpit1235");
        System.out.println(vmOlogin.getUsername());
        vmOlogin.setPassword("Mishra", false);
        System.out.println(vmOlogin.getPassword());
       // System.out.println(vmOlogin.password);
       // vmOlogin.password="Arpit12345";// here there is no security any one can change password
       // System.out.println(vmOlogin.password);
    }
}
class VMOlogin1{
    //Data Member
    private String username;// if it is private you can't access in another class
    //if you want to use it the you need to create function
    private String password;
   // Encapsulation says you can not access Data Member directly you can access data member
// by using function
    //Getter and Setter are function
    //Data Members are controleed by getter and setter method
    //below geeter and setter method function are binding with co[de
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password, boolean isAuth) {
        if (isAuth){
        this.password = password;}
        else {
            System.out.println("Not Allowed");
        }
    }

    public VMOlogin1(String password, String username) {
        this.password = password;
        this.username = username;
    }
}

