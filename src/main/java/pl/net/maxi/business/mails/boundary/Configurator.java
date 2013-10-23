/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.net.maxi.business.mails.boundary;

import javax.enterprise.inject.Produces;
import javax.enterprise.inject.spi.InjectionPoint;

/**
 *
 * @author luc
 */
public class Configurator {
    
    @Produces
    public String getString(InjectionPoint ip){
        Class<?> clazz = ip.getMember().getDeclaringClass();
        String clazzName = clazz.getSimpleName();
        return "abc@wp.pl ("+clazzName+")";
    }
}
