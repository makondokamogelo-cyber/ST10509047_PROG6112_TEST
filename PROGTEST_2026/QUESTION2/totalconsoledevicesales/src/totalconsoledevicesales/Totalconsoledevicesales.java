/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package totalconsoledevicesales;

import java.util.Scanner;

/**
 *
 * @author Student
 */
public class Totalconsoledevicesales {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       
        ConsoleSales sale1 = new ConsoleSales("PlayStation 5", "GameStop", 15000);
        sale1.printReport();
        
        System.out.println();
        
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("--- Enter New Sale Details ---");
        
        System.out.print("Enter console device type: ");
        String consoleType = scanner.nextLine();
        
        System.out.print("Enter store name: ");
        String storeName = scanner.nextLine();
        
        System.out.print("Enter total amount of sales: ");
        int totalSales = scanner.nextInt();
        
        
        ConsoleSales sale2 = new ConsoleSales(consoleType, storeName, totalSales);
        
        System.out.println("\n--- Generated Report ---");
        sale2.printReport();
        
        scanner.close();
    }
}

// ==========================================
// The required Interface
// ==========================================
interface IConsoles {
    String getConsoleType();
    String getStore();
    int getTotalSales();
}


abstract class Consoles implements IConsoles {
    
    private String consoleType;
    private String storeName;
    private int totalSales;

    
    public Consoles(String consoleType, String storeName, int totalSales) {
        this.consoleType = consoleType;
        this.storeName = storeName;
        this.totalSales = totalSales;
    }

    
    @Override
    public String getConsoleType() {
        return consoleType;
    }

    @Override
    public String getStore() {
        return storeName;
    }

    @Override
    public int getTotalSales() {
        return totalSales;
    }
}


class ConsoleSales extends Consoles {

    
    public ConsoleSales(String consoleType, String storeName, int totalSales) {
        super(consoleType, storeName, totalSales);
    }

    
    public void printReport() {
        System.out.println("CONSOLE SALES REPORT");
        System.out.println("-----------------------------------");
        System.out.println("Console Type : " + getConsoleType());
        System.out.println("Store Name   : " + getStore());
        System.out.println("Total Sales  : R" + getTotalSales());
        System.out.println("-----------------------------------");
    }
}