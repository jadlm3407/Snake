import java.util.Random;

public class Mapa {

    // 0 = vacio, 1 = pared, 2 = cabeza, 3 = cuerpo, 4 = manzana
    int[][] mapa = {
        {1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
        {1, 0, 0, 0, 0, 0, 0, 0, 0, 1},
        {1, 0, 0, 0, 0, 0, 0, 0, 0, 1},
        {1, 0, 0, 0, 0, 0, 0, 0, 0, 1},
        {1, 0, 0, 2, 0, 0, 4, 0, 0, 1},
        {1, 0, 0, 0, 0, 0, 0, 0, 0, 1},
        {1, 0, 0, 0, 0, 0, 0, 0, 0, 1},
        {1, 0, 0, 0, 0, 0, 0, 0, 0, 1},
        {1, 0, 0, 0, 0, 0, 0, 0, 0, 1},
        {1, 1, 1, 1, 1, 1, 1, 1, 1, 1}
    };

    int[] coordM = {4, 6}; //Coordenadas iniciales de la manzana

    Random rand = new Random();

    // Places the apple in a new random empty cell and returns its coordinates
    public int[] nuevaManzana() {
        mapa[coordM[0]][coordM[1]] = 0; // Clear old apple

        // Keep trying until we find an empty cell
        do {
            coordM[0] = rand.nextInt(1, 9); // rows 1..8 (avoid walls)
            coordM[1] = rand.nextInt(1, 9); // cols 1..8
        } while (mapa[coordM[0]][coordM[1]] != 0);

        mapa[coordM[0]][coordM[1]] = 4; // Place new apple
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
