package br.com.dio.basics;

public class ArgsToMain {

    /*
     *   String [] args is used to pass parameters to main from the terminal.
     *   To use it, run "java ArgsToMain par1 par2 par3" in a terminal
     */
    public static void main (String[] args) {
        String name = args[0];
        String age = args[1];
        String height = args[2];

        System.out.println("About me");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Height: " + height);
    }
}