package HerenciaPolimorfismo;



public abstract class Figure {

    static int figuresCreated;
    final String name;

    protected Figure(String name) {
        this.name = name;
    }

    public String getName()
    {
        return name;
    }
    abstract public float getArea();

    abstract public float getPerimete();
}
