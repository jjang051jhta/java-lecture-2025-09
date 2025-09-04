package test;

import java.util.*;

public class Test1002 {
    public static void main(String[] args) {
        List<Word> wordList =  new ArrayList<>();
        wordList.add(new Word("constructor", "생성자"));
        wordList.add(new Word("overriding", "재정의"));
        wordList.add(new Word("extends", "상속"));
        wordList.add(new Word("array", "배열"));
        wordList.add(new Word("string", "문자열"));
        wordList.add(new Word("character", "문자"));
        wordList.add(new Word("integer", "정수"));
        wordList.add(new Word("double", "실수"));
        wordList.add(new Word("abstract", "추상"));
        wordList.add(new Word("implements", "구현하다"));
        //주석을 다시기 바랍니다.
        int total = wordList.size(); //list의 크기
        System.out.println("단어테스트를 시작합니다.");
        System.out.println("현재 "+ total+"개의 단어가 들어있습니다.");
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();


        for(int i=0;i<5;i++) {
            Word answer = wordList.get(random.nextInt(total));
            Set<String> examples = new HashSet<>();
            examples.add(answer.getKorean()); //examples에 미리 정답하나를 넣어둔다.
            while (examples.size() < 4) {
                Word wrong = wordList.get(random.nextInt(total));
                examples.add(wrong.getKorean());
            }
            //examples.size()가 처음에 1인데 4개가 될때까지 반복을 한다.
            //이때 중복문자열은 들어가지 못하므로 반드시 4개가 채워진다.
            //System.out.println(examples);
            List<String> question =  new ArrayList<>(examples);
//            System.out.println(question);
            Collections.shuffle(question); //list를 만들어서 섞어둔다.
//            System.out.println(question);
            //System.out.println("=============");
            System.out.println("qestion "+(i+1)+") "+answer.getEnglish()+" ? ");
            for(int j=0;j<examples.size();j++) {
                System.out.print(j+1+") "+question.get(j)+"\t");
            }
            //question에 있는 4개의 문자열을 출력한다.
            System.out.println("정답을 입력하세요.");
            int answerIdx = scanner.nextInt();
            // question에 있는 문자열과 정답이 일치하는지 따져본다.
            if(question.get(answerIdx-1).equals(answer.getKorean())) {
                System.out.println("정답");
            }else {
                System.out.println("땡");
            }
        }
    }
    //로또 만들어보기
    //[4,5,6,7,23,45]
    //[4,5,6,7,23,45]
    //[4,5,6,7,23,45]
}
