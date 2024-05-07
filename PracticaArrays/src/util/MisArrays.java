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
				if(array.length==0) {
					throw new IllegalArgumentException("La array esta vacia");
				}
				for(int a=0;a<array.length;a++) {
					if(array[a]<0||array[a]>10) {
						throw new IllegalArgumentException("Hay al menos un valor en la array fuera del rango");
					}
					media+=array[a];
					poblacion++;
				}			
				media/=poblacion;	
			return media;
		}
		
		/**
		 * Observa la mediana de la array
		 * @param array a la que hacer mediana
		 * @return valor que en el intermedio de la array
		 */
		public static float medianaNotas(float[] array) {
			float mediana=0;
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
			return mediana;
		}
		/**
		 * Observa la nota maxima de la array
		 * @param array a la que buscar el max
		 * @return valor maximo de nota
		 */
		public static int maxNotas(float[] array) {
			int max=0;
				if(array.length==0) {
					throw new IllegalArgumentException("La array esta vacia");
				}
				for(int a=0;a<array.length;a++) {
					if(array[a]<0||array[a]>10) {
						throw new IllegalArgumentException("Hay al menos un valor en la array fuera del rango");
					}
					else if(array[a]>max) {
						max=(int)array[a];
					}
				}	
			return max;
		}
		/**
		 * Observa la nota minima de la array
		 * @param array a la que buscar el min
		 * @return valor minimo de nota
		 */
		public static int minNotas(float[] array) {
			int min=11;//OJO:este metodo supone de que las notas van de 0 a 10
				if(array.length==0) {
					throw new IllegalArgumentException("La array esta vacia");
				}
				for(int a=0;a<array.length;a++) {
					if(array[a]<0||array[a]>10) {
						throw new IllegalArgumentException("Hay al menos un valor en la array fuera del rango");
					}
					else if(array[a]<min) {
						min=(int)array[a];
					}
				}		
			return min;
		}
		
		

	}


