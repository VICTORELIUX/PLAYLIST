public class Musicas {
    // Atributes
    String Titulo;
    String Album;
    String Fecha;
    int Duracion;

    // Metodos
    /*
     * public Musicas(String _Titulo, String _Album, String _Fecha, int _Duracion) {
     * Titulo = _Titulo;
     * Album = _Album;
     * Fecha = _Fecha;
     * Duracion = _Duracion;
     * }/*
     */

    public Musicas(String Titulo, String Album, String Fecha, int Duracion) {
        this.Titulo = Titulo;
        this.Album = Album;
        this.Fecha = Fecha;
        this.Duracion = Duracion;
    }

    public void ShowPlaylist() {
        System.out.println("Titulo " + Titulo);
        System.out.println("Album " + Album);
        System.out.println("Fecha " + Fecha);
        System.out.println("Duracion " + Duracion);
    }
}
