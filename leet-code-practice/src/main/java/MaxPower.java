public class MaxPower {

    public static void main(String[] args) {

        System.out.println(maxPower("abbcccddddeeeeedcba"));
    }

    public static int maxPower(String s) {
        if(s==null) return -1;
        int max=0;
        int i=0;
        while(i<s.length()){
            int j=i+1;
            int currmax=0;
            while(s.charAt(i)==s.charAt(j)&& j<s.length()){
                j++;
                currmax++;
            }
            max=Math.max(max,currmax);
            i++;

        }
    return max;
    }
}
