import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static Date parseDate(String date) {
        try {
            return new SimpleDateFormat("dd-MM-yyyy").parse(date);
        } catch (ParseException e) {
            return null;
        }
    }

    public static void sort(List<Artisan> artisanList) {
        artisanList.sort((artisan, t1) -> artisan.getCode().compareTo(t1.getCode()));
    }

    public static void main(String[] args) {
        List<Electricien> electricienList = new ArrayList<Electricien>();
        List<Plombier> plombierList = new ArrayList<Plombier>();
        List<Artisan> artisanList = new ArrayList<Artisan>();

        BufferedReader choix = new BufferedReader(new InputStreamReader(System.in));
        String string = "";
        int integer = 0;

        while (integer != 8) {
            //////////////////////
            // Afficher le menu //
            //////////////////////
            System.out.println("\n---------Menu Principal---------\n");
            System.out.println("1 - Ajouter un électricien");
            System.out.println("2 - Supprimer un électricien");
            System.out.println("3 - Lister les électriciens existants");
            System.out.println("4 - Ajouter un plombier");
            System.out.println("5 - Supprimer un plombier");
            System.out.println("6 - Lister les plombiers existants");
            System.out.println("7 - Lister les artisans existants en mettant en évidence la fonction (Électricien ou Plombier)");
            System.out.println("8 - Quitter le programme");

            try {
                System.out.println("\nFaites votre choix (1, 2, 3, ...)");
                string = choix.readLine();
                integer = Integer.parseInt(string);
            } catch (IOException e) {
                e.printStackTrace();
            }

            ////////////////////////////////
            // 1 - Ajouter un électricien //
            ////////////////////////////////
            if(integer == 1){
                System.out.println("\n---------Ajouter un électricien---------\n");
                BufferedReader addElec = new BufferedReader(new InputStreamReader(System.in));
                String code = "";
                String prenom = "";
                String nom = "";
                String dateDebutCarriere = null;
                String StrNbPuissanceMaitrisee = "";
                int intNbPuissanceMaitrisee = 0;
                try {
                    System.out.println("Saisir le Code :");
                    code = addElec.readLine();
                    System.out.println("Saisir le Prénom :");
                    prenom = addElec.readLine();
                    System.out.println("Saisir le Nom :");
                    nom = addElec.readLine();
                    System.out.println("Saisir la Date du début de carrière (ex:25-12-2021):");
                    dateDebutCarriere = addElec.readLine();
                    System.out.println("Saisir le Nombre de Puissance Maitrisée :");
                    StrNbPuissanceMaitrisee = addElec.readLine();
                    intNbPuissanceMaitrisee = Integer.parseInt(StrNbPuissanceMaitrisee);

                    if (electricienList.isEmpty()){
                        electricienList.add(new Electricien(code, prenom, nom, parseDate(dateDebutCarriere), intNbPuissanceMaitrisee));
                        artisanList.add(new Electricien(code, prenom, nom, parseDate(dateDebutCarriere), intNbPuissanceMaitrisee));
                        System.out.println("\n☑ Électricien ajouté avec succès");
                    } else {
                        for (Artisan artisan : artisanList) {
                            if (artisan.getCode().equals(code)) {
                                System.out.println("\nUn artisan possède déjà ce code");
                            } else {
                                electricienList.add(new Electricien(code, prenom, nom, parseDate(dateDebutCarriere), intNbPuissanceMaitrisee));
                                artisanList.add(new Electricien(code, prenom, nom, parseDate(dateDebutCarriere), intNbPuissanceMaitrisee));
                                System.out.println("\n☑ Électricien ajouté avec succès");
                            }
                            break;
                        }
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            //////////////////////////////////
            // 2 - Supprimer un électricien //
            //////////////////////////////////
            if(integer == 2){
                System.out.println("\n---------Supprimer un électricien---------\n");
                BufferedReader removeElec = new BufferedReader(new InputStreamReader(System.in));
                String code = "";
                try {
                    System.out.println("Liste des électriens :");
                    for (Electricien i : electricienList) {
                        System.out.println(i.getCode() + " - " + i.getNom() + " - " + i.getPrenom());
                    }
                    System.out.println("Entrez le code de l'électricien à supprimer :");
                    code = removeElec.readLine();
                    try {
                        for (Electricien electricien : electricienList) {
                            if (electricien.getCode().equals(code)) {
                                electricienList.remove(electricien);
                                break;
                            }
                        }
                        for (Artisan artisan : artisanList) {
                            if (artisan.getCode().equals(code)) {
                                artisanList.remove(artisan);
                                break;
                            }
                        }
                        System.out.println("\n☑ Électricien supprimer avec succès");
                    } catch (Exception e) {
                        System.out.println("\nCe code pointe aucun électricien");
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            ///////////////////////////////////////////
            // 3 - Lister les électriciens existants //
            ///////////////////////////////////////////
            if(integer == 3){
                System.out.println("\n---------Liste électriciens---------\n");
                if (electricienList.isEmpty()){
                    System.out.println("Il n'y a aucun électriciens");
                } else {
                    for (Electricien electricien : electricienList) {
                        System.out.println(electricien.toString());
                    }
                }
            }

            /////////////////////////////
            // 4 - Ajouter un plombier //
            /////////////////////////////
            if(integer == 4){
                System.out.println("\n---------Ajouter un plombier---------\n");
                BufferedReader addPlom = new BufferedReader(new InputStreamReader(System.in));
                String code = "";
                String prenom = "";
                String nom = "";
                String dateDebutCarriere = null;
                String StrNbMarqueCertifiee = "";
                int intNbMarqueCertifiee = 0;
                try {
                    System.out.println("Saisir le Code :");
                    code = addPlom.readLine();
                    System.out.println("Saisir le Prénom :");
                    prenom = addPlom.readLine();
                    System.out.println("Saisir le Nom :");
                    nom = addPlom.readLine();
                    System.out.println("Saisir la Date du début de carrière (ex:25-12-2021):");
                    dateDebutCarriere = addPlom.readLine();
                    System.out.println("Saisir le Nombre de Marque Certifiée :");
                    StrNbMarqueCertifiee = addPlom.readLine();
                    intNbMarqueCertifiee = Integer.parseInt(StrNbMarqueCertifiee);

                    if (plombierList.isEmpty()) {
                        plombierList.add(new Plombier(code, prenom, nom, parseDate(dateDebutCarriere), intNbMarqueCertifiee));
                        artisanList.add(new Plombier(code, prenom, nom, parseDate(dateDebutCarriere), intNbMarqueCertifiee));
                        System.out.println("\n☑ Plombier ajouté avec succès");
                    } else {
                        for (Artisan artisan : artisanList) {
                            if (artisan.getCode().equals(code)) {
                                System.out.println("\nUn artisan possède déjà ce code");
                            } else {
                                plombierList.add(new Plombier(code, prenom, nom, parseDate(dateDebutCarriere), intNbMarqueCertifiee));
                                artisanList.add(new Plombier(code, prenom, nom, parseDate(dateDebutCarriere), intNbMarqueCertifiee));
                                System.out.println("\n☑ Plombier ajouté avec succès");
                            }
                            break;
                        }
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            //////////////////////////////////
            // 5 - Supprimer un plombier //
            //////////////////////////////////
            if(integer == 5){
                System.out.println("\n---------Supprimer un plombier---------\n");
                BufferedReader removePlom = new BufferedReader(new InputStreamReader(System.in));
                String code = "";
                try {
                    System.out.println("Liste des plombiers :");
                    for (Plombier i : plombierList) {
                        System.out.println(i.getCode() + " - " + i.getNom() + " - " + i.getPrenom());
                    }
                    System.out.println("Entrez le code du plombier à supprimer :");
                    code = removePlom.readLine();
                    try {
                        for (Plombier plombier : plombierList) {
                            if (plombier.getCode().equals(code)) {
                                plombierList.remove(plombier);
                                break;
                            }
                        }
                        for (Artisan artisan : artisanList) {
                            if (artisan.getCode().equals(code)) {
                                artisanList.remove(artisan);
                                break;
                            }
                        }
                        System.out.println("\n☑ Plombier supprimer avec succès");
                    } catch (Exception e) {
                        System.out.println("\nCe code pointe aucun plombier");
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            ////////////////////////////////////////
            // 6 - Lister les plombiers existants //
            ////////////////////////////////////////
            if(integer == 6){
                System.out.println("\n---------Liste plombiers---------\n");
                if (plombierList.isEmpty()) {
                    System.out.println("Il n'y a aucun plombiers");
                } else {
                    for (Plombier i : plombierList) {
                        System.out.println(i.toString());
                    }
                }
            }

            ///////////////////////////////////////
            // 7 - Lister les artisans existants //
            ///////////////////////////////////////
            if(integer == 7){
                System.out.println("\n---------Liste artisans---------\n");
                if (artisanList.isEmpty()) {
                    System.out.println("Il n'y a aucun artisans");
                } else {
                    sort(artisanList);
                    for (Artisan i : artisanList) {
                        System.out.println(i.toStringArtisans());
                    }
                }
            }
        }
    }
}