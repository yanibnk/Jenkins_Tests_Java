class Main {
  public static void main(String[] args) {
    if (args.length != 3) {
      System.err.println("Erreur : 3 arguments attendus (int, int, opérateur)");
      System.exit(-1);
    }

    try {
      int a = Integer.parseInt(args[0]);
      int b = Integer.parseInt(args[1]);
      String op = args[2];

      switch (op) {
        case "+":
          System.out.println(a + b);
          break;
        case "-":
          System.out.println(a - b);
          break;
        case "*":
          System.out.println(a * b);
          break;
        case "/":
          if (b != 0) {
            System.out.println(a / b);
          } else {
            System.err.println("Erreur : division par zéro");
            System.exit(-1);
          }
          break;
        default:
          System.err.println("Erreur : opérateur non reconnu");
          System.exit(-1);
      }

    } catch (NumberFormatException e) {
      System.err.println("Erreur : les deux premiers arguments doivent être des entiers");
      System.exit(-1);
    }
  }
}
