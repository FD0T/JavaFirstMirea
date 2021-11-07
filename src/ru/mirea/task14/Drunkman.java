package ru.mirea.task14;

import java.util.LinkedList;

public class Drunkman {
    public boolean checkNumber() {

        return true;
    }

    public static class Player {
        LinkedList<Card> cardlist = new LinkedList<>();

        String name;

        Player(String name) {
            this.name = name;
        }

        public void addCard(Card o1) {
            cardlist.add(o1);
        }

        public void addCard(Card o1, Card o2){
            cardlist.add(o1);
            cardlist.add(o2);
        }

        public Card takeTop(){
            return cardlist.pollFirst();
        }

        public boolean isEmpty(){
            return cardlist.isEmpty();
        }

        @Override
        public String toString() {
            return "Player " + this.name + " {" +
                    "cardlist=" + this.cardlist +
                    '}';
        }
    }

    public static class Card {
        int value;

        Card(int value) {
            this.value = value;
        }

        static public int compare(Card o1, Card o2) {
            if ((o1.value == 0 || o1.value == 9) && (o2.value == 0 || o2.value == 9)) {
                if (o1.value == 0 && o2.value == 9) {
                    return 1;
                } else if (o1.value == 9 && o2.value == 0) {
                    return -1;
                } else {
                    return 0;
                }
            } else {
                if (o1.value > o2.value) {
                    return 1;
                } else if (o1.value < o2.value) {
                    return -1;
                } else {
                    return 0;
                }
            }
        }

        @Override
        public String toString() {
            return this.value + ", ";
        }
    }

    public static void main(String[] args) {
        Player fp = new Player("first");
        Player sp = new Player("second");

        LinkedList<Integer> numbers = new LinkedList<>();
        for (int i = 0; i < 10; ++i) {
            int rnd = (int) (Math.random() * 10);
            //Debugging of unique cards
            System.out.println("Debug iteration " + i);
            System.out.println(numbers.toString());
            System.out.println(rnd);
            if (numbers.contains(rnd)) {
                while (numbers.contains(rnd)) {
                    rnd = (int) (Math.random() * 10);
                    //Debugging of unique cards
                    System.out.println(numbers.contains(rnd));
                    System.out.println(rnd);
                }
            }
            numbers.add(rnd);
            if (i < 5) {
                fp.addCard(new Card(rnd));
            } else {
                sp.addCard(new Card(rnd));
            }
        }
        //Debugging of unique cards
        System.out.println(fp.toString());
        System.out.println(sp.toString());
        System.out.println(numbers);
        numbers.clear();
        int turn = 0;
        while(turn<106)
        {
            Card fcard = fp.takeTop();
            Card scard = sp.takeTop();
            //Debug turn
            System.out.println();
            System.out.println("Turn " + turn);
            System.out.println(fp.toString());
            System.out.println(sp.toString());
            System.out.println(fcard.value + " and " + scard.value);

            if(Card.compare(fcard, scard) == 1) {
                fp.addCard(fcard, scard);
            }
            else {
                sp.addCard(scard, fcard);
            }

            if(fp.isEmpty()){
                System.out.println("first " + (++turn));
                break;}
            if(sp.isEmpty()){
                System.out.println("second " + (++turn));
                break;}

            ++turn;
        }
        if (turn==106){System.out.println("botva");}
    }
}
