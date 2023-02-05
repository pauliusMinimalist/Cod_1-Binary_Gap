public class Main {
    public static void main(String[] args) {

        Solution sol = new Solution();
        System.out.println(sol.solution(5));

    }
}

class Solution {
    public int solution(int N) {

        String bin = Integer.toBinaryString(N);
        String[] arr = bin.split("");

        int cout = 0;
        int max = 0;

        for (int i = 1; i <= arr.length; i++) {

            if (arr[i - 1].contains("0")) {
                cout++;
            } else {

                if (cout > max) {
                    max = cout;
                }
                cout=0;

            }

        }


        return max;
    }
}