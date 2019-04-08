
import javax.swing.*;

class BookID {
   public static void main(String [] arg){
      String title,fullname, firstname,lastname;
      int num;
       title= JOptionPane.showInputDialog(null, "Enter the title of the book");// to input the title of the book 
       fullname=JOptionPane.showInputDialog(null,"Enter the author's fullname" );// to input the full name 
       firstname=fullname.substring(0,1);// to extract first name from full name 
       num=fullname.indexOf(" ")+1;// know the postion of the space so that i can extaract the last name 
       lastname=fullname.substring(num,num+3);// extract the first three letters of the last name
       title=title.substring(0,10);// extracts the first 10 characters of the litle 
       JOptionPane.showMessageDialog(null,"That book’s ID is :"+ lastname+firstname+ "-"+ title ); // output the book ID  
       System.exit(0);
    }
}