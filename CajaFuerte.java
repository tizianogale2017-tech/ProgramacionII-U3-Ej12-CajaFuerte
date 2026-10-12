package Ejercicio12_cajaFuerte;

public class CajaFuerte {
    private static final int MAXIMO_INTENTOS = 3;

    private String combinacion;
    private boolean bloqueada;
    private int intentosFallidos;

    public CajaFuerte(String combinacion) {
        this.combinacion = combinacion;
        this.bloqueada = false;
        this.intentosFallidos = 0;
    }

    public boolean abrir(String intentoClave) {
        if (bloqueada) {
            return false;
        }
        if (combinacion.equals(intentoClave)) {
            intentosFallidos = 0;
            return true;
        }
        intentosFallidos++;
        if (intentosFallidos >= MAXIMO_INTENTOS) {
            bloqueada = true;
        }
        return false;
    }

    public boolean cambiarCombinacion(String claveActual, String nuevaClave) {
        if (bloqueada || !combinacion.equals(claveActual) || nuevaClave.length() < 4) {
            return false;
        }
        combinacion = nuevaClave;
        return true;
    }

    public boolean isBloqueada() {
        return bloqueada;
    }

    public int getIntentosFallidos() {
        return intentosFallidos;
    }
}
