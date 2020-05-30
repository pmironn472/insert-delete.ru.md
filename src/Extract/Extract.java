package Extract;

import People.People;

public class Extract {

    public static void delete() {

        String[] names = {"Ja1", "Ja2", "Ja3", "Ja4", "Ja5", "Ja6"};
        People[] people = new People[6];
        People[] newPeople = new People[people.length - 1];
        int indexToDelete = 2;

        for (int i = 0; i < people.length; i++) {
            people[i] = new People(names[i]);
        }


        for (int i = 0, c = 0; i < people.length; i++) {
            if (i != indexToDelete) {
                newPeople[c++] = people[i];
            }

        }
        people = newPeople;

        for (People p :
                people) {
            System.out.println(p.getFullName());
        }

    }


    public static void insert() {
        String[] names = {"Ja1", "Ja2", "Ja3", "Ja4", "Ja5", "Ja6"};
        People[] people = new People[5];
        People[] newPeople = new People[people.length + 1];
        int indexToInsert = 2;
        String newName = "Ja7";




        for (int i = 0; i < people.length; i++) {
            people[i] = new People(names[i]);
        }


        for (int i = 0, c = 0; i < people.length; i++) {
            if (i == indexToInsert) {
                people[i].setFullName(newName);
                newPeople[c++] = people[i];
            }else {
                newPeople[c++] = people[i];
            }

        }
        people = newPeople;

        for (People p :
                people) {
            if(p == null )
            System.out.println("No name");
            else
                System.out.println(p.getFullName());

        }

    }
}

