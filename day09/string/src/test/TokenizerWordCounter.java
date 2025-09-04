package test;

import java.util.StringTokenizer;

public class TokenizerWordCounter
        implements  WordCounter{

    @Override
    public int countWord(String str) {
        StringTokenizer stringTokenizer =
                new StringTokenizer(str, " ");
        return stringTokenizer.countTokens();
    }
}
