package healthsystem;
class Healthsystem {
  public static void main(String[] args) { 
    Jugador Jprincipal = new Jugador("Mbappe", 15);
    Zombie zombie = new Zombie("megsie", 50, 20);
    Botiquin botiking = new Botiquin (15, false);

    System.out.println("Sistema de salud (Healthsystem)/n");
   Jprincipal.recibirVida(botiking.curarVida());
   System.out.println("la vida del jugador es: "+Jprincipal.getVida());


    Jprincipal.recibirDanio(zombie.ataque());

    System.out.println(">> El Zombie ataca a Jugador Principal. Jugador Principal tiene "+Jprincipal.getVida()+" de vida");
    
    zombie.recibirDanio(Jprincipal.ataque());

    Jprincipal.setVida(100);
    System.out.println("Vida es: "+ Jprincipal.getVida());

    System.out.println(">> El Zombie es atacado por el Jugador Principal. El Zombie tiene "+zombie.getVida()+" de vida");

  } 
}