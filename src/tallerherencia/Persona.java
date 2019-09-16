package tallerherencia;

import javax.swing.JOptionPane;

public class Persona {
    
    protected String nombre;
    protected String apellido;
    protected int edad;
    protected double peso;
    
    public Persona() {
// TODO Auto-generated constructor stub
    }
    
    public Persona (String nombre, String apellido, int edad, double peso){
        
    this.nombre = nombre;
    this.apellido = apellido;
    this.edad = edad;
    this.peso = peso;
    
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getEdad() {
        return edad;
    }

    public double getPeso() {
        return peso;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
    
    public void imprimirDatosPersona (){
        
    String datosPersona = "";
    datosPersona = "Nombre " + nombre + "\n"+ "Apellido: " + apellido + "\n" + "Edad: " + edad + "\n" +"Peso: " + peso;
    JOptionPane.showMessageDialog(null,datosPersona);
    definirEstadoPersona(edad);
    
    }
    
    public void definirEstadoPersona (int edad){
        
    String estado = "";
    if (edad < 18)
    {
    estado = "Menor de edad";
    }
    else
    {
    estado = "Mayor de edad";
    }
    JOptionPane.showMessageDialog(null,"La persona" + nombre
    + " " + apellido + " es " + estado);
    }

    public int leerDatoTipoEntero (String mensaje){
        
    int valor = 0;
    try{
        
    valor = Integer.parseInt(JOptionPane.showInputDialog(null,mensaje));
    
    return (valor);
    
    }catch (Exception errorIngreso){
        
    errorIngreso.printStackTrace();
    
    return (0);
        }
    }
    //Método para leer un double
    public double leerDatoTipoReal (String mensaje) {
    double valor = 0.0;
    valor = Double.parseDouble(JOptionPane.showInputDialog(null,mensaje));
    return (valor);
    
    }
    
    //Método para leer un booleano
    public boolean leerDatoTipoBooleano (String mensaje){
        boolean valor = false;
        valor = Boolean.parseBoolean(JOptionPane.showInputDialog(null,mensaje));
        return (valor);
    }
    
    public String leerDatoTipoCadena (String mensaje){
        
        String valor = "";
        valor = JOptionPane.showInputDialog(null,mensaje);
        return (valor);
        
    }

 
}


