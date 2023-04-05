import java.io.*; 
import java.util.*; 
public class Solution  
{ 
    public static void main(String[] args)  
    { 
        Scanner scanner = new Scanner(System.in); 
        int n = scanner.nextInt(); 
        if (n < 2)  
        { 
            System.out.println("Invalid"); 
            return; 
        } 
        String[] stringArray = new String[n]; 
        for (int i = 0; i < n; i++)  
        { 
            stringArray[i] = scanner.next(); 
        } 
        Arrays.sort(stringArray); 
        for (String str : stringArray)  
        { 
            System.out.println(str); 
        } 
    } 
}
