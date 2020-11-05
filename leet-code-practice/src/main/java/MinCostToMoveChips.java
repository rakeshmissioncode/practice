public class MinCostToMoveChips {
    public static void main(String[] args) {

        int [] price={2,2,2,3,3};
        int d=minCostToMoveChips(price);
        System.out.println(d);
    }


    public static int minCostToMoveChips(int[] position) {
        int chipsAtEvenPos=0;
        int chipsAtOddPos=0;

        for(int chips:position){
            if((chips & 1)==0) chipsAtEvenPos++;
            else chipsAtOddPos++;

        }
        return Math.min(chipsAtOddPos,chipsAtEvenPos);


    }
}
