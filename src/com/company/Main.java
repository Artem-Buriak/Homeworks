package com.company;

import homework7.StringAndSymbols;

public class Main {

    public static void main(String[] args) {
        StringAndSymbols.findSymbolOccurance("google", 'o');
        StringAndSymbols.findWordPosition("Madagaskar", "gas");
        StringAndSymbols.stringReverse("Want to learn Java");
        StringAndSymbols.isPalindrome("Tenet");
        String word = StringAndSymbols.startGame();
        StringAndSymbols.wordGame(word);
    }
}
