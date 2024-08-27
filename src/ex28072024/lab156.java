package ex28072024;

public class lab156 {
    public static void main(String[] args) {

        //Class have Attribute/properties main - data typew --primitive and nonprimitive
        //Class have Behaviour.method/function
        //Object --> Real entity created from class

        //Syntax to create object:-
        // ClassName classreference - new ClassName();
        // new ClassName();is a object
        //clasreference=clasreference
        // ClassName= ClassName it will be the blueprint you will use
        BuildingBluePrint DLF= new BuildingBluePrint();
        DLF.Name="DLF";
        DLF.Address="Noida";
        DLF.Color="White";
        DLF.Numbersofrooms=100;

        DLF.uselift();
        BuildingBluePrint prestige= new BuildingBluePrint();
        prestige.Name="DLF";
        prestige.Address="Noida";
        prestige.Color="White";
        prestige.Numbersofrooms=100;
        prestige.activities();

    }
}
