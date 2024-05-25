public class Empleado {

    private String nombre;
    private String tipo;

    public Empleado(String nombre){
        this.nombre = nombre;
    }

    public void responder(String orden) {

        if (tipo == "director") {

            System.out.printf("%s ordena a los empleados a que ejecuten la orden: %s", nombre, orden);
        } else {
            System.out.printf("%s ejecuta orden: %s\n", nombre, orden);
        }
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public String getNombre(){
        return nombre;
    }

}
