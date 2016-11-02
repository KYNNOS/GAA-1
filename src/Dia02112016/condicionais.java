package Dia02112016;

public class condicionais {

	public condicionais() {
		// TODO Auto-generated constructor stub
		comparadorsimples();
		comparadormultivariavel();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new condicionais();
	
	}
	
	
	
	
public void comparadorsimples(){
	int num1=5;
	int num2=4;
			//= atribuiçao ==comparaçao
if (num1==num2) {
System.out.println("os numeros sao iguais");

}else if (num1<num2) {
System.out.println("o numero 1 e menor que o numero 2 ");
}else {
System.out.println("o numero 1 e maior que o numero 2 ");
}
	
	
}
public void comparadormultivariavel(){
	int num1=7;
	int num2=6;
	int num3=5;
	
			//= atribuiçao ==comparaçao
	
if (num1>num2 && num1 > num3) {
System.out.println("o numero 1 é o maior");

}else if (num2>num1 && num2>num3) {
System.out.println("o numero 2 é o maior ");
}else if (num1==num2 && num2 == num3) {
	System.out.println("os numeros sao iguais");
}else {
System.out.println("o numero 3 é o maior ");
}
}

}

