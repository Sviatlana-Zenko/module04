/*
 * Создать объект класса Текст, используя классы Предложение, Слово.
 * Методы: дополнить текст, вывести на консоль текст, заголовок текста.
 */

package by.java_online.module04.aggregation_and_composition.task01.main;

import by.java_online.module04.aggregation_and_composition.task01.entity.Sentence;
import by.java_online.module04.aggregation_and_composition.task01.entity.Text;
import by.java_online.module04.aggregation_and_composition.task01.entity.Word;
import by.java_online.module04.aggregation_and_composition.task01.logic.TextLogic;
import by.java_online.module04.aggregation_and_composition.task01.view.TextView;

public class Main {
    public static void main(String[] args) {
        TextLogic logic = new TextLogic();
        TextView view = new TextView();

        Sentence s1 = new Sentence();
        logic.addWordToSentence(s1, new Word("This"));
        logic.addWordToSentence(s1, new Word("is"));
        logic.addWordToSentence(s1, new Word("the"));
        logic.addWordToSentence(s1, new Word("heading"));

        Sentence s2 = new Sentence();
        logic.addWordToSentence(s2, new Word("We"));
        logic.addWordToSentence(s2, new Word("are"));
        logic.addWordToSentence(s2, new Word("creating"));
        logic.addWordToSentence(s2, new Word("new"));
        logic.addWordToSentence(s2, new Word("text."));

        Text text = new Text(s1);
        logic.addSentenceToText(text, s2);
        logic.addSentenceToText(text, "It's our second sentence. Fascinating process!");

        System.out.println("Heading ->");
        view.printHeading(text.getHeading());

        System.out.println("Text body ->");
        view.printTextBody(text.getBody());
    }
}