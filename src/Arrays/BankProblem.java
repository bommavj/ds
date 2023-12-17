package Arrays;

public class BankProblem {

    public static void main(String[] args) {
        String s = "AABBA";
        int val[] = {4,2,2,1,6};
        int aTotal = 0;
        int bTotal = 0;
        for (int i=0; i<val.length; i++){
            if(s.charAt(i) == 'A'){
                aTotal += val[i];
            }else if(s.charAt(i) == 'B'){
                bTotal += val[i];
            }
        }
        System.out.println("Total A Bal " + aTotal);
        System.out.println("Total B Bal " + bTotal);

        int minBalA = 0;
        int minBalB = 0;
        for (int i=0; i<val.length; i++){
            if(s.charAt(i) == 'A'){
                aTotal += val[i];
                bTotal -= val[i];
                minBalA = aTotal;
                System.out.println("A Bal " +  minBalA + " and B Bal " + minBalB);
            }else if(s.charAt(i) == 'B'){
                bTotal += val[i];
                aTotal -= val[i];
                minBalB = bTotal;
                System.out.println("A Bal " +  minBalA + " and B Bal " + minBalB);
            }
        }

        System.out.println(minBalA);
        System.out.println(minBalB);

    }
}
