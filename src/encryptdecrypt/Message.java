package encryptdecrypt;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Message {

    public static String inputMessage (String data, String in) {

        String message = "";

        if (data.equals("noData") && in.equals("noIn")) {
            message = "";
        } else if (data.equals("noData")) {

            File inptFile = new File(in);
            try (Scanner sc = new Scanner(inptFile)) {
                message = sc.nextLine();
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        } else {
            message = data;
        }

        return message;
    }

    public static void outputMessage (String out, String outputMessage) {

        if(out.equals("Standard")) {
            System.out.println(outputMessage);
        } else {
            File outptFile = new File(out);
            try(PrintWriter write = new PrintWriter(outptFile)) {
                write.println(outputMessage);
            } catch(IOException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
