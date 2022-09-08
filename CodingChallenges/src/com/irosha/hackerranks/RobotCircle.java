package com.irosha.hackerranks;

public class RobotCircle {

    boolean checkCircle(String [] instArr){

        if (instArr.length != 1){

            for (int i = 0; i < instArr.length; i++) {

                if(instArr[i] =="G"){

                }

                String s = instArr[i];

            }
            return true;
        }else{
            return false;
        }


    }

    public static void main(String[] args) {

        RobotCircle rc = new RobotCircle();
        String [] instArr = {"G", "G", "L","L","G", "G"};
        String [] instArr1 = {"G"};
        String [] instArr2 = {"G", "G"};
        String [] instArr3 = {"G", "R"};

        System.out.println(rc.checkCircle(instArr));
        System.out.println(rc.checkCircle(instArr1));
        System.out.println(rc.checkCircle(instArr2));
        System.out.println(rc.checkCircle(instArr3));
    }
}
