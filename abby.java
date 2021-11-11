import java.io.BufferedReader;
import java.io.InputStreamReader;
import javax.swing.*;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import java.util.*;

public class abby {
	public static void main(String[] args) {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String name,number,password, uname,feed;
        // starting point
		System.out.println("------------------->hello im, abby<--------------------");
		JOptionPane.showMessageDialog(null, "*************** Hello!! i'm Abby.***************");
        // user
        name = JOptionPane.showInputDialog(null, "Please Enter Full Name:\n");
				//
				JOptionPane.showMessageDialog(null, "nice to meet you\n"+name);
				//
                System.out.println("name of the user:"+name);
               //
               number= JOptionPane.showInputDialog(null, "Enter password\n");
               //
               System.out.println("password user:"+number);
               //
               //
      uname = JOptionPane.showInputDialog(null, "Enter your user name\n");
      	//
          System.out.println("user name of the current user:"+uname);
          //
          password = JOptionPane.showInputDialog(null, "Enter password\n");
      	//
          System.out.println("password user:"+password);
          //
               JOptionPane.showMessageDialog(null, "welcome to the chemist assistance system\n here you find everything your looking for");
       // system
       JOptionPane.showMessageDialog(null, "        **************Location of products*************\nname of medicine_______ line number_______ shelf number_____________price"+
       "\n           panado                     line no (2)                shelf number 4          price:5k"+
       "\n           ellaone                    line no (7)                shelf number 2          price:25k"+
       "\n           Antiretroviral pills       line no (3)                shelf number7           price:75k"+
       "\n           Piriton                    line no (8)                shelf number 8          price:15k"+
       "\n           Septrin                    line no (4)                shelf number 1          price:20k"+
       "\n           diclofanac                 line no (1)                shelf number 3          price:13.5k"+
       "\n           amoxicillin                line no (10)               shelf number 5          price:32k"+
       "\n           amplicilne                 line no (3)                shelf number 4          price:10k"+
       "\n           frsgile                    line no (2)                shelf number 1          price:28k"+
       "\n           caffeino                   line no (6)                shelf number 5          price:10k"+
       "\n           zinc                       line no (3)                shelf number 4          price:11k"+
       "\n           amplicilne                 line no (2)                shelf number 2          price:4k"+
       "\n if what your looking for isnt on this list check the storage room or ask the manager" );
       feed=JOptionPane.showInputDialog(null, "Thank for visting give us feed back on your visit "+" hope i was of help Goodbye"+name+" see you soon :"+ name);
       //
       System.out.println("user name of the current user:"+feed);
       // 
    }
}