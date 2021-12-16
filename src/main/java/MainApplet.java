import processing.core.PApplet;

public class MainApplet extends PApplet{
    public static  final int WIDTH=800;
    public static  final int HEIGHT=600;

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
        for(int x=0;x<=WIDTH;x+=1.5)
            ellipse(x, (HEIGHT/5), 20, 20);
        for(int x=0;x<=WIDTH;x+=2.5)
            ellipse(x, (HEIGHT*2)/5, 20, 20);
        for(int x=0;x<=WIDTH;x+=3.5)
            ellipse(x, (HEIGHT*3)/5, 20, 20);
        for(int x=0;x<=WIDTH;x+=4.5)
            ellipse(x, (HEIGHT*4)/5, 20, 20);

    }
    void construct(){
        PApplet.main("MainApplet");
    }
}
