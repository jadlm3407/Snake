import java.util.Random;

public class Mapa {

    // 0 = vacio, 1 = pared, 2 = cabeza, 3 = cuerpo, 4 = manzana
    int[][] mapa = {
        {1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
        {1, 0, 0, 0, 0, 0, 0, 0, 0, 1},
        {1, 0, 0, 0, 0, 0, 0, 0, 0, 1},
        {1, 0, 0, 0, 0, 4, 0, 0, 0, 1},
        {1, 0, 0, 0, 0, 0, 0, 0, 0, 1},
        {1, 0, 0, 0, 0, 0, 0, 0, 0, 1},
        {1, 0, 0, 0, 0, 2, 0, 0, 0, 1},
        {1, 0, 0, 0, 0, 0, 0, 0, 0, 1},
        {1, 0, 0, 0, 0, 0, 0, 0, 0, 1},
        {1, 1, 1, 1, 1, 1, 1, 1, 1, 1}
    };

    int[] coordM = {3, 5}; //Coordenadas iniciales de la manzana

    Random rand = new Random();

    // Para poner una manzana nueva en el mapa
    public int[] nuevaManzana() {
        mapa[coordM[0]][coordM[1]] = 0; // Quito la manzana anterior

        // Lo intenta hasta que encuentre una casilla vacía
        do {
            coordM[0] = rand.nextInt(1, 9); // fila 1-9
            coordM[1] = rand.nextInt(1, 9); // columna 1-9
        } while (mapa[coordM[0]][coordM[1]] != 0);
        mapa[coordM[0]][coordM[1]] = 4; // Pongo la nueva manzana
        return coordM;
    }

    @Override
    public String toString(){
        String resultado = "";
        for (int i = 0 ; i<mapa.length ; i++){
            for (int j = 0 ; j<mapa[0].length ; j++){
                resultado+=mapa[i][j] +" ";
            }
            resultado+="\n";
        }
        resultado+="-------------------";
        return resultado;
    }
}
