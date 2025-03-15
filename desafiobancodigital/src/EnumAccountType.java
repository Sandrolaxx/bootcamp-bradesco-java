package desafiobancodigital.src;

public enum EnumAccountType {
    
    CHECKING_ACCOUNT("CHECKING_ACCOUNT", "Conta corrente"),
    SALARY_ACCOUNT("CHECKING_ACCOUNT", "Conta salário");

    private String key;

    private String description;

    EnumAccountType(String key, String description) {
        this.key = key;
        this.description = description;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}
