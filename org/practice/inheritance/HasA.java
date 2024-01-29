package org.practice.inheritance;

//  => Aggregation: If a class have  entity reference, it is known as Aggregation. It represents Has-A relationship
//      ex. Employee class has name,emailId,id and address which address contains its own information like city,state,pincode

//      so, Employee has an entity reference address, so relationship is Employee Has-A address
//   - it is used for code re-usability

 class EmployeeDetails{
    String name;
    String email;

    Address address;

    public EmployeeDetails(String name,String email,Address address){

        this.name=name;
        this.email=email;
        this.address=address;

    }

    void display(){
        System.out.println("Employee name and email is " +name +", " +email);
        System.out.println("Employee Address is; " +address.city +" and the pincode is " +address.pincode);
    }
}

class Address{
     String city;
     String pincode;

     public Address(String city,String pincode){
         this.city=city;
         this.pincode=pincode;
     }
}
public class HasA {
    public static void main(String[] args) {
        Address address= new Address("Vishakapatnam","534321");
        EmployeeDetails details = new EmployeeDetails("Durgaprasad","durga@gmail",address);

        details.display();
    }
}
