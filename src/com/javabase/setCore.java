package com.javabase;

import java.util.Scanner;

/**
 * 需求:在编程竞赛中，有6个评委为参赛的选手打分，分数为0-100整数分
 *      选手最后得分为：去掉一个最高分一个最低分后的4个评委平均值（不考虑小数部分）
 * 思路：
 * 1:定义一个数组，用动态初始化完成数组元素的初始化，长度为6
 * 2：键盘录入评委分数
 * 3：由于是6个评委打分，所以接收评委分数的操作，用循环改进
 * 4：定义方法实现获取数组中的最高分，调用方法
 * 5：定义方法实现获取数组中的最低分，调用方法
 * 6：定义方法实现获取数组中的所有元素和，调用方法
 * 7：按照计算规则进行计算得到评分
 * 8：输出平均分
 *
 */
public class setCore {
    public static void main(String[] args) {
        //定义一个数组，用动态初始化完成数组元素的初始化，长度为6
        int[] arr=new int[6];
        //键盘录入评委分数
        Scanner sc = new Scanner(System.in);
        //由于是6个评委打分，所以接收评委分数的操作，用循环改进
        for (int x=0;x<arr.length;x++){
            System.out.println("请输入第"+(x+1)+"评委打分：");
            arr[x]=sc.nextInt();
        }
        //定义方法实现获取数组中的最高分，调用方法
        int max = getMax(arr);
        System.out.println("最高分为："+max);
        //定义方法实现获取数组中的最低分，调用方法
        int min = getMin(arr);
        System.out.println("最低分为："+min);
        //定义方法实现获取数组中的所有元素和，调用方法
        int sum = getSum(arr);
        System.out.println("总分为："+sum);
        //按照计算规则进行计算得到评分
        int avg = (sum-max-min)/(arr.length-2);
        System.out.println("去掉最高最低："+(sum-max-min));
        System.out.println("去掉最高最低："+(arr.length-2));
        System.out.println("选手的最终得分是："+avg);


    }

    /*获取数组最大值
      两个明确：
          返回值类型：int
          参数：int[] arr
   */

public static int getMax(int[] arr){
    int max = arr[0];
    for (int x=1;x<arr.length;x++){
        if (arr[x]>max){
            max=arr[x];
        }
    }
    return max;
}

    /*获取数组最小值
      两个明确：
          返回值类型：int
          参数：int[] arr
   */

    public static int getMin(int[] arr){
        int min = arr[0];
        for (int x=1;x<arr.length;x++){
            if (arr[x]<min){
                min=arr[x];
            }
        }
        return min;
    }
  /*获取数组和
      两个明确：
          返回值类型：int
          参数：int[] arr
   */

    public static int getSum(int[] arr){
        int sum = 0;
        for (int x=0;x<arr.length;x++){
            sum += arr[x];
        }
        return sum;
    }
    /*遍历数组
          两个明确：
              返回值类型：void
              参数：int[] arr
       */
    public static void printArray(int[] arr) {
        System.out.print("[");
        for (int x = 0; x < arr.length; x++) {
            if (x == arr.length - 1) {
                System.out.print(arr[x]);
            } else {
                System.out.print(arr[x] + ", ");
            }
        }
        System.out.println("]");
    }
}
