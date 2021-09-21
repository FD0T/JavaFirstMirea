package ru.mirea.task4.BallPack;

public class Ball {
    private double x = 0;
    private double y = 0;

    Ball(double x, double y)
    {
        this.x = x;
        this.y = y;
    }

    Ball() {}

    public double getX(){ return(this.x); }
    public double getY() { return(this.y); }
    public void setX(double x) { this.x = x; }
    public void setY(double y) { this.y = y; }
    public void setXY(double x, double y) { this.x = x; this.y = y; }
    public void move(double xDisp, double yDisp) {
        this.x += xDisp;
        this.y += yDisp;
    }
    public String toString() {return "x: " + this.x + " y: " + this.y; }
}
