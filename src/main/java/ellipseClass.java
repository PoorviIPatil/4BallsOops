import processing.core.PApplet;

public class ellipseClass{
    private double inc;
    private int yAxis;
    private int a;
    private int b;
    private int width;
    private PApplet pApplet;
    ellipseClass(double x,int yAxis,int a,int b,int width,PApplet pApplet){
        this.inc=x;
        this.yAxis=yAxis;
        this.a=a;
        this.b=b;
        this.width=width;
        this.pApplet=pApplet;
    }

    public void move(){
        for(int x=0;x<=width;x+=inc)
            pApplet.ellipse(x, yAxis, 20, 20);
    }

}
