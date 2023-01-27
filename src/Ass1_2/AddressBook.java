/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ass1_2;

/**
 *
 * @author Dell
 */
public class AddressBook {
    public String pname;
    public String homeAddress;
    public String homePhoneno;
    public String businessAddress;
    public String businessPhoneno;
    public String faxMachineNumber;
    public String cellularPhoneno;
    public String pagerNumber;
    
    public AddressBook(String pname, String homeAddress, String homePhoneno, String businessAddress, String businessPhoneno, String faxMachineNumber, 
            String cellularPhoneno, String pagerNumber)
    {
        this.pname = pname;
        this.homeAddress = homeAddress;
        this.homePhoneno = homePhoneno;
        this.businessAddress = businessAddress;
        this.businessPhoneno = businessPhoneno;
        this.faxMachineNumber = faxMachineNumber;
        this.cellularPhoneno = cellularPhoneno;
        this.pagerNumber = pagerNumber;
    }
}
