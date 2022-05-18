package com.bridgelabz.Polymorpism;
class Polygon{
    // method to render a shape
    public void render(){
        System.out.println("Rendering Polygon ...");
    }
}
class Square extends Polygon{
    // renders Square

    @Override
    public void render() {
        System.out.println("Rendering Square ...");
    }
}
class Circle extends Polygon{
    // renders Circle

    @Override
    public void render() {
        System.out.println("Rendering Circle ...");
    }
}
public class Polymorphism
{
    public static void main(String[] args) {
      // create an object of square
        Square s1 = new Square();
        s1.render();

        // create an object of Circle
        Circle c1 = new Circle();
        c1.render();
    }
}
