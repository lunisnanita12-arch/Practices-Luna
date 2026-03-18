public class Vuelos {

    // atributos 

    private String destino;
    private String origen;
    private String fecha;
    private int pasajeros;

    //Constructor con Parametro

    public Vuelos(String destino, String origen, String fecha, int pasajeros) {
        this.destino = destino;
        this.origen = origen;
        this.fecha = fecha;
        this.pasajeros = pasajeros;
    }
    //Getters

    public String getDestino() {
        return destino;
    }


    public String getOrigen() {
        return origen;
    }


    public String getFecha() {
        return fecha;
    }


    public int getPasajeros() {
        return pasajeros;
    }

    
}
