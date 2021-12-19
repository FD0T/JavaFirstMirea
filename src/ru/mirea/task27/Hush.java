package ru.mirea.task27;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Hush {

    static void hush1(){
        HashMap<String, String> map = new HashMap<>();
        map.put("Габанна","Дольче");
        map.put("Лисенков", "Дмитрий");
        map.put("Федотов", "Владислав");
        map.put("Писарев", "Дмитрий");
        map.put("Антонов", "Владислав");
        map.put("Паранюк", "Владислав");
        map.put("Юдашкина", "Валентина");
        map.put("Ванг","Александр");

        System.out.println(map);

        ArrayList<String> toDelete = new ArrayList<>();
        for (String surname:map.keySet()){
            String name = map.get(surname);
            for(String surname2:map.keySet()){
                boolean bool = map.get(surname2).equals(name);
                if (map.get(surname2).equals(name) && surname!=surname2){
                    toDelete.add(surname);
                }
            }
        }
        for(String surname:toDelete){
            map.remove(surname);
        }
        System.out.println("\n" + map);
    }

    static void hush2(){
        City cities[] = {
                new City("Baxcha", "Russia"),
                new City("Manchester", "Great Britain"),
                new City("Ouagadouhou", "Burkina Faso"),
                new City("Antananarivo","Madagascar"),
                new City("London", "Great Britain"),
                new City("Moscow","Russia")
        };
        Map<String, ArrayList<String>> map = new HashMap<>();
        for(City city:cities){
            if (map.containsKey(city.country)) map.get(city.country).add(city.city);
            else {
                map.put(city.country, new ArrayList<String>());
                map.get(city.country).add(city.city);
            }
        }
        System.out.println(map);
    }

    public static void main(String[] args) {
        hush1();
        System.out.println();
        hush2();
    }

    static class City{
        String city;
        String country;

        public City(String city, String country) {
            this.city = city;
            this.country = country;
        }
    }
}