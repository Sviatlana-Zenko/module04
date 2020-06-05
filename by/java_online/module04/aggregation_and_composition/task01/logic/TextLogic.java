package by.java_online.module04.aggregation_and_composition.task01.logic;

import by.java_online.module04.aggregation_and_composition.task01.entity.Sentence;
import by.java_online.module04.aggregation_and_composition.task01.entity.Text;
import by.java_online.module04.aggregation_and_composition.task01.entity.Word;

public class TextLogic {
    public void addSentenceToText(Text text, String textToAdd) {
        int symbol;
        int beginIndex;
        int endIndex;

        symbol = 32;  // Пробел
        beginIndex = 0;

        endIndex = textToAdd.indexOf(symbol, beginIndex);

        while (endIndex < textToAdd.length() - 1) {
            Sentence sentence = new Sentence();
            boolean condition = true;

            while (condition) {
                if (endIndex == -1) {
                    endIndex = textToAdd.length();
                }

                String temp;
                temp = textToAdd.substring(beginIndex, endIndex);

                addWordToSentence(sentence, new Word(temp));

                if (temp.charAt(temp.length() - 1) == '!' |
                        temp.charAt(temp.length() - 1) == '?' |
                        temp.charAt(temp.length() - 1) == '.') {

                    addSentenceToText(text, sentence);

                    condition = false;
                }

                if (endIndex < textToAdd.length() - 1) {
                    beginIndex = endIndex + 1;
                    endIndex = textToAdd.indexOf(symbol, beginIndex);
                }
            }
        }
    }

    public void addSentenceToText(Text text, Sentence sentence) {
        text.getBody().add(sentence);
    }

    public void addWordToSentence(Sentence sentence, Word word) {
        sentence.getWords().add(word);
    }
}
