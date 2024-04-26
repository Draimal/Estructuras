public class Empleado 
{
   private String nombre, apellido, direccion, cargo;
   private int edad;

   public Empleado(String Nombre, String Apellido, String Direccion, String Cargo, int Edad)
   {
        nombre = Nombre;
        apellido = Apellido;
        direccion = Direccion;
        cargo = Cargo;
        edad = Edad;

   }

public String getNombre() {
    return nombre;
}

public void setNombre(String nombre) {
    this.nombre = nombre;
}

public String getApellido() {
    return apellido;
}

public void setApellido(String apellido) {
    this.apellido = apellido;
}

public String getDireccion() {
    return direccion;
}

public void setDireccion(String direccion) {
    this.direccion = direccion;
}

public String getCargo() {
    return cargo;
}

public void setCargo(String cargo) {
    this.cargo = cargo;
}

public int getEdad() {
    return edad;
}

public void setEdad(int edad) {
    this.edad = edad;
}
}
