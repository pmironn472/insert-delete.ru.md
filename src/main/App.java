package main;

import Extract.Extract;
import People.People;
import delete.Delete;
import insert.Insert;


public class App {
    public static void main(String[] args) {
        Delete.delete();
        System.out.println();
        System.out.println();
        Insert.insert();
        System.out.println();
        System.out.println();
        Extract.delete();
        System.out.println();
        System.out.println();
        Extract.insert();


    }
}
