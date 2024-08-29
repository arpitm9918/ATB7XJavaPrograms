package aug_ex04082024;

import org.w3c.dom.ls.LSOutput;

public class lab169 {
    public static void main(String[] args) {
        ATBPerson p0 =new ATBPerson();
        ATBPerson p1 = new ATBPerson("Arpit");
        ATBPerson p2 = new ATBPerson("Mishra");
        ATBPerson p3= new ATBPerson("Rahul", 9414143872l);
        System.out.println(p0.Name);// OP Null because default constructor have passes . constructor not set any value
        System.out.println(p1.Name);
        System.out.println(p2.Name);
        System.out.println(p3.Name);
        System.out.println(p3.phone);

    }
}
