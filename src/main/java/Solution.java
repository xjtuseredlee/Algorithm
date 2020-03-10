public class Solution {

    public boolean duplicate(int numbers[],int length,int [] duplication) {

        //{2,3,0,1}
        if (numbers == null || numbers.length <= 0) {
            return false;
        }
        for(int i=0;i<numbers.length-1;i++){
            if(numbers[i]<0 || numbers[i]> numbers.length-1) {
                return false;
            }
        }
        for(int i=0;i<=numbers.length-1;) {
            if(numbers[i] != i) {
                if (numbers[i] == numbers[numbers[i]]) {
                    duplication[0] = numbers[i];
                    return true;
                }
                 int temp = numbers[i];
                 numbers[i] = numbers[temp];
                 numbers[temp] = temp;
            } else {
                 i++;
            }
        }
        return false;
    }

    public static void main(String args []) {
        int numbers[] = {2,3,1,1};
        int length = 4;
        int [] duplication = {2};
        Solution solution = new Solution();
        System.out.println(solution.duplicate(numbers,length,duplication));
    }
}
