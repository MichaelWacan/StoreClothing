/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.budstore;

import java.util.Scanner;

/**
 *
 * @author Acer Nitro
 */
public class Budstore {

   
    public static Scanner input = new Scanner(System.in);
    public static String again;
    public static int choose,quantity=1;
    public static double total=0,pay;
    public static void menu(){
    System.out.println("           Welcome to BudClothing             ");
    System.out.println("                                              ");
    System.out.println("              Oversized Tshirt                ");
                        //Brand Name Tshirt 
    System.out.println("   1. Nike                        Php.1000.00 ");
    System.out.println("   2. Adidas                      Php. 800.00 ");
    System.out.println("   3. Oxygen                      Php. 500.00 ");
    System.out.println("   4. Penshoppe                   Php  300.00 ");
    System.out.println("   5. Bench                       Php. 600.00 ");
    System.out.println("                                              ");
                       //Naay tay promo mga goys
    System.out.println("            Oversized Tshirt Promo!!          ");
    System.out.println(" 6. Promo a- Bracelet with budclothing sticker Php. 200.00 ");
    System.out.println(" 7. Promo b- Cap with budclothing sticker Php. 100.00      ");
    System.out.println(" 8. Cancel                                    ");
    System.out.println("                                              ");
                      //Naay tay discount run kay birthday run sa tag iya AHAHHAH!!
    System.out.println("               DISCOUNTS                      ");
    System.out.println(" 1. If the total cost is Php 2000+ - 10%      ");
    System.out.println(" 2. If the total cost is Php 1000+ - 5%       ");
    System.out.println("                                              ");
    }
    
