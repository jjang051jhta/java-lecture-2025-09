package test;

import java.util.*;

public class Test0902 {
    public static void main(String[] args) {
        Map<String,Country> countryMap = new HashMap();
        countryMap.put("대한민국",new Country("대한민국","서울"));
        countryMap.put("일본",new Country("일본","도쿄"));
        countryMap.put("미국",new Country("미국","워싱턴"));
        countryMap.put("호주",new Country("호주","캔버라"));
        countryMap.put("캐나다",new Country("캐나다","오타와"));
        System.out.println("수도맞추기 게임을 시작합니다. 나라이름이 나오면 수도이름을 입력하세요");
        //System.out.println(countryMap.size());
        Scanner scanner = new Scanner(System.in);
        //ArrayList<Integer> keyList = new ArrayList<>();
        Set<String> keySet = countryMap.keySet(); //중복없다
        List<String> keyList =  new ArrayList<>(keySet);
        System.out.println(keyList);
        //Object keyArray[] = keySet.toArray(); //배열로 바뀐다.
        while(true) {
            Random random = new Random();//0,1,2,3,4
            int num = random.nextInt(countryMap.size());
            String keyString  = keyList.get(num);
            System.out.println(keyString+"의 수도는?");
            String capital = countryMap.get(keyString).getCapital();
            String str = scanner.nextLine();
            if(str.equals("그만")) break;
            if(str.equals(capital)) {
                System.out.println("정답");
            } else {
                System.out.println("땡");
            }
        }
    }
}
