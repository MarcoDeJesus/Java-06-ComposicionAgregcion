public class Main {
    public static void main(String args[]){
        Celular xiaomi = new Celular();
        xiaomi.ObtenerCaracteristicasDelCelular();
    }
}

class Celular{
    Pantalla pantalla;

    Celular(){
        pantalla = new Pantalla("LCD");
    }

    void ObtenerCaracteristicasDelCelular(){
        System.out.println("El Celuar tiene una pantalla: " + pantalla.tipoPantalla);
    }
}

class Pantalla{
    String tipoPantalla;

    Pantalla (String tipoPantalla){
        this.tipoPantalla = tipoPantalla;
    }
}
