public class BMexercicio4 {
    public static void main(String[] args) {
        long long1 = 100;
        int int1 = 200, int2;
        
        //int2 = int1 + long1;
        //erro: tipos incompatíveis
        int2 = int1 + (int)long1;
        //o casting (int) converte valor em long1 para int e possibilita a soma. 
        System.out.println("resultado: " + int2);
    }
}
