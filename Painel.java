class Painel {
    public static void main(String[] argumentos) throws InterruptedException {

        Sensores painel = new Sensores();
        painel.sensorManual();
        painel.AtivadorTemperatura();
        painel.sensorTemperatura();
        painel.AtivadorUmidade();
        painel.sensorUmidade();
        painel.AtivadorCarbonico();
        painel.sensorCarbonico();


    }
}
