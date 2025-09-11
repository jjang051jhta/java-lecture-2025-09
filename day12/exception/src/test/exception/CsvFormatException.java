package test.exception;

public class CsvFormatException extends Exception {
    public CsvFormatException(String message) {
        super("원인 : "+message);
    }
    public CsvFormatException(String str,String message) {
        super("원인 : "+message+" / ["+str+"]"); //정수여야합니다 / [kim,서른,서울]
    }
}
