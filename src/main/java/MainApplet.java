import processing.core.PApplet;

public class MainApplet extends PApplet{
    public static  final int WIDTH=800;
    public static  final int HEIGHT=600;
    ellipseClass eo1= new ellipseClass(1.5, (HEIGHT/5), 20, 20,WIDTH, this);
    ellipseClass eo2= new ellipseClass(2.5, (HEIGHT*2)/5, 20, 20,WIDTH, this);
    ellipseClass eo3= new ellipseClass(3.5, (HEIGHT*3)/5, 20, 20,WIDTH, this);
    ellipseClass eo4= new ellipseClass(4.5, (HEIGHT*4)/5, 20, 20,WIDTH, this);

    public void settings() {
        size(WIDTH, HEIGHT);
    }

    @Override
    public  void setup(){
        System.out.println("Printed from the setup");
        background(160);
        //ellipse(WIDTH/2,HEIGHT/2,100,100);
    }

    public void draw() {
        //ellipse(mouseX, mouseY, 20, 20);
        eo1.move();
        eo2.move();
        eo3.move();
        eo4.move();

    }
    void construct(){
        PApplet.main("MainApplet");
    }
}
