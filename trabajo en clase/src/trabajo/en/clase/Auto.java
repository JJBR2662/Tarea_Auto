package trabajo.en.clase;

public class Auto {
    public String nombre;
    public String motor;
    public String color;
    public int year;
    public String marca;
    private String owner;
    public double precio;
    
    public Auto(String nombre, String motor, String color, int year, String marca, String owner, double precio){
        this.nombre=nombre;
        this.motor=motor;
        this.color=color;
        this.year=year;
        this.marca=marca;
        this.owner=owner;
        this.precio=precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMotor() {
        return motor;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Los datos del los autos son{" + "nombre=" + nombre + ", motor=" + motor + ", color=" + color + ", year=" + year + ", marca=" + marca + ", owner=" + owner + ", precio=" + precio + '}';
    }
    
    
    
    
}
