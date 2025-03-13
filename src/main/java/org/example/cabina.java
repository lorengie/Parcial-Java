package org.example;

public class cabina {
    int minutosDistancia= 150;
    int munutosLocal=50;
    int nCabina;
    int totalCabinas;
    int totalLlamadas;
    int totcalingresos;

    public cabina(int minutosDistancia, int munutosLocal, int nCabina, int totalCabinas, int totalLlamadas, int totcalingresos) {
        this.minutosDistancia = minutosDistancia;
        this.munutosLocal = munutosLocal;
        this.nCabina = nCabina;
        this.totalCabinas = totalCabinas;
        this.totalLlamadas = totalLlamadas;
        this.totcalingresos = totcalingresos;
    }

    public int getMinutosDistancia() {
        return minutosDistancia;
    }

    public int getMunutosLocal() {
        return munutosLocal;
    }

    public void InfoCabina(){
        System.out.println("la cabina"+ nCabina);
        System.out.println("ha hecho "+minutosDistancia +"llamadas a distacnia");
        System.out.println("ha hecho"+munutosLocal+ "llamadas localmente");
    }
    public int LlamadaLocal(int duracion){
        this.minutosDistancia *=duracion;
        return duracion;
    }
    public int LlamadaDistancia(int duracion){
        this.minutosDistancia *=duracion;
        return duracion;
    }
    public int CabinasTotales(int cantidad){
        this.totalCabinas = cantidad;
        return cantidad;
    }
    public int LlamadasTotates(int ttllamadas){
        this.totalLlamadas= ttllamadas;
        return ttllamadas;
    }
    public int IngresosTotales(int ttIngesos){
        this.totcalingresos = ttIngesos;
        return ttIngesos;
    }
}
