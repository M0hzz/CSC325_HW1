package com.mycompany.agency;



// TODO 1: Make this class work and public
 class StaffMember
{
    private String name;
    private String address;
    private String phone;
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
    //-----------------------------------------------------------------
    //  Constructor: Sets up this staff member using the specified
    //  information.
    //-----------------------------------------------------------------
    public StaffMember(String eName, String eAddress, String ePhone)
    {
        setName(eName);
        setAddress(eAddress);
        setPhone(ePhone);
    }

    //-----------------------------------------------------------------
    // TODO 2: Returns a string including the basic employee information.
    //-----------------------------------------------------------------
    public String toString()
    {
        String result = "Name: " + getName() + "\n" + "Address: " + getAddress() + "\n" + "Phone: " + getPhone()+ "\n";
        return result;

    }

    //-----------------------------------------------------------------
    //  Derived classes must define the pay method for each type of
    //  employee.
    //-----------------------------------------------------------------
    public double pay() {
        return 0;
    }


}
