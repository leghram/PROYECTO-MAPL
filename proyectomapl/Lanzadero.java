
package proyectomapl;

public class Lanzadero implements Naves {

    private String id, tipoNave, descripcion, fuenteEnergia, pais;
    private int velocidad,tripulantes;
    
    public Lanzadero(String id, String tipo, String des, int vel, String fuen, int tri, String pa){
        this.id = id;
        tipoNave = tipo;
        descripcion =des;
        velocidad = vel;
        fuenteEnergia=fuen;
        tripulantes =tri;
        pais = pa;
    }
    
    @Override
    public String ObtenerIdNave() {
        return id;
    }

    @Override
    public String ObtenerTipoNave() {
       return tipoNave;
    }

    @Override
    public String ObtenerDescripcion() {
        return descripcion;
    }

    @Override
    public int ObtenerVelocidad() {
        return velocidad;
    }

    @Override
    public String ObtenerFuenteEnergia() {
        return fuenteEnergia;
    }

    @Override
    public int ObtenerTripulantes() {
        return tripulantes;
    }

    @Override
    public String ObtenerPais() {
        return pais;
    }
    
}
