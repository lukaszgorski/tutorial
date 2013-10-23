package pl.net.maxi.business.mails.boundary;

import javax.ejb.Stateless;
import javax.inject.Inject;

/**
 *
 * @author luc
 */
@Stateless
public class MailsGenerator {
    
    @Inject
    String mailes;
    
    public String mailes(){
    return mailes;

}
    
}
