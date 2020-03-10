package fr.uvsq;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;


/**
 * Tahoura Koniba Jean.
 */
public class UneClasseMetierTest 
    extends TestCase
{
    public void testAfficher()
    {
		UneClasseMetier c=new UneClasseMetier();
		String valeurAtendu="le test passe";
		
		if (c.afficher("le test passe") != valeurAtendu) {
		fail("le test a échoué");
        }
        
    }
}
