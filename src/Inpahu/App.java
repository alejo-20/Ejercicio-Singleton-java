package Inpahu;

import App.Conexion;


public class App {

    public static void main(String[] args) {
        //Instanciacion por constructor prohibido por ser "private"
        //Conexion c = new Conexion(); (no se puede)
        Conexion c = Conexion.getInstancia();
        c.conectar();
        c.desconectar();
    
        boolean respuesta = c instanceof Conexion;
        System.out.println(respuesta);
   
    }
    
}
