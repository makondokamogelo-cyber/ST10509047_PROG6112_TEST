/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package yearlysales;

/**
 *
 * @author Student
 */
public class Yearlysales {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Declare and initialize a single-dimensional array of the cities
        
        String[] cities = {"CAPE TOWN", "PORT ELIZABETH", "PRETORIA"};
        
        //Declare and initialize a 2D array for the sales

        int[][] salesData = {
            {1000, 2000, 3000}, // Cape Town
            {2000, 3000, 4000}, // Port Elizabeth
            {1500, 1100, 1200}  // Pretoria
        };
        
        //Display the first section of the report
        System.out.println("----------------------------------------------------------");
        System.out.println("GAMING CONSOLE REPORT");
        System.out.println("----------------------------------------------------------");
        System.out.printf("%-15s %-13s %-13s %-13s%n", "", "PS5", "XBOX", "SWITCH");
        
        for (int i = 0; i < cities.length; i++) {
            System.out.printf("%-15s %-13d %-13d %-13d%n", 
                              cities[i], salesData[i][0], salesData[i][1], salesData[i][2]);
        }
        
        System.out.println();
        
        //Calculate totals for the cities and find the city with the most sales
        int[] cityTotals = new int[cities.length];
        int maxSales = 0;
        String cityWithMostSales = "";
        
        for (int i = 0; i < salesData.length; i++) {
            int rowTotal = 0;
            for (int j = 0; j < salesData[i].length; j++) {
                rowTotal += salesData[i][j];
            }
            cityTotals[i] = rowTotal;
            
            // Check if this city has the most sales so far
            if (rowTotal > maxSales) {
                maxSales = rowTotal;
                cityWithMostSales = cities[i];
            }
        }
        
        //Display Totals for each city
        System.out.println("----------------------------------------------------------");
        System.out.println("CONSOLE SALES TOTALS FOR EACH CITY");
        System.out.println("----------------------------------------------------------");
        
        for (int i = 0; i < cities.length; i++) {
            System.out.printf("%-15s %d%n", cities[i], cityTotals[i]);
        }
        
        //Print the final section (City with the most sales)
        System.out.println("\nCITY WITH THE MOST SALES: " + cityWithMostSales);
        System.out.println("----------------------------------------------------------");
        
    }
    
}