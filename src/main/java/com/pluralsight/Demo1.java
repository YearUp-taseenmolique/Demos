package com.pluralsight;

public class Demo1 {
    public static void main(String[] args){

        String names;

        names = "Taseen";
        names = "Katie";
        names = "Jay";

        System.out.println(names);

        StringBuilder namesBuilder = new StringBuilder();
        namesBuilder.append("Taseen");
        namesBuilder.append(", Katie");
        namesBuilder.append(", Jay");

        String names2 = namesBuilder.toString();

        System.out.println(names2);

    }

}
