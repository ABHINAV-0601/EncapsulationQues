package data;

public class Customer {

    private String name;
    private String address;
    private long mobileNo;
    private String email;
    private boolean premiumMembership;

    Customer(){
        name = null;
        address = null;
        mobileNo = 0;
        email = null;
        premiumMembership = false;
    }

    Customer(String name,String address,long mobileNo,String email,boolean premiumMembership){
        this.name = name;
        this.address = address;
        this.mobileNo = mobileNo;
        this.email = email;
        this.premiumMembership = premiumMembership;
    }
}
