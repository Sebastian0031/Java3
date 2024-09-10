import java.util.Scanner;
public class Decodificador {
    public static void main(String[] args) {
        String mensajeCodificado = "H0l4  MUnD0,  3st0  3s  Un  m3ns4j3  s3cr3t0";
        mensajeCodificado = mensajeCodificado.replace("0", "o");
        mensajeCodificado = mensajeCodificado.replace("3", "e");
        mensajeCodificado = mensajeCodificado.replace("4", "a");
        mensajeCodificado = mensajeCodificado.trim();
        mensajeCodificado = mensajeCodificado.replaceAll(" +", " ");
        mensajeCodificado = mensajeCodificado.toUpperCase();
        System.out.println("Mensaje decodificado: " + mensajeCodificado);
    }
}