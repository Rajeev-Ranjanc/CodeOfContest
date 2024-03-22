import java.util.HashMap;
import java.util.Map;

public class Thrice {
    public static void main(String[] args) {
        int[] nums = {2,2,2,1};
        System.out.println(find_single(nums , 4));
    }
    public static int find_single(int[] nums , int N){
        Map<Integer , Integer> map = new HashMap<>();
        for (int i = 0; i < N; i++) {
            map.put(nums[i] , map.getOrDefault(nums[i],0)+1);
        }
        for(int num : map.keySet()){
            if(map.get(num) == 1){
                return num;
            }
        }
        return -1;
    }
}
