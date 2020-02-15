package lab4_sergiosuazoalessandroreyes;

import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;




public class Lab4_SergioSuazoAlessandroReyes {

    public static Scanner leer = new Scanner(System.in);
    public static Random random = new Random();
    
    public static ArrayList<Equipo> equipos = new ArrayList();
    public static ArrayList<Jugador> jugadores = new ArrayList();
    
    
    
    
    public static void main(String[] args) {
        boolean r=true;
        while(r){
            System.out.print("1. CRUD Equipo" 
                    + "\n2. CRUD Jugadores" 
                    + "\n3. Simulación del Juego}"
                    + "\n4. Terminar programa"
                    + "\nElija una opcion: ");
            int o = leer.nextInt();
            
            
            switch(o){
                case 1://crud equipo
                    System.out.print("a. Crear equipo"
                            + "\nb. Listar equipo/s"
                            + "\nc. Modificar equipo/s"
                            + "\nd  Eliminar equipo"
                            + "\nELija una opcion: ");
                    char op = leer.next().charAt(0);
                    switch(op){
                        case 'a'://crear
                            System.out.print("1. Gryffindor"
                                    + "\n2. Slytherin"
                                    + "\n3. Ravenclaw"
                                    + "\n4. Hufflepuff"
                                    + "De que casa proviene: ");
                            int c = leer.nextInt();
                            if(c==1){
                                for (int i = 0; i < equipos.size(); i++) {
                                    if(equipos.get(i).getCasa().equals("Gryffindor")){
                                        System.out.print("Esa casa ya tiene un equipo. ");
                                        break;
                                    }
                                }
                                System.out.print("Cuantos partidos tiene ganados: ");
                                int pg = leer.nextInt();
                                System.out.print("Cuantos partidos tiene perdidos: ");
                                int pp = leer.nextInt();
                                equipos.add(new Equipo());
                            }else if(c==2){
                                for (int i = 0; i < equipos.size(); i++) {
                                    if(equipos.get(i).getCasa().equals("Slytherin")){
                                        System.out.println("Esa casa ya tiene un equipo. ");
                                        break;
                                    }
                                }
                                System.out.print("Cuantos partidos tiene ganados: ");
                                int pg = leer.nextInt();
                                System.out.print("Cuantos partidos tiene perdidos: ");
                                int pp = leer.nextInt();
                                equipos.add(new Equipo());
                            }else if(c==3){
                                for (int i = 0; i < equipos.size(); i++) {
                                    if(equipos.get(i).getCasa().equals("Ravenclaw")){
                                        System.out.println("Esa casa ya tiene un equipo. ");
                                        break;
                                    }
                                }
                                System.out.print("Cuantos partidos tiene ganados: ");
                                int pg = leer.nextInt();
                                System.out.print("Cuantos partidos tiene perdidos: ");
                                int pp = leer.nextInt();
                                equipos.add(new Equipo());
                            }else if(c==4){
                                for (int i = 0; i < equipos.size(); i++) {
                                    if(equipos.get(i).getCasa().equals("Hufflepuff")){
                                        System.out.println("Esa casa ya tiene un equipo. ");
                                        break;
                                    }
                                }
                                System.out.print("Cuantos partidos tiene ganados: ");
                                int pg = leer.nextInt();
                                System.out.print("Cuantos partidos tiene perdidos: ");
                                int pp = leer.nextInt();
                                equipos.add(new Equipo());
                            }
                            break;
                        case 'b'://listar
                            for (int i = 0; i < equipos.size(); i++) {
                                System.out.println(i+") "+equipos.get(i).getCasa());
                            }
                            break;
                        case 'c'://modifcar
                            
                            break;
                        case 'd'://eliminar
                            for (int i = 0; i < equipos.size(); i++) {
                                System.out.println(i+") "+equipos.get(i).getCasa());
                            }
                            System.out.println("Elija el numero del equipo que desea eliminar");
                            int del = leer.nextInt();
                            equipos.remove(del);
                            break;
                        default:
                            
                    }
                    break;
                case 2://crud jugador
                    System.out.print("a. Crear jugador"
                            + "\nb. Listar jugador/es"
                            + "\nc. Modificar jugador/es"
                            + "\nd. Eliminar jugador"
                            + "\ne. Ver stats de un jugador"
                            + "\nELija una opcion: ");
                    op = leer.next().charAt(0);
                    switch(op){
                        case 'a'://Crear
                            if(equipos.isEmpty()){
                                System.out.println("No se pueden crear jugadores si no hay equipos creados.");
                            }else{
                                System.out.print("1. Gryffindor"
                                        + "\n2. Slytherin"
                                        + "\n3. Ravenclaw"
                                        + "\n4. Hufflepuff"
                                        + "De que casa proviene: ");
                                int c = leer.nextInt();
                                if(c == 1){
                                    int v=0;
                                    for (int i = 0; i < equipos.size(); i++) {
                                        if(equipos.get(i).getCasa().equals("Gryffindor"))
                                            v=i;
                                    }
                                    if(equipos.get(v).getJugadores().size() == 7){
                                        System.out.println("Error, este equipo ya tiene todos sus jugadores.");
                                        break;
                                    }else{
                                        System.out.print("Cual es el nombre del jugador: ");
                                        String n = leer.nextLine();
                                        System.out.print("Que año cursa en Hogwarts: ");
                                        int a = leer.nextInt();
                                        System.out.println("Cual es el numero del uniforme: ");
                                        int num = leer.nextInt();
                                        boolean ver =true;
                                        while(ver){
                                            for (int i = 0; i < equipos.get(v).getJugadores().size(); i++) {
                                                if(equipos.get(v).getJugadores().get(i).getNumero() == num){
                                                    System.out.println("ELiga otro numero de camisa, el seleccionado, ya esta en uso: ");
                                                    num = leer.nextInt();
                                                }else
                                                    break;
                                            }
                                        }
                                        System.out.println("1. Guardian"
                                                + "\n2. Golpeador"
                                                + "\n3. Cazador"
                                                + "\n4. Buscador");
                                        int pos = leer.nextInt();
                                        if(pos==1){
                                            for (int i = 0; i < equipos.get(v).getJugadores().size(); i++) {
                                                if(equipos.get(v).getJugadores().get(i) instanceof Guardian){
                                                    System.out.println("ELiga otro numero de camisa, el seleccionado, ya esta en uso: ");
                                                    num = leer.nextInt();
                                                }else
                                                    break;
                                            }
                                        }else if(pos==2){
                                            
                                        }else if(pos==3){
                                            
                                        }else if(pos==4){
                                            
                                        } 
                                    }
                                }else if(c==2){
                                    
                                }else if(c==3){
                                    
                                }else if(c==4){
                                    
                                }
                            }
                            break;
                        case 'b'://listar
                            for (int i = 0; i < jugadores.size(); i++) {
                                System.out.println(i+") "+jugadores.get(i).getNombre());
                            }
                            break;
                        case 'c'://modificar
                            
                            break;
                        case 'd'://eliminar
                            for (int i = 0; i < jugadores.size(); i++) {
                                System.out.println(i+") "+jugadores.get(i).getNombre());
                            }
                            System.out.println("Elija el numero del equipo que desea eliminar");
                            int del = leer.nextInt();
                            jugadores.remove(del);
                            break;
                        case 'e'://ver starts
                            
                            break;
                        default:
                            
                    }
                    break;
                case 3://simulaciion del juego
                    
                    break;
                case 4:
                    r = false;
                    break;
                default:
                    r = false;
            }//fin del switch menu
        }//fin del while menu
    }//fin del main
    






























































    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    









    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

public static void Simulacion(Equipo a,Equipo b)
{
    int marcador1=0,marcador2=0;
    int select,jugada;
    Jugador x;
    int contb1=0,contb2=0,conta1=0,conta2=0;
    boolean flag,barrera1=false,snitch=false,atajar1=false,barrera2=false,atajar2=false;
    while(snitch=false)
    {
        for (int i = 0; i < a.getJugadores().size(); i++) {
        System.out.println(i+"- "+a.getJugadores().get(i));
        }
        System.out.print("Seleccione al jugador que desea utilizar: ");
        select=leer.nextInt();
        x=a.getJugadores().get(select);
        System.out.print("1-Normal \n"
                + "2-Trampa\n"
                + "Seleccione la jugada: ");
        jugada=leer.nextInt();
        if(x instanceof Guardian)
        {
            if(jugada==1)
            {
                int vel=100;
                for (int i = 0; i < b.getJugadores().size(); i++) {
                    if(b.getJugadores().get(i) instanceof Cazador)
                    {
                        if(vel>((Cazador)b.getJugadores().get(i)).getVelocidad())
                        {
                            vel=((Cazador)b.getJugadores().get(i)).getVelocidad();
                        }
                    }
                }
                flag=x.Juego(vel, true);
                if(flag)
                {
                    ((Guardian) x).setAgilidad(((Guardian) x).getAgilidad()+8);
                    System.out.println(x.getNombre()+"(Guadrian - ("+ x.getCasa()+") Atajo un gol");
                }
                else
                {
                    System.out.println(x.getNombre()+"(Guadrian - ("+ x.getCasa()+") no atajo el gol");
                    marcador2+=10;
                }
            }
            if(jugada==2)
            {
                int rand=1+random.nextInt(100);
                flag=x.Trampa(rand);
                if(flag)
                {
                    System.out.println(x.getNombre()+"(Guadrian - ("+ x.getCasa()+") Creo barreras invisibles frente a los aros");
                    barrera1=true;
                    contb1=2;
                }
                else
                {
                    System.out.println(x.getNombre()+"(Guadrian - ("+ x.getCasa()+") No pudo crear barreras, no puede atajar por 2 turnos");
                    atajar1=true;
                    conta1=2;
                }
            }
        }
        if(x instanceof Golpeador)
        {
            if(jugada==1)
            {
                int opcion;
                System.out.print("1-Atacar \n"
                        + "2-Defender \n"
                        + "Seleccione la opcion: ");
                opcion=leer.nextInt();
                if(opcion==1)
                {
                    int suma=0;
                    for (int i = 0; i < b.getJugadores().size(); i++) {
                        if(b.getJugadores().get(i) instanceof Golpeador)
                        {
                            suma+=((Golpeador)b.getJugadores().get(i)).getFuerza();
                        }
                    }
                    flag=x.Juego(suma, true);
                    if(flag)
                    {
                        ((Golpeador) x).setFuerza(((Golpeador) x).getFuerza()+10);
                        System.out.println(x.getNombre()+"(Golpeador - ("+ x.getCasa()+") Ataco exitosamente");
                    }
                    else
                    {
                        System.out.println(x.getNombre()+"(Guadrian - ("+ x.getCasa()+") no pudo atacar");
                    
                    }
                }
                else
                {
                    int vel=100;
                    for (int i = 0; i < b.getJugadores().size(); i++) {
                        if(b.getJugadores().get(i) instanceof Golpeador)
                        {
                            if(vel>((Golpeador)b.getJugadores().get(i)).getAgilidad())
                            {
                                vel=((Golpeador)b.getJugadores().get(i)).getAgilidad();
                            }
                        }
                    }
                    flag=x.Juego(vel,false);
                    if(flag)
                    {
                        ((Golpeador) x).setAgilidad(((Golpeador) x).getAgilidad()+10);
                        System.out.println(x.getNombre()+"(Golpeador - ("+ x.getCasa()+") Defendio a su compañero");
                    }
                    else
                    {
                        System.out.println(x.getNombre()+"(Golpeador - ("+ x.getCasa()+") no defendio a su compañero");
                    
                    }
                }

            }
            if(jugada==2)
            {
                int rand=1+random.nextInt(100);
                flag=x.Trampa(rand);
                if(flag)
                {
                    System.out.println(x.getNombre()+"(Golpeador - ("+ x.getCasa()+") Creo una burbuja protectora");
                    for (int i = 0; i < a.getJugadores().size(); i++) {
                        if(a.getJugadores().get(i) instanceof Golpeador)
                        {
                            ((Golpeador)a.getJugadores().get(i)).setAgilidad(((Golpeador)a.getJugadores().get(i)).getAgilidad()+10);
                            ((Golpeador)a.getJugadores().get(i)).setFuerza(((Golpeador)a.getJugadores().get(i)).getFuerza()+10);
                        }
                    }
                }
                else
                {
                    System.out.println(x.getNombre()+"(Golpeador - ("+ x.getCasa()+") No pudo crear burbujar protectoras");
                    for (int i = 0; i < a.getJugadores().size(); i++) {
                        if(a.getJugadores().get(i) instanceof Golpeador)
                        {
                            ((Golpeador)a.getJugadores().get(i)).setAgilidad(((Golpeador)a.getJugadores().get(i)).getAgilidad()-10);
                            ((Golpeador)a.getJugadores().get(i)).setFuerza(((Golpeador)a.getJugadores().get(i)).getFuerza()-15);
                        }
                    }
                }
            }
        }
        
        if(x instanceof Cazador)
        {
            if(jugada==1)
            {
                int ag=0;
                for (int i = 0; i < b.getJugadores().size(); i++) {
                    if(b.getJugadores().get(i) instanceof Guardian)
                    {
                        ag=((Guardian)b.getJugadores().get(i)).getAgilidad();
                    }
                }
                flag=x.Juego(ag, true);
                if(flag)
                {
                    ((Cazador) x).setAgilidad(((Cazador) x).getAgilidad()+6);
                    ((Cazador) x).setVelocidad(((Cazador) x).getVelocidad()+6);
                    System.out.println(x.getNombre()+"(Cazador - ("+ x.getCasa()+") Metio un gol");
                    marcador1+=10;
                }
                else
                {
                    System.out.println(x.getNombre()+"(Cazador - ("+ x.getCasa()+") no metio el gol");
                }
            }
            if(jugada==2)
            {
                int rand=1+random.nextInt(100);
                flag=x.Trampa(rand);
                if(flag)
                {
                    System.out.println(x.getNombre()+"(Cazador - ("+ x.getCasa()+") Encanto la escoba para volar mas rapido");
                    for (int i = 0; i < a.getJugadores().size(); i++) {
                        if(a.getJugadores().get(i) instanceof Cazador)
                        {
                            ((Cazador)a.getJugadores().get(i)).setAgilidad(((Cazador)a.getJugadores().get(i)).getAgilidad()+6);
                            ((Cazador)a.getJugadores().get(i)).setVelocidad(((Cazador)a.getJugadores().get(i)).getVelocidad()+6);
                        }
                    }
                }
                else
                {
                    System.out.println(x.getNombre()+"(Cazador - ("+ x.getCasa()+") No pudo encantar la escoba");
                    for (int i = 0; i < a.getJugadores().size(); i++) {
                        if(a.getJugadores().get(i) instanceof Cazador)
                        {
                            ((Cazador)a.getJugadores().get(i)).setVelocidad(3);
                        }
                    }
                }
            }
        }
        if(x instanceof Buscador)
        {
            if(jugada==1)
            {
                int ag=0;
                for (int i = 0; i < b.getJugadores().size(); i++) {
                    if(b.getJugadores().get(i) instanceof Buscador)
                    {
                        ag=((Buscador)b.getJugadores().get(i)).getVelocidad();
                    }
                }
                flag=x.Juego(ag, true);
                if(flag)
                {
                    
                    System.out.println(x.getNombre()+"(Buscador - ("+ x.getCasa()+") atrapo la Snitch Dorada");
                    snitch=true;
                    marcador1+=150;
                }
                else
                {
                    System.out.println(x.getNombre()+"(Buscador - ("+ x.getCasa()+") no atrapo la Snitch Dorada");
                }
            }
            if(jugada==2)
            {
                int rand=1+random.nextInt(100);
                flag=x.Trampa(rand);
                if(flag)
                {
                    System.out.println(x.getNombre()+"(Buscador - ("+ x.getCasa()+") Pudo atraer la snitch con su varita");
                    marcador1+=150;
                }
                else
                {
                    System.out.println(x.getNombre()+"(Buscador - ("+ x.getCasa()+") No pudo atraer la snitch con la varita, DESCALIFICADO DEL JUEGO");
                    snitch=true;
                }
            }
        }
        
        //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        //JUGADA DE LA MAQUINA
        
        int r=random.nextInt(b.getJugadores().size()-1);
        jugada=1+random.nextInt(2);
        x=b.getJugadores().get(r);
        if(x instanceof Guardian)
        {
            if(jugada==1)
            {
                int vel=100;
                for (int i = 0; i < b.getJugadores().size(); i++) {
                    if(b.getJugadores().get(i) instanceof Cazador)
                    {
                        if(vel>((Cazador)b.getJugadores().get(i)).getVelocidad())
                        {
                            vel=((Cazador)b.getJugadores().get(i)).getVelocidad();
                        }
                    }
                }
                flag=x.Juego(vel, true);
                if(flag)
                {
                    ((Guardian) x).setAgilidad(((Guardian) x).getAgilidad()+8);
                    System.out.println(x.getNombre()+"(Guadrian - ("+ x.getCasa()+") Atajo un gol");
                }
                else
                {
                    System.out.println(x.getNombre()+"(Guadrian - ("+ x.getCasa()+") no atajo el gol");
                    marcador2+=10;
                }
            }
            if(jugada==2)
            {
                int rand=1+random.nextInt(100);
                flag=x.Trampa(rand);
                if(flag)
                {
                    System.out.println(x.getNombre()+"(Guadrian - ("+ x.getCasa()+") Creo barreras invisibles frente a los aros");
                    barrera2=true;
                    contb2=2;
                }
                else
                {
                    System.out.println(x.getNombre()+"(Guadrian - ("+ x.getCasa()+") No pudo crear barreras, no puede atajar por 2 turnos");
                    atajar2=true;
                    conta2=2;
                }
            }
        }
        if(x instanceof Golpeador)
        {
            if(jugada==1)
            {
                int opcion=1+random.nextInt(2);
                
                if(opcion==1)
                {
                    int suma=0;
                    for (int i = 0; i < a.getJugadores().size(); i++) {
                        if(a.getJugadores().get(i) instanceof Golpeador)
                        {
                            suma+=((Golpeador)a.getJugadores().get(i)).getFuerza();
                        }
                    }
                    flag=x.Juego(suma, true);
                    if(flag)
                    {
                        ((Golpeador) x).setFuerza(((Golpeador) x).getFuerza()+10);
                        System.out.println(x.getNombre()+"(Golpeador - ("+ x.getCasa()+") Ataco exitosamente");
                    }
                    else
                    {
                        System.out.println(x.getNombre()+"(Guadrian - ("+ x.getCasa()+") no pudo atacar");
                    
                    }
                }
                else
                {
                    int vel=100;
                    for (int i = 0; i < a.getJugadores().size(); i++) {
                        if(a.getJugadores().get(i) instanceof Golpeador)
                        {
                            if(vel>((Golpeador)a.getJugadores().get(i)).getAgilidad())
                            {
                                vel=((Golpeador)a.getJugadores().get(i)).getAgilidad();
                            }
                        }
                    }
                    flag=x.Juego(vel,false);
                    if(flag)
                    {
                        ((Golpeador) x).setAgilidad(((Golpeador) x).getAgilidad()+10);
                        System.out.println(x.getNombre()+"(Golpeador - ("+ x.getCasa()+") Defendio a su compañero");
                    }
                    else
                    {
                        System.out.println(x.getNombre()+"(Golpeador - ("+ x.getCasa()+") no defendio a su compañero");
                    
                    }
                }

            }
            if(jugada==2)
            {
                int rand=1+random.nextInt(100);
                flag=x.Trampa(rand);
                if(flag)
                {
                    System.out.println(x.getNombre()+"(Golpeador - ("+ x.getCasa()+") Creo una burbuja protectora");
                    for (int i = 0; i < b.getJugadores().size(); i++) {
                        if(b.getJugadores().get(i) instanceof Golpeador)
                        {
                            ((Golpeador)b.getJugadores().get(i)).setAgilidad(((Golpeador)b.getJugadores().get(i)).getAgilidad()+10);
                            ((Golpeador)b.getJugadores().get(i)).setFuerza(((Golpeador)b.getJugadores().get(i)).getFuerza()+10);
                        }
                    }
                }
                else
                {
                    System.out.println(x.getNombre()+"(Golpeador - ("+ x.getCasa()+") No pudo crear burbujar protectoras");
                    for (int i = 0; i < b.getJugadores().size(); i++) {
                        if(b.getJugadores().get(i) instanceof Golpeador)
                        {
                            ((Golpeador)b.getJugadores().get(i)).setAgilidad(((Golpeador)b.getJugadores().get(i)).getAgilidad()-10);
                            ((Golpeador)b.getJugadores().get(i)).setFuerza(((Golpeador)b.getJugadores().get(i)).getFuerza()-15);
                        }
                    }
                }
            }
        }
        if(x instanceof Cazador)
        {
            if(jugada==1)
            {
                int ag=0;
                for (int i = 0; i < a.getJugadores().size(); i++) {
                    if(a.getJugadores().get(i) instanceof Guardian)
                    {
                        ag=((Guardian)a.getJugadores().get(i)).getAgilidad();
                    }
                }
                flag=x.Juego(ag, true);
                if(flag)
                {
                    ((Cazador) x).setAgilidad(((Cazador) x).getAgilidad()+6);
                    ((Cazador) x).setVelocidad(((Cazador) x).getVelocidad()+6);
                    System.out.println(x.getNombre()+"(Cazador - ("+ x.getCasa()+") Metio un gol");
                    marcador1+=10;
                }
                else
                {
                    System.out.println(x.getNombre()+"(Cazador - ("+ x.getCasa()+") no metio el gol");
                }
            }
            if(jugada==2)
            {
                int rand=1+random.nextInt(100);
                flag=x.Trampa(rand);
                if(flag)
                {
                    System.out.println(x.getNombre()+"(Cazador - ("+ x.getCasa()+") Encanto la escoba para volar mas rapido");
                    for (int i = 0; i < b.getJugadores().size(); i++) {
                        if(b.getJugadores().get(i) instanceof Cazador)
                        {
                            ((Cazador)b.getJugadores().get(i)).setAgilidad(((Cazador)b.getJugadores().get(i)).getAgilidad()+6);
                            ((Cazador)b.getJugadores().get(i)).setVelocidad(((Cazador)b.getJugadores().get(i)).getVelocidad()+6);
                        }
                    }
                }
                else
                {
                    System.out.println(x.getNombre()+"(Cazador - ("+ x.getCasa()+") No pudo encantar la escoba");
                    for (int i = 0; i < b.getJugadores().size(); i++) {
                        if(b.getJugadores().get(i) instanceof Cazador)
                        {
                            ((Cazador)b.getJugadores().get(i)).setVelocidad(3);
                        }
                    }
                }
            }
        }
        
        if(x instanceof Buscador)
        {
            if(jugada==1)
            {
                int ag=0;
                for (int i = 0; i < a.getJugadores().size(); i++) {
                    if(a.getJugadores().get(i) instanceof Buscador)
                    {
                        ag=((Buscador)a.getJugadores().get(i)).getVelocidad();
                    }
                }
                flag=x.Juego(ag, true);
                if(flag)
                {
                    
                    System.out.println(x.getNombre()+"(Buscador - ("+ x.getCasa()+") atrapo la Snitch Dorada");
                    snitch=true;
                    marcador1+=150;
                }
                else
                {
                    System.out.println(x.getNombre()+"(Buscador - ("+ x.getCasa()+") no atrapo la Snitch Dorada");
                }
            }
            if(jugada==2)
            {
                int rand=1+random.nextInt(100);
                flag=x.Trampa(rand);
                if(flag)
                {
                    System.out.println(x.getNombre()+"(Buscador - ("+ x.getCasa()+") Pudo atraer la snitch con su varita");
                    marcador1+=150;
                }
                else
                {
                    System.out.println(x.getNombre()+"(Buscador - ("+ x.getCasa()+") No pudo atraer la snitch con la varita, DESCALIFICADO DEL JUEGO");
                    snitch=true;
                }
            }
        }
        
        
        
        conta1--;
        conta2--;
        contb1--;
        contb2--;
        if(contb1==0)
        {
            barrera1=false;
            System.out.println("Se termino la barrera de tu equipo");
        }
        if(contb2==0)
        {
            barrera2=false;
            System.out.println("Se termino la barrera del oponente");
        }
        if(conta1==0)
        {
            atajar1=false;
            System.out.println("Tu portero ya puede atajar");
        }
        if(conta2==0)
        {
            atajar2=false;
            System.out.println("El equipo oponente ya puede atajar");
        }
        
        System.out.println("El marcador es: "+a.getCasa()+ " " + marcador1 +" - " + marcador2 + " "+ b.getCasa());
        
    }
}






































































































































































































































































































































































































































}
