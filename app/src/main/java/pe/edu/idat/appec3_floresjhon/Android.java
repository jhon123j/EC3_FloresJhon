package pe.edu.idat.appec3_floresjhon;

public class Android {

    private int id;
    private int image;
    private String paradero;
    private String pasajero;
    private String ok;

    public Android(int id, int image, String paradero, String pasajero, String ok) {
        this.id = id;
        this.image = image;
        this.paradero = paradero;
        this.pasajero = pasajero;
        this.ok = ok;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getParadero() {
        return paradero;
    }
    public void setParadero(String paradero) {
        this.paradero = paradero;
    }
    public String getPasajero() {
        return pasajero;
    }
    public void setPasajero(String pasajero) {
        this.pasajero = pasajero;
    }
    public String getOk() {
        return ok;
    }
    public void setOk(String ok) {
        this.ok = ok;
    }

}
