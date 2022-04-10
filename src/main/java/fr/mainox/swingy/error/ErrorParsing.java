package fr.mainox.swingy.error;

public class ErrorParsing extends Exception {

    public ErrorParsing() {
        super();
    }

    public ErrorParsing(String str) {
        super(str);
    }

    public static void testerrorParsing(String[] arg) throws ErrorParsing {

        if (arg.length == 0) 
            throw new ErrorParsing("Usage:\nSet the mode with those args ONLY:\"console\", \"gui\"");
        if (arg.length != 1)
            throw new ErrorParsing("Too many args");
        if (!arg[0].equals("console") && !arg[0].equals("gui"))
            throw new ErrorParsing("Wrong arg. Only:\"console\", \"gui\" is accepted.");
    }
}
