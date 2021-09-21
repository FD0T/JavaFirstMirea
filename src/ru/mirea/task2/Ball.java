package ru.mirea.task2;

public class Ball {
    private int x = 0;
    private int y = 0;

    Ball(int x, int y)
    {
        this.x = x;
        this.y = y;
    }

    Ball() {}

    public int getX(){ return(this.x); }
    public int getY() { return(this.y); }
    public void setX(int x) { this.x = x; }
    public void setY(int y) { this.y = y; }
    public void setXY(int x, int y) { this.x = x; this.y = y; }
    public String toString() {return "x: " + this.x + " y: " + this.y; }
}
