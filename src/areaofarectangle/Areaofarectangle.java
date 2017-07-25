/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package areaofarectangle;

import java.util.Scanner;

/**
 *
 * @author deborah
 */
public class Areaofarectangle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int length, width;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the length: ");
        length = input.nextInt();
        System.out.print("Enter the width: ");
        width = input.nextInt();
        int area= rectangleArea(length, width);
        int per = rectanglePerimeter(length, width);
        System.out.printf("Rectangle Area : %d; Perimeter : %d\n", area, per);
        //The name of this method is main,which returns nothing thus the presence of the word void.
        //Its static because i do not need to create/declare an object of areaofrectangle(the class) in order to use this method(main).
        //The method is public which means it is accessible outside of the class named area of rectangle.
       
    }
    public static int rectangleArea(int someLength,int someWidth){
      //the method is static because it is in the class Areaofrectangle and i want to be able to use it without declaring an object.  
     return someLength * someWidth;
    } 
    public static int rectanglePerimeter(int someLength,int someWidth){
        return 2 * (someLength + someWidth);
    }
}

