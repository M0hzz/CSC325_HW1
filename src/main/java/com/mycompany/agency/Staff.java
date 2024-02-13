package com.mycompany.agency;




public class Staff
{
    private StaffMember[] staffList;

    //-----------------------------------------------------------------
    //  Constructor: Sets up the list of staff members.
    //-----------------------------------------------------------------
    public Staff()
    {
        staffList = new StaffMember[6];

        // Employee 1 - Assuming Executive due to high pay
        staffList[0] = new Executive("Moaath Alrajab", "25 New Tree Line", "516-101-3131", "000-000-1234", 21900.5);
        // Employee 2 - Assuming StaffEmployee
        staffList[1] = new StaffEmployee("John", "456 Off Line", "516-555-0101", "516-65-4321", 1546.15);
        // Employee 3 - Assuming StaffEmployee
        staffList[2] = new StaffEmployee("William", "789 Off Rocker", "516-555-0000", "631-20-3040", 1669.23);
        // Employee 4 - Assuming TempEmploee due to hourly rate indication
        staffList[3] = new TempEmploee("Sam", "678 Fifth Ave.", "516-555-0690", "516-47-3625", 622.0 / 40); // Assuming pay rate is total paid divided by hours
        // Employee 5 - Assuming Intern (no pay specified)
        staffList[4] = new Intern("Alex", "987 Wood Blvd.", "516-555-8374");
        // Employee 6 - Assuming Intern (no pay specified)
        staffList[5] = new Intern("Ahmad", "321 Elm Lane", "516-555-7282");

        // Assuming Executive class has a method to award bonus, and it's relevant
        // Not applying bonus as no bonus details were provided

        // For TempEmploee, adding hours worked
        ((TempEmploee)staffList[3]).addHours(40);
    }

    //-----------------------------------------------------------------
    //  Pays all staff members.
    //-----------------------------------------------------------------
    public void payday ()
    {
        double amount;

        for (int count=0; count < staffList.length; count++)
        {
            System.out.println("Employee - "+ (count + 1));
            System.out.println(staffList[count]);

            amount = staffList[count].pay();  // polymorphic

            if (amount == 0.0)
                System.out.println("-- DONE ---!");
            else
                System.out.println("Paid: " + amount);

            System.out.println("+ + + + + + + + + + + + + + + + + + + + + + + + +");
        }
    }
}
