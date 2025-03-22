package vanilla.facade;

public class CrmService {
    
    public void saveCustomer(String name, String cep, String city, String state) {
        System.out.println("Cliente " + name + " salvo no sistema do CRM");
    }

}
