public class Main {
    public static void main(String[] args) {
        Shape[] arr = new Shape[]{new Circle(), new Square(), new Triangle()};//Массив с тремя объектами из каждого класса
        for (int i = 0; i < arr.length; i++ )
            arr[i].draw();//вызов метода
    }
}