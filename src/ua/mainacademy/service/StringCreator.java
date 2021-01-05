package ua.mainacademy.service;

public class StringCreator {
    public static StringBuilder multiplyStringCreator(long one, long two){
        int lengthOne = String.valueOf(one).length();
        int lengthTwo = String.valueOf(two).length();
        long multiply = one*two;
        int lengthMultiply = String.valueOf(multiply).length();
        String indentOne= symbolMultiply(lengthMultiply-lengthOne,' ');
        String indentTwo = symbolMultiply(lengthMultiply-lengthTwo,' ');
        String firstLine = symbolMultiply(String.valueOf(two).length(),'-');
        String secondLine = symbolMultiply(lengthMultiply,'-');
        StringBuilder middleResultString = new StringBuilder();
        StringBuilder stringTwo = new StringBuilder(String.valueOf(two));
        stringTwo.reverse();
        for (int i=0; i<lengthTwo;i++){
            long middleResultInt = one*Long.valueOf(stringTwo.substring(i,i+1));
            middleResultString.append(symbolMultiply(lengthMultiply-String.valueOf(middleResultInt).length()-i,' '));
            middleResultString.append(middleResultInt);
            middleResultString.append(symbolMultiply(i,' ')).append("\n");
        }
        return new StringBuilder("\n"+indentOne+one+"\n"+indentTwo+two +"\n"+indentTwo+firstLine+"\n"+middleResultString+secondLine+"\n"+multiply);
    }

    public static String symbolMultiply (int count, char symbol){
        StringBuilder result = new StringBuilder();
        for (int i=0;i<count;i++) {
            result.append(symbol);
        }
        return result.toString();
    }
}
