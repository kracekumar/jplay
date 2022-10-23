package com.example;
import com.example.protos.Label;
import java.util.ArrayList;

public class Sample{
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<String>();
        names.add("Adult!");
        names.add("Programmer");

        Label.Builder builder = Label.newBuilder();
        builder.addAllNames(names);
        Label label = builder.build();
        System.out.println(String.format("Hello: %s", label));

    }
}