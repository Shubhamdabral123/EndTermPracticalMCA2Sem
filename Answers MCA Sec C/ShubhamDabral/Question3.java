import java.io.*; 
import java.io.IOException;
import java.util.*;
public class Question3 
{
public static void main(String[] args) 
{
try 
{
File shubham= new File("C:\\Users\\dell\\Desktop\\ShubhamDabral.txt");
if (shubham.createNewFile()) 
{
System.out.println("File created with the name " + shubham.getName());
FileWriter myWriter = new FileWriter("ShubhamDabral");
System.out.println("Enter Content");Scanner input = new Scanner(System.in);
String str = input.nextLine();
myWriter.write(str);
myWriter.close();
System.out.println("The content of the files are as follows");
String line = null;
FileReader fileReader = new FileReader("ShubhamDabral");
BufferedReader bufferedReader = new BufferedReader(fileReader);
while((line = bufferedReader.readLine()) != null)
{
System.out.println(line);
}
bufferedReader.close();
} 
else 
{
System.out.println("File already exists.");
}
}
catch (IOException e) {
System.out.println("An error occurred.");
e.printStackTrace();
}
}
}