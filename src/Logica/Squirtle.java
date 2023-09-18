
package Logica;


public class Squirtle extends Pokemon implements IAgua{

    public Squirtle() {
    }

    
    
    
    
    
    @Override
    protected void atacarPlacaje() {
         System.out.println(" Hola soy Squirtle y este es mi ataque placaje");
    }

    @Override
    protected void atacarAraniazo() {
        System.out.println(" Hola soy Squirtle y este es mi ataque arañazo");
    }

    @Override
    protected void atacarMordico() {
        System.out.println(" Hola souy Squirtle y este es mi ataque mordisco");
    }

    @Override
    public void atacarHidrobomba() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void atacarBurbuja() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void atacarPistolaAgua() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
