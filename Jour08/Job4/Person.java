package Jour08.Job4;

public abstract class Person {
    
    protected String identity;
    protected String corporateName;
    protected String address;

    protected Person(String identity, String corporateName, String address){
        this.identity = identity;
        this.corporateName = corporateName;
        this.address = address;
    }

    protected void setIdentity(String identity){
        this.identity = identity;
    }

    protected void setCorporateName(String corporateName){
        this.corporateName = corporateName;
    }

    protected void setAddress(String address){
        this.address = address;
    }

    protected String getIdentity(){
        return this.identity;
    }

    protected String getCorporateName(){
        return this.corporateName;
    }

    protected String getAddress(){
        return this.address;
    }

    protected String display(){
        return "Identity: " + this.identity + 
                "\nCorporate Name: " + this.corporateName + 
                "\nAddress: " + this.address;
    }
}