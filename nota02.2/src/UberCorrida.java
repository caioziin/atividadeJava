public class UberCorrida {

    double distancia;
    int tempoEspera;
    double tarifaBase;
    double fatorDemanda;

    public UberCorrida(){

        this.distancia = 0.0;
        this.tempoEspera = 0;
        this.tarifaBase = 0.0;
        this.fatorDemanda = 1.0;

    }

    public UberCorrida(double distancia, int tempoEspera, double tarifaBase, double fatorDemanda){

        this.distancia = distancia;
        this.tempoEspera = tempoEspera;
        this.tarifaBase = tarifaBase;
        this.fatorDemanda = fatorDemanda;

    }

    public double getDistancia() {
        return distancia;
    }

    public void setDistancia(double distancia) {
        this.distancia = distancia;
    }

    public int getTempoEspera() {
        return tempoEspera;
    }

    public void setTempoEspera(int tempoEspera) {
        this.tempoEspera = tempoEspera;
    }

    public double getTarifaBase() {
        return tarifaBase;
    }

    public void setTarifaBase(double tarifaBase) {
        this.tarifaBase = tarifaBase;
    }

    public double getFatorDemanda() {
        return fatorDemanda;
    }

    public void setFatorDemanda(double fatorDemanda) {
        this.fatorDemanda = fatorDemanda;
    }

    public double calcularValorCorrida() {

        double valorFinal = (distancia * 2) + (tempoEspera * 0.5) + (tarifaBase * fatorDemanda);
        return valorFinal;

    }

    public void exibirDetalherCorrida(){

        System.out.println("Detalhes da corrida: ");
        System.out.println("A distância pecorrida foi de: " + distancia + " km");
        System.out.println("O tempo de espera foi de: " + tempoEspera + " minutos");
        System.out.println("Tarifa base: " + tarifaBase);
        System.out.println("Fator demanda: " + fatorDemanda);
        System.out.println("O valor final da corrida foi de: " + calcularValorCorrida());
    }






}
