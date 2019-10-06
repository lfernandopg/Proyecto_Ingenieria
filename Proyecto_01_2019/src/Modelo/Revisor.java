package Modelo;

/**
 *
 * @author alexanyernas
 */
public class Revisor {
    private final String login;
    private final String clave;
    private String cuenta_correo;
    private String nombre_apellido;
    private String siglas_universidad;
    private String siglas_ciudad;
    private String siglas_pais;
    private String codigo_area;
    private int link_e[];
    
    public Revisor(String login, String clave){
        this.login = login;
        this.clave = clave;
        link_e = new int[2];
    }
    
    public void registrar(String cc,String na,String u,String c,String p,String a){
        cuenta_correo = cc;
        nombre_apellido = na;
        siglas_universidad = u;
        siglas_ciudad = c;
        siglas_pais = p;
        codigo_area = a;
    }

    public String getLogin() {
        return login;
    }

    public String getClave() {
        return clave;
    }

    public String getCuenta_correo() {
        return cuenta_correo;
    }

    public String getNombre_apellido() {
        return nombre_apellido;
    }

    public String getSiglas_universidad() {
        return siglas_universidad;
    }

    public String getSiglas_ciudad() {
        return siglas_ciudad;
    }

    public String getSiglas_pais() {
        return siglas_pais;
    }

    public String getCodigo_area() {
        return codigo_area;
    }

    public int[] getLink_e() {
        return link_e;
    }
    
    
}
