import java.util.*;


class Line {
    private static point startpoint;
    private static point endpoint;

    Line(point startpoint,point endpoint){
       this.startpoint=startpoint;
       this.endpoint=endpoint;
    }

    public static double calculatelength(){
        double x1=startpoint.getX();
        double y1=startpoint.getY();
        double x2=endpoint.getX();
        double y2=endpoint.getY();

        return Math.sqrt(Math.pow(x2-x1,2)+Math.pow(y2-y1,2));

    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("WELCOME TO LINE COMPARISON COMPUTATION");
        point startpoint1=new point(sc.nextInt(), sc.nextInt());

        String s1="";
        s1+=startpoint1.getX();
        s1+=startpoint1.getY();
        point endpoint1=new point(sc.nextInt(),sc.nextInt());
        String e1="";
        e1+=endpoint1.getX();
        e1+=endpoint1.getY();
        Line line1=new Line(startpoint1,endpoint1);
        double length_line1=Line.calculatelength();
        point startpoint2=new point(sc.nextInt(), sc.nextInt());
        String s2="";
        s2+=startpoint2.getX();
        s2+=startpoint2.getY();
        point endpoint2=new point(sc.nextInt(),sc.nextInt());
        String e2="";
        e2+=endpoint2.getX();
        e2+=endpoint2.getY();
        Line line2=new Line(startpoint2,endpoint2);
        double length_line2=Line.calculatelength();




       if((s1.equals(s2))&&(e1.equals(e2)) ){
         System.out.println("line1 is equal to line2");

       }
       else if((s1.equals(e2)) && (s2.equals(e1))){
            System.out.println("line1 is equal to line2");

       }
       else{
           System.out.println("line1 is not equal to line2");

       }







        System.out.println(length_line1+" "+length_line2);

        point endpoint1=new point(sc.nextInt(),sc.nextInt());

        Line line1=new Line(startpoint1,endpoint1);
        double length_line1=Line.calculatelength();

        Line line1=new Line(startpoint,endpoint);
        double length_line1=Line.calculatelength();
      



    }


}
class point{
    double x;
    double y;
    point(double x,double y){
        this.x=x;
        this.y=y;

    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }
}

