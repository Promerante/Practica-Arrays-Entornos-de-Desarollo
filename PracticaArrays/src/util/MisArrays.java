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
		

	}


