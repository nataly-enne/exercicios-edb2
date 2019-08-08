package com.company;
import org.junit.Test;

import java.util.Arrays;
import java.util.Random;
import static org.junit.Assert.*;

public class SearcherTest {
    private Searcher searcher;

    @org.junit.Before
    public void setUp() throws Exception{
        searcher = new Searcher();
    }
    public Searcher getSearcher() {
        return searcher;
    }

    @Test
    public void RetornaMenos1SeArrayEstaVazio(){
        int entrada[] = {};
        assertEquals(-1, searcher.search(entrada, 10));
    }

    @Test
    public void RetornaMenos1SeElementoNaoEncontrado(){
        int entrada[] = {10, 20, 30, 40};
        assertEquals(-1, searcher.search(entrada, 50));
    }

    @Test
    public void RetornaPosicaoSeElementoAleatorioForEcontrado(){
        Random r = new Random();
        int size = 1 + Math.abs(r.nextInt())%10;
        int entrada[] = new int[size];

        for(int i=0; i<entrada.length; i++){
            entrada[i] = r.nextInt() % 10;
        }
        Arrays.sort(entrada);
        int pos = Math.abs(r.nextInt()) % entrada.length;
        int valor = entrada[pos];

        assertEquals(pos, searcher.search(entrada, valor));

    }

}
