package com.softserve.edu08.pt;

public class Department implements Cloneable{
    private String name;
    private Address address = new Address();
    public Department(){
        name="";
    }
    public Department(String name,String city,String street,int building){
        this.name=name;
        this.address.city=city;
        this.address.street=street;
        this.address.building=building;

    }

    public void setCity(String city) {
        this.address.city=city;
    }

    public void showDepartment(){
        System.out.println("Info about department "+name+
                "\nCity:"+ address.city+
                "\nStreet:"+ address.street+
                "\nBuilding:"+ address.building+
                "\n***********************");
    }
    @Override
    protected Object clone() throws CloneNotSupportedException{
        Department copydep = (Department) super.clone();
        copydep.address = (Address) copydep.address.clone();
        return copydep;
    }
    public class Address implements Cloneable{
        private String city;
        private String street;
        private int building;

        @Override
        protected Object clone()throws CloneNotSupportedException{
            return super.clone();
        }

    }
}
