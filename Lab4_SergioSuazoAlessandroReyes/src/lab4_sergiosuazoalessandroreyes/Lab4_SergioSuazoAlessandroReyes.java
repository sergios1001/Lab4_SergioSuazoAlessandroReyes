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
    















































































































































































































































































































































































































































































































}
