package bucky;

import java.util.Scanner;

public class Tasc1 {

    public static void main(String[] args) {

            doPush10Ups();
    }

    public static void doPush10Ups(){
//        for(int i=1; i<=10; i++){
//            System.out.println("Pushup " +i);
//        }
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 2 numbers");
        int nums1 = input.nextInt();
        int nums2 = input.nextInt();
        if(nums1<nums2){
            for(int i=nums1; i<=nums2; i++){
                System.out.println(i+ " ");
            }

        }else if(nums1>nums2){
            for(int k=nums1; k>nums2; k--){
                System.out.println(k + " ");
            }

        }else{
            System.out.println(nums1);
        }

    }
}
