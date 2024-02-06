package Lessons;

public class Eng {
    public static void main(String[] args) {

        boolean itMoves = false;
        boolean shouldItMove = true;

//        if(itMoves){
//            if (shouldItMove){
//                System.out.println("No problem!");
//            } else {
//                System.out.println("Use duct tape!");
//            }
//        }else {
//            if (shouldItMove){
//                System.out.println("Use WD-40!");
//            }else {
//                System.out.println("No problem!");
//            }
//        }

        if (itMoves && !shouldItMove) {
            System.out.println("Use duct tape!");
        } else if (!itMoves && shouldItMove) {
            System.out.println("Use WD-40!");
        } else {
            System.out.println("No problem!");
        }

        //3.1 if/else/boolean/logical_operators
        int a = 9;
        int b = 55;
        int c = 8;

        if (a > b) {
            System.out.println("a больше b");
        } else if (a == c) {
            System.out.println("a равно c");
        } else {
            System.out.println("b больше a, a не равно c");
        }
    }

}

