package sg.edu.nus.iss;
import java.io.Console;import java.util.List;
import java.util.ArrayList;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Console con= System.console();
        List<String> todos = new ArrayList<String>();
        String input ="";
        while (input.equals("quit")){
            input = con.readLine("Enter a string ");
           if (!input.equals("quit")){
            todos.add(input);

        }
        
    }

    for (String todo:todos){
        System.out.println("Todo task " +todo);
    }
}
}