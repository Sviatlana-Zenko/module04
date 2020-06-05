package by.java_online.module04.aggregation_and_composition.task01.view;

import by.java_online.module04.aggregation_and_composition.task01.entity.Sentence;

import java.util.List;

public class TextView {
    public void printTextBody(List<Sentence> body) {
        if (body.size() > 0) {
            for (int i = 0; i < body.size(); i++) {
                if (i < body.size() - 1) {
                    printSentence(body.get(i));
                    System.out.print(" ");
                } else {
                    printSentence(body.get(i));
                }
            }
        }
    }

    public void printHeading(Sentence heading) {
        System.out.print("'");
        printSentence(heading);
        System.out.print("'\n");
    }

    public void printSentence(Sentence sentence) {
        if(sentence.getWords().size() > 0) {
            for (int i = 0; i < sentence.getWords().size(); i++) {
                if (i < sentence.getWords().size() - 1) {
                    System.out.print(sentence.getWords().get(i).getWord() + " ");
                } else {
                    System.out.print(sentence.getWords().get(i).getWord());
                }
            }
        }
    }
}
