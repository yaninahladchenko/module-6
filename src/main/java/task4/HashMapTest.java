package task4;

import java.util.HashMap;
import java.util.Map;

public class HashMapTest {

    public static void main(String[] args) {

        HashMap<Passport, Citizen> myHashMap = new HashMap();
        Passport passport1 = new Passport("EI", 564321);
        Passport passport2 = new Passport("TH", 856576);
        Citizen citizen1 = new Citizen("Yanina", "Hladchenko");
        Citizen citizen2 = new Citizen("Donald", "Trump");

        myHashMap.put(passport1, citizen1);
        myHashMap.put(passport2, citizen2);

        searchCitizenByPassport(myHashMap, passport2);
        searchCitizenByPassport(myHashMap, passport1);
        searchCitizenByPassport(myHashMap, new Passport("EI", 564321));
        searchCitizenByPassport(myHashMap, new Passport("EI", 123456));
        searchCitizenByPassport(myHashMap, new Passport("XX", 543111));
    }

    private static void searchCitizenByPassport(HashMap<Passport, Citizen> myHashMap, Passport passport) {
        System.out.println(String.format("Search for Citizen with Passport: %s%s ", passport.getSeries(), passport.getNumber()));

        for (Map.Entry<Passport, Citizen> entry : myHashMap.entrySet()) {
            Passport key = entry.getKey();
            if (key.getNumber().equals(passport.getNumber()) && key.getSeries().equals(passport.getSeries())) {
                Citizen value = entry.getValue();
                System.out.println(String.format("Citizen: %s %s ", value.getName(), value.getSurname()));
            }
        }
    }
}