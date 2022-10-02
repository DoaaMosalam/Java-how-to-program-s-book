package com.company;

public class Card {
    private String face; // reference to the face name;
    private String suite; // reference to the suite name;
 // create empty constructor
    public Card(){}
 // create constructor receives two string consisting face and suit.
 public Card(String cardFace,String cardSuite){
        this.face = cardFace;
        this.suite = cardSuite;
 }
    // return String representation of Card
    @Override
    public String toString() {
//        return "Card{" +
//                "face='" + face + '\'' +
//                ", suite='" + suite + '\'' +
//                '}';
        return face + " of " + suite;
    }
}
