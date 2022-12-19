import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        //第一题
        int[] nums2 = {1, 4, 5, 2, 7, 9, 11, 10};
        int[] nums1 = {4, 2, 5, 11};
        test1(nums1, nums2);
        //第二题
        int[] pushed = {1,2,3,4,5};
        int[] popped = {4,5,3,2,1};
        System.out.println(test2(pushed,popped));
        ArrayList<Object> objects = new ArrayList<>();
        objects.add(3);
        //第三题
        int[] nums = {1,2,3,2,2,10,9};
        System.out.println(test3(nums));
    }

    public static void test1(int[] nums1, int[] nums2) {
        int[] temp = new int[nums1.length];//默认是-1
        for (int i = 0; i < nums1.length; i++) {
            temp[i] = -1;//默认为-1
        }
        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++) {
                if (nums1[i] == nums2[j] && j + 1 < nums2.length) {
                    for (int k = j + 1; k < nums2.length; k++) {
                        if (nums1[i] < nums2[k]) {
                            temp[i] = nums2[k];
                            k = nums2.length;
                        }
                    }
                }
            }
        }
        System.out.println(Arrays.toString(temp));
    }
    public static boolean test2(int[] pushed, int[] popped) {
        if (pushed.length == 0 && popped.length == 0) return true;
        if (pushed.length == 0 && popped.length != 0 ||
                pushed.length != 0 && popped.length == 0 ||
                pushed.length != popped.length)
            return false;
        Stack<Integer> stack = new Stack<>();//栈
        int len = pushed.length;//长度
        int index = 0;//索引
        for (int i = 0; i < len; i++) {
            stack.push(pushed[i]);
            while (!stack.isEmpty() && index < len && stack.peek() == popped[index]) {
                stack.pop();
                index++;
            }
        }
        return index == len;
    }
    public static int test3(int[] nums){
        ArrayList<Object> objects = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            objects.add(nums[i]);
        }
        for (int i = 0; i < nums.length; i++) {
            int count = 0;
            for (int j = 0; j < nums.length; j++) {
                if(nums[i] == nums[j])
                    count++;
                if(count == 2) {
                    objects.remove(new Integer(nums[j]));
                    j = nums.length;
                }
            }
        }
        int sum = 0;
        for (Object object : objects) {
            sum += (Integer)object;
        }
        return sum;
    }
}