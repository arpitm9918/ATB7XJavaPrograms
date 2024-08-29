package aug_ex04082024;// lab 169 use this

public class ATBPerson {
    String Name;
    long phone;
//DC
     ATBPerson() {
        System.out.println("object created");
    }
    ATBPerson(String nameGiven){
         this.Name= nameGiven;
    }
    ATBPerson(String nameGiven, long phonenumberGiven){
         this.Name=nameGiven;
         this.phone= phonenumberGiven;

         //this mean current class
    }
}
