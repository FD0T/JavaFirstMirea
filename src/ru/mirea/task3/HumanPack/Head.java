package ru.mirea.task3.HumanPack;

public class Head extends Human {
    private int iq = 100;
    private double head_size;
    private String eye_color;
    private int fov = 180;
    private int visual_acuity = 1;

    Head(){}
    Head(double head_size, String eye_color){
        this.head_size = head_size;
        this.eye_color = eye_color;
    }
    Head(int iq, double head_size, String eye_color, int fov, int visual_acuity){
        this.iq = iq;
        this.head_size = head_size;
        this.eye_color = eye_color;
        this.fov = fov;
        this.visual_acuity = visual_acuity;
    }

    Head(String name, int age, double height, double weight, int iq, double head_size, String eye_color, int fov, int visual_acuity){
        super(name, age, height, weight);
        this.iq = iq;
        this.head_size = head_size;
        this.eye_color = eye_color;
        this.fov = fov;
        this.visual_acuity = visual_acuity;
    }

    public void setIq(int iq) { this.iq = iq; }
    public int getIq() { return this.iq; }
    public void sethead_size(double head_size) { this.head_size = head_size; }
    public double gethead_size() { return this.head_size; }
    public void setEye_color(String eye_color) { this.eye_color = eye_color; }
    public String getEye_color() { return this.eye_color; }
    public void setFov(int fov) { this.fov = fov; }
    public int getFov() { return this.fov; }
    public void setVisual_acuity(int visual_acuity) { this.visual_acuity = visual_acuity; }
    public int getVisual_acuity() { return this.visual_acuity; }

    public String toString() {
        return "Head{" +
                "iq=" + iq +
                ", head_size=" + head_size +
                ", eye_color='" + eye_color + '\'' +
                ", fov=" + fov +
                ", visual_acuity=" + visual_acuity +
                '}';
    }
}
