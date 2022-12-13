

// import java.io.*;  
import java.util.*;  
public class Roman_to_Integer{  
    public static void convertRomanToInt(String s)  
    {  
        Map<Character, Integer> map=new HashMap<Character, Integer>();  
        //adding elements to the Map   
        map.put('I',1);  
        map.put('V',5);  
        map.put('X',10);  
        map.put('L',50);  
        map.put('C',100);  
        map.put('D',500);  
        map.put('M',1000);    
        s = s.replace("IV","IIII");  
        s = s.replace("IX","VIIII");  
        s = s.replace("XL","XXXX");  
        s = s.replace("XC","LXXXX");  
        s = s.replace("CD","CCCC");  
        s = s.replace("CM","DCCCC");  

        map.put('i',1);  
        map.put('v',5);  
        map.put('x',10);  
        map.put('l',50);  
        map.put('c',100);  
        map.put('d',500);  
        map.put('m',1000);    
        s = s.replace("iv","IIII");  
        s = s.replace("ix","VIIII");  
        s = s.replace("xl","XXXX");  
        s = s.replace("xc","LXXXX");  
        s = s.replace("cd","CCCC");  
        s = s.replace("cm","DCCCC");  
        int number = 0;  
    //loop iterates over the roman numeral   
        for (int i = 0; i < s.length(); i++)  
        {  
    //getting each character of roman numeral and adding it to the variable number  
            number = number + (map.get(s.charAt(i)));  
        }  
        //prints the corresponding integer value  
        System.out.println("The corresponding Integer value is: "+number);  

        // * or return number;
}  
    //driver code  
    public static void main (String args[])  
    {  
        try ( Scanner sc = new Scanner(System.in)) {
            String s = sc.nextLine();

            //function calling  
            convertRomanToInt(s);
            
            // ? MCMXV
        }  
    }  
}