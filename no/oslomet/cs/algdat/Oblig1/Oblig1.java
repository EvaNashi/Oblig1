package no.oslomet.cs.algdat.Oblig1;

////// Løsningsforslag Oblig 1 ////////////////////////

import java.lang.UnsupportedOperationException;

public class Oblig1 {
    private Oblig1() {}

    ///// Oppgave 1 //////////////////////////////////////
    public static int maks(int[] a) {
        throw new UnsupportedOperationException();
    }

    public static int ombyttinger(int[] a) {
        throw new UnsupportedOperationException();
    }

    ///// Oppgave 2 //////////////////////////////////////
    public static int antallUlikeSortert(int[] a) {
        throw new UnsupportedOperationException();
    }

    ///// Oppgave 3 //////////////////////////////////////
    public static int antallUlikeUsortert(int[] a) {
        throw new UnsupportedOperationException();
    }

    ///// Oppgave 4 //////////////////////////////////////
    public static void delsortering(int[] a) {
        throw new UnsupportedOperationException();
    }

    ///// Oppgave 5 //////////////////////////////////////
    public static void rotasjon(char[] a) {
        throw new UnsupportedOperationException();
    }

    ///// Oppgave 6 //////////////////////////////////////
    public static void rotasjon(char[] a, int k) {
        throw new UnsupportedOperationException();
    }

    ///// Oppgave 7 //////////////////////////////////////
    /// 7a)
    public static String flett(String s, String t) {
        throw new UnsupportedOperationException();
    }

    /// 7b)
    public static String flett(String... s) {
        throw new UnsupportedOperationException();
    }

    ///// Oppgave 8 //////////////////////////////////////
    public static int[] indekssortering(int[] a) {
        throw new UnsupportedOperationException();
    }


        int[] indeks = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] elementer = new int[a.length];
        int min = a[indeks[0]];
        int ind = 0;
        int i;
        for (i = 1; i < a.length - 1; ++i) {
            //     ind = indeks[i];
            if (min > a[indeks[i]]) {

                min = a[indeks[i]];

                System.out.print(a[indeks[i]] + " ");

            }


            System.out.print(min+ " ");

        }


        return elementer;
    ///// Oppgave 9 //////////////////////////////////////
    public static int[] tredjeMin(int[] a) {
        int []a = {6,10,16,11,7,12,3,9,8,5};
        throw new UnsupportedOperationException();



                int n = a.length;     // tabellens lengde

                if (n < 3)     // må ha minst tre verdier
                {
                    throw new IllegalArgumentException("Lengden til tabellen(" + n + ") er < 3!");
                }

                int m = 0;     // m er posisjonen til minst verdi
                int nm = 1;    // nm er posisjonen til nest minst verdi
                int tm = 2;    // tm er posisjonen til tredje minst verdi

                // vi bytter om slik at når vi starter er m posisjonen til
                // den minste av de tre første, nm er posisjonen til den nest
                // minste og tm posisjonen til den tredje minste av de tre første

                if (a[nm] > a[m])
                {
                    m = 0;
                    nm = 1;
                }

                if (a[tm] < a[m])   //hvis tredje minst er mindre en minst
                {
                    int temp = tm;  //legger verdien til tredjeminst over temporary variabel
                    tm = m;         //tredje minst flytes til minst plassen
                    m = temp;        // minst blir temporary
                }

                if (a[tm] < a[nm])  //hvis tredje minst er mindre enn nest minst
                {
                    int temp = tm;   //tredje minst legges over til temp
                    tm = nm;         // så tredjeminst tar plassen til nest minst
                    nm = temp;
                }

                int minverdi = a[m];                // minste verdi
                int nestminverdi = a[nm];           // nest minste verdi
                int tredjeminverdi = a[tm];         // tredje minste verdi

                for (int i = 3; i < n; i++)
                {
                    int verdi = a[i];

                    if (verdi < tredjeminverdi)
                    {
                        if (verdi < nestminverdi)
                        {
                            if (verdi < minverdi)
                            {
                                tm = nm;
                                tredjeminverdi = nestminverdi;

                                nm = m;
                                nestminverdi = minverdi;

                                m = i;
                                minverdi = verdi;
                            }
                            else  // verdi <= minverdi && verdi > nestminverdi
                            {
                                tm = nm;
                                tredjeminverdi = nestminverdi;

                                nm = i;
                                nestminverdi = verdi;
                            }
                        }
                        else // verdi >= nestminverdi && verdi < tredjeminverdi
                        {
                            tm = i;
                            tredjeminverdi = verdi;
                        }
                    }

                }

                return new int[]{m, nm, tm};

            }

        }

}

    ///// Oppgave 10 //////////////////////////////////////
    public static int bokstavNr(char bokstav) {
        throw new UnsupportedOperationException();
    }

    public static boolean inneholdt(String a, String b) {
        throw new UnsupportedOperationException();
    }

}  // Oblig1
