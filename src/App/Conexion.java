
package App;


public class Conexion {
    //Declaracion 
    private static Conexion instancia;
    //private static Conexion instancia = new Conexion();
    
    //para evitar instancia mediante operador "new"
    private Conexion(){
    
    }
    
    //Para obtener la instancia unicamente por este metodo
    //Notese la palabra reservada "static" hace posible el acceso mediante Clase.metodo
    public static Conexion getInstancia(){
        if (instancia == null){
            instancia = new Conexion();
        }
        return instancia;        
    }
         //Metodo de prueba
    public void conectar(){
        System.out.println("Me conecte a la BD");
    }
    
        //Metodo de prueba
    public void desconectar(){
        System.out.println("Me desconecte de la BD");
    }
    
    
}
