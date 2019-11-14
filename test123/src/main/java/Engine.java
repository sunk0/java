

import java.util.ArrayList;

import java.util.Base64;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Engine implements Runnable {
    String matchedByte;


    @Override
    public void run() {
        PrintFormattedString();


    }

    private void PrintFormattedString() {
        Scanner scanner = new Scanner(System.in);
        String input;
        List<String> formatted = new ArrayList<>();
        List<String> bodyParts = new ArrayList<>();
        List<String> formattedFinished = new ArrayList<>();

        while (true) {

            input = scanner.nextLine();


            if (input.equals("quit")) {
                break;
            }

            if (input.contains("Basic")) {
                String[] tokens = input.split("Basic ");
                matchedByte = tokens[1];
            }
            if (!input.equals("")) {
                formatted.add(input);
            }

            if (input.matches("(name=)([a-zA-z]+)(&)(quantity=)([\\d]+)(&)(price=)([\\d]+)")) {
                bodyParts.add(BodyName(input));
                bodyParts.add(BodyQuantity(input));
                bodyParts.add(BodyPrice(input));
            }
        }

        for (String s : formatted) {
            if (s.contains("Date:")) {
                formattedFinished.add(s);
            }
            if (s.contains("Host:")) {
                formattedFinished.add(s);
            }
            if (s.contains("Content-Type")) {
                formattedFinished.add(s);
            }
        }
        boolean isTrueUnauthorized = false;
        boolean isTrueHeaderParams = false;
        boolean isTrueBodyParams = false;
        for (String s : formatted) {
            if (s.contains("Authorization:")) {
                isTrueUnauthorized = true;
            }
            if(formatted.get(0).contains("url")){
                isTrueHeaderParams = true;
            }
            if(s.matches("(name=)([a-zA-z]+)(&)(quantity=)([\\d]+)(&)(price=)([\\d]+)")){
                isTrueBodyParams = true;
            }
        }

        if (matchedByte != null && isTrueHeaderParams && isTrueBodyParams) {
            System.out.println("HTTP/1.1 200 OK");
            formattedFinished.forEach(System.out::println);
            System.out.println(System.lineSeparator() + "Greetings " + ByteEncoder(matchedByte) + "! You have successfully created " + bodyParts.get(0) + " with quantity – " + bodyParts.get(1) + ", price –" + bodyParts.get(2) + ".");
        } else if (!isTrueUnauthorized) {
            System.out.println("HTTP/1.1 401 Unauthorized");
            formattedFinished.forEach(System.out::println);
            System.out.println(System.lineSeparator() + "You are not authorized to access the requested functionality.");
        } else if(!isTrueHeaderParams){
            System.out.println("HTTP/1.1 404 Not Found");
            formattedFinished.forEach(System.out::println);
            System.out.println("Date: 17/01/2019");
            System.out.println("The requested functionality was not found.");
        }
        else if(!isTrueBodyParams){
            System.out.println("HTTP/1.1 400 Bad Request");
            System.out.println("Date: 17/01/2019");
            System.out.println("Host: localhost:8000");

            System.out.println(System.lineSeparator()+"There was an error with the requested functionality due to malformed request.");

        }


    }

    private String BodyPrice(String input) {
        String pattern = "(price=)([\\d]+)";
        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(input);
        String returnPattern = null;
        if (m.find()) {
            returnPattern = m.group(2);

        }
        return returnPattern;
    }

    private String BodyQuantity(String input) {
        String pattern = "(quantity=)([\\d]+)(&)";
        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(input);
        String returnPattern = null;
        if (m.find()) {
            returnPattern = m.group(2);

        }
        return returnPattern;
    }

    private String BodyName(String input) {
        String pattern = "(name=)([a-zA-z]+)(&)";
        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(input);
        String returnPattern = null;
        if (m.find()) {
            returnPattern = m.group(2);

        }
        return returnPattern;
    }

    private String ByteEncoder(String matchedByte) {
        String binaryEncode = matchedByte;

        byte[] valueDecoded = Base64.getDecoder().decode(binaryEncode);
        return (new String(valueDecoded));
    }


}
