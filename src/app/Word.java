package app;

public class Word {
    private static int idCount = 0; 
    private final int wordId;
    private int attemptCount;
    private String name;
    private String definition;
    private double wordAverage;

    public Word(String name, String definition) {
        this.attemptCount = 1;
        this.wordId = ++this.idCount;
        this.name = name;
        this.definition = definition;
        this.wordAverage = 3;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDefinition() {
        return definition;
    }

    public void setDefinition(String definition) {
        this.definition = definition;
    }

    public double getWordAverage() {
        return wordAverage;
    }

    public void addNewAttemptValue(double value) {
        this.attemptCount++;
        this.wordAverage = (this.wordAverage + value)/this.attemptCount;
    }

    public int getWordId() {
        return wordId;
    }

    public int getAttemptCount() {
        return attemptCount;
    }
    
}