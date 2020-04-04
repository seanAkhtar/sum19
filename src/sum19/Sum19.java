/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sum19;
//import javax.swing.JOptionPane;
//import java.net.URL;
//import javax.swing.ImageIcon;
import java.util.Scanner;
import java.lang.Math;

/**
 *
 * @author AK
 */
public class Sum19 {

    /**
     * @param args the command line arguments
     * @throws java.lang.Exception
     */
    public static void main(String[] args) throws Exception {
        
        Scanner scan = new Scanner(System.in);
        
        //p1.1   
        System.out.println("Ciao Sean!");
        System.out.println("######################");
       
        //p1.2
        System.out.println(1+2+3+4+5+6+7+8+9+10);
        System.out.println("######################");
        //p1.3
        System.out.println(1*2*3*4*5*6*7*8*9*10);
        System.out.println("######################");
        //p1.4
        int acct =1000;
        double intr = 0.05;
        double y1 = acct * intr + acct;
        double y2 = acct * intr + y1;
        double y3 = acct * intr + y2;

        System.out.println(y1);
        System.out.println(y2);
        System.out.println(y3);      
        System.out.println("######################");
        
        //p1.5
        System.out.println("____");
        
        System.out.println("|Sean|");
        System.out.println("____");
        System.out.println("######################");
        //p1.7
        System.out.println(" "+"?????");
        System.out.println(" "+"__1__");
        System.out.println("(|o O|)");
        System.out.println(" "+"|"+" "+"< "+"|");
        System.out.println(" "+"|"+" "+"u"+" "+"|");
        System.out.println(" "+"~`~`~");
        System.out.println("######################");
        //p1.9
        System.out.println("   "+"+"+" "+" ");
        System.out.println("  "+"+"+" "+"+"+"+");
        System.out.println(" +"+" "+"  "+"+");
        System.out.println("+-----+");
        System.out.println("| .-. |");
        System.out.println("| | | |");
        System.out.println("+-+-+-+");
        System.out.println("######################");
        //p1.11
        System.out.println("######################");
        System.out.println("######################");
        System.out.println("######################");
        //p1.12
        System.out.println("Rock and roll");
        System.out.println("######################");
        
         System.out.println("Body Mass Index Program");
       
       double weight,height,bmi,power;
       
       System.out.println("Please enter your weight in pounds: ");
       weight = scan.nextInt();
       System.out.println("Please enter your height in inches: ");
       height = scan.nextInt();
       
       power = 2;
       
       bmi = weight * (703 / (Math.pow(height,power)));
       
       System.out.printf("Your bmi is: %.2f\n",bmi);
       
        //p.14
       //////////////////////////////////////////////////////////////////////////////////
       /*
        JOptionPane.showMessageDialog(null,"Hello Sean!");
        System.out.println("######################");
        //p1.15
        String name = JOptionPane.showInputDialog("What is your name?");
        System.out.println(name);
        
        
        JOptionPane.showInputDialog("What can i do for you?");
        JOptionPane.showMessageDialog(null,"I'm sorry,"+name+". I cant do that for you.");
        JOptionPane.showMessageDialog(null,"Goodbye");
        //JOptionPane.showMessageDialog(null,"Hello,"+name+"!");
        System.out.println("######################");
        //p.1.17
        //this prints the message dailog with the panda image
        URL imageLocation = new URL("https://chambermaster.blob.core.windows.net/images/members/2917/1505/MemLogo_WWF.png");
        JOptionPane.showMessageDialog(null,"Sean"," ",JOptionPane.PLAIN_MESSAGE, new ImageIcon(imageLocation));
        */
        System.out.println("######################");
        //different book 2.27
        String city = "San Francisco";
        String upperCity = city.toUpperCase();
        String lowerCity = city.toLowerCase();
        int stringLength = city.length();
        char oneChar =  city.charAt(0);
        
        System.out.println(city);
        System.out.println(upperCity);
        System.out.println(lowerCity);
        System.out.println(stringLength);
        System.out.println(oneChar);
        System.out.println("######################");
        //chapter 2.1 
        /////////////////////////////////////////////////////////////////////////
         /*
        
        
        String name1;
        int age;
        double annualPay;
        
        System.out.println("Please enter your name.");
        name1 = scan.nextLine();
        System.out.println("What is your age?");
        age = scan.nextInt();
        System.out.println("What is your annual pay?");
        annualPay = scan.nextDouble();
        
        System.out.println("My name is "+name1+", "+ "my age is "+age+""
                + "         \nand "+ "I hope to earn "+annualPay+" this year");
        System.out.println("######################");
        */
        //2.2
        String fname = "AK",mname = "Sean",lname = "Akhtar";
        char finitial = fname.charAt(0),minitial = mname.charAt(0),linitial = lname.charAt(0);
        System.out.println("Your initials are: "+finitial+minitial+linitial);
        System.out.println("######################");
        //2.3
        System.out.println(fname);
        System.out.println(" Bern st dallas City, Tx");
        System.out.println("(111) 455-7698");
        System.out.println("Computer Science");
        System.out.println("######################");
        //2.4
        
        for (int i = 0; i < 1; i++){
        System.out.print("    *   *  *******   "+ "\n   ***   ***  *****  "+ "\n  *****   *****  *** " + "\n *******   *******  *"+"\n  *****   *****   *** "+
                            "\n   ***   ***  *****  "+"\n    *   *  *******   ");
        
        System.out.println("    *   *  *******   "+ "\n   ***   ***  *****  "+ "\n  *****   *****  *** " + "\n *******   *******  *"+"\n  *****   *****   *** "+
                            "\n   ***   ***  *****  "+"\n    *   *  *******   ");
                
        System.out.println("    *   *  *******   "+ "\n   ***   ***  *****  "+ "\n  *****   *****  *** " + "\n *******   *******  *"+"\n  *****   *****   *** "+
                            "\n   ***   ***  *****  "+"\n    *   *  *******   ");
     
        
        System.out.print("    *   *  *******   "+ "\n   ***   ***  *****  "+ "\n  *****   *****  *** " + "\n *******   *******  *"+"\n  *****   *****   *** "+
                            "\n   ***   ***  *****  "+"\n    *   *  *******   ");
        
        System.out.println("    *   *  *******   "+ "\n   ***   ***  *****  "+ "\n  *****   *****  *** " + "\n *******   *******  *"+"\n  *****   *****   *** "+
                            "\n   ***   ***  *****  "+"\n    *   *  *******   ");
                
        System.out.println("    *   *  *******   "+ "\n   ***   ***  *****  "+ "\n  *****   *****  *** " + "\n *******   *******  *"+"\n  *****   *****   *** "+
                            "\n   ***   ***  *****  "+"\n    *   *  *******   ");
        
                                       }
        
        System.out.println("######################");
        //2.5
        double rate = 0.62, sales = 4.6000000,total = sales * rate;
        
        System.out.println("East Coast Sales: "+ total);
        
        System.out.println("######################");
        //2.6
        /*
        for(int i =0; i<10;i++){
            System.out.println("    *   *  *******   "+ "\n   ***   ***  *****  "+ "\n  *****   *****  *** " + "\n *******   *******  *"+"\n  *****   *****   *** "+
                            "\n   ***   ***  *****  "+"\n    *   *  *******   ");
         System.out.println("    *   *  *******   "+ "\n   ***   ***  *****  "+ "\n  *****   *****  *** " + "\n *******   *******  *"+"\n  *****   *****   *** "+
                            "\n   ***   ***  *****  "+"\n    *   *  *******   ");
         System.out.println("    *   *  *******   "+ "\n   ***   ***  *****  "+ "\n  *****   *****  *** " + "\n *******   *******  *"+"\n  *****   *****   *** "+
                            "\n   ***   ***  *****  "+"\n    *   *  *******   ");
                               }
        //end loop marker
          System.out.println(" ************************************************************************************ ");
        */
        //2.6 cont
        
        double acre = 43560, tract = 389767,sum = tract / acre;
                                            //used math.round to get rounded answer
          System.out.printf("Total Acres: "+ Math.round(sum)+"\n");
          
          //TODO: need to find syntax for printf function to cut to 2 decimel places ex: 8.94 rounded
          //DONE//        
        System.out.println("######################");
        
       /* double purch, sttax,cttax,taxto,mtoto;
        
        System.out.print(" Purchase amount: ");
        purch = scan.nextDouble();
        sttax = purch * 0.04;
        cttax = purch * 0.02;
        taxto = sttax + cttax;
        mtoto = purch + taxto;
        
        System.out.printf("%s %10.2f %s %s %9.2f %s %s %3.2f %s %s %s %s %9.2f"," State tax: ",sttax,
                                "\n","County tax: ",cttax,"\n","Total sales tax: ",taxto,
                                    "\n","**********************","\n","Total Sale: ",mtoto,"\n","\n");
        
        System.out.println("");
        System.out.println("######################");
        
        int cookie = 75;
        int servings;
        
        System.out.println("~Cookie Calories~"+"\n");   
        System.out.println("Please enter # of cookies consumed: ");
        servings = scan.nextInt();
        
        int total3 = cookie * servings;
        
         System.out.println("You consumed "+ total3+" calories.");
         
         
        
        System.out.println("######################");
         
        System.out.println("~Miles Per Gallon~");
         
        //get miles and gallons used and divide to get the mpgs
         int miles, gas;
         
          System.out.println("Please enter # of miles: ");
          miles = scan.nextInt();
          System.out.println("Please enter # of gallons used: ");
          gas = scan.nextInt();
          
         int total4 = miles / gas;
          
        System.out.println("Your Average MPG: "+total4+" MPG");
        System.out.println("######################");
        
       System.out.println("~Test Average~");
         
         int test1,test2,test3,ave;
         
         //ask user for grade and get input
         //repeat for all grades
         //add all the grades and divide by three to get the average
          System.out.println("Please enter test 1 grade: ");
          test1 = scan.nextInt();
          System.out.println("Please enter test 2 grade: ");
          test2 = scan.nextInt();
          System.out.println("Please enter test 3 grade: ");
          test3 = scan.nextInt();
          ave=(test1+test2+test3) / 3;
          System.out.println("Test 1 Grade:    "+test1+"\n"+"Test 2 Grade:    "+test2+
                                "\n"+"Test 3 Grade:    "+test3+"\n"+"Your Average is: "+ave);
          
       System.out.println("######################");
       System.out.println("~``Circuit Board Profit``~");
       double rp,marg,profit;
       
       System.out.println("Please enter retail price: ");
       rp = scan.nextDouble();
       System.out.println("Please enter the desired margin: ");
       marg = scan.nextDouble();
       scan.next();
       profit = rp * marg;
       System.out.println("At "+marg+ " profit earned is: " + profit);
       
       
       System.out.println("######################"); 
       System.out.println("~`/String Manipulator/`~");
       //initialize the string variables
       String cityOne,cityOneupper, cityOnelower;
       //int data type sl = string length
       int sl;
       //char to get the first char
       
       //ask user for city
       System.out.println("Please enter your favorite city: ");
       cityOne = scan.nextLine();
       cityOneupper = cityOne.toUpperCase();
       cityOnelower = cityOne.toLowerCase();
       sl = cityOne.length();
       char cityChar = cityOne.charAt(0);
       
       System.out.println("Number of Characters: "+ sl+"\n"+ "City all Upper: "+ cityOneupper+ "\n"+"City all lower: " +cityOnelower+"\n"+
                                "The First Character is: ");
       //todo cannot get the first letter of the string cityOne
       
       System.out.println("######################");
         System.out.println("`Restaurant bill`");
         double meal,taxx,tip,totall;
           System.out.println("Please enter meal total: ");
           meal = scan.nextDouble();
           taxx = meal * 0.0675;
           tip = (meal + taxx) * .2;
           totall = meal + taxx + tip;
           
           System.out.printf("%s %.2f %s %s %7.2f %s %s %7.2f %s %s %9.2f %s"," Meal charge is: " , meal,"\n", "Tax charged: ",taxx,"\n","Tip charged: ",tip,
                                        "\n","Total bill: ",totall,"\n");
       System.out.println("######################");
       System.out.println("~~Male and female percentages~~");
       //initialize the variables needed
       double male,female,all;
       //ask user for males
       System.out.println("Please enter the # of males: ");
       male = scan.nextDouble();
       //ask user for females
       System.out.println("Please enter the # of females: ");
       female = scan.nextDouble();
       //use all to get the total
       all = male + female;
       //get male percentage
       male = male / all;
       //get female percentage
       female = female / all;
       //print with new line to seperate the two and cut the percentages after two decimal places
       System.out.printf("%s %s %s %.2f %s %s %.2f %s","The percentages of males and females. ", "\n","Male:   ", male , "\n" , "Female: " , female, "\n");
       System.out.println("######################");
       */
       System.out.println("`~Stock Commission`~");
       //new program starts here
        double shares,commis,total6;
        shares = 600 * 21.77; // shares cost this
        commis = shares * 0.02; //calculated the commission from the shares
        total6 = shares + commis; // get the total 
        
        // print the data below
        
        System.out.printf("%s %s %.2f %s","Stock price without commission:","$", shares,"\n");
        System.out.printf("%s %14s %8.2f %s","Commission amount:","$", commis,"\n");
        System.out.printf("%s %3s %.2f %s","Total of stock + commission: ","$", total6,"\n");
       
       System.out.println("######################");
       System.out.println("!Energy Drink Consumption!");
       //write logic here
       double survey, citrus;
       survey = 12467 * 0.14; //assign the calculations
       citrus = 12467 * 0.64;//
       
       System.out.println("Customers who purchase one or more drink: " + Math.round(survey));
       System.out.println("Customers who perfer citrus flavor: " + Math.round(citrus));
       
       System.out.println("######################");
       /*
       System.out.println("<The Ingredient Adjuster>");
       double sugar, flour, cookies;
       double butter;
       
       sugar = 1.5 / 48; // divide by 48 to get amount per cookie
       butter = 1.0 / 48;
       flour = 2.75 / 48;
       
       System.out.println("Please enter how many cookies you want to make: ");
       cookies = scan.nextDouble();//multiply with the ingredients to get amount needed
       
       System.out.println("The amount of sugar needed: "+ sugar * cookies);
       System.out.println("The amount of butter needed: "+ butter * cookies);
       System.out.println("The amount of flour needed: "+ flour * cookies);
       
       System.out.println("######################");
       System.out.println("<Word Game>");
       String name1, city2,college, profession, animal,pet;
       int age2;
       scan.nextLine();
       System.out.println("Please enter your name: ");
       name1 = scan.nextLine();//get the first input
       System.out.println("Please enter your age: ");
       age2 = scan.nextInt();//
       scan.nextLine();
       System.out.println("Please enter your city: ");
       city2 = scan.nextLine();//
       System.out.println("Please enter your college: ");
       college = scan.nextLine();//
       System.out.println("Please enter your profession: ");
       profession = scan.nextLine();//
       System.out.println("Please enter what type of animal: ");
       animal = scan.nextLine();//
       System.out.println("Please enter your pets name: ");
       pet = scan.nextLine();//
       
       // now put everything in the story
       System.out.println("There once was a person named " + name1 +  " who lived in "+ city2 + "." + " At the age of " + age2 + "\n" +
                            name1 +" went to college at " + college+ ". " + name1 + " graduated and went to work as a" + "\n" +
                            profession + "." + " Then, " + name1 + " adopted a(n) " + animal + " named " + pet + ", and they both lived " + "\n" +
                            "happily ever after!");
       */
       System.out.println("######################");
       
      
       double sharesPurch, sharesCom, soldStock, profit , soldCom;
       
       sharesPurch = 1000 * 32.87;
       sharesCom = sharesPurch * 0.02;
       soldStock = 1000 * 33.92;
       soldCom = soldStock * 0.02;
       profit =  soldStock - (sharesPurch + sharesCom + soldCom );
       System.out.println("Amount paid for stock: "+ sharesPurch + "\n" + "Commission paid when purchased: " + sharesCom + "\n" +
               "Amount joe sold stock: " + soldStock + "\n" + "Amount of commission paid when sold: " + soldCom + "\n");
       System.out.printf("%s %.2f %s","The profit made if any: " , profit , "\n");
       System.out.println("######################");
       /*
       int x,y = 20;
       
       if(y == 20){
           x = 0;
          }
       
       if (hours > 40){
           payRate * 1.5;
       }
       
       if (x > 100){
       y = 20;
       z = 40;
       }
       if ( a < 10){
       b = 0;
       c = 1;
       }

       
       
       
       
       System.out.println("Roman Numeral Program");
       
       System.out.println("Please enter a number from 1 - 10");
       
       int num = scan.nextInt();
       
       if (10 != num)
           if (num == 9)
           {
               System.out.print(num + " = IX "+"\n");
           }
           else if (num == 8)
           {
               System.out.print(num + " = VIII "+"\n");
           }
           else if (num == 7)
           {
               System.out.print(num + " = VII "+"\n");
           }
           else if (num == 6)
           {
               System.out.print(num + " = VI "+"\n");
           }
           else if (num == 5)
           {
               System.out.print(num + " = V "+"\n");
           }
           else if (num == 4)
           {
               System.out.print(num + " = IV "+"\n");
           }
           else if (num == 3)
           {
               System.out.print(num + " = III "+"\n");
           }
           else if (num == 2)
           {
               System.out.print(num + " = II "+"\n");
           }
           else if (num == 1)
           {
               System.out.print(num + " = I "+"\n");
           }
           else
           {
               
               System.out.println("System Error: Please enter # in range 1-10");
               
           }
           else {
           System.out.println(num +" = X "+"\n");
        }
       
       
       System.out.println("######################");
       System.out.println("Magic Dates Program");
       
        int mo,day,yr,equal;
        
        //Program will display magic date if mo * day == yr
        System.out.println("Please enter one digit month: ");
        
            mo = scan.nextInt();
            
       // for(int i = 1; i <= 2; i++) {   
         //   if(mo > 12)
           // {
             //   System.out.println("You have entered an invalid month. Please try again");
            //}else{
              //  mo = scan.nextInt();
            //}
            
        
        System.out.println("Please enter 2 digit day: ");
        
            day = scan.nextInt();
            
        System.out.println("Please enter 2 digit year: ");
        
            yr = scan.nextInt();
            
            equal = mo * day;
            
            if (equal == yr){
                
                System.out.println("You have a magic date!");
                
            }else{
            
                System.out.println("Your date isnt magic");
            }
       System.out.println("######################");

       System.out.println("Body Mass Index Program");
       
       double weight,height,bmi,power;
       
       System.out.println("Please enter your weight in pounds: ");
       weight = scan.nextInt();
       System.out.println("Please enter your height in inches: ");
       height = scan.nextInt();
       
       power = 2;
       
       bmi = weight * (703 / (Math.pow(height,power)));
       
       System.out.printf("Your bmi is: %.2f\n",bmi);
       
       System.out.println("######################");

       System.out.println("Test Score program");
       double test1, test2,test3, ave;
       
       //get the three scores
       System.out.println("Please enter Test 1 grade");
       
       test1 = scan.nextDouble();
       
       System.out.println("Please enter Test 2 grade");
       
       test2 = scan.nextDouble();
       
       System.out.println("Please enter Test 3 grade");
       
       test3 = scan.nextDouble();
       
       //calculate the average
       
       ave = (test1 + test2 + test3) / 3;
       
       System.out.printf("The average is: %.2f\n",ave);
      
       //logic to assign the letter grade
       
       if (ave >= 60 && ave <= 69){
           
       System.out.println("Letter grade is D ");
       
       } else if(ave >= 70 && ave <= 79 ){
           
       System.out.println("Letter grade is C ");
       
       }else if (ave >= 80 && ave <= 89){
           
       System.out.println("Letter grade is B ");
       
       }else if(ave >= 90 && ave <= 100){
           
       System.out.println("Letter grade is A. Good Job! ");
       
       }else if(ave > 100){
           
           System.out.println("You have entered invalid parameters");
           
       } else{
           
           System.out.printf("Letter grade is F \n");
       }
      
       System.out.println("######################");
       System.out.println("(; Mass and Weight Program ;)");
       
       double mass,weight1;
       
       System.out.println("Please enter an objects mass: ");
       
       mass = scan.nextDouble();
       
       weight1 = mass * 9.8;
       
       if (weight1 > 1000){
           System.out.println("Object is too heavy!");
       }else if( weight1 < 10){
           System.out.println("Object is too light...");
       }else{
           System.out.printf("Weight is: %.2f \n", weight1);
       }
     
       System.out.println("######################");
       System.out.println("Time Calculator Program");
       
       System.out.println("Please enter # of seconds: ");
       
       //declare the variables
       double seconds, minute, hour1,daze;
       
       seconds = scan.nextInt();
       minute = (seconds / 60);
       hour1  = (seconds / 3600);
       daze   = (seconds / 86400);
       
       if (seconds >= 60){
           
           System.out.println("This the number of minutes: \n" + seconds + " == " + minute + " minute ");
       }
       if (seconds >= 3600){
          
           System.out.println("This the number of hours: \n" + seconds + " == " + hour1 + " hour ");
       }
       if (seconds >= 86400){
       
           System.out.println("This the number of days: \n" + seconds + " == " + daze + " day ");
       }
       */
       System.out.println("######################");
       
       System.out.println("Sorted names program");
       //assign varaible and names
       String name1,name2,name3,temp;
       char char1,char2,char3;
       //get user input
       System.out.println("Please enter 1st name: ");
       name1 = scan.nextLine();
       System.out.println("Please enter 2nd name: ");
       name2 = scan.nextLine();
       System.out.println("Please enter 3rd name: ");
       name3 = scan.nextLine();
       //use char to  compare the names
       //now this method isnt going to recognize if the first letters are the same
        char1 = name1.charAt(0);
        char2 = name2.charAt(0);
        char3 = name3.charAt(0);
       
       if(name1.compareTo(name2) < 0){
           temp = name1;
           name1 = name2;
           name3 = temp;
       } else if(name2.compareTo(name3) < 0){
           temp = name2;
           //name2p
    
       }
       
       
       System.out.println("Names ==" +"\n"+ name1 +"\n"+ name2 +"\n"+ name3);
       System.out.println("######################");
       
       System.exit(0);
             

}
       
    
 }