package healthsystem;
class Botiquin {
  private int montoPuntoDeVida;
  private boolean estaUsado;

  public Botiquin (int montoVida, boolean Usado){
    this.montoPuntoDeVida = montoVida;
    this.estaUsado = Usado;
  }

  public int curarVida(){
    
    return (montoPuntoDeVida);
  }
  public boolean getEstaUsado(){
    return(this.estaUsado);
  }
}