
public class Box {
	int depth;
    int height;
    int width;
    Box(int d,int h,int w){
    	depth=d;
    	height=h;
    	width=w;
    }
    int volume() {
    	return depth*height*width;
    }
    public static void main(String args[]) {
    	Box b=new Box(12,10,2);
    	int vol=b.volume();
    	System.out.println(vol);
    }
}
