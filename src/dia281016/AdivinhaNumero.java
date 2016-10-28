package dia281016;

import java.util.Random;
import java.util.Scanner;

/*
 * Random : V
 */
public class AdivinhaNumero {
	int escondido;
	final int VALORMAX = 5;
	
	public AdivinhaNumero() {
		Random r = new Random();
		
		escondido = r.nextInt(VALORMAX);
		
		tentarAdivinhar();
	}
	
	public void tentarAdivinhar() {
		int numero;
        int tentativas =3;
        do{
            System.out.println("Tente adivinhar o numero escondido:\n");
            numero = (new Scanner(System.in).nextInt());
            if(numero > escondido){
                System.out.println("O numero escondido � menor que "+numero+"\n Tente novamente");
            }else if(numero < escondido){
                System.out.println("O numero escondido � maior que "+numero+"\n Tente novamente");
            }
            tentativas--;
        }while(numero != escondido && tentativas>0);
        if(tentativas==0){
            System.out.println("Gastou todas as tentativas!!\n O numero escondido era "+escondido);
        }else{
            System.out.println("Parab�ns acertaste o numero escondido � "+escondido);
        }
	}

}
