package august.ex10082024.encapsulation;

public class VMOLoginAr {
   private String UserName;
   private String Password;
   private String SignButton;

    public String getUserName() {
        return UserName;
    }

    public String getPassword() {
        return Password;
    }

    public String getSignButton() {
        return SignButton;
    }

    public void setUserName(String userName, boolean isAdmin ) {
        if(isAdmin){
        UserName = userName;
        }else{
            System.out.println("no");
        }
    }
}
