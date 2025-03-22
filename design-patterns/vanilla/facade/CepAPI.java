package vanilla.facade;

public class CepAPI {
    
    private static CepAPI instance = new CepAPI();

    private CepAPI() {
    }

    public static CepAPI getInstante() {
        return instance;
    }

    public String getCityByCep(String cep) {
        return "Cascavel";
    }

    public String getStateByCep(String cep) {
        return "Paraná";
    }

}
