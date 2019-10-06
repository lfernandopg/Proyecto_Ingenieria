package Modelo;

/**
 *
 * @author alexanyernas
 */
public class Conjunto_Evaluaciones {
    private Evaluacion[] Evaluaciones;
    private int[] link_e;
    //variables de trabajo:
    private int j,lim;
    private boolean esta,r_com;
    private String t;
    
    public void registrar(int mi_eval,String Respuestas[]){
        j = 0;
        while(j < 33){
            Evaluaciones[mi_eval].setRespuesta(Respuestas[j], j);
            j = j + 1;
        }
    }
    
    //public void Agregar(Evaluacion e)
    
    //public void buscar_evaluaciones(int link_e[]){
     
    public int obtener_evaluacion(int link_e[],String sel){
        int mi_eval = 0;
        j = 0;
        esta = false;
        lim = link_e.length-1;
        while(j < lim && !(esta)){
            if(Evaluaciones[link_e[j]].getCodigo().equals(sel)){
                esta = true;
                mi_eval = link_e[j];
            }else{
               j = j + 1; 
            }
        }
        return mi_eval;
    }
    
    public Evaluacion buscar_evaluacion(int j){
        return Evaluaciones[j];
    }
    
    public void registrar_rc(int mi_eval,int rec){
        Evaluaciones[mi_eval].setRec(rec);
    }
    
    //public string[] obtener_respuestas()
    //public string obtener_rpta(int nro_p)
    
    public boolean confirmar(int mi_eval){
        j = 0;
        r_com = true;
        while(j < 33 && r_com){
            if(Evaluaciones[mi_eval].respuestas[j] == null){
                r_com = false;
            }else{
                j = j + 1;
            }
        }
        return r_com;
    }
    
    public void estado_fsom(int mi_eval){
        Evaluaciones[mi_eval].setEstado_eval('S');
        //Evaluaciones[mi_eval].setFecha_sometido(fecha_actuall);
    }
}
