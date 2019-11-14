import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Engine implements Runnable {
public static final String PATTERN = "([a-zA-z]+)=([a-zA-z\\d]+)";
    public void run() {
        Map<String,String> parsedCookies = new HashMap<String, String>();
        String line;

        Scanner scanner = new Scanner(System.in);
        while(true){
            line = scanner.nextLine();
            if(line.equals("")){
                break;
            }
            Pattern p = Pattern.compile(PATTERN);
            Matcher m = p.matcher(line);

            while(m.find()){

                parsedCookies.put(m.group(1),m.group(2));

            }

        }
        for (Map.Entry<String, String> s : parsedCookies.entrySet()) {
            System.out.print(s.getKey());
            System.out.print(" <-> ");
            System.out.print(s.getValue());
            System.out.println();
        }


    }
}
