/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ass1_4;

import java.util.Hashtable;
import java.util.Scanner;

/**
 *
 * @author Dell
 */
public class DataTable implements IFeaturable {
    
    Scanner sc = new Scanner(System.in);
    static String foreground;
    static String background;
    static int font;
    static int rows, columns;
    static int values[] = null;

    @Override
    public void foreground() {
        System.out.println("Enter the color that you prefer for your table texts: ");
        foreground = sc.next();
    }

    @Override
    public void background() {
        System.out.println("Enter the background color for your table: ");
        background = sc.next();
    }

    @Override
    public void font() {
        System.out.println("Enter the font for your table text: ");
        font = sc.nextInt();
    }
    
    public static void main(String[] args) throws tblException{
        DataTable dt = new DataTable();
        int choice;
        Scanner sc1 = new Scanner(System.in);
        Hashtable<String, String> ht1 = new Hashtable<String, String>();
        do{
            System.out.println("--------------------------------------------------------------------------------------");
            System.out.println("Select Your choice: ");
            System.out.println("1. Create a table");
            System.out.println("2. Add values in a table");
            System.out.println("3. Set foreground, background and font size for the table");
            System.out.println("4. Edit rows and columns in a table");
            System.out.println("5. Delete rows and columns in a table");
            System.out.println("6. Show the Hashtable");
            System.out.println("7. Exit");
            System.out.println("--------------------------------------------------------------------------------------");
            choice = sc1.nextInt();
            
            switch(choice){
                case 1:
                    System.out.println("Enter rows for the table: ");
                    rows = sc1.nextInt();
                    
                    if(rows > 200){
                        throw new tblException("Rows can not be more than 200!!!");
                    }
                    
                    System.out.println("Enter colums for the table: ");
                    columns = sc1.nextInt();
                    
                    if(columns > 200){
                        throw new tblException("Coulmns can not be more than 200!!!");
                    }
                    
                    ht1.put("Rows", Integer.toString(rows));
                    ht1.put("Columns", Integer.toString(columns));
                    break;
                    
                case 2:
                    System.out.println("Enter values in cell: ");
                    int length = rows * columns;
                    values = new int[length];
                    
                    for(int i = 0; i < length; i++){
                        System.out.println("Enter the value for " + i);
                        values[i] = sc1.nextInt();
                    }
                    break;
                    
                case 3:
                    dt.foreground();
                    ht1.put("Foreground", foreground);
                    
                    dt.background();
                    ht1.put("Background", background);
                    
                    dt.font();
                    ht1.put("Font", Integer.toString(font));
                    
                    break;
                    
                case 4:
                    System.out.println("There are total " + rows + " rows in a table.");
                    System.out.println("How many more rows do you want to add ? ");
                    int editRow = sc1.nextInt();
                    rows = rows + editRow;
                    
                    if(rows > 200){
                        throw new tblException("Rows can not be more than 200!!!");
                    }
                    
                    System.out.println("There are total " + columns + " coulmns in a table.");
                    System.out.println("How many more coulmns do you want to add ? ");
                    int editColumn= sc1.nextInt();
                    columns = columns + editColumn;
                    
                    if(columns > 200){
                        throw new tblException("Coulmns can not be more than 200!!!");
                    }
                    
                    ht1.put("Rows", Integer.toString(rows));
                    ht1.put("Columns", Integer.toString(columns));
                    
                    break;
                    
                case 5:
                    System.out.println("There are total " + rows + " rows in a table.");
                    System.out.println("How many rows do you want to delete ? ");
                    int deleteRow = sc1.nextInt();
                    rows = rows - deleteRow;
                    
                    if(deleteRow > rows){
                        throw new tblException("You are trying to delete more than the existing rows!!!");
                    }
                    
                    System.out.println("There are total " + columns + " coulmns in a table.");
                    System.out.println("How many coulmns do you want to delete ? ");
                    int deleteColumn = sc1.nextInt();
                    columns = columns - deleteColumn;
                    
                    if(deleteColumn > columns){
                        throw new tblException("You are trying to delete more than the existing coulms!!!");
                    }
                    
                    ht1.put("Rows", Integer.toString(rows));
                    ht1.put("Columns", Integer.toString(columns));
                    
                    break;
                    
                case 6:
                    System.out.println("HashTable: " + ht1);
                    break;
                    
                case 7:
                    break;
            }
        }while(choice != 7);
    }
}
