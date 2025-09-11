package test;

import test.exception.CsvFormatException;

public class CSVValidator   {
    public void validate(String csv) throws CsvFormatException {
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
    }
}
