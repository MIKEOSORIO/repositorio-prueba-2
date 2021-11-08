
public class Operaciones {  
    
    public double absoluto(double a , double b){
        
        double absoluto = Math.abs(a-b);    
        return absoluto;
    }
    
    public double relativo(double a, double b) {
        double relativo = Math.abs(((a-b)/a));
        return relativo;
    }
    
    public double porcentaje(double a , double b)
    {
        double porcentaje = Math.abs((((a-b)/a)*100));
        return porcentaje;
    }
    
   public double redondearDecimales(double valorInicial, int numeroDecimales) {
        double parteEntera, resultado;
        resultado = valorInicial;
        parteEntera = Math.floor(resultado);
        resultado = (resultado - parteEntera) * Math.pow(10, numeroDecimales);
        resultado = Math.round(resultado);
        resultado = (resultado / Math.pow(10, numeroDecimales)) + parteEntera;
        return resultado;
    }
   public double truncamiento(double resultado, int t){
       if (resultado > 0) {
       double resultado1;
       resultado = Math.floor(resultado * Math.pow(10, t)) / Math.pow(10, t);
       } else {
       resultado = Math.ceil(resultado * Math.pow(10, t)) / Math.pow(10, t);
       }
       return resultado;
   }
    
    
}
