/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nyilvantarto;

import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;



/**
 *
 * @author Ádám
 */
public class Nyilvantarto implements Serializable {
//
//    private Scene scene;
//    private Felhasznalo aktFelhasznalo;
//    private ArrayList<Felhasznalo> felhasznalok;
//    private ArrayList<aru> aruk;
//    private int maxID = 0;
//
//    public int getMaxID() {
//        return maxID++;
//    }
//
//    public int getCurrentID() {
//        return maxID;
//    }
//
//    public void setMaxID(int maxID) {
//        this.maxID = maxID;
//    }
//
//    public Felhasznalo getaktFelhasznalo() {
//        return aktFelhasznalo;
//    }
//
//    public void setaktFelhasznalo(Felhasznalo aktFelhasznalo) {
//        this.aktFelhasznalo = aktFelhasznalo;
//    }
//
//    public ArrayList<Felhasznalo> getFelhasznalok() {
//        return felhasznalok;
//    }
//
//    public void setFelhasznalok(ArrayList<Felhasznalo> felhasznalok) {
//        this.felhasznalok = felhasznalok;
//    }
//
//    public ArrayList<aru> getAruk() {
//        return aruk;
//    }
//
//    public void setAruk(ArrayList<aru> aruk) {
//        this.aruk = aruk;
//    }
//
//    public Scene getScene() {
//        return scene;
//    }
//
//    public void setScene(Scene scene) {
//        this.scene = scene;
//    }
//
//    public Hibauzenetek getHiba() {
//        return hiba;
//    }
//
//    public Fajlkezeles getFajlkezeles() {
//        return fajlkezeles;
//    }
//
//    public Adatbaziskezeles getAdatbaziskezeles() {
//        return adatbaziskezeles;
//    }
//
//    public void aruImport() {
//
//    }
//
//    public void aruExport() {
//    }
//
//    public boolean aruTorles(aru toroltAru) {
//return false;
//    }
//
//    public boolean aruModositas(aru modositottAru, aru elozoAru) {
//return false;
//    }
//
//    public boolean aruHozzaad(aru ujAru) {
////        boolean allapot;
////        if (adatbaziskezeles.aruHozzaad(ujAru)) {
////            // Felvesszük az új elemet
////            aruk.add(ujAru);
////            // Egyből be is rendezzük ;)
////            Collections.sort(aruk);
//////            addLog(getaktFelhasznalo().getFnev() + " hozzáadta: " + ujAru.getNev());
////            addNaplo(new Naplo(getaktFelhasznalo().getFnev(), "Áru hozzáadás: " + ujAru.getNev()));
////            allapot = true;
////        } else {
////            allapot = false;
////        }
////        return allapot;
//return false;
//    }
//
//    public void aruFrissit() {
//        adatbaziskezeles.aruOlvasas(this);
//    }
//
//    public boolean felhasznaloHozzaadas(Felhasznalo ujFelhasznalo) {
//        boolean allapot;
//        if (adatbaziskezeles.felhasznaloHozzaad(ujFelhasznalo)) {
//            // Felvesszük az új felhasználót
//            felhasznalok.add(ujFelhasznalo);
//            // Egyből be is rendezzük ;)
//            Collections.sort(felhasznalok);
////            addLog(getaktFelhasznalo().getFnev() + " hozzáadott egy új felhasználót: " + ujFelhasznalo.getFnev());
//            addNaplo(new Naplo(getaktFelhasznalo().getFnev(), "Felhasználó hozzáadás: " + ujFelhasznalo.getFnev()));
//            allapot = true;
//        } else {
//            allapot = false;
//        }
//        return allapot;
//    }
//
//    public boolean felhasznaloTorles(Felhasznalo toroltFelhasznalo) {
//        // Törli az adott felhasználót az adatbázisból, true értékkel tér vissza, ha sikerült
//        boolean allapot = false;
//        switch (adatbaziskezeles.felhasznaloEllenoriz(toroltFelhasznalo)) {
//            case 0:
//                // Adatbázis törlés
//                if (adatbaziskezeles.felhasznaloTorol(toroltFelhasznalo)) {
//                    // Töröljük a felhasználót
//                    felhasznalok.remove(toroltFelhasznalo);
////                    addLog(getaktFelhasznalo().getFnev() + " törölt egy felhasználót: " + toroltFelhasznalo.getFnev());
//                    addNaplo(new Naplo(getaktFelhasznalo().getFnev(), "Felhasználó törlés: " + toroltFelhasznalo.getFnev()));
//                    allapot = true;
//                }
//                break;
//
//            case 1:
//                adatbaziskezeles.felhasznaloOlvasas(this);
//                hiba.adatbazisKesobbModositva();
//                break;
//
//            case 2:
//                adatbaziskezeles.felhasznaloOlvasas(this);
//                hiba.adatbazisNemtalalhato();
//                break;
//
//            default:
//                hiba.adatbazisHiba();
//        }
//        return allapot;
//    }
//
//    public void addNaplo(Naplo ujNaplo) {
//        adatbaziskezeles.naploHozzaad(ujNaplo);
//    }
//
//    public ArrayList<Naplo> getNaplo() {
//        return adatbaziskezeles.naploOlvasas(this);
//    }
//
//    public void clearNaplo() {
//        adatbaziskezeles.naploTisztitas();
//        addNaplo(new Naplo(getaktFelhasznalo().getFnev(), "Törölte a naplót"));
//    }
//
//    public Nyilvantarto() {
//        this.scene = new Scene(new StackPane());
//        this.fajlkezeles = new Fajlkezeles();
//        this.hiba = new Hibauzenetek();
//        this.adatbaziskezeles = new Adatbaziskezeles();
//        adatbaziskezeles.adatbazisInicializalas();
//        adatbaziskezeles.aruOlvasas(this);
//        adatbaziskezeles.felhasznaloOlvasas(this);
////        this.log = fajlkezeles.logOlvasas();
//    }
//
//    @Override
//    public void start(Stage stage) throws IOException {
//        showLoginScreen(stage);
//    }
//
//    public void showLoginScreen(Stage stage) {
////        try {
////            FXMLLoader loader = new FXMLLoader(getClass().getResource("Login.fxml"));
////            scene.setRoot((Parent) loader.load());
////            LoginController controller = loader.<LoginController>getController();
////            controller.initManager(this);
////            stage.setScene(scene);
////            stage.setTitle("Nyilvántartó - Belépés");
////            stage.setResizable(false);
////            // Ezzel megoldjuk az átméretezési hibát
////            stage.sizeToScene();
////            stage.show();
////            if (getFelhasznalok().size() == 1 && getFelhasznalok().get(0).getFnev().equals("admin")) {
////                getHiba().elsoInditas();
////            }
////        } catch (IOException ex) {
////            hiba.fajlHiba("Login.fxml");
////        }
//    }
//
//    public void showMainScreen() {
////        try {
////
////            FXMLLoader loader = new FXMLLoader(getClass().getResource("Main.fxml"));
////            scene.setRoot((Parent) loader.load());
////            MainController controller = loader.<MainController>getController();
////            controller.initManager(this);
////            Stage stage = new Stage();
////            stage.setScene(scene);
////            stage.setTitle("Nyilvántartó");
////            stage.show();
////        } catch (IOException ex) {
////            hiba.fajlHiba("Main.fxml");
////        }
//    }
//
//    // BETA
//    public void showAdminScreen() {
////        try {
////
////            FXMLLoader loader = new FXMLLoader(getClass().getResource("AdminPanel.fxml"));
////            Scene alma = new Scene((Parent) loader.load());
////            AdminPanelController controller = loader.<AdminPanelController>getController();
////
////            Stage stage = new Stage();
////            controller.initManager(this, stage);
////            stage.setScene(alma);
////            stage.setTitle("Nyilvántartó");
////            stage.showAndWait();
////
////        } catch (IOException ex) {
////            hiba.fajlHiba("AdminPanel.fxml");
////        }
//    }
//
//    // Platform.exit hívja meg, ekkor mentünk fájlba
//    @Override
//    public void stop() {
////        fajlkezeles.aruMentes(this);
////        fajlkezeles.felhasznaloMentes(this);
////        fajlkezeles.logMentes(this);
//        System.exit(0);
//    }
//
//    public void run(String[] args) {
//        System.out.println("START");
//        this.launch(args);
//        System.out.println("END");
//    }
//
////    public static void main(String[] args) {
////        new Nyilvantarto().run(args);
////    }
}
