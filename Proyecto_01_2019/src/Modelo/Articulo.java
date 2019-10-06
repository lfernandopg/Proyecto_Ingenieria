package Modelo;

public class Articulo {
    private String codigo;
    private String titulo;
    private char decision;
    private int link_e[];
    
    public Articulo(String codigo,String titulo){
        this.codigo = codigo;
        this.titulo = titulo;
        decision = 'P';
        link_e = new int[2];
    }

    public String getCodigo() {
        return codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public char getDecision() {
        return decision;
    }

    public int[] getLink_e() {
        return link_e;
    }

    public void setDecision(char decision) {
        this.decision = decision;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
   
}
