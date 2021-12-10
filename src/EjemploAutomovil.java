public class EjemploAutomovil {
    public static void main(String[] args) {
        Automovil subaru = new Automovil("Subaru", "Impresa");
        subaru.setCapacidadEstanque(2);
        subaru.setColor("Blanco");

        Automovil mazda = new Automovil("Mazda", "BT-50");
        mazda.setCilindrada(3.0);
        mazda.setColor("Rojo");

        Automovil nissan = new Automovil();
        nissan.setFabricante("Nissan");
        nissan.setModelo("2");

        Automovil nissan2 = new Automovil();
        nissan2.setFabricante("Nissan");
        nissan2.setModelo("3");

        Automovil nissan3 = nissan;

        System.out.println("¿Son iguales nissan y nissan2? " + (nissan == nissan2));
        System.out.println("¿Son iguales (equals) nissan y nissan2? " + (nissan.equals(nissan2)));

        System.out.println("¿Son iguales nissan y nissan3? " + (nissan == nissan3));

        System.out.println(subaru.detalle());
        System.out.println(mazda.detalle());
        System.out.println(subaru.acelerar(3000));
        System.out.println(subaru.frenar());

        System.out.println(mazda.acelerarFrenar(4000));

        System.out.println("Kilómetros por litro " + subaru.calcularConsumo(300, 0.6f));

        System.out.println("Kilómetros por litro " + subaru.calcularConsumo(300, 60));
    }
}
