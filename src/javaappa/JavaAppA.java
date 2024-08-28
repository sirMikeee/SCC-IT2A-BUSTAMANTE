
package javaappa;

import java.util.Scanner;
public class JavaAppA {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Products[] pr = new Products[100];
        
        int nump, i;
        
        System.out.print("Enter no. of products: ");
        nump = sc.nextInt();
        
        
         for ( i = 0; i < nump; i++ ){
             System.out.println("Enter details of Product "+(i + 1)+": ");
             System.out.print("ID: ");
             int id = sc.nextInt();
             System.out.print("Name: ");
             String name = sc.next();
             System.out.print("Price: ");
             double pri = sc.nextDouble();
             System.out.print("Stock: ");
             int st = sc.nextInt();
             System.out.print("Sold: ");
             int sold = sc.nextInt();
             pr[i]= new Products();
             pr[i].addProducts(id, name, pri, st, sold);
             
         }
         
         for ( i = 0; i < nump; i++ ){
             pr[i].viewProducts();
         }
    }
}
