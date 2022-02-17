package fr.encheres.bo;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

public class ConnexionForm {
	
	private static final String champPseudo  = "pseudo";
    private static final String champLogin   = "motDePasse";

    private String resultat;
    private Map<String, String> erreurs = new HashMap<String, String>();
    
    
    public String getResultat() {
        return resultat;
    }
    
    public Map<String, String> getErreurs() {
        return erreurs;
    }
    
    public Utilisateur connecterUtilisateur( HttpServletRequest request ) {
        /* Récupération des champs du formulaire */
        String pseudo = getValeurChamp( request, champPseudo );
        String motDePasse = getValeurChamp( request, champLogin );

        Utilisateur utilisateur = new Utilisateur();
        
        
        try {
            validationPseudo( pseudo );
        } catch ( Exception e ) {
            setErreur( champPseudo, e.getMessage() );
        }
        utilisateur.setPseudo( pseudo );
        
        
        try {
            validationMotDePasse( motDePasse );
        } catch ( Exception e ) {
            setErreur( champLogin, e.getMessage() );
        }
        utilisateur.setMotDePasse( motDePasse );
        
        if ( erreurs.isEmpty() ) {
            resultat = "Succès de la connexion.";
        } else {
            resultat = "Échec de la connexion.";
        }

        return utilisateur;
    }
    
    private void validationPseudo( String pseudo ) throws Exception
    	{
        if ( pseudo != null && !pseudo.matches( "([^.@]+)(\\.[^.@]+)*@([^.@]+\\.)+([^.@]+)" ) )
        {
            throw new Exception( "Merci de saisir des caractères valides." );
            
        }
        
    }
            
    private void validationMotDePasse( String motDePasse ) throws Exception {
    	 if ( motDePasse != null && !motDePasse.matches( "([^.@]+)(\\.[^.@]+)*@([^.@]+\\.)+([^.@]+)" ) )
         {
             throw new Exception( "Merci d'utiliser des caractères valides." );
    }
    }
    /*
     * Ajoute un message correspondant au champ spécifié à la map des erreurs.
     */
    private void setErreur( String champ, String message ) {
        erreurs.put( champ, message );
    }
    
    
    
    
    
    
        
        private static String getValeurChamp( HttpServletRequest request, String nomChamp ) {
            String valeur = request.getParameter( nomChamp );
            if ( valeur == null || valeur.trim().length() == 0 ) {
                return null;
            } else {
                return valeur;
            }
        }


}
