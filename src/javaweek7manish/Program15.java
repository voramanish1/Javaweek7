package javaweek7manish;

public class Program15 {
    double width, height;

    public Program15() {

    }

    public Program15(double width, double height) {
        if (width < 0 && height < 0) {
            this.width = 0.0;
            this.height = 0.0;
        } else {
            this.width = width;
            this.height = height;
        }
    }

    public static void main(String[] args) {
        Program15 program15 = new Program15(5, 4);
        System.out.println("area= " + program15.getArea());
        program15.setHeight(-1.5);
        System.out.println("width= " + program15.getWidth());
        System.out.println("height= " + program15.getHeight());
        System.out.println("area= " + program15.getArea());
    }
    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }


    public void setWidth(double width) {
        if (width < 0) {
            this.width = 0;
        } else {
            this.width = width;
        }
    }
    public void setHeight(double height) {
        if (height < 0) {
            this.height = 0;
        } else {
            this.height = height;
        }
    }

    public double getArea() {
        return this.width * this.height;
    }
}

