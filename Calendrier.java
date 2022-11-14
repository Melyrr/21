import java.util.Scanner;
public class Calendrier {
    public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in);
        System.out.println("Veuillez donnez un mois :");
        int mois = clavier.nextInt();
        System.out.println("et une année :");
        int année = clavier.nextInt();
        afficherTitre(mois,année);
        afficherEntête();
        afficherMois(numéroJour(1,mois,année),nombreJours(mois, année));
    }
        static String nomMois(int mois){
        String nomMois ="";
        switch(mois){
            case 1 :
            nomMois = "Janvier";
            break;  
            case 2 : 
            nomMois = "Février";
            break;
            case 3 : 
            nomMois = "Mars";
            break;
            case 4 : 
            nomMois = "Avril";
            break;
            case 5 : 
            nomMois = "Mai";
            break;
            case 6 : 
            nomMois = "Juin";
            break;
            case 7 : 
            nomMois = "Juillet";
            break;
            case 8 : 
            nomMois = "Aout";
            break;
            case 9 : 
            nomMois = "Septembre";
            break;
            case 10 : 
            nomMois = "Octobre";
            break;
            case 11 : 
            nomMois = "Novembre";
            break;
            case 12 : 
            nomMois = "Décembre";
            }
        return nomMois;
        }
        static void afficherTitre(int mois, int année){
            nomMois(mois);
            System.out.println("==========================");
            System.out.println("       " + nomMois(mois) +"  "+année);
            System.out.println("==========================");
        }
        static void afficherEntête(){
            System.out.println("Lu  Ma  Me  Je  Ve  Sa  Di");
        }
        static void afficherMois(int décalage, int nombreJours){
            int space;
            space=décalage;
            int count=0;
            while(count<space){
                System.out.print(" ");
                count++;
            }
            for(int i=1;i<=nombreJours;i++){
                if(i<10){
                    if((i+décalage)%7==0){
                        System.out.println("0"+i+"  ");
                    }else{
                        System.out.print("0"+i+"  ");
                    }
                }
                else{
                    if((i+décalage)%7==0){
                    System.out.println(i+"  ");
                }else{
                    System.out.print(i+"  ");
                }
            }
        }
    }
        static boolean estBissextile(int année){
            if(((année%4==0) && !(année%100==0)) || (année%400==0)){
                System.out.println("YES");
                return true;
            }else{
                System.out.println("NO");
                return false;
            }
        }
        static int nombreJours(int mois, int année){
            int nbJours=0;
            switch(mois){
                case 1 :
                nbJours = 31;
                break;  
                case 2 : 
                if(estBissextile(année)){nbJours=29;}else{nbJours=28;};
                break;
                case 3 : 
                nbJours = 31;
                break;
                case 4 : 
                nbJours = 30;
                break;
                case 5 : 
                nbJours = 31;
                break;
                case 6 : 
                nbJours = 30;
                break;
                case 7 : 
                nbJours = 31;
                break;
                case 8 : 
                nbJours = 31;
                break;
                case 9 : 
                nbJours = 30;
                break;
                case 10 : 
                nbJours = 31;
                break;
                case 11 : 
                nbJours = 30;
                break;
                case 12 : 
                nbJours = 31;
                }
            return nbJours;
        }
        static int numéroJour(int jour, int mois, int année){
            int h;
            int q = jour;
            int m=mois;
            int J=année/20;
            int K=année%100;
            h = (q+(((m+1)*13)/5)+K+(K/4)+(J/4)+5*J+5)%7;
            return h;
        }
    }