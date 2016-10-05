package TP4;

/** CLASSE PERSONNAGE **/

public abstract class Personnage
{
	//CONSTANTES -----------------------------------------
	//Type de personnages
   public static final int TYPE_CHEVALIER = 0;
   public static final int TYPE_EXCALIBUR = 1;
   public static final int TYPE_ENCHANTEUR = 2;
   public static final int TYPE_TRUQUEUR = 3;
   private final int NB_TYPES = 4;
	
	//Cibles possibles (partie 2 TP)
   public static final int CIBLE_TETE = 0;
   public static final int CIBLE_VENTRE = 1;
   public static final int CIBLE_JAMBES = 2;
   private final int NB_CIBLES = 3;
	//-----------------------------------------------------

   protected int vie;						// parametre commun a tous les personnages
   protected int typePers;					// type du personnage cr�� selon constantes
	
   public int getVie()
   {
      return this.vie;
   }
	
   protected int Alea(int min, int max)  // tirage au sort entre min et max
   {
      return  min +(int)(Math.random()*(max - min + 1));
   }
	
   public int getType()						// renvoie le type de personnage selon les constantes
   {
      return this.typePers;
   }

   public abstract int attaque();		// renvoie un entier proposionnel � la force de l'attaque
   public abstract void blesse();		// methode diminuant les parametres
   public abstract String toString();	// methode permettant d'afficher un personnage
	
}

abstract class magicien extends Personnage
{
   protected int magie;
   protected int spe; 
}

abstract class guerrier extends Personnage 
{
   protected int force;
   protected int spe; 
}


class enchanteur extends magicien
{
   enchanteur(int v, int f, int c) {
      super.typePers = 2;
      this.magie = f;
      this.spe = c;
      super.vie = v; 
   }
   
   public int attaque() {
      int A;
      A = Alea(0, this.vie) + Alea(0,this.magie) + Alea(0, this.spe);
      return A;
   }
   
   public void blesse() {
      this.vie = this.vie - Alea(20,40);
   }
   
   public String toString() {
      return "Enchanteur, "+this.vie+" PV, "+this.magie+" FOR, "+this.spe+" PC.";
   }
}


class truqueur extends magicien
{
   truqueur(int v, int f, int c) {
      super.typePers = 3;
      super.vie = v;
      this.magie = f;
      this.spe = c;
   }
   
   public int attaque() {
      int A;
      A = Alea(0, this.vie) + Alea(0,this.magie) + Alea(0, this.spe);
      return A;
   }
   
   public void blesse() {
      this.vie = this.vie - Alea(20,40);
   }
   
   public String toString() {
      return "Truqueur, "+this.vie+" PV, "+this.magie+" FOR, "+this.spe+" PC.";
   }
}

class chevalier extends guerrier 
{
   chevalier(int v, int f, int c) {
      super.typePers = 0;
      super.vie = v;
      this.force = f;
      this.spe = c;
   }
   
   public int attaque() {
      int A;
      A = Alea(0, this.vie) + Alea(0,this.force) + Alea(0, this.spe);
      return A;
   }
   
   public void blesse() {
      this.vie = this.vie - Alea(20,40);
   }
   
   public String toString() {
      return "Chevalier, "+this.vie+" PV, "+this.force+" FOR, "+this.spe+" PC.";
   }
}

class excalibur extends guerrier 
{
   excalibur(int v, int f, int c) {
      super.typePers = 3;
      super.vie = v;
      this.force = f;
      this.spe = c;
   }
   
   public int attaque() {
      int A;
      A = Alea(0, this.vie) + Alea(0,this.force) + Alea(0, this.spe);
      return A;
   }
   
   public void blesse() {
      this.vie = this.vie - Alea(20,40);
   }
   
   public String toString() {
      return "Excalibur, "+this.vie+" PV, "+this.force+" FOR, "+this.spe+" PC.";
   }
}