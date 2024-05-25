public class CreadorDepartamentos {

    public void crearDepartamentoSecundario(DepartamentoPrincipal departamentoPrincipal, String nombreDepartamentoSecundario){

        Departamento nuevoDepartamentoSecundario = new DepartamentoSecundario(nombreDepartamentoSecundario);

        departamentoPrincipal.agregarDepartamento(nuevoDepartamentoSecundario);

        System.out.printf("Departamento %s ha sido anexado a %s", nombreDepartamentoSecundario, departamentoPrincipal.getNombre());
    }


    public Departamento CrearDepartamentoPrincipal(String nombreDepartamentoPrincipal, Empleado director){
        Departamento nuevoDepartamentoPrincipal = new DepartamentoPrincipal(nombreDepartamentoPrincipal, director);
        return nuevoDepartamentoPrincipal;
    }

    
}
