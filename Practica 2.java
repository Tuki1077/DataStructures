import java.util.*;

class Main {
    static double[] Remover(double[] quitar, int valor){
        quitar[valor] = 0;
        return quitar;
    }
  public static void main(String[] args) {
    Scanner userinput = new Scanner (System.in);
    double[] credito = new double [10];
    double[] debito = new double [10];
    int i = 0;
    int j = 0;
    double totalD = 0;
    double totalC = 0;
    double totales = 0;
    double promedioD = 0;
    double max = 0;

    boolean start = true;
      while (start == true){
        System.out.print(" 1. Ingresar debito\n 2. Ingrese credito\n 3. Total de debitos\n 4. Total creditos\n 5. Saldo\n 6. Promedio de debitos\n 7. Monto de debito mas grande\n 8. Conteo\n 9. Arrays\n 10. Eliminar\n ");
        int option = userinput.nextInt();
        
        switch(option){
          case 1: 
            System.out.print("Ingrese debito: ");
            double debits = userinput.nextInt();
            debito[i] = debits;
            System.out.print("Ingreso: " + debito[i] + "\n");
            i++;
            break;
          case 2:
            System.out.print("Ingrese credito: ");
            double credits = userinput.nextInt();
            credito[j] = credits;
            System.out.print("Ingreso: " + credito[j] + "\n");
            j++;
            break;
          case 3:
            for (int c = 0; c < debito.length; c++){
                totalD += debito[c];
            }
            System.out.print ("El total de debitos es: " + totalD + "\n");
            break;
          case 4:
            for (int a = 0; a < credito.length; a++){
                totalC += credito[a];
            }
            System.out.print ("El total de creditos es: " + totalC + "\n");
            break;
          case 5:
            totales = totalC + totalD;
            System.out.print("El total es:" + totales + "\n");
            break;
          case 6:
            promedioD = totalD/i;
            System.out.print ("Promedio de debitos es:" + promedioD + "\n");
            break;
          case 7:
            for (int t = 0; t < debito.length; t++){
                if (max < debito[t]){
                    max = debito[t];
                }
            }
            System.out.print ("El debito mas grande es: " + max + "\n");
            break;
          case 8:
            System.out.print ("Conteo de debitos: " + i + "\n");
            System.out.print ("Conteo de creditos: " + j + "\n");
            break;
          case 9:
            for (int p = 0; p < credito.length; p++ ){
                System.out.print ("El " + p + " credito es:" + credito[p] + "\n");
                System.out.print ("El " + p + " debito es:" + debito[p] + "\n");
            }
            break;
          case 10:
            System.out.print ("Que elemento desea eliminar: ");
            int remv = userinput.nextInt();
            credito = Remover(credito, remv);
        }
      } 
  }
}
