package encryptdecrypt;

public class Arguments {

    //searched the provided arguments list for a specifiecc one
    // it aplies that one if it is there or a standard one if not
    public static String readArguments(String[] arguments, String arg, String standard) {
        String toReturn = "";

        for(int i = 0; i < arguments.length; i++){
            if(arguments[i].equals(arg)) {
                if(arguments[i + 1].substring(0, 1).equals("-")){
                    toReturn = standard;
                } else {
                    toReturn =  arguments[i + 1];
                }
                break;
            }
            if(i == arguments.length - 1) {
                toReturn = standard;
            }
        }
        return toReturn;
    }

}
