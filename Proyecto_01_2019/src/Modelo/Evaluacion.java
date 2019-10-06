/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author alexanyernas
 */
public class Evaluacion {
    private String codigo;
    private String login;
    private char estado_eval;
    private int rec;
    private String fecha_tope;
    private String fecha_sometido;
    private String fecha_asignacion;
    private int link_a;
    private int link_r;
    private boolean TIPO_preg[];
    public String respuestas[];
    
    //variables de trabajo:
    private int i;
    
    //asociaciones
    //Conjunto_Articulos conj_a;
    
    public Evaluacion(String codigo){
        this.codigo = codigo;
        estado_eval = 'P';
        rec = 9;
        TIPO_preg = new boolean[33];
        respuestas = new String[33];
    }
    
    public void registrar(String login,String fecha_asignacion,String fecha_tope){
        this.login = login;
        this.fecha_asignacion = fecha_asignacion;
        this.fecha_tope = fecha_tope;
    }
    
    public void contar_dicotomicas(int tot_si,int tot_no){
        i = 0;
        while(i <= 32){
            if(TIPO_preg[i] == true){ //la pregunta es dicotomica
                if("si".equals(respuestas[i])){
                    tot_si = tot_si + 1;
                }else{
                    tot_no = tot_no + 1;
                }
            }
            i = i + 1;
        }
    }

    public String getCodigo() {
        return codigo;
    }

    public String getLogin() {
        return login;
    }

    public char getEstado_eval() {
        return estado_eval;
    }

    public int getRec() {
        return rec;
    }

    public String getFecha_tope() {
        return fecha_tope;
    }

    public String getFecha_sometido() {
        return fecha_sometido;
    }

    public String getFecha_asignacion() {
        return fecha_asignacion;
    }

    public int getLink_a() {
        return link_a;
    }

    public int getLink_r() {
        return link_r;
    }

    public String[] getRespuestas() {
        return respuestas;
    }
    
    public void setRespuesta(String respuesta,int i){
        respuestas[i] = respuesta;
    }

    public void setRec(int rec){
        this.rec = rec;
    }

    public void setEstado_eval(char estado_eval) {
        this.estado_eval = estado_eval;
    }

    public void setFecha_sometido(String fecha_sometido) {
        this.fecha_sometido = fecha_sometido;
    }
    
    
}
