class Main {
  public static void main(String[] args) {
     if(args[(args.length-1)].equals("+")){
        System.out.println("La somme "+(Integer.parseInt(args[0])+Integer.parseInt(args[1])));
      }
      else if(args[(args.length-1)].equals("-")){
        System.out.println("La somme "+(Integer.parseInt(args[0])-Integer.parseInt(args[1])));
      }
      else {System.out.println("Signe non valide !");}
    }
}
