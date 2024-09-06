package august.ex10082024.encapsulation;
//Encapsulation
public class lab176 {
    public static void main(String[] args) {
        VMOlogin vmOlogin = new VMOlogin("password123", "admin");
        System.out.println(vmOlogin.password);
        vmOlogin.password="Arpit12345";// here there is no security any one can change password
        System.out.println(vmOlogin.password);
    }
}
class VMOlogin{
    public String username;
    public String password;

    public VMOlogin(String password, String username) {
        this.password = password;
        this.username = username;
    }
}
