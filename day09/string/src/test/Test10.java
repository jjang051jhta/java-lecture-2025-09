package test;

public class Test10 {
    public static void main(String[] args) {
        Player me = new Player("장성호");
        Computer computer = new Computer("컴퓨터");
        String rockPaperScissors [] = {"가위","바위","보"};
        while(true) {
            int myChoice = me.turn();
            int computerChoice = computer.turn();

            if(myChoice==4) break;
            System.out.print(me.getName()+"님 "+rockPaperScissors[myChoice-1] +" / " +
                    computer.getName()+" "+rockPaperScissors[computerChoice-1]+" = "
            );
            if(myChoice==computerChoice){

                System.out.println("비겼습니다.");
            }
            else if((myChoice==1 && computerChoice==3) ||
                    (myChoice==2 && computerChoice==1) ||
                    (myChoice==3 && computerChoice==2)) {

                System.out.println("사람이 이겼습니다.");
            } else {

                System.out.println("사람이 졌습니다.");
            }
        }
    }
}
