class Main {
  public static void main(String[] args) {
     if(args[(args.length-1)].equals("+")){
        System.exit(Integer.parseInt(args[0])+Integer.parseInt(args[1]));
      }
      else if(args[(args.length-1)].equals("-")){
        System.exit((Integer.parseInt(args[0])-Integer.parseInt(args[1]));
      }
      else {System.exit(-1);}
    }
}
