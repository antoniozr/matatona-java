package academy.devdojo.maratonajava.javacore.Dconstrutores.dominio;

public class Anime {
    private String nome;
    private String tipo;
    private int espisodios;
    private String genero;
    private String estudio;

    public Anime(String nome, String tipo, int espisodios, String genero) {
        this.nome = nome;
        this.tipo = tipo;
        this.espisodios = espisodios;
        this.genero = genero;
    }
    public Anime(String nome, String tipo, int espisodios, String genero, String estudio) {
    this(nome, tipo, espisodios, genero);
    this.estudio = estudio;
    }

    public Anime() {
        System.out.println("Dentro do construtor sem argumentos");
    }

    public void imprime(){
        System.out.println(this.nome);
        System.out.println(this.tipo);
        System.out.println(this.espisodios);
        System.out.println(this.genero);
        System.out.println(this.estudio);
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public String getTipo(String tipo) {
        return this.tipo;
    }
    public void setEspisodios(int espisodios) {
        this.espisodios = espisodios;
    }
    public int getEspisodio(int espisodio) {
        return this.espisodios;
    }
}
