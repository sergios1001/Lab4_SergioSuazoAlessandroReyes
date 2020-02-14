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
    
















































































































































































































































































































































































































































































































}
