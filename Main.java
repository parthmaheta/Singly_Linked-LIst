/* 
  Program Name: Singly Linked List
  Author: Parth Maheta
  Date: 20 feb,2019
  Language: java		  
  Number Of File:3
  Files Name:Main.java,Node.java,singly_list.java  
  
  Description: Basic Singly Linked List
  
  Step 1: Compile Main java File Using Command Given Below
           java -d . Node.java          //hit enter
           java -d . singly_list.java  //hit enter		   
           javac Main.java             //hit enter
		   
  Step2: Run Program		   
          java Main      //hit enter	


       Thank You

 Written With Love.......	   
		   
*/


import myCollection.*;
import java.util.Scanner;

public class Main{
    
    public static void main(String [] args)
    {
        singly_list List=new singly_list();
        int Choice=0;
        int Num,Position;
        Scanner Scan=new Scanner(System.in);
		Node Obj;
        
        while(Choice!=-1)
        {
            System.out.println("Enter Number \n-1 for Exit\n 1 for addFirst\n 2 for addLast\n 3 for addAt");
            System.out.println(" 4 for removeFirst\n 5 for removeLast\n 6 for removeAt");
            System.out.println(" 7 for getAt\n 8 for printList");
			System.out.print("Enter Choice:");
            Choice=Scan.nextInt();
            switch (Choice)
            {    case -1:
                    System.exit(0);
                case 1:
                    System.out.print("enter Number:");
                    Num=Scan.nextInt();
                    List.addFirst(Num);
                    break;
                case 2:
                    System.out.print("enter Number:");
                    Num=Scan.nextInt();
                    List.addLast(Num);
                    break;
                case 3:
                    System.out.print("enter Number:");
                    Num=Scan.nextInt();
                    System.out.print("enter Position:");
                    Position=Scan.nextInt();
                    List.addAt(Num,Position);
                    break;
                case 4:
                    List.removeFirst();
                    break;
                case 5:
                    List.removeLast();
                    break;
                case 6:
                    System.out.print("Enter Position:");
                    Position=Scan.nextInt();
                    List.removeAt(Position);
					break;
                case 7:
                    System.out.print("Enter Position:");
                    Position=Scan.nextInt();
                    Obj=List.getAt(Position);
					if(Obj!=null)
					System.out.print(Obj.Data);
					Scan.next();
                    break;
                case 8:
                    List.printList();
					Scan.next();
                    break;
                 default:
                     System.out.println("incorrect choice\n");

            }

        }
    }
}
 

