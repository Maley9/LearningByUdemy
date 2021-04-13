package com.company.Final;

class PointWithConstants{
   int x,y;
    final int width = 12;
    final int height;

    PointWithConstants(){
        height = 20;
    }

    PointWithConstants( int posX, int posY){
        this();
        x = posX;
        y = posY;
    }

    public void changePos(int newX, final int newY){
        newX = 30;
        x = newX;
        y = newY;
    }
}


public class FinalCon {

    public static void main(String[] args) {

        PointWithConstants point = new PointWithConstants(33, 22);
    }

}
