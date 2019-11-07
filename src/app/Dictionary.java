package app;
import java.util.ArrayList;

public class Dictionary {
    private ArrayList<Word> wordList;

    public Dictionary() {
        this.wordList = new ArrayList<Word>();
    }

    public void addWord(String name, String definition) {
        Word word = new Word(name, definition);
        wordList.add(word);
    }

    public Word getRandomWord() {
        int wordIndex = (int) Math.floor(Math.random()*wordList.size());
        return wordList.get(wordIndex);
    }

    public Word getBiggestAverageWord() {
        int size = Math.min(10, wordList.size());
        int i;
        Word word;
        Word biggestAverageWord = getRandomWord();
        for(i=0; i<size; i++) {
            word = getRandomWord();
            if(word.getWordAverage() > biggestAverageWord.getWordAverage()) {
                biggestAverageWord = word;
            }
        }
        return biggestAverageWord;
    }
/*
    public void setWordAttemptValue(int wordId, double value) {
        int i=0;
        while(i<wordList.size() && wordList.get(i).getWordId()!=wordId) i++;
        if(i!=wordList.size()) {
            wordList.get(i).addNewAttemptValue(value);
        }
    }
*/
}