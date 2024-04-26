import java.util.LinkedList;
import java.util.Scanner;

public class proyecto 
{
    public static void main(String[] args) 
    {
        LinkedList<Empleado> empleados = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 2; i++) 
        {
            Empleado employee = new Empleado(null, null, null, null, i);
            System.out.print("Ingrese el nombre: ");
            employee.setNombre(sc.next());

            System.out.print("Ingrese el Apellido: ");
            employee.setApellido(sc.next());

            System.out.print("Ingrese la edad: ");
            employee.setEdad(sc.nextInt());

            System.out.print("Ingrese el Direccion: ");
            employee.setDireccion(sc.next());

            sc.nextLine();
            System.out.print("Ingrese el cargo: ");
            employee.setCargo(sc.next());

            sc.nextLine();

            empleados.add(employee);
        }
        String cadena = "";
        for (Empleado employee : empleados) 
        {
            cadena = cadena + "[" + employee.getNombre() + "]" + "[" + employee.getApellido() + "]" + "[" + employee.getEdad() + "]" + "[" + employee.getDireccion() + "]" + "[" + employee.getCargo() + "]" + "\n";
        }
        System.out.println(cadena);

        sc.close();
    }
    
}