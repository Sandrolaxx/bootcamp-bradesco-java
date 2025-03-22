package vanilla.facade;

public class Facade {
    
    public void migrateCustomer(String name, String cep) {

        CepAPI cepAPI = CepAPI.getInstante();

        CrmService crmService = new CrmService();

        String city =  cepAPI.getCityByCep(cep);
        String state =  cepAPI.getStateByCep(cep);

        crmService.saveCustomer(name, cep, city, state);
    }

}
