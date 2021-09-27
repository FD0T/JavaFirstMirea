package ru.mirea.task6.nameable;

public class Planet implements Nameable{
        private String name,size;

        public Planet(String name, String size) {
            this.name = name;
            this.size = size;
        }

        @Override
        public String getName() {
            return "Name: " + this.name;
        }
}