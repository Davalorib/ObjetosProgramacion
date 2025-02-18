package Herencia.RedesSociales;

public class RedSocial {

    public static void main(String[] args) {

        Usuario usuario = new Usuario("Ana",30,"ana",231);
        Influencer influencer = new Influencer("Luis", 25, "luis_influencer", 5000);
        influencer.meterColaboradores("MediaMarkt", "Yoigo", "Temu");
        Streamer streamer = new Streamer("Carlos", 27, "carlos_stream", 1500, 150,2000);
        Basico basico = new Basico("Pedro", 22, "pedro123", 455);

        usuario.mostrarInfo();
        System.out.println();
        influencer.mostrarInfo();
        System.out.println();
        streamer.mostrarInfo();
        System.out.println();
        basico.mostrarInfo();

    }

}
