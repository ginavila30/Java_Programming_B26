package day36_methods;

public class ArrayIndexOf {
    static public int indexOf(int[]nums,int element){
        for (int i=0; i<nums.length;i++) {
            if(nums[i]==element){
                return i;
            }
        }

        return -1;
    }
    static public int indexOf(String[]strs,String element){
        for (int i=0; i<strs.length;i++) {
            if(strs[i].equals(element)){
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[]arr={12,5,1,5,2,6,5};
        System.out.println(indexOf(arr,4));
        System.out.println(indexOf(arr,20));
        System.out.println(indexOf(arr,5));//My code will return first occurrence.

        String []word={"java","apple","water","hello"};
        System.out.println(indexOf(word,"hello"));// overloaded so I can work with int arrays and String arrays
    }
}

