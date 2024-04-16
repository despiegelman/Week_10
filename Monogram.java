import java.util.*;
public class Monogram {
    public static void main(String[]args){
        String f_name;
        String m_name;
        String l_name;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your first name: ");
        f_name = input.next();
        System.out.print("Enter your middle initial: ");
        m_name = input.next();
        System.out.print("Enter your last name: ");
        l_name = input.next();
        input.close();
        System.out.println("Your monogram is: " + f_name.substring(0,1).toLowerCase() + l_name.substring(0,1).toUpperCase() + m_name.toLowerCase());
    }
}
