// your class code goes here
class VipCustomer{
    public String name;
     public double creditLimit;
      public String email;

  
    VipCustomer(){
        this("XYZ",10,"xyz@abc.com");
    }

    VipCustomer(String name, double creditLimit){
        // this.name = name;
        // this.creditLimit = creditLimit;
        // this.email = "xyz@abc.com";
        this(name,creditLimit,"xyz@abc.com");
    }

      VipCustomer(String name, double creditLimit, String email){
       this.name = name;
       this.creditLimit = creditLimit ;
       this.email= email;
    }

    public  String getName(){
        return name;
    }
    public  double getCreditLimit(){
        return creditLimit;
    }

    public  String getEmail(){
        return email;
    }

    public static void main(String []args){
        VipCustomer obj = new VipCustomer();
    }
}
