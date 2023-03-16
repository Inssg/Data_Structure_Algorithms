class Solution {
    public int solution(int[][] triangle) {
        int answer = 0;
             Integer[][] dp = new Integer[triangle.length][];
        for (int i = 0; i < triangle.length; i++ ) {
            dp[i] = new Integer[triangle[i].length];
        }

        dp[0][0] = triangle[0][0];


        for (int i = 1; i < triangle.length; i++) {
            for (int j = 0; j < triangle[i].length; j++) {
                if (dp[i][j] == null) {
                    if (j == 0) {
                        dp[i][j] = dp[i - 1][j] + triangle[i][j];
                    } else if (j == triangle[i].length - 1) {
                        dp[i][j] = dp[i - 1][j - 1] + triangle[i][j];
                    } else {
                        dp[i][j] = Math.max(dp[i - 1][j - 1] , dp[i - 1][j]) + triangle[i][j];
                    }
                }

            }
        }

        for (int i = 0; i < dp[dp.length - 1].length; i++) {
            if (answer < dp[dp.length - 1][i]) {
                answer = dp[dp.length - 1][i];
            }
        }
        return answer;
    }
}