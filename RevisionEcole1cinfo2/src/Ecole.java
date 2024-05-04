public class Ecole {

    private String nom;
    private Etudiant[] etds;
    private int cmp=0;

    public Ecole(String nom) {
        this.nom = nom;
        etds=new Etudiant[500];
    }

    public void ajouterEtudiant(Etudiant e) throws EtudiantExisteException {
        if(rechercherEtudiant(e)!=-1)
            throw new EtudiantExisteException("L'etudiant existe");
        if(cmp<500){
            etds[cmp]=e;
            cmp++;
        }
    }


    public int rechercherEtudiant (Etudiant e){

        for(int i=0;i<cmp;i++)
            if(etds[i].equals(e))
                return i;
        return -1;
    }


   public float getMoyenneDes3A(){
        float moy=0;
        int nbr=0;
        for(int i=0;i<cmp;i++){
            if(etds[i].getClass()==Etudiant3eme.class)
            {
                nbr++;
                moy+=etds[i].getMoyenne();
            }
        }
        return moy/nbr;
   }

   public int moyenneSalaireAlternants(){
       int sal=0;
       int nbr=0;
       for(int i =0; i<cmp;i++){
           if(etds[i] instanceof EtudiantAlternance eta){
               nbr++;
               sal+=eta.getSalaire();
           }
       }
       return sal/nbr;
   }
    public int moyenneSalaireAlternants2(){
        int sal=0;
        int nbr=0;
        for(int i =0; i<cmp;i++){
            if(etds[i] instanceof EtudiantAlternance){
                nbr++;
                sal+=((EtudiantAlternance)etds[i]).getSalaire();
            }
        }
        return sal/nbr;
    }


    @Override
    public String toString() {
        String chaine="";
        for(int i=0;i<cmp;i++)
            chaine+=etds[i];
        return "Ecole{" +
                "nom='" + nom + '\'' +
                '}'+ " les etudiants : "+chaine;
    }


    public void supprimerEtudiant(Etudiant e){
        int pos=rechercherEtudiant(e);
        if(pos!=-1){
            etds[pos]=etds[cmp-1];
            cmp--;
        }
    }

    public void changerEcole(Etudiant etd, Ecole ecole){
            supprimerEtudiant(etd);
        try {
            ecole.ajouterEtudiant(etd);
        } catch (EtudiantExisteException e) {
            throw new RuntimeException(e);
        }
    }
}