   public static void order(){
    System.out.println(" Press 1 for Nike             ");
    System.out.println(" Press 2 for Adidas           ");
    System.out.println(" Press 3 for Oxygen           ");
    System.out.println(" Press 4 for Penshoppe        ");
    System.out.println(" Press 5 for Bench            ");
    System.out.println(" Press 6 for Promo 1          ");
    System.out.println(" Press 7 for Promo 2          ");
    System.out.println(" Press 8 to cancel            ");
    System.out.println(" Enter your order:            ");
    choose = input.nextInt();
        switch (choose) {
            //Nike 
            case 1:
                System.out.println(" You choose Nike ");
                System.out.print(" How many Nike Oversized Tshirt you want to Buy? :");
                quantity =input.nextInt();
                total = total +(quantity*1000);
                System.out.println(" Total cost: Php " + total);
                System.out.println("  ");
                System.out.println(" You want to buy another order? ");
                
                System.out.println(" Press 1 for Yes and 2 for No : ");
                again = input.next();
                if(again.equalsIgnoreCase("1")){
                    order();
                    }else{
                    System.out.println("   ");
                    System.out.println(" Php "+ total + " is your total cost ");
                    if (total>=2000){
                        System.out.println("  ");
                        System.out.println(" You have 10% discount ");  
                        double discount=total*.90;
                        System.out.println(" Your new total cost is Php " + discount +" *discounted " );
                        System.out.println(" Enter a payment: ");
                    pay = input.nextDouble();{
                    if(pay < discount){
                     do{
                        System.out.println(" Not enough payment!!! ");
                        System.out.println(" Enter payment again: ");
                        pay = input.nextDouble();
                        if (pay>=discount){
                        System.out.println(" Total price is Php " + discount);
                        System.out.println(" I received Php "+pay);
                           total = pay-discount;
                        System.out.println(" Your change is Php " + total);                      
                        break;  }
                        }while(true);}
                       else if (pay >=discount){
                        System.out.println(" Total price is Php " + discount);
                        System.out.println(" I received Php "+pay);
                        total = pay-discount;
                        System.out.println(" Your change is Php " + total);                        
                        break; } break; }
                    }
                else if (total>=1000 && total<=1999){
                    System.out.println(" You have 5% discount ");
                         double discount=total*.95;
                        System.out.println(" Your new total cost is Php " + discount + " *discounted " );
                        System.out.println(" Enter a payment: ");
                    pay = input.nextDouble();{
                     if(pay <discount){
                        do{
                        System.out.println(" Not enough payment!!! ");
                        System.out.println(" Enter payment again: ");
                        pay = input.nextDouble();
                        if (pay>=discount){         
                        System.out.println(" Total price is Php " + discount);
                        System.out.println(" I received Php "+pay);
                           total = pay-discount;
                        System.out.println(" Your change is Php " + total);                       
                        break;}
                        }while(true);}
                       else if (pay >=discount){
                        System.out.println(" Total price is Php " + discount);
                        System.out.println(" I received Php "+pay);
                        total = pay-discount;
                        System.out.println(" Your change is Php " + total);        
                        break;}  break; }
                    }
                else if (total<=999){
                    System.out.println(" Enter a payment: ");
                    pay = input.nextDouble();    
                    if(pay < total){
                         do{
                        System.out.println(" Not enough payment!!! ");
                        System.out.println(" Enter payment again: ");
                        pay = input.nextDouble();
                        if (pay>=total){        
                        System.out.println(" Total price is Php " + total);
                        System.out.println(" I received Php "+pay);
                           total = pay-total;
                        System.out.println(" Your change is Php " + total);         
                        break; }
                        }while(true);  }
                       else if (pay >=total){        
                        System.out.println(" Total price is Php " + total);
                        System.out.println(" I received Php "+pay);
                           total = pay-total;
                        System.out.println(" Your change is Php " + total);
                        break;}break; }
                    }
               // Adidas
               case 2:
                System.out.println(" You choose Adidas ");
                System.out.print(" How many Adidas Oversized Tshirt you want to Buy? : ");
                quantity =input.nextInt();
                total = total +(quantity*800);
                System.out.println(" Total cost: Php " + total);
                System.out.println("  ");
                System.out.println(" You want to buy another order? ");
                System.out.println(" Press 1 for Yes and 2 for No : ");
                again = input.next();
                if(again.equalsIgnoreCase("1")){
                    order();
                }else{
                    System.out.println("   ");
                    System.out.println(" Php "+ total + " is your total cost ");
                    if (total>=2000){
                        System.out.println("  ");
                        System.out.println(" You have 10% discount "); 
                        double discount=total*.90;
                        System.out.println(" Your new total cost is Php " + discount + " *discounted ");
                        System.out.println(" Enter a payment: ");
                    pay = input.nextDouble();{
                    if(pay < discount){
                          do{
                        System.out.println(" Not enough payment!!! ");
                        System.out.println(" Enter payment again: ");
                        pay = input.nextDouble();
                        if (pay>=discount){        
                        System.out.println(" Total price is Php " + discount);
                        System.out.println(" I received Php "+pay);
                           total = pay-discount;
                        System.out.println(" Your change is Php " + total);    
                        break;}
                        }while(true);}
                       else if (pay >=discount){    
                        System.out.println(" Total price is Php " + discount);
                        System.out.println(" I received Php "+pay);
                        total = pay-discount;
                        System.out.println(" Your change is Php " + total);   
                        break; } break;}
                    }
                else if (total>=1000 && total<=1999){
                    System.out.println(" You have 5% discount ");
                        double discount=total*.95;
                        System.out.println(" Your total discounted cost is Php " + discount + " *discounted " );
                        System.out.println(" Enter a payment: ");
                    pay = input.nextDouble();{
                     if(pay <discount){
                          do{
                        System.out.println(" Not enough payment!!! ");
                        System.out.println(" Enter payment again: ");
                        pay = input.nextDouble();
                        if (pay>=discount){        
                        System.out.println(" Total price is Php " + discount);
                        System.out.println(" I received Php "+pay);
                           total = pay-discount;
                        System.out.println(" Your change is Php " + total);   
                        break; }
                        }while(true); }
                        else if (pay >=discount){
                        System.out.println(" Total price is Php " + discount);
                        System.out.println(" I received Php "+pay);
                        total = pay-discount;
                        System.out.println(" Your change is Php " + total);  
                        break;} break;}
                    }
                 else if (total<=999){
                        System.out.println(" Enter a payment: ");
                        pay = input.nextDouble();
                         if(pay <total){
                        do{
                        System.out.println(" Not enough payment!!! ");
                        System.out.println(" Enter payment again: ");
                        pay = input.nextDouble();
                        if (pay>=total){        
                        System.out.println(" Total price is Php " + total);
                        System.out.println(" I received Php "+pay);
                           total = pay-total;
                        System.out.println(" Your change is Php " + total);   
                        break;}
                        }while(true);}
                       else if (pay >=total){
                        System.out.println(" Total price is Php " + total);
                        System.out.println(" I received Php "+pay);
                           total = pay-total;
                        System.out.println(" Your change is Php " + total);
                        break;  }break;}
                   }
            //Oxygen   
            case 3:
                System.out.println(" You choose Oxygen ");
                System.out.print(" How many Oxygen Oversized Tshirt you want to Buy? :");
                quantity =input.nextInt();
                total = total +(quantity*500);
                System.out.println(" Total cost: Php " + total);
                System.out.println("  ");
                System.out.println(" You want to buy another order? ");
                System.out.println(" Press 1 for Yes and 2 for No : ");
                again = input.next();
                if(again.equalsIgnoreCase("1")){
                    order();
                }else{
                    System.out.println("   ");
                    System.out.println(" Php "+ total + " is your total cost ");
                    if (total>=2000){
                        System.out.println("  ");
                        System.out.println(" You have 10% discount ");
                        double discount=total*.90;
                        System.out.println(" Your new total cost is Php " + discount +" *discounted " );
                        System.out.println(" Enter a payment: ");
                    pay = input.nextDouble();{
                    if(pay < discount){
                        do{
                        System.out.println(" Not enough payment!!! ");
                        System.out.println(" Enter payment again: ");
                        pay = input.nextDouble();
                        if (pay>=discount){        
                        System.out.println(" Total price is Php " + discount);
                        System.out.println(" I received Php "+pay);
                           total = pay-discount;
                        System.out.println(" Your change is Php " + total);  
                        break;}
                       }while(true); }
                       else if (pay >=discount){
                        System.out.println(" Total price is Php " + discount);
                        System.out.println(" I received Php "+pay);
                        total = pay-discount;
                        System.out.println(" Your change is Php " + total); 
                        break;} break; }
                    }
                else if (total>=1000 && total<=1999){
                    System.out.println(" You have 5% discount ");  
                        double discount=total*.95;
                        System.out.println(" Your new total cost is Php " + discount + " *discounted " );
                        System.out.println(" Enter a payment: ");
                    pay = input.nextDouble();{
                     if(pay < discount){ 
                        do{
                        System.out.println(" Not enough payment!!! ");
                        System.out.println(" Enter payment again: ");
                        pay = input.nextDouble();
                        if (pay>=discount){         
                        System.out.println(" Total price is Php " + discount);
                        System.out.println(" I received Php "+pay);
                           total = pay-discount;
                        System.out.println(" Your change is Php " + total);   
                        break;}
                        }while(true); }
                     else if (pay >=discount){    
                        System.out.println(" Total price is Php " + discount);
                        System.out.println(" I received Php "+pay);
                        total = pay-discount;
                        System.out.println(" Your change is Php " + total); 
                        break;   }  break; }
                    }
                else if (total<=999){
                    System.out.println(" Enter a payment: ");
                    pay = input.nextDouble();   
                    if(pay < total){ 
                        do{
                        System.out.println(" Not enough payment!!! ");
                        System.out.println(" Enter payment again: ");
                        pay = input.nextDouble();
                        if (pay>=total){         
                        System.out.println(" Total price is Php " + total);
                        System.out.println(" I received Php "+pay);
                           total = pay-total;
                        System.out.println(" Your change is Php " + total);
                        break;}
                        }while(true); }
                       else if (pay >=total){    
                        System.out.println(" Total price is Php " + total);
                        System.out.println(" I received Php "+pay);
                           total = pay-total;
                        System.out.println(" Your change is Php " + total);     
                        break; }break;}
                    }
            //Penshoppe
            case 4:
               System.out.println(" You choose Penshoppe ");
                System.out.print(" How many Penshopper Oversized Tshirt you want to Buy? :");
                quantity =input.nextInt();
                total = total +(quantity*300);
                System.out.println(" Total cost: Php " + total);
                System.out.println("  ");
                System.out.println(" You want to buy another order? "); 
                System.out.println(" Press 1 for Yes and 2 for No : ");
                again = input.next();
                if(again.equalsIgnoreCase("1")){
                    order();
                }else{
                    System.out.println("   ");
                    System.out.println(" Php "+ total + " is your total cost ");
                    if (total>=2000){
                        System.out.println("  ");
                        System.out.println(" You have 10% discount ");
                        double discount=total*.90;
                        System.out.println(" Your new total cost is Php " + discount +" *discounted " );
                        System.out.println(" Enter a payment: ");
                    pay = input.nextDouble();{
                    if(pay < discount){
                        do{
                        System.out.println(" Not enough payment!!! ");
                        System.out.println(" Enter payment again: ");
                        pay = input.nextDouble();
                        if (pay>=discount){        
                        System.out.println(" Total price is Php " + discount);
                        System.out.println(" I received Php "+pay);
                          total = pay-discount;
                        System.out.println(" Your change is Php " + total); 
                        break; }
                        }while(true);   }
                     else if (pay >=discount){     
                        System.out.println(" Total price is Php " + discount);
                        System.out.println(" I received Php "+pay);
                        total = pay-discount;
                        System.out.println(" Your change is Php " + total);
                        break; }  break; }
                    }
                else if (total>=1000 && total<=1999){
                    System.out.println(" You have 5% discount ");
                        double discount=total*.95;
                        System.out.println(" Your new total cost is Php " + discount + " *discounted " );
                        System.out.println(" Enter a payment: ");
                    pay = input.nextDouble();{
                     if(pay < discount){
                        do{
                        System.out.println(" Not enough payment!!! ");
                        System.out.println(" Enter payment again: ");
                        pay = input.nextDouble();
                        if (pay>=discount){         
                        System.out.println(" Total price is Php " + discount);
                        System.out.println(" I received Php "+pay);
                           total = pay-discount;
                        System.out.println(" Your change is Php " + total); 
                        break; }
                        }while(true); }
                     else if (pay >=discount){    
                        System.out.println(" Total price is Php " + discount);
                        System.out.println(" I received Php "+pay);
                        total = pay-discount;
                        System.out.println(" Your change is Php " + total);  
                        break;  }  break; }
                    }
                else if (total<=999){ 
                    System.out.println(" Enter a payment: ");
                    pay = input.nextDouble();   
                    if(pay < total){ 
                        do{
                        System.out.println(" Not enough payment!!! ");
                        System.out.println(" Enter payment again: ");
                        pay = input.nextDouble();
                        if (pay>=total){         
                        System.out.println(" Total price is Php " + total);
                        System.out.println(" I received Php "+pay);
                          total = pay-total;
                        System.out.println(" Your change is Php " + total);    
                        break;  }
                        }while(true);}
                       else if (pay >=total){      
                        System.out.println(" Total price is Php " + total);
                        System.out.println(" I received Php "+pay);
                           total = pay-total;
                        System.out.println(" Your change is Php " + total);  
                        break;  } break; } 
                    }
            //Bench
            case 5:
               System.out.println(" You choose Bench ");
                System.out.print(" How many Bench Oversized Tshirt you want to Buy? :");
                quantity =input.nextInt();
                total = total +(quantity*600);
                System.out.println(" Total cost: Php " + total);
                System.out.println("  ");
                System.out.println(" You want to buy another order? "); 
                System.out.println(" Press 1 for Yes and 2 for No : ");
                again = input.next();
                if(again.equalsIgnoreCase("1")){
                    order();}else{
                    System.out.println("   ");
                    System.out.println(" Php "+ total + " is your total cost ");
                    if (total>=2000){
                        System.out.println("  ");
                        System.out.println(" You have 10% discount ");
                        double discount=total*.90;
                        System.out.println(" Your new total cost is Php " + discount +" *discounted " );
                        System.out.println(" Enter a payment: ");
                    pay = input.nextDouble();{
                    if(pay < discount){
                        do{
                        System.out.println(" Not enough payment!!! ");
                        System.out.println(" Enter payment again: ");
                        pay = input.nextDouble();
                        if (pay>=discount){        
                        System.out.println(" Total price is Php " + discount);
                        System.out.println(" I received Php "+pay);
                           total = pay-discount;
                        System.out.println(" Your change is Php " + total); 
                        break; }
                        }while(true); }
                     else if (pay >=discount){  
                        System.out.println(" Total price is Php " + discount);
                        System.out.println(" I received Php "+pay);
                        total = pay-discount;
                        System.out.println(" Your change is Php " + total);
                        break;}  break;     } }
                else if (total>=1000 && total<=1999){
                    System.out.println(" You have 5% discount ");
                        double discount=total*.95;
                        System.out.println(" Your new total cost is Php " + discount + " *discounted " );
                        System.out.println(" Enter a payment: ");
                    pay = input.nextDouble();{
                     if(pay < discount){
                        do{
                        System.out.println(" Not enough payment!!! ");
                        System.out.println(" Enter payment again: ");
                        pay = input.nextDouble();
                        if (pay>=discount){        
                        System.out.println(" Total price is Php " + discount);
                        System.out.println(" I received Php "+pay);
                           total = pay-discount;
                        System.out.println(" Your change is Php " + total); 
                        break; }
                        }while(true); }
                     else if (pay >=discount){      
                        System.out.println(" Total price is Php " + discount);
                        System.out.println(" I received Php "+pay);
                        total = pay-discount;
                        System.out.println(" Your change is Php " + total);
                        break; }  break;   }
                    }
                else if (total<=999){ 
                    System.out.println(" Enter a payment: ");
                    pay = input.nextDouble();  
                    if(pay < total){
                        do{
                        System.out.println(" Not enough payment!!! ");
                        System.out.println(" Enter payment again: ");
                        pay = input.nextDouble();
                        if (pay>=total){       
                        System.out.println(" Total price is Php " + total);
                        System.out.println(" I received Php "+pay);
                           total = pay-total;
                        System.out.println(" Your change is Php " + total);
                        break;  }
                        }while(true);  }
                       else if (pay >=total){     
                        System.out.println(" Total price is Php " + total);
                        System.out.println(" I received Php "+pay);
                           total = pay-total;
                        System.out.println(" Your change is Php " + total);
                        break;    } break; }
                    }
                //Promo a 
                case 6:
                System.out.println(" You choose Promo a- Bracelet with budclothing sticker ");
                System.out.print(" How many Promo a- Bracelet with budclothing sticker you want to Buy? :");
                quantity =input.nextInt();
                total = total +(quantity*120);
                System.out.println(" Total cost: Php " + total);
                System.out.println("  ");
                System.out.println(" You want to buy another order? ");
                System.out.println(" Press 1 for Yes and 2 for No : ");
                again = input.next();
                if(again.equalsIgnoreCase("1")){
                    order();
                }else{
                    System.out.println("   ");
                    System.out.println(" Php "+ total + " is your total cost ");
                    if (total>=2000){
                        System.out.println("  ");
                        System.out.println(" You have 10% discount ");
                        double discount=total*.90;
                        System.out.println(" Your new total cost is Php " + discount +" *discounted " );
                        System.out.println(" Enter a payment: ");
                    pay = input.nextDouble();{
                    if(pay < discount){
                        do{
                        System.out.println(" Not enough payment!!! ");
                        System.out.println(" Enter payment again: ");
                        pay = input.nextDouble();
                        if (pay>=discount){         
                        System.out.println(" Total price is Php " + discount);
                        System.out.println(" I received Php "+pay);
                           total = pay-discount;
                        System.out.println(" Your change is Php " + total);
                        break; }
                        }while(true);}
                     else if (pay >=discount){   
                        System.out.println(" Total price is Php " + discount);
                        System.out.println(" I received Php "+pay);
                        total = pay-discount;
                        System.out.println(" Your change is Php " + total);
                        break;  }  break; }
                   }
                else if (total>=1000 && total<=1999){
                    System.out.println(" You have 5% discount ");  
                        double discount=total*.95;
                        System.out.println(" Your new total cost is Php " + discount + " *discounted " );
                        System.out.println(" Enter a payment: ");
                    pay = input.nextDouble();{
                     if(pay < discount){  
                        do{
                        System.out.println(" Not enough payment!!! ");
                        System.out.println(" Enter payment again: ");
                        pay = input.nextDouble();
                        if (pay>=discount){          
                        System.out.println(" Total price is Php " + discount);
                        System.out.println(" I received Php "+pay);
                           total = pay-discount;
                        System.out.println(" Your change is Php " + total);
                        break; }
                        }while(true);  }
                     else if (pay >=discount){    
                        System.out.println(" Total price is Php " + discount);
                        System.out.println(" I received Php "+pay);
                        total = pay-discount;
                        System.out.println(" Your change is Php " + total); 
                        break; } break; }
                    }
                else if (total<=999){
                    System.out.println(" Enter a payment: ");
                    pay = input.nextDouble();   
                    if(pay < total){
                        do{
                        System.out.println(" Not enough payment!!! ");
                        System.out.println(" Enter payment again: ");
                        pay = input.nextDouble();
                        if (pay>=total){        
                        System.out.println(" Total price is Php " + total);
                        System.out.println(" I received Php "+pay);
                           total = pay-total;
                        System.out.println(" Your change is Php " + total);
                        
                        break;}
                        }while(true); }
                       else if (pay >=total){    
                        System.out.println(" Total price is Php " + total);
                        System.out.println(" I received Php "+pay);
                           total = pay-total;
                        System.out.println(" Your change is Php " + total);
                        
                        break;   } break; }
                }
                //Promo b
                case 7:
                System.out.println(" You choose Promo b- Cap with budclothing sticker ");
                System.out.print(" How many Promo b- Cap with budclothing sticker you want to Buy? :");
                quantity =input.nextInt();
                total = total +(quantity*90);
                System.out.println(" Total cost: Php " + total);
                System.out.println("  ");
                System.out.println(" You want to buy another order? ");
                System.out.println(" Press 1 for Yes and 2 for No : ");
                again = input.next();
                if(again.equalsIgnoreCase("1")){
                    order();
                }else{
                    System.out.println("   ");
                    System.out.println(" Php "+ total + " is your total cost ");
                    if (total>=2000){
                        System.out.println("  ");
                        System.out.println(" You have 10% discount "); 
                        double discount=total*.90;
                        System.out.println(" Your new total cost is Php " + discount +" *discounted " );
                        System.out.println(" Enter a payment: ");
                    pay = input.nextDouble();{
                    if(pay < discount){
                        do{
                        System.out.println(" Not enough payment!!! ");
                        System.out.println(" Enter payment again: ");
                        pay = input.nextDouble();
                        if (pay>=discount){         
                        System.out.println(" Total price is Php " + discount);
                        System.out.println(" I received Php "+pay);
                           total = pay-discount;
                        System.out.println(" Your change is Php " + total);
                        break;     }
                        }while(true);   }                      
                     else if (pay >=discount){   
                        System.out.println(" Total price is Php " + discount);
                        System.out.println(" I received Php "+pay);
                        total = pay-discount;
                        System.out.println(" Your change is Php " + total);  
                        break; } break; }
                    }
                else if (total>=1000 && total<=1999){
                    System.out.println(" You have 5% discount ");
                        double discount=total*.95;
                        System.out.println(" Your new total cost is Php " + discount + " *discounted " );
                        System.out.println(" Enter a payment: ");
                    pay = input.nextDouble();{
                     if(pay < discount){
                        do{
                        System.out.println(" Not enough payment!!! ");
                        System.out.println(" Enter payment again: ");
                        pay = input.nextDouble();
                        if (pay>=discount){        
                        System.out.println(" Total price is Php " + discount);
                        System.out.println(" I received Php "+pay);
                           total = pay-discount;
                        System.out.println(" Your change is Php " + total); 
                        break; }
                        }while(true); }
                     else if (pay >=discount){   
                        System.out.println(" Total price is Php " + discount);
                        System.out.println(" I received Php "+pay);
                        total = pay-discount;
                        System.out.println(" Your change is Php " + total);
                        break; }   break;}
                    }
                else if (total<=999){
                    System.out.println(" Enter a payment: ");
                    pay = input.nextDouble();    
                    if(pay < total){
                        do{
                        System.out.println(" Not enough payment!!! ");
                        System.out.println(" Enter payment again: ");
                        pay = input.nextDouble();
                        if (pay>=total){        
                        System.out.println(" Total price is Php " + total);
                        System.out.println(" I received Php "+pay);
                           total = pay-total;
                        System.out.println(" Your change is Php " + total);
                        break;}
                        }while(true); }
                       else if (pay >=total){  
                        System.out.println(" Total price is Php " + total);
                        System.out.println(" I received Php "+pay);
                           total = pay-total;
                        System.out.println(" Your change is Php " + total);
                         break; }  break; }
                }
                //Exit 
                 case 8:
                    System.exit(0);    
                default:      
                break;         }
       System.out.println(" Thank you for buying! ");
       System.out.println("                       ");
       System.out.println(" For the next customer please press 1: ");
       System.out.println(" To exit please press 2: ");
                again = input.next();
                if(again.equalsIgnoreCase("1")){
                    total=total-total;
                    order();    }
                else{
                    System.exit(0);}
   }
    public static void main(String[] args) {
        menu();
       order();
    }   
    }
    
    
