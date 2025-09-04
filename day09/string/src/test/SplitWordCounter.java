package test;

public class SplitWordCounter
        implements WordCounter {
    @Override
    public int countWord(String str) {
        String words[] = str.split(" ");
        return words.length;
    }
}
