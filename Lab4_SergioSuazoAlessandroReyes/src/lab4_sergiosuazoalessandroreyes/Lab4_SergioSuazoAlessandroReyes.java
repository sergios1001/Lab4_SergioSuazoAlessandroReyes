package lab4_sergiosuazoalessandroreyes;

import java.awt.Color;
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
        
        equipos.add(new Equipo("Grifindor", 0, 0, 0, 0, 0, null));
        equipos.get(0).getJugadores().add(new Buscador(160, "Harry Potter", "Gryffindor", 3, 10));
        equipos.get(0).getJugadores().add(new Guardian(10, "Ron Wesley", "Gryffindor", 3, 12));
        equipos.get(0).getJugadores().add(new Golpeador(10,8,"Adriana Parodi", "Gryffindor", 3, 2));
        equipos.get(0).getJugadores().add(new Golpeador(7,7, "Alexandre", "Gryffindor", 3, 42));
        equipos.get(0).getJugadores().add(new Cazador(165,6, "James Potter", "Gryffindor", 3, 62));
        equipos.get(0).getJugadores().add(new Cazador(166,5, "Albus Dumbledore", "Gryffindor", 3, 92));
        equipos.get(0).getJugadores().add(new Cazador(150,4, "Sirius Black", "Gryffindor", 3, 52));
        
        equipos.add(new Equipo("Slytherin", 0, 0, 0, 0, 0, null));
        equipos.get(1).getJugadores().add(new Buscador(160, "Draco Malfoy", "Slytherin", 3, 10));
        equipos.get(1).getJugadores().add(new Guardian(10, "Severus Snape", "Slytherin", 3, 12));
        equipos.get(1).getJugadores().add(new Golpeador(10,8,"Lucius Malfoy", "Slytherin", 3, 2));
        equipos.get(1).getJugadores().add(new Golpeador(7,7, "Bellatrix Lestrange", "Slytherin", 3, 42));
        equipos.get(1).getJugadores().add(new Cazador(165,6, "Tom Riddle", "Slytherin", 3, 62));
        equipos.get(1).getJugadores().add(new Cazador(166,5, "Dolores Umbridge", "Slytherin", 3, 92));
        equipos.get(1).getJugadores().add(new Cazador(150,4, "Salazar Slytherin", "Slytherin", 3, 52));
        
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
                            for (int i = 0; i < equipos.size(); i++) {
                                System.out.println(i+") "+equipos.get(i).getCasa());
                            }
                            System.out.print("Elija el numero del equipo que quiere modificar.");
                            int mod = leer.nextInt();
                            System.out.print("Desea quitarle la capitania al capitan actual [s/n]: ");
                            char el = leer.next().charAt(0);
                            if(el=='s'||el=='S'){
                                System.out.print("EL jugador ya no es el capitan, desea elegir uno nuevo[s/n]: ");
                                equipos.get(mod).setCapitan(null);
                                el = leer.next().charAt(0);
                                if(el=='s'||el=='S'){
                                    for (int i = 0; i < equipos.get(mod).getJugadores().size(); i++) {
                                        System.out.println(i+") "+equipos.get(mod).getJugadores().get(i).getNombre());
                                    }
                                    System.out.print("Elija el numero del jugador que quiere de capitan.");
                                    int nc = leer.nextInt();
                                    equipos.get(mod).setCapitan(equipos.get(mod).getJugadores().get(nc));
                                    System.out.println("Se le dio la capitania con exito.");
                                }
                            }
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
                                        try {
                                            validarcant(v);
                                        } catch (Misexcepcionts ex) {
                                            System.out.println(ex.getMessage());
                                            break;
                                        }
                                    } else {
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
                                                    System.out.println("ELija otro numero de camisa, el seleccionado, ya esta en uso: ");
                                                    num = leer.nextInt();
                                                    i=0;
                                                }
                                            }
                                            ver = false;
                                        }
                                        System.out.println("1. Guardian"
                                                + "\n2. Golpeador"
                                                + "\n3. Cazador"
                                                + "\n4. Buscador");
                                        int pos = leer.nextInt();
                                        if(pos==1){
                                            boolean x = true;
                                            for (int i = 0; i < equipos.get(v).getJugadores().size(); i++) {
                                                if(equipos.get(v).getJugadores().get(i) instanceof Guardian){
                                                    System.out.println("Ya existe un guardian en el equipo.");
                                                    x=false;
                                                    break;
                                                }
                                            }
                                            while(x){
                                                System.out.println("Cual es el reflejo del guardian(1-10): ");
                                                int stats = leer.nextInt();
                                                try {
                                                    validarOReflejo(stats);
                                                } catch (Misexcepcionts ex) {
                                                    System.out.println(ex.getMessage());
                                                    break;
                                                }
                                                if(equipos.get(v).getCapitan()==null){
                                                    System.out.println("Quiere que este sea su capitan[s/n]: ");
                                                    char cap = leer.next().charAt(0);
                                                    
                                                    if(cap == 's' || cap == 'S'){
                                                        equipos.get(v).setCapitan(new Guardian(stats, n, "Gryffindor", a, num));
                                                    }
                                                    
                                                }
                                                jugadores.add(new Guardian(stats, n, "Gryffindor", a, num));
                                                equipos.get(v).getJugadores().add(new Guardian(stats, n, "Gryffindor", a, num));
                                            }
                                        }else if(pos==2){
                                            boolean x = true;
                                            for (int i = 0; i < equipos.get(v).getJugadores().size(); i++) {
                                                if(equipos.get(v).getJugadores().get(i) instanceof Golpeador){
                                                    System.out.println("Ya existe un guardian en el equipo.");
                                                    x=false;
                                                    break;
                                                }
                                            }
                                            while(x){
                                                System.out.println("Cual es la musculatura del Golpeador(1-15): ");
                                                int stats = leer.nextInt();
                                                try {
                                                    validarMusc(stats);
                                                } catch (Misexcepcionts ex) {
                                                    System.out.println(ex.getMessage());
                                                    break;
                                                }
                                                System.out.println("Cual es el reflejo del Golpeador(1-10): ");
                                                int stat = leer.nextInt();
                                                try {
                                                    validarOReflejo(stat);
                                                } catch (Misexcepcionts ex) {
                                                    System.out.println(ex.getMessage());
                                                    break;
                                                }
                                                if (equipos.get(v).getCapitan().getNombre() == null) {
                                                    System.out.println("Quiere que este sea su capitan[s/n]: ");
                                                    char cap = leer.next().charAt(0);
                                                    if(cap == 's' || cap == 'S')
                                                        equipos.get(v).setCapitan(new Golpeador(stats, stat, n, "Gryffindor", a, num));
                                                }
                                                jugadores.add(new Golpeador(stats, stat, n, "Gryffindor", a, num));
                                                equipos.get(v).getJugadores().add(new Golpeador(stats, stat, n, "Gryffindor", a, num));
                                            }
                                        }else if(pos==3){
                                            boolean x = true;
                                            for (int i = 0; i < equipos.get(v).getJugadores().size(); i++) {
                                                if(equipos.get(v).getJugadores().get(i) instanceof Cazador){
                                                    System.out.println("Ya existe un guardian en el equipo.");
                                                    x=false;
                                                    break;
                                                }
                                            }
                                            while(x){
                                                System.out.println("Cual es el reflejo del Cazador(1-15): ");
                                                int stats = leer.nextInt();
                                                try {
                                                    validarOReflejo(stats);
                                                } catch (Misexcepcionts ex) {
                                                    System.out.println(ex.getMessage());
                                                    break;
                                                }
                                                System.out.println("Cual es el peso del cazador: ");
                                                int stat = leer.nextInt();
                                                
                                                if(equipos.get(v).getCapitan()==null){
                                                    System.out.println("Quiere que este sea su capitan[s/n]: ");
                                                    char cap = leer.next().charAt(0);
                                                    if(cap == 's' || cap == 'S')
                                                        equipos.get(v).setCapitan(new Cazador(stat, stats, n, "Gryffindor", a, num));
                                                }
                                                jugadores.add(new Cazador(stat, stats, n, "Gryffindor", a, num));
                                                equipos.get(v).getJugadores().add(new Cazador(stat, stats, n, "Gryffindor", a, num));
                                            }
                                        }else if(pos==4){
                                            boolean x = true;
                                            for (int i = 0; i < equipos.get(v).getJugadores().size(); i++) {
                                                if(equipos.get(v).getJugadores().get(i) instanceof Buscador){
                                                    System.out.println("Ya existe un guardian en el equipo.");
                                                    x=false;
                                                    break;
                                                }
                                            }
                                            while(x){
                                                System.out.println("Cual es el peso del Bucador: ");
                                                int stats = leer.nextInt();
                                                if(equipos.get(v).getCapitan()==null){
                                                    System.out.println("Quiere que este sea su capitan[s/n]: ");
                                                    char cap = leer.next().charAt(0);
                                                    if(cap == 's' || cap == 'S')
                                                        equipos.get(v).setCapitan(new Buscador(stats, n, "Gryffindor", a, num));
                                                }
                                                jugadores.add(new Buscador(stats, n, "Gryffindor", a, num));
                                                equipos.get(v).getJugadores().add(new Buscador(stats, n, "Gryffindor", a, num));
                                            }
                                        } 
                                    }
                                }else if(c==2){
                                    int v=0;
                                    for (int i = 0; i < equipos.size(); i++) {
                                        if(equipos.get(i).getCasa().equals("Slytherin"))
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
                                                    System.out.println("ELija otro numero de camisa, el seleccionado, ya esta en uso: ");
                                                    num = leer.nextInt();
                                                    i=0;
                                                }
                                            }
                                            ver = false;
                                        }
                                        System.out.println("1. Guardian"
                                                + "\n2. Golpeador"
                                                + "\n3. Cazador"
                                                + "\n4. Buscador");
                                        int pos = leer.nextInt();
                                        if(pos==1){
                                            boolean x = true;
                                            for (int i = 0; i < equipos.get(v).getJugadores().size(); i++) {
                                                if(equipos.get(v).getJugadores().get(i) instanceof Guardian){
                                                    System.out.println("Ya existe un guardian en el equipo.");
                                                    x=false;
                                                    break;
                                                }
                                            }
                                            while(x){
                                                System.out.println("Cual es el reflejo del guardian(1-10): ");
                                                int stats = leer.nextInt();
                                                try {
                                                    validarOReflejo(stats);
                                                } catch (Misexcepcionts ex) {
                                                    System.out.println(ex.getMessage());
                                                    break;
                                                }
                                                if(equipos.get(v).getCapitan()==null){
                                                    System.out.println("Quiere que este sea su capitan[s/n]: ");
                                                    char cap = leer.next().charAt(0);
                                                    
                                                    if(cap == 's' || cap == 'S'){
                                                        equipos.get(v).setCapitan(new Guardian(stats, n, "Slytherin", a, num));
                                                    }
                                                    
                                                }
                                                jugadores.add(new Guardian(stats, n, "Slytherin", a, num));
                                                equipos.get(v).getJugadores().add(new Guardian(stats, n, "Slytherin", a, num));
                                            }
                                        }else if(pos==2){
                                            boolean x = true;
                                            for (int i = 0; i < equipos.get(v).getJugadores().size(); i++) {
                                                if(equipos.get(v).getJugadores().get(i) instanceof Golpeador){
                                                    System.out.println("Ya existe un guardian en el equipo.");
                                                    x=false;
                                                    break;
                                                }
                                            }
                                            while(x){
                                                System.out.println("Cual es la musculatura del Golpeador(1-15): ");
                                                int stats = leer.nextInt();
                                                try {
                                                    validarMusc(stats);
                                                } catch (Misexcepcionts ex) {
                                                    System.out.println(ex.getMessage());
                                                    break;
                                                }
                                                System.out.println("Cual es el reflejo del Golpeador(1-10): ");
                                                int stat = leer.nextInt();
                                                
                                                try {
                                                    validarOReflejo(stat);
                                                } catch (Misexcepcionts ex) {
                                                    System.out.println(ex.getMessage());
                                                    break;
                                                }
                                                if(equipos.get(v).getCapitan()==null){
                                                    System.out.println("Quiere que este sea su capitan[s/n]: ");
                                                    char cap = leer.next().charAt(0);
                                                    if(cap == 's' || cap == 'S')
                                                        equipos.get(v).setCapitan(new Golpeador(stats, stat, n, "Slytherin", a, num));
                                                }
                                                jugadores.add(new Golpeador(stats, stat, n, "Slytherin", a, num));
                                                equipos.get(v).getJugadores().add(new Golpeador(stats, stat, n, "Slytherin", a, num));
                                            }
                                        }else if(pos==3){
                                            boolean x = true;
                                            for (int i = 0; i < equipos.get(v).getJugadores().size(); i++) {
                                                if(equipos.get(v).getJugadores().get(i) instanceof Cazador){
                                                    System.out.println("Ya existe un guardian en el equipo.");
                                                    x=false;
                                                    break;
                                                }
                                            }
                                            while(x){
                                                System.out.println("Cual es el reflejo del Cazador(1-10): ");
                                                int stats = leer.nextInt();
                                                try {
                                                    validarOReflejo(stats);
                                                } catch (Misexcepcionts ex) {
                                                    System.out.println(ex.getMessage());
                                                    break;
                                                }
                                                System.out.println("Cual es el peso del cazador: ");
                                                int stat = leer.nextInt();
                                                if(equipos.get(v).getCapitan()==null){
                                                    System.out.println("Quiere que este sea su capitan[s/n]: ");
                                                    char cap = leer.next().charAt(0);
                                                    if(cap == 's' || cap == 'S')
                                                        equipos.get(v).setCapitan(new Cazador(stat, stats, n, "Slytherin", a, num));
                                                }
                                                jugadores.add(new Cazador(stat, stats, n, "Slytherin", a, num));
                                                equipos.get(v).getJugadores().add(new Cazador(stat, stats, n, "Slytherin", a, num));
                                            }
                                        }else if(pos==4){
                                            boolean x = true;
                                            for (int i = 0; i < equipos.get(v).getJugadores().size(); i++) {
                                                if(equipos.get(v).getJugadores().get(i) instanceof Buscador){
                                                    System.out.println("Ya existe un guardian en el equipo.");
                                                    x=false;
                                                    break;
                                                }
                                            }
                                            while(x){
                                                System.out.println("Cual es el peso del Bucador: ");
                                                int stats = leer.nextInt();
                                                if(equipos.get(v).getCapitan()==null){
                                                    System.out.println("Quiere que este sea su capitan[s/n]: ");
                                                    char cap = leer.next().charAt(0);
                                                    if(cap == 's' || cap == 'S')
                                                        equipos.get(v).setCapitan(new Buscador(stats, n, "Slytherin", a, num));
                                                }
                                                jugadores.add(new Buscador(stats, n, "Slytherin", a, num));
                                                equipos.get(v).getJugadores().add(new Buscador(stats, n, "Slytherin", a, num));
                                            }
                                        } 
                                    }
                                }else if(c==3){
                                    int v=0;
                                    for (int i = 0; i < equipos.size(); i++) {
                                        if(equipos.get(i).getCasa().equals("Ravenclaw"))
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
                                                    System.out.println("ELija otro numero de camisa, el seleccionado, ya esta en uso: ");
                                                    num = leer.nextInt();
                                                    i=0;
                                                }
                                            }
                                            ver = false;
                                        }
                                        System.out.println("1. Guardian"
                                                + "\n2. Golpeador"
                                                + "\n3. Cazador"
                                                + "\n4. Buscador");
                                        int pos = leer.nextInt();
                                        if(pos==1){
                                            boolean x = true;
                                            for (int i = 0; i < equipos.get(v).getJugadores().size(); i++) {
                                                if(equipos.get(v).getJugadores().get(i) instanceof Guardian){
                                                    System.out.println("Ya existe un guardian en el equipo.");
                                                    x=false;
                                                    break;
                                                }
                                            }
                                            while(x){
                                                System.out.println("Cual es el reflejo del guardian(1-10): ");
                                                int stats = leer.nextInt();
                                                try {
                                                    validarOReflejo(stats);
                                                } catch (Misexcepcionts ex) {
                                                    System.out.println(ex.getMessage());
                                                    break;
                                                }
                                                if(equipos.get(v).getCapitan()==null){
                                                    System.out.println("Quiere que este sea su capitan[s/n]: ");
                                                    char cap = leer.next().charAt(0);
                                                    
                                                    if(cap == 's' || cap == 'S'){
                                                        equipos.get(v).setCapitan(new Guardian(stats, n, "Ravenclaw", a, num));
                                                    }
                                                    
                                                }
                                                jugadores.add(new Guardian(stats, n, "Ravenclaw", a, num));
                                                equipos.get(v).getJugadores().add(new Guardian(stats, n, "Ravenclaw", a, num));
                                            }
                                        }else if(pos==2){
                                            boolean x = true;
                                            for (int i = 0; i < equipos.get(v).getJugadores().size(); i++) {
                                                if(equipos.get(v).getJugadores().get(i) instanceof Golpeador){
                                                    System.out.println("Ya existe un guardian en el equipo.");
                                                    x=false;
                                                    break;
                                                }
                                            }
                                            while(x){
                                                System.out.println("Cual es la musculatura del Golpeador(1-15): ");
                                                int stats = leer.nextInt();
                                                try {
                                                    validarMusc(stats);
                                                } catch (Misexcepcionts ex) {
                                                    System.out.println(ex.getMessage());
                                                    break;
                                                }
                                                
                                                System.out.println("Cual es el reflejo del Golpeador(1-10): ");
                                                int stat = leer.nextInt();
                                                try {
                                                    validarOReflejo(stat);
                                                } catch (Misexcepcionts ex) {
                                                    System.out.println(ex.getMessage());
                                                    break;
                                                }
                                                if(equipos.get(v).getCapitan()==null){
                                                    System.out.println("Quiere que este sea su capitan[s/n]: ");
                                                    char cap = leer.next().charAt(0);
                                                    
                                                    if(cap == 's' || cap == 'S'){
                                                        equipos.get(v).setCapitan(new Golpeador(stats, stat, n, "Ravenclaw", a, num));
                                                    }
                                                    
                                                }
                                                jugadores.add(new Golpeador(stats, stat, n, "Ravenclaw", a, num));
                                                equipos.get(v).getJugadores().add(new Golpeador(stats, stat, n, "Ravenclaw", a, num));
                                            }
                                        }else if(pos==3){
                                            boolean x = true;
                                            for (int i = 0; i < equipos.get(v).getJugadores().size(); i++) {
                                                if(equipos.get(v).getJugadores().get(i) instanceof Cazador){
                                                    System.out.println("Ya existe un guardian en el equipo.");
                                                    x=false;
                                                    break;
                                                }
                                            }
                                            while(x){
                                                System.out.println("Cual es el reflejo del Cazador(1-15): ");
                                                int stats = leer.nextInt();
                                                try {
                                                    validarOReflejo(stats);
                                                } catch (Misexcepcionts ex) {
                                                    System.out.println(ex.getMessage());
                                                    break;
                                                }
                                                System.out.println("Cual es el peso del cazador: ");
                                                int stat = leer.nextInt();
                                                if(equipos.get(v).getCapitan()==null){
                                                    System.out.println("Quiere que este sea su capitan[s/n]: ");
                                                    char cap = leer.next().charAt(0);
                                                    
                                                    if(cap == 's' || cap == 'S'){
                                                        equipos.get(v).setCapitan(new Cazador(stat, stats, n, "Ravenclaw", a, num));
                                                    }
                                                    
                                                }
                                                jugadores.add(new Cazador(stat, stats, n, "Ravenclaw", a, num));
                                                equipos.get(v).getJugadores().add(new Cazador(stat, stats, n, "Ravenclaw", a, num));
                                            }
                                        }else if(pos==4){
                                            boolean x = true;
                                            for (int i = 0; i < equipos.get(v).getJugadores().size(); i++) {
                                                if(equipos.get(v).getJugadores().get(i) instanceof Buscador){
                                                    System.out.println("Ya existe un guardian en el equipo.");
                                                    x=false;
                                                    break;
                                                }
                                            }
                                            while(x){
                                                System.out.println("Cual es el peso del Bucador: ");
                                                int stats = leer.nextInt();
                                                if(equipos.get(v).getCapitan()==null){
                                                    System.out.println("Quiere que este sea su capitan[s/n]: ");
                                                    char cap = leer.next().charAt(0);
                                                    
                                                    if(cap == 's' || cap == 'S'){
                                                        equipos.get(v).setCapitan(new Buscador(stats, n, "Ravenclaw", a, num));
                                                    }
                                                    
                                                }
                                                jugadores.add(new Buscador(stats, n, "Ravenclaw", a, num));
                                                equipos.get(v).getJugadores().add(new Buscador(stats, n, "Ravenclaw", a, num));
                                            }
                                        } 
                                    }
                                }else if(c==4){
                                    int v=0;
                                    for (int i = 0; i < equipos.size(); i++) {
                                        if(equipos.get(i).getCasa().equals("Hufflepuff"))
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
                                                    System.out.println("ELija otro numero de camisa, el seleccionado, ya esta en uso: ");
                                                    num = leer.nextInt();
                                                    i=0;
                                                }
                                            }
                                            ver = false;
                                        }
                                        System.out.println("1. Guardian"
                                                + "\n2. Golpeador"
                                                + "\n3. Cazador"
                                                + "\n4. Buscador");
                                        int pos = leer.nextInt();
                                        if(pos==1){
                                            boolean x = true;
                                            for (int i = 0; i < equipos.get(v).getJugadores().size(); i++) {
                                                if(equipos.get(v).getJugadores().get(i) instanceof Guardian){
                                                    System.out.println("Ya existe un guardian en el equipo.");
                                                    x=false;
                                                    break;
                                                }
                                            }
                                            while(x){
                                                System.out.println("Cual es el reflejo del guardian(1-10): ");
                                                int stats = leer.nextInt();
                                                try {
                                                    validarOReflejo(stats);
                                                } catch (Misexcepcionts ex) {
                                                    System.out.println(ex.getMessage());
                                                    break;
                                                }
                                                if(equipos.get(v).getCapitan()==null){
                                                    System.out.println("Quiere que este sea su capitan[s/n]: ");
                                                    char cap = leer.next().charAt(0);
                                                    
                                                    if(cap == 's' || cap == 'S'){
                                                        equipos.get(v).setCapitan(new Guardian(stats, n, "Hufflepuff", a, num));
                                                    }
                                                    
                                                }
                                                jugadores.add(new Guardian(stats, n, "Hufflepuff", a, num));
                                                equipos.get(v).getJugadores().add(new Guardian(stats, n, "Hufflepuff", a, num));
                                            }
                                        }else if(pos==2){
                                            boolean x = true;
                                            for (int i = 0; i < equipos.get(v).getJugadores().size(); i++) {
                                                if(equipos.get(v).getJugadores().get(i) instanceof Golpeador){
                                                    System.out.println("Ya existe un guardian en el equipo.");
                                                    x=false;
                                                    break;
                                                }
                                            }
                                            while(x){
                                                System.out.println("Cual es la musculatura del Golpeador(1-15): ");
                                                int stats = leer.nextInt();
                                                try {
                                                    validarMusc(stats);
                                                } catch (Misexcepcionts ex) {
                                                    System.out.println(ex.getMessage());
                                                    break;
                                                }
                                                
                                                System.out.println("Cual es el reflejo del Golpeador(1-10): ");
                                                int stat = leer.nextInt();
                                                try {
                                                    validarOReflejo(stat);
                                                } catch (Misexcepcionts ex) {
                                                    System.out.println(ex.getMessage());
                                                    break;
                                                }
                                                if(equipos.get(v).getCapitan()==null){
                                                    System.out.println("Quiere que este sea su capitan[s/n]: ");
                                                    char cap = leer.next().charAt(0);
                                                    
                                                    if(cap == 's' || cap == 'S'){
                                                        equipos.get(v).setCapitan(new Golpeador(stats, stat, n, "Hufflepuff", a, num));
                                                    }
                                                    
                                                }
                                                jugadores.add(new Golpeador(stats, stat, n, "Hufflepuff", a, num));
                                                equipos.get(v).getJugadores().add(new Golpeador(stats, stat, n, "Hufflepuff", a, num));
                                            }
                                        }else if(pos==3){
                                            boolean x = true;
                                            for (int i = 0; i < equipos.get(v).getJugadores().size(); i++) {
                                                if(equipos.get(v).getJugadores().get(i) instanceof Cazador){
                                                    System.out.println("Ya existe un guardian en el equipo.");
                                                    x=false;
                                                    break;
                                                }
                                            }
                                            while(x){
                                                System.out.println("Cual es el reflejo del Cazador(1-10): ");
                                                int stats = leer.nextInt();
                                                try {
                                                    validarOReflejo(stats);
                                                } catch (Misexcepcionts ex) {
                                                    System.out.println(ex.getMessage());
                                                    break;
                                                }
                                                System.out.println("Cual es el peso del cazador: ");
                                                int stat = leer.nextInt();
                                                if(equipos.get(v).getCapitan()==null){
                                                    System.out.println("Quiere que este sea su capitan[s/n]: ");
                                                    char cap = leer.next().charAt(0);
                                                    
                                                    if(cap == 's' || cap == 'S'){
                                                        equipos.get(v).setCapitan(new Cazador(stat, stats, n, "Hufflepuff", a, num));
                                                    }
                                                    
                                                }
                                                jugadores.add(new Cazador(stat, stats, n, "Hufflepuff", a, num));
                                                equipos.get(v).getJugadores().add(new Cazador(stat, stats, n, "Hufflepuff", a, num));
                                            }
                                        }else if(pos==4){
                                            boolean x = true;
                                            for (int i = 0; i < equipos.get(v).getJugadores().size(); i++) {
                                                if(equipos.get(v).getJugadores().get(i) instanceof Buscador){
                                                    System.out.println("Ya existe un guardian en el equipo.");
                                                    x=false;
                                                    break;
                                                }
                                            }
                                            while(x){
                                                System.out.println("Cual es el peso del Bucador: ");
                                                int stats = leer.nextInt();
                                                if(equipos.get(v).getCapitan()==null){
                                                    System.out.println("Quiere que este sea su capitan[s/n]: ");
                                                    char cap = leer.next().charAt(0);
                                                    
                                                    if(cap == 's' || cap == 'S'){
                                                        equipos.get(v).setCapitan(new Buscador(stats, n, "Hufflepuff", a, num));
                                                    }
                                                    
                                                }
                                                jugadores.add(new Buscador(stats, n, "Hufflepuff", a, num));
                                                equipos.get(v).getJugadores().add(new Buscador(stats, n, "Hufflepuff", a, num));
                                            }
                                        } 
                                    }
                                }
                            }
                            break;
                        case 'b'://listar
                            for (int i = 0; i < jugadores.size(); i++) {
                                System.out.println(i+") "+jugadores.get(i).getNombre());
                            }
                            break;
                        case 'c'://modificar
                            for (int i = 0; i < jugadores.size(); i++) {
                                System.out.println(i+") "+jugadores.get(i).getNombre());
                            }
                            System.out.print("Elija el numero del jugador que desea modificar: ");
                            int mod = leer.nextInt();
                            int me=0, mej=0;
                            boolean cap=false;
                            for (int i = 0; i < equipos.size(); i++) {
                                for (int j = 0; j < equipos.get(i).getJugadores().size(); j++) {
                                    if(equipos.get(i).getJugadores().get(j).getNombre().equals(jugadores.get(mod).getNombre())){
                                        me=i;
                                        mej=j;
                                        if(equipos.get(i).getCapitan().getNombre().equals(jugadores.get(mod).getNombre()))
                                            cap = true;
                                    }
                                }
                            }
                            System.out.print("1) Nombre"
                                    + "\n2) año que cursa en Hogwarts"
                                    + "\n3) Numero de uniforme"
                                    + "\nQue desea modificar de este jugador");
                            int mod1 = leer.nextInt();
                            switch(mod1){
                                case 1:
                                    System.out.print("Cual es el nuevo nombre que le quiere poner: ");
                                    String nom = leer.nextLine();
                                    if(cap){
                                        equipos.get(me).getCapitan().setNombre(nom);
                                    }
                                    jugadores.get(mod).setNombre(nom);
                                    equipos.get(me).getJugadores().get(mej).setNombre(nom);
                                    break;
                                case 2:
                                    System.out.println("Por qué año esta curzando: ");
                                    int a = leer.nextInt();
                                    if(cap){
                                        equipos.get(me).getCapitan().setAño(a);
                                    }
                                    jugadores.get(mod).setAño(a);
                                    equipos.get(me).getJugadores().get(mej).setAño(a);
                                    break;
                                case 3:
                                    System.out.println("Cual es el nuevo numero de uniforme que le quiere asignar: ");
                                    int num = leer.nextInt();
                                    boolean ver = true;
                                    while (ver) {
                                        for (int i = 0; i < equipos.get(me).getJugadores().size(); i++) {
                                            if (equipos.get(me).getJugadores().get(i).getNumero() == num) {
                                                System.out.println("ELija otro numero de camisa, el seleccionado, ya esta en uso: ");
                                                num = leer.nextInt();
                                                i = 0;
                                            }
                                        }
                                        ver = false;
                                    }
                                    if(cap){
                                        equipos.get(me).getCapitan().setNumero(num);
                                    }
                                    jugadores.get(mod).setNumero(num);
                                    equipos.get(me).getJugadores().get(mej).setNumero(num);
                                    System.out.println("Modificacion hecha con exito.");
                                    break;
                            }
                            break;
                        case 'd'://eliminar
                            for (int i = 0; i < jugadores.size(); i++) {
                                System.out.println(i+") "+jugadores.get(i).getNombre());
                            }
                            System.out.print("Elija el numero del jugador que desea eliminar");
                            int del = leer.nextInt();
                            int del2=0;
                            for (int i = 0; i < equipos.size(); i++) {
                                if(jugadores.get(del).getCasa().equals(equipos.get(i).getCasa())){
                                    del2 = leer.nextInt();
                                }
                            }
                            for (int i = 0; i < equipos.get(del2).getJugadores().size(); i++) {
                                if(jugadores.get(del).getNumero() == equipos.get(del2).getJugadores().get(i).getNumero()){
                                    equipos.get(del2).getJugadores().remove(i);
                                }
                            }
                            jugadores.remove(del);
                            System.out.println("Jugador eliminado con exito.");
                            break;
                        case 'e'://ver stats
                            for (int i = 0; i < jugadores.size(); i++) {
                                System.out.println(i+") "+jugadores.get(i).getNombre());
                            }
                            System.out.print("Elija el numero del jugador que quiere visualizar los stats: ");
                            int st = leer.nextInt();
                            System.out.println(jugadores.get(st));
                            break;
                        default:
                            
                    }
                    break;
                case 3://simulaciion del juego
                    Simulacion(equipos.get(0),equipos.get(1));
                    break;
                case 4:
                    r = false;
                    break;
                default:
                    r = false;
            }//fin del switch menu
        }//fin del while menu
    }//fin del main
    static void validarOReflejo(int x)throws Misexcepcionts{
        if(x < 0 || x > 10){
            throw new Misexcepcionts(Color.red,"\n Numero fuera de las opciones\n ");
        }
    }
    static void validarMusc(int x)throws Misexcepcionts{
        if(x < 0 || x > 15){
            throw new Misexcepcionts(Color.red,"\n Numero fuera de las opciones\n ");
        }
    }
    static void validarcant(int v)throws Misexcepcionts{
        if(equipos.get(v).getJugadores().size() == 7){
            throw new Misexcepcionts(Color.red,"\n este equipo ya tiene todos sus jugadores\n ");
        }
    }
    

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public static void Simulacion(Equipo a,Equipo b)
    {
        int marcador1=0,marcador2=0;
        int select,jugada;
        Jugador x;
        int contb1=0,contb2=0,conta1=0,conta2=0;
        boolean flag,barrera1=false,snitch=false,atajar1=false,barrera2=false,atajar2=false;
        while(!snitch)
        {
            //JUGADA DEL USUARIO

            for (int i = 0; i < a.getJugadores().size(); i++) {
            System.out.println(i+"- "+a.getJugadores().get(i).getNombre()+", "+a.getJugadores().get(i));
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
                if(atajar1)
                {
                    System.out.println("El guardian no puede atajar");
                }
                else if(jugada==1)
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
                        System.out.println(x.getNombre()+"(Guadrian - "+ x.getCasa()+") Atajo un gol");
                    }
                    else
                    {
                        System.out.println(x.getNombre()+"(Guadrian - "+ x.getCasa()+") no atajo el gol");
                        marcador2+=10;
                    }
                }
                else if(jugada==2)
                {
                    int rand=1+random.nextInt(100);
                    flag=x.Trampa(rand);
                    if(flag)
                    {
                        System.out.println(x.getNombre()+"(Guadrian - "+ x.getCasa()+") Creo barreras invisibles frente a los aros");
                        barrera1=true;
                        contb1=2;
                    }
                    else
                    {
                        System.out.println(x.getNombre()+"(Guadrian - "+ x.getCasa()+") No pudo crear barreras, no puede atajar por 2 turnos");
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
                            System.out.println(x.getNombre()+"(Golpeador - "+ x.getCasa()+") Ataco exitosamente");
                        }
                        else
                        {
                            System.out.println(x.getNombre()+"(Guadrian - "+ x.getCasa()+") no pudo atacar");

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
                            System.out.println(x.getNombre()+"(Golpeador - "+ x.getCasa()+") Defendio a su compañero");
                        }
                        else
                        {
                            System.out.println(x.getNombre()+"(Golpeador - "+ x.getCasa()+") no defendio a su compañero");

                        }
                    }

                }
                if(jugada==2)
                {
                    int rand=1+random.nextInt(100);
                    flag=x.Trampa(rand);
                    if(flag)
                    {
                        System.out.println(x.getNombre()+"(Golpeador - "+ x.getCasa()+") Creo una burbuja protectora");
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
                        System.out.println(x.getNombre()+"(Golpeador - "+ x.getCasa()+") No pudo crear burbujar protectoras");
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
                    if(flag||atajar2)
                    {
                        ((Cazador) x).setAgilidad(((Cazador) x).getAgilidad()+6);
                        ((Cazador) x).setVelocidad(((Cazador) x).getVelocidad()+6);
                        System.out.println(x.getNombre()+"(Cazador - "+ x.getCasa()+") Metio un gol");
                        marcador1+=10;
                    }
                    else
                    {
                        System.out.println(x.getNombre()+"(Cazador - "+ x.getCasa()+") no metio el gol");
                    }
                }
                if(jugada==2)
                {
                    int rand=1+random.nextInt(100);
                    flag=x.Trampa(rand);
                    if(flag)
                    {
                        System.out.println(x.getNombre()+"(Cazador - "+ x.getCasa()+") Encanto la escoba para volar mas rapido");
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
                        System.out.println(x.getNombre()+"(Cazador - "+ x.getCasa()+") No pudo encantar la escoba");
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

                        System.out.println(x.getNombre()+"(Buscador - "+ x.getCasa()+") atrapo la Snitch Dorada");
                        snitch=true;
                        marcador1+=150;
                        a.setGanados(a.getGanados()+1);
                        b.setPerdidos(b.getPerdidos()+1);
                        System.out.println("El marcador es: "+a.getCasa()+ " " + marcador1 +" - " + marcador2 + " "+ b.getCasa()+" final");
                        break;
                    }
                    else
                    {
                        System.out.println(x.getNombre()+"(Buscador - "+ x.getCasa()+") no atrapo la Snitch Dorada");
                    }
                }
                if(jugada==2)
                {
                    int rand=1+random.nextInt(100);
                    flag=x.Trampa(rand);
                    if(flag)
                    {
                        System.out.println(x.getNombre()+"(Buscador - "+ x.getCasa()+") Pudo atraer la snitch con su varita");
                        a.setGanados(a.getGanados()+1);
                        b.setPerdidos(b.getPerdidos()+1);
                        marcador1+=150;
                        System.out.println("El marcador es: "+a.getCasa()+ " " + marcador1 +" - " + marcador2 + " "+ b.getCasa()+" final");
                        break;
                    }
                    else
                    {
                        System.out.println(x.getNombre()+"(Buscador - "+ x.getCasa()+") No pudo atraer la snitch con la varita, DESCALIFICADO DEL JUEGO");
                        b.setGanados(b.getGanados()+1);
                        a.setPerdidos(a.getPerdidos()+1);
                        snitch=true;
                        break;
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
                if(atajar2)
                {
                    System.out.println("El guardian no puede atajar");
                }
                else if(jugada==1)
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
                        System.out.println(x.getNombre()+"(Guadrian - "+ x.getCasa()+") Atajo un gol");
                    }
                    else
                    {
                        System.out.println(x.getNombre()+"(Guadrian - "+ x.getCasa()+") no atajo el gol");
                        marcador2+=10;
                    }
                }
                else if(jugada==2)
                {
                    int rand=1+random.nextInt(100);
                    flag=x.Trampa(rand);
                    if(flag)
                    {
                        System.out.println(x.getNombre()+"(Guadrian - "+ x.getCasa()+") Creo barreras invisibles frente a los aros");
                        barrera2=true;
                        contb2=3;
                    }
                    else
                    {
                        System.out.println(x.getNombre()+"(Guadrian - "+ x.getCasa()+") No pudo crear barreras, no puede atajar por 2 turnos");
                        atajar2=true;
                        conta2=3;
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
                            System.out.println(x.getNombre()+"(Golpeador - "+ x.getCasa()+") Ataco exitosamente");
                        }
                        else
                        {
                            System.out.println(x.getNombre()+"(Guadrian - "+ x.getCasa()+") no pudo atacar");

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
                            System.out.println(x.getNombre()+"(Golpeador - "+ x.getCasa()+") Defendio a su compañero");
                        }
                        else
                        {
                            System.out.println(x.getNombre()+"(Golpeador - "+ x.getCasa()+") no defendio a su compañero");

                        }
                    }

                }
                if(jugada==2)
                {
                    int rand=1+random.nextInt(100);
                    flag=x.Trampa(rand);
                    if(flag)
                    {
                        System.out.println(x.getNombre()+"(Golpeador - "+ x.getCasa()+") Creo una burbuja protectora");
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
                        System.out.println(x.getNombre()+"(Golpeador - "+ x.getCasa()+") No pudo crear burbujar protectoras");
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
                    if(flag||atajar1)
                    {
                        ((Cazador) x).setAgilidad(((Cazador) x).getAgilidad()+6);
                        ((Cazador) x).setVelocidad(((Cazador) x).getVelocidad()+6);
                        System.out.println(x.getNombre()+"(Cazador - "+ x.getCasa()+") Metio un gol");
                        marcador2+=10;
                    }
                    else
                    {
                        System.out.println(x.getNombre()+"(Cazador - "+ x.getCasa()+") no metio el gol");
                    }
                }
                if(jugada==2)
                {
                    int rand=1+random.nextInt(100);
                    flag=x.Trampa(rand);
                    if(flag)
                    {
                        System.out.println(x.getNombre()+"(Cazador - "+ x.getCasa()+") Encanto la escoba para volar mas rapido");
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
                        System.out.println(x.getNombre()+"(Cazador - "+ x.getCasa()+") No pudo encantar la escoba");
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

                        System.out.println(x.getNombre()+"(Buscador - "+ x.getCasa()+") atrapo la Snitch Dorada");
                        snitch=true;
                        b.setGanados(b.getGanados()+1);
                        a.setPerdidos(a.getPerdidos()+1);
                        marcador2+=150;
                        System.out.println("El marcador es: "+a.getCasa()+ " " + marcador1 +" - " + marcador2 + " "+ b.getCasa()+" final");
                        break;
                    }
                    else
                    {
                        System.out.println(x.getNombre()+"(Buscador - "+ x.getCasa()+") no atrapo la Snitch Dorada");
                    }
                }
                if(jugada==2)
                {
                    int rand=1+random.nextInt(100);
                    flag=x.Trampa(rand);
                    if(flag)
                    {
                        System.out.println(x.getNombre()+"(Buscador - "+ x.getCasa()+") Pudo atraer la snitch con su varita");
                        b.setGanados(b.getGanados()+1);
                        a.setPerdidos(a.getPerdidos()+1);
                        marcador2+=150;
                        System.out.println("El marcador es: "+a.getCasa()+ " " + marcador1 +" - " + marcador2 + " "+ b.getCasa()+" final");
                        break;
                    }
                    else
                    {
                        System.out.println(x.getNombre()+"(Buscador - "+ x.getCasa()+") No pudo atraer la snitch con la varita, DESCALIFICADO DEL JUEGO");
                        snitch=true;
                        a.setGanados(a.getGanados()+1);
                        b.setPerdidos(b.getPerdidos()+1);
                        break;
                    }
                }
            }

            //Test de contadores + impresion del marcador

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
            System.out.println("Desea seguir con el juego? (s/n)");
            char resp=leer.next().charAt(0);
            if(resp=='n'||resp=='N')
            {
                snitch=true;
                if(marcador1>marcador2)
                {
                    System.out.println(a.getCasa()+" gano la partida");
                }
                else if(marcador1<marcador2)
                {
                    System.out.println(b.getCasa()+" gano la partida");
                }
                else
                {
                    System.out.println("Empate!");
                }
                
            }
        }
    }

}
