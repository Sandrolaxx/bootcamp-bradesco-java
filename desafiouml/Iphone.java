package desafiouml;

public class Iphone implements IReprodutorMusical, IAparelhoTelefonico, INavegadorInternet {
    
    private String modelo;

    private String sistemaOperacional;
    
    private String numeroSerie;
    
    private int bateria;
    
    private int armazenamentoTotal;
    
    private int armazenamentoUsado;
    
    private int memoriaRAM;
    
    private int volume;
    
    private String idioma;

    public Iphone(String modelo, String sistemaOperacional, String numeroSerie, int bateria, 
        int armazenamentoTotal, int armazenamentoUsado, int memoriaRAM, int volume, String idioma) {
        this.modelo = modelo;
        this.sistemaOperacional = sistemaOperacional;
        this.numeroSerie = numeroSerie;
        this.bateria = bateria;
        this.armazenamentoTotal = armazenamentoTotal;
        this.armazenamentoUsado = armazenamentoUsado;
        this.memoriaRAM = memoriaRAM;
        this.volume = volume;
        this.idioma = idioma;
    }

    @Override
    public void tocar() {
        System.out.println("Reproduzindo música...");
    }
    
    @Override
    public void pausar() {
        System.out.println("Música pausada.");
    }
    
    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Música selecionada: " + musica);
    }

    @Override
    public void ligar(String numero) {
        System.out.println("Ligando para " + numero);
    }
    
    @Override
    public void atender() {
        System.out.println("Atendendo chamada...");
    }
    
    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz...");
    }

    @Override
    public void exibirPagina(String url) {
        System.out.println("Exibindo página: " + url);
    }
    
    @Override
    public void adicionarNovaAba() {
        System.out.println("Nova aba adicionada.");
    }
    
    @Override
    public void atualizarPagina() {
        System.out.println("Página atualizada.");
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getSistemaOperacional() {
        return sistemaOperacional;
    }

    public void setSistemaOperacional(String sistemaOperacional) {
        this.sistemaOperacional = sistemaOperacional;
    }

    public String getNumeroSerie() {
        return numeroSerie;
    }

    public void setNumeroSerie(String numeroSerie) {
        this.numeroSerie = numeroSerie;
    }

    public int getBateria() {
        return bateria;
    }

    public void setBateria(int bateria) {
        this.bateria = bateria;
    }

    public int getArmazenamentoTotal() {
        return armazenamentoTotal;
    }

    public void setArmazenamentoTotal(int armazenamentoTotal) {
        this.armazenamentoTotal = armazenamentoTotal;
    }

    public int getArmazenamentoUsado() {
        return armazenamentoUsado;
    }

    public void setArmazenamentoUsado(int armazenamentoUsado) {
        this.armazenamentoUsado = armazenamentoUsado;
    }

    public int getMemoriaRAM() {
        return memoriaRAM;
    }

    public void setMemoriaRAM(int memoriaRAM) {
        this.memoriaRAM = memoriaRAM;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

}
