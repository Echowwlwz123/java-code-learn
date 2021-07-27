package com.javabase;

/**
 * 数组内容相同
 * 设计一个方法，用于比较连个数组的内容是否相同
 * 定义两个数组，分别使用静态初始化完成数组元素的初始化
 * 定义一个方法，用于比较两个数组内容是否相同
 * 返回值类型：boolean
 * 参数：int[]arr,int[]arr2
 * 思路：
     * 1:比较两个数组的内容是否相同，按照下面步骤实现就可以了
     * 2:首先比较数组长度，如果长度不同，数组内容肯定不同，返回false
     * 3:其次遍历，比较两个数组中的每个元素，只要元素不同，返回false
     * 4:最后循环数组遍历结束后，返回true
 */
public class sameElement {
    public static void main(String[] args) {
        //定义两个数组，分别使用静态初始化完成数组元素的初始化
        int[] arr = {11, 22, 33, 44, 55};
        int[] arr2 = {11, 22, 33, 44, 55};
        boolean flag = compare(arr,arr2);
        System.out.println(flag);

    }
    //定义一个方法，用于比较两个数组内容是否相同
    /*
     *两个明确：
     *     返回值类型：boolean
     *     参数：int[]arr,int[]arr2
     */
    public static boolean compare(int[] arr, int[] arr2) {
        //首先比较数组长度，如果长度不同，数组内容肯定不同，返回false
        if (arr.length != arr2.length) {
            return false;
        }
        //其次遍历，比较两个数组中的每个元素，只要元素不同，返回false
        for (int x = 0;x<arr.length;x++){
            if (arr[x]!=arr2[x]){
                return false;

            }
        }
        //最后循环数组遍历结束后，返回true
        return true;
    }
}
