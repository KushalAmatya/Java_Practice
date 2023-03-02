public class Shape {
    int width;
    int height;
    public Shape(int w, int h){
        width = w;
        height = h;
    }
    public void area(){
        int area = width * height;
        System.out.println(area);
    }
}
