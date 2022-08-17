public class main {

	public static void main(String[] args) {

		int vet[] = new int[6];
		int tamanho = vet.length;

		vet[0] = 1;
		vet[1] = -1;
		vet[2] = 10;
		vet[3] = -10;
		vet[4] = -20;
		vet[5] = -20;

		int contador = soma(vet, tamanho);
		System.out.println(contador);

	}

	private static int soma(int[] vet, int tamanho) {
		if (tamanho == 0) { // se não houver posição no vetor. retorna zero
			return 0;
		} else {
			
			if (vet[tamanho - 1] < 0) { // se for menor que zero. retorna 1
				return 1 + soma(vet, tamanho - 1);
			} else {
				return 0 + soma(vet, tamanho - 1);
			}
		}
	}
}
