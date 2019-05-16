package task4;

import java.util.HashMap;

public class HashMapTest {

    public static void main(String[] args) {
         HashMap myHashMap = new HashMap(Passport, Citizen);

         /*Passport passport1 = new Passport("EI", 564321);
         Passport passport2 = new Passport("TH", 856576);
         Citizen citizen1 = new Citizen("Yanina", "Hladchenko");
         Citizen citizen2 = new Citizen("Donald", "Trump");*/



         myHashMap.put(new Passport("EI", 564321), new Citizen("Yanina", "Hladchenko"));

         System.out.println(myHashMap);

     }
}

