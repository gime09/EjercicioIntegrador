
package Logica;


public class Charmander extends Pokemon implements IFuego{

    public Charmander() {
    }
    
    

    @Override
    protected void atacarPlacaje() {
        System.out.println(" Hola soy Charmander y este es mi ataque placaje");
    }

    @Override
    protected void atacarAraniazo() {
        System.out.println(" Hola soy Charmander y este es mi ataque arañazo");
    }

    @Override
    protected void atacarMordico() {
        System.out.println(" Hola soy  Charmander y este es mi ataque mordisco");
    }

    @Override
    public void atacarPunioFuego() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void atacarLanzallamas() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void atacarAscuas() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
    
    
    
}
