package Ejercicio12_cajaFuerte;

public class Main {
    public static void main(String[] args) {
        CajaFuerte caja = new CajaFuerte("4721");

        System.out.println("Intento con 0000: " + (caja.abrir("0000") ? "ABIERTA" : "falló") + " (fallidos: " + caja.getIntentosFallidos() + ")");
        System.out.println("Intento con 4721: " + (caja.abrir("4721") ? "ABIERTA" : "falló") + " (fallidos: " + caja.getIntentosFallidos() + ")");

        System.out.println("Cambio de clave con la actual incorrecta: " + (caja.cambiarCombinacion("1111", "9999") ? "OK" : "RECHAZADO"));
        System.out.println("Cambio de clave correcto: " + (caja.cambiarCombinacion("4721", "9999") ? "OK" : "RECHAZADO"));

        for (int i = 1; i <= 3; i++) {
            caja.abrir("0000");
            System.out.println("Error consecutivo " + i + " - bloqueada: " + caja.isBloqueada());
        }
        System.out.println("Intento con la clave correcta (9999) estando bloqueada: " + (caja.abrir("9999") ? "ABIERTA" : "BLOQUEADA, no abre"));
    }
}
