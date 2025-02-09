/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entities;

/**
 *
 * Ntshangase
 * Ntokozo
 * 4123601
 * CSC211 2022 Practical 2
 * Singly linked list Citizen class
 */

public class Citizen 
{
    private String citizenID;
    private String citizenName;
    private String citizenSurname;
    private String citizenCellNumber;
    private int registrationDay;
    private int registrationMonth;
    private int registrationYear;

    public Citizen(String citizenID, String citizenName, String citizenSurname, String citizenCellNumber, int registrationDay, int registrationMonth, int registrationYear) 
    {
        this.citizenID = citizenID;
        this.citizenName = citizenName;
        this.citizenSurname = citizenSurname;
        this.citizenCellNumber = citizenCellNumber;
        this.registrationDay = registrationDay;
        this.registrationMonth = registrationMonth;
        this.registrationYear = registrationYear;
    }

    public String getCitizenID() 
    {
        return citizenID;
    }

    public void setCitizenID(String citizenID) 
    {
        this.citizenID = citizenID;
    }

    public String getCitizenName() 
    {
        return citizenName;
    }

    public void setCitizenName(String citizenName) 
    {
        this.citizenName = citizenName;
    }

    public String getCitizenSurname() 
    {
        return citizenSurname;
    }

    public void setCitizenSurname(String citizenSurname) 
    {
        this.citizenSurname = citizenSurname;
    }

    public String getCitizenCellNumber() 
    {
        return citizenCellNumber;
    }

    public void setCitizenCellNumber(String citizenCellNumber) 
    {
        this.citizenCellNumber = citizenCellNumber;
    }

    public int getRegistrationDay() 
    {
        return registrationDay;
    }

    public void setRegistrationDay(int registrationDay) 
    {
        this.registrationDay = registrationDay;
    }

    public int getRegistrationMonth() 
    {
        return registrationMonth;
    }

    public void setRegistrationMonth(int registrationMonth) 
    {
        this.registrationMonth = registrationMonth;
    }

    public int getRegistrationYear() 
    {
        return registrationYear;
    }

    public void setRegistrationYear(int registrationYear) 
    {
        this.registrationYear = registrationYear;
    }

    @Override
    public String toString() 
    {
        return "Citizen{" + "citizenID=\t" + citizenID + 
                "\ncitizenName citizenSurname\t" + citizenName + " " +  citizenSurname + 
                "\ncitizenCellNumber=" + citizenCellNumber + 
                "\nregistrationDay=" + registrationDay + 
                "\nregistrationMonth=" + registrationMonth + 
                "\nregistrationYear=" + registrationYear + '}';
    }
}
