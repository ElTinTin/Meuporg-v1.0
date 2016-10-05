package TP4;

class TestTP4 {
   public static void main(String[] args) {
      Enchanteur Gandoulf = new Enchanteur (150, 20, 15);
      Truqueur Tartanfion = new Truqueur (100, 30, 10);
      Chevalier Passpartrou = new Chevalier (300, 10, 30);
      Excalibur Foulindra = new Excalibur (200, 40, 30);
      
      System.out.println(Gandoulf.toString());
      Gandoulf.blesse();
      System.out.println("    ");
      System.out.println(Gandoulf.toString());
      System.out.println("    ");
      System.out.println("Attaque de l'enchanteur : "+Gandoulf.attaque()+" Attk.");
      
      combats Mordor = new combats(Gandoulf,Passpartrou,Tartanfion,Foulindra);
      Mordor.ouvrirArene();
      char result = Mordor.combat();
        if(result=='A'){
            System.out.println("\nL'équipe A est déclarée gagnante !");
        } else if(result=='B'){
            System.out.println("\nL'équipe B est déclarée gagnante !");
        } else {
            System.out.println("\nTout le monde est mort... Oh wait ?!");
        }
        
   }
}