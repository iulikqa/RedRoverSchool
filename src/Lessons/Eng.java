package Lessons;

public class Eng {
    public static void main(String[] args) {

        boolean itMoves = false;
        boolean shouldItMove = true;
//
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

        if (itMoves && !shouldItMove){
            System.out.println("Use duct tape!");
        }else if (!itMoves && shouldItMove){
            System.out.println("Use WD-40!");
        }else {
            System.out.println("No problem!");
        }

    }
}
