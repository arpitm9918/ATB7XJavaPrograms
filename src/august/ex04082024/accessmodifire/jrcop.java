package august.ex04082024.accessmodifire;

public class jrcop {
    public static void main(String[] args) {
        cop jrcop = new cop(10);
        jrcop.CanIShoot();// if this is private then it is not acceaaible
        // But if this is protected then it is accessible to jrcop but not for thief
        // Protected means you can access if function in same package
        // here cop and jrcop in same pacjage or folder that's why both can acess
        //thief is in other folder that's why he can't use
        //Private mean within the class
        //protected mean within the folder
    }
}
