package Modelo;

/**
 *
 * @author alexanyernas
 */
public class Conjunto_Articulos {
    private Articulo Articulos[];
    //variables de trabajo:
    private int i,l;
    private String t;
    private char dc;
    
    //public void Agregar(Articulo a)
    
    public void registrar_decision(int i, char d){
        Articulos[i].setDecision(d);
    }
    
    public String obtener_titulo(int link_a){
        return Articulos[link_a].getTitulo();
    }
    
    public Articulo[] reportar(){
        i = 0;
        Articulo[] Reporte = new Articulo[Articulos.length];
        l = Articulos.length;
        while(i < 1){
            dc = Articulos[i].getDecision();
            if(dc != 'P'){
                t = Articulos[i].getTitulo();
                Reporte[i].setTitulo(t);
                Reporte[i].setDecision(dc);
            }
            i = i + 1;
        }
        return Reporte;
    }
    
    public Articulo[] reportar_aceptados(){
        i = 0;
        Articulo[] Reporte = new Articulo[Articulos.length];
        l = Articulos.length;
        while(i < 1){
            dc = Articulos[i].getDecision();
            if(dc == 'A'){
                t = Articulos[i].getTitulo();
                Reporte[i].setTitulo(t);
            }
            i = i + 1;
        }
        return Reporte;
    }
}
