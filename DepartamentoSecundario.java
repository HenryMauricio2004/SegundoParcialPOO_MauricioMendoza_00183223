import java.util.ArrayList;

public class DepartamentoSecundario implements Departamento{

    private String nombreDepartamento;

    private ArrayList<Empleado> listaEmpleados = new ArrayList<>();

    public DepartamentoSecundario(String nombre){
        nombreDepartamento = nombre;
    }

    public void ejecutarOrden(String orden){

        for (Empleado empleado : listaEmpleados){
            empleado.responder(orden);
        }

    }

    public void agregarEmpleado(Empleado nuevoEmpleado){
        listaEmpleados.add(nuevoEmpleado);
    }

    public void eliminarEmpleado(Empleado empleadoDespedido){
        listaEmpleados.remove(empleadoDespedido);
    }


    public String getNombre(){
        return nombreDepartamento;
    }
}
