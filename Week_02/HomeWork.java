class Solution {
    /**两数之和*/
    public int[] twoSum(int[] nums, int target) {
        int[] result = {};
        for(int i =0; i<nums.length;i++){
            for(int j = i+1;j<nums.length; j++){
                if(nums[i] + nums[j] == target){
                    return new int[] { i, j };
                }
            }
        }
        return result;
    }

    /**有效的字母异位词*/
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        int[] counter = new int[26];
        for(int i=0;i<s.length();i++){
            counter[s.charAt(i)- 'a']++;
        }
        for(int i= 0;i<t.length();i++){
            counter[t.charAt(i) - 'a']--;
            if(counter[t.charAt(i) - 'a'] <0){
                return false;
            }
        }
        return true;
    }
}
}