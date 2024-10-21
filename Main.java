import java.util.ArrayList;

/*
ARRAYLIST

Dado un arraylist de numeros de 5 posiciones con los siguientes valores:
{2,4,6,8,10}
Guarda los valores de este array en otro array distinto pero con los valores invertidos
es decir, que el segundo array debera tener los valores
{10,8,6,4,2}
 */
public class Main
{
    public static void main(String[] args)
    {
        /*
        Creamos nuestro arraylist de numeros ENTEROS
        Esta vacia, por el momento no tiene nada

        Tambien creamos el arraylist para guardar los numeros enteros invertidos
         */
        ArrayList<Integer>listaNumeros = new ArrayList<Integer>(); //Es una lista infinita
        ArrayList<Integer>listaIvertida = new ArrayList<Integer>();

        listaNumeros.add(2);
        listaNumeros.add(4);
        listaNumeros.add(6);
        listaNumeros.add(8);
        listaNumeros.add(10);

       // System.out.println(listaNumeros.get(3)); //Imprime el elemento que hay en la posicion 3, que será 8

      //  for(Integer numeros : listaNumeros) //Para que imprima toda la lista
        //{
          //  System.out.print(numeros);
        //}


        /*
        Al principio i vale 4 y por lo tanto le decimos que me almacene en la posicion 0
        de mis listaInvertida, lo que haya en la posicion 4 (en este caso 10).
         */
        for(int i = listaNumeros.size()-1; i >= 0; i--)
        {
            listaIvertida.add(listaNumeros.get(i));
        }

        for(Integer numeros : listaInvertida) //Para que imprima toda la lista
        {
            System.out.print(numeros);
        }
    }
}