sealed interface Fruit permits Apple,Orange{

}
sealed class Apple implements Fruit permits Dragon,Pappaya{

}


non-sealed class Orange implements Fruit{

}
sealed public class Shape permits Square,Rectangle{
}
non-sealed class Square extends Shape{

}
final class Rectangle extends Shape{

}