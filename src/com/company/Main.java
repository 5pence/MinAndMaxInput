package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        inputThenPrintSumAndAverage();
//	    minAndMax();
    }

    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets) {
        double amount = 0d;
        if (width <= 0 || height <= 0 || areaPerBucket <= 0 || extraBuckets < 0) {
            return -1;
        }
        double wh = width * height;
        if (extraBuckets == 0) {
            amount = Math.ceil(wh / areaPerBucket);
        } else {
            wh = wh - (areaPerBucket * extraBuckets);
            amount = Math.ceil(wh / areaPerBucket);
        }
        return (int) amount;
    }

    public static int getBucketCount(double width, double height, double areaPerBucket) {
        double amount = 0d;
        if (width <= 0 || height <= 0 || areaPerBucket <= 0) {
            return -1;
        }
        double wh = width * height;
        amount = Math.ceil(wh / areaPerBucket);
        return (int) amount;
    }

    public static int getBucketCount(double area, double areaPerBucket) {
        double amount = 0d;
        if (area <= 0 || areaPerBucket <= 0) {
            return -1;
        }
        amount = Math.ceil(area / areaPerBucket);
        return (int) amount;
    }



    public static void inputThenPrintSumAndAverage() {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        long avg = 0;
        int counter = 0;

        while(true) {
            boolean hasNext = scanner.hasNextInt();
            if(hasNext) {
                int num = scanner.nextInt();
                scanner.nextLine();
                sum += num;
                counter ++;
            } else {
                avg =Math.round((double)sum / (double) counter);
                System.out.println("SUM = " + sum + " AVG = " + avg);
                break;
            }
        }
    }

    public static void minAndMax() {
        Scanner scanner = new Scanner(System.in);
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        while(true) {
            System.out.println("Enter a number: ");
            boolean hasNext = scanner.hasNextInt();
            if(hasNext) {
                int num = scanner.nextInt();
                scanner.nextLine();
                if (num < min) {
                    min = num;
                }
                if (num > max) {
                    max = num;
                }

            } else {
                System.out.println("Min: " + min);
                System.out.println("Max: " + max);
                break;
            }
        }
    }


}
