import java.util.ArrayList;

public class DepartamentoPrincipal implements Departamento{

    private String nombreDepartamento;
    private Empleado director;
    private ArrayList<Departamento> DepartamentosSecundarios = new ArrayList<>();


    public DepartamentoPrincipal(String nombre, Empleado director){
        this.director = director;
        nombreDepartamento = nombre;
    }

    public void ejecutarOrden(String orden){
        director.responder(orden);

        for (Departamento DepartamentoSecundario : DepartamentosSecundarios){
            DepartamentoSecundario.ejecutarOrden(orden);
        }
    }

    public void agregarDepartamento(Departamento nuevoDepartamento){
        DepartamentosSecundarios.add(nuevoDepartamento);
    }

    public void eliminarDepartamento(Departamento departamentoCerrado){
        DepartamentosSecundarios.remove(departamentoCerrado);
    }

    public String getNombre(){
        return nombreDepartamento;
    }

}
