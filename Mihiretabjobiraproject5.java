/* This program is designed for outer bank excursions

to take an input of the store location , date , tax rate

and for each excursion the guide number and excursion

the guide number and excursion amount from an associate and prints

the summary for the whole day transactions, excursion amount,

the tax amount, store total transaction amount.

Author: Mihiretab Jobira

Date : 11-12-2017

*/
import java.text.DecimalFormat;
import java.util.*;

import java.io.*;

public class Mihiretabjobiraproject5

{

public static void main(String args[]) throws IOException

   {

       //  storetransaction savedkilldevilinfo = new storetransaction();
               
               double ToTxAmt=0;
               
               double AvExAmt=0;
               
               double HiTrAmt=0;
               
               int HiGn=0;
               
               double AvgExAmt=0;
               
               String SLString = "";
               
               String DString = "";
               
               float Tx=0;
               
               double ToExAmt=0;
            
               int ToTrCt=0;
               
               String store ="";
               
               Scanner userinput = new Scanner(System.in);
               
         DecimalFormat df = new DecimalFormat("0.##");
         int[] GN = {11, 12,17,18,13,16,17,19};
         double[] ExAmt = {650.99,1090.99,415.99,1900.99,990.99,1900.99,135.99,415.99};
         double[] TxAmt = new double[8];
         double[] TrAmt = new double[8];
         double[] ToTrAmt = new double[8];
         

                     System.out.println("Please Enter Store location");
                     
                     SLString = userinput.nextLine();
                     
                     System.out.println("please Enter the DATE");
                     
                     DString = userinput.nextLine();
                     
                     System.out.println("please Enter the tax rate");
                     
                     Tx = userinput.nextFloat();
                     

                  
        
         for(int index=0; index < 8; index++)
               {
                  System.out.println("Please enter excursion amount");
                  ExAmt[index] = userinput.nextDouble();
                  
                  System.out.println("please Enter the Guide Number");
                  GN[index] = userinput.nextInt();
                  
                  TxAmt[index] = ExAmt[index]*Tx;
                  TrAmt[index] = TxAmt[index]+ExAmt[index];
                  ToExAmt+=ExAmt[index];
                 
                     if(index==0)
                        {
                           ToTrAmt[index] = TrAmt[index];
                        }
                      else
                        {
                           ToTrAmt[index] = ToTrAmt[index-1] + TrAmt[index];
                        }     
                         
                                     
                           if ( TrAmt[index] > HiTrAmt)

                                    {
                              
                                       HiTrAmt = TrAmt[index];
                                       HiGn = GN[index];
                                    }

                                  
                     AvgExAmt = ToTrAmt[index] / (index+1);                       
                                        
           
            
            System.out.println("\n=======================================" + "\n Poject #5: A bigger and better OBX program" +
            
            "\n Author: Mihiretab Jobira" + "\n====================================" + "\n===================================" + "=====================" + "\n Obx Daily Transaction Report"  + "====================" + "\n" +
            "\n Store:" + SLString +"\n Date:" + DString + "\n Tax%" + Tx + "\n" + "\n=========================================" + "\n EXCURSION DETAILS" + "\n");
            
            System.out.print("Guide \t" );
            
            
            
            System.out.print("Excur Amt\t" );
            
           
            
            System.out.print("\tTax Amt\t" );
            
            
            
            System.out.print("\t\tTrans Amt\t" );
            
           
            
            System.out.println("\tRun Tot\t" );
            
            ToTxAmt = ToTxAmt + TxAmt[index];
      
      
      }
      
            
               for(int i=0; i<8; i++)
                  {
                     System.out.print("\n" + GN[i] +  "\t\t\t$" + df.format(ExAmt[i]) + "\t\t\t$" + df.format(TxAmt[i]) + "\t\t\t$" + df.format(TrAmt[i]) + "\t\t\t$" + df.format(ToTrAmt[i]) + "\t");
                
                  }
                  
                  
                   System.out.print("\n =======================" + "\n ====================" +
            "\n Excursion Summary" + "\n ================================" +
            "\n Total Excursion Amount:$" + df.format(ToExAmt)   + "\n Total tax amount:$" + df.format(ToTxAmt) +
            "\n Average Excursion Amount:$" + df.format(AvgExAmt) + "\n High Trans Amount:$" + df.format(HiTrAmt) +
            "\n ==================" + "\n High Guide Number" + "\n=================" +"\n" + HiGn + "\n==================" + "\n====================="); 
            
                     
                  
                  
          }        
                  
                  
          /* public void Summary(){

            System.out.println("=====Obx: End of Day Report=====" +
            
            "\n Store: " + SLString + "\n Date: " + DString + "\nTax: %" + Tx +
            
            "\n========" + "\n Total Excursion Amount:" + ToTrAmt +
            
            "\n Total Tax Amount:" + ToTxAmt + "\n Average Excursion Amount" + AvExAmt +
            
            "\n High Trans Amount:" + HiTrAmt + "\n High Guide Number:" + HiGn +
            
            "\n=================");
            
         }

*/
                  
                     
                  

     }
    //  void fixedstoreinput()

           


         