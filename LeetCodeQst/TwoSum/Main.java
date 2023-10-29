public class Main {
    public static void main(String[] args) {
        class Solution {
            public int[] twoSum(int[] nums, int target) {
                for (int i = 0; i < nums.length; i++) {//passando por todos os numeros do array
                    for (int j = i + 1; j < nums.length; j++) {// passando um numero a frente do array
                        if (nums[i] + nums[j] == target) {
                            return new int[]{i, j};
                        }
                    }
                }
                return new int[2];
            }
        }
    }
}