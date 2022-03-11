package HerenciaPolimorfismo;

public class Circle extends Figure{
float radio;


public Circle(float radio)
{
    this.radio=radio;
}
@Override
    public float getPerimeter(float x)
    {
        float Perimeter= (float) (3.1416*x*x);
        return Perimeter;


    }
}
