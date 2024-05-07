/**
 * @author FacundoBenitez
 */
package util;

	public abstract class MisArrays {
		/**
		 *  Calcula la media de la array
		 * @param array Array a la que hacer media
		 * @return resultado de la media
		 */
		public static float mediaNotas(float[] array) {
			float media=0;
			int poblacion=0;
			try { 
				for(int a=0;a<array.length;a++) {
					if(array[a]<0||array[a]>10) {
						throw new IllegalArgumentException("El valor de la array en la posicion "+a+" es menor que 0 o mayor que 10.");
					}
					media+=array[a];
					poblacion++;
				}
				if(poblacion==0) {
					throw new IllegalArgumentException("La array esta vacia");
				}
				media/=poblacion;	
			} 
			catch (IllegalArgumentException e) {
				System.out.println(e.getMessage());	
			}
			return media;
		}
		/**
		 * Observa la mediana de la array
		 * @param array a la que hacer mediana
		 * @return valor que en el intermedio de la array
		 */
		public static float medianaNotas(float[] array) {
			float mediana=0;
			try {
				if(array.length==0) {
					throw new IllegalArgumentException("La array esta vacia");
				}
				for(int a=0;a<array.length;a++) {
					if(array[a]<0||array[a]>10) {
						throw new IllegalArgumentException("Hay al menos un valor en la array fuera del rango");
					}
				}
				if(array.length%2==0) {
					mediana=(array[array.length/2]+array[(array.length/2)+1])/2;
				}
				else {
					mediana=array[(array.length/2)];	
				}
			} 
			catch (IllegalArgumentException e) {
				System.out.println(e.getMessage());	
			}		
			return mediana;
		}
		
		

	}


