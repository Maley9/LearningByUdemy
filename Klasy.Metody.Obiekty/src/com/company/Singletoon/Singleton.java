package com.company.Singletoon;

/* Singleton to wzorzec projektowy zapewniający, że TYLKO JEDNA instancja
może powstać z danego obiektu.
Przydatny, gdy chcemy ograniczyć np dostęp do połączenia bazy danych!

więcej INFO
https://devcave.pl/effective-java/wzorzec-projektowy-singleton

 */


/*

    Można odnieść się przez normalny konstruktor do prywatnego

    DBconnect(int x){
      this();
    }

 */

class DBconnect{

    private static DBconnect instance;

    private DBconnect(){

    }

    public static DBconnect getInstance(){
        if(instance == null){
            instance = new DBconnect();
        }
        return instance;
    }

    public void getFromDb(){
        System.out.println("Polaczyles sie z baza");
    }

}

public class Singleton {
    public static void main(String[] args) {

        DBconnect connection = DBconnect.getInstance();
        DBconnect connection1 = DBconnect.getInstance();

        connection1.getFromDb();

        System.out.println(connection == connection1);

    }

}
