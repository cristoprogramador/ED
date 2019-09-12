/**
 * Ejercicio uno del examen de la segunda evaluación
 * @author Cristobal salido
 * Clase cuenta.
 */
public class ejer1_Cuenta {
    
    private double balance;
    private int numeroCuenta;
    private String tipo;
    
       /**
        * Metodo constructor cuenta
        * @param balanceInicial entrada tipo double del balance inicial
        * @param numeroCuenta entrada tipo int numero de cuenta
        * @param tipo entrada tiro String del tipo de cuenta
        */
    public ejer1_Cuenta(double balanceInicial, int numeroCuenta, String tipo){
        
        this.balance=0;
        this.tipo=tipo;
        this.numeroCuenta=numeroCuenta;
      
        if (balanceInicial>=100){
            this.balance=balanceInicial;
                   }
        
        else{
            
            System.out.println("La cuenta debe ser abierta con un valor igual o superior a 100 euros");
            
        }
        }
    
    /**
     * Metodo getter del balance
     * @return devuelve el balance en tipo double
     */
    public double getBalance(){
        
        return this.balance;
        
    }
    
    // Aumenta el balance de una cuenta en una cantidad
    
    /**
     * Aumenta el balance de una cuenta en una cantidad
     * @param cantidad valor tipo double de la cantidad a ingresar
     */
    public void ingresar(double cantidad){
        
        if (cantidad>0){
            
            this.balance=this.balance+cantidad;
            System.out.println("Transacción realizada correctamente.");
            System.out.println("Su nuevo saldo es: "+this.balance+"-- euros");
        }
            
            else
            
            System.out.println("Imposible realizar la transacción, la actualización del saldo debe ser mayor a 0 euros");
        }
    
    // Disminuye el balance de una cuenta en una cantidad
    /**
     * Disminuye el balance de una cuenta en una cantidad
     * @param cantidad valor tipo double de la cantidad a retirar
     */
    public void retirar(double cantidad){
        
        if (cantidad<=this.balance){
            
            this.balance=this.balance-cantidad;
            System.out.println("Transacción realizada correctamente.");
            System.out.println("Su nuevo saldo es: "+this.balance+"-- euros ");
        }
            
            else
            
            System.out.println("Imposible realizar la transacción");
        }
    
    //Actualiza el balance en los ingresos y cuando retira
    /**
     * Actualiza el balance en los ingresos y cuando retira
     * @param cantidad valor tipo double de la cantidad para actualizar el balance
     */
    public void actualizarBalance(double cantidad){
        
                    this.balance=this.balance+cantidad;
       
    }
    /**
     * Metodo getter para devolver el tipo de cuenta
     * @return valor tipo string del tipo de cuenta
     */
    public String getTipo(){
        
        return this.tipo;
    }
    /**
     * metodo getter para devolver el numero de cuenta
     * @return valor tipo int del numero de cuenta.
     */
    public int getNum(){
        
        return this.numeroCuenta;
    }
    }
    
