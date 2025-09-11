package test;

import test.exception.CsvFormatException;

public class Test04 {
    public static void main(String[] args) {
        //CSV 형식 오류 (Checked)
        //요구: name,age,city 3필드가 아니면 CsvFormatException 던지는 프로그램을 작성하시오.
        //age는 정수.
        String csv = "kim,39,서울"; //"[kim, 서른,서울]"
        CSVValidator csvValidator = new CSVValidator();
        try {
            csvValidator.validate(csv);
            System.out.println(csv);
        } catch (CsvFormatException e) {
            System.out.println(e.getMessage());
        }
    }

    static  void validate(String csv) throws CsvFormatException {
        if(csv==null || csv.isBlank()) {
            throw new CsvFormatException("csv는 필수입력 사항입니다.");
        }
        String[] csvs = csv.split(",");
        if(csvs.length!=3) {
            throw new CsvFormatException("컬럼수는 3개여야 합니다.");
        }
        try {
            Integer.parseInt(csvs[1].trim());
        } catch (NumberFormatException e) {
            throw new CsvFormatException("나이는 정수여야 합니다.");
        }
    }
    static  String validate02(String csv) throws CsvFormatException {
        if(csv==null || csv.isBlank()) {
            throw new CsvFormatException("csv는 필수입력 사항입니다.", csv);
        }
        String[] csvs = csv.split(",");
        if(csvs.length!=3) {
            throw new CsvFormatException("컬럼수는 3개여야 합니다.", csv);
        }
        try {
            Integer.parseInt(csvs[1].trim());
        } catch (NumberFormatException e) {
            throw new CsvFormatException("나이는 정수여야 합니다.", csv);
        }
        return "ok  ["+csv+"]";
    }
}
