package ec.com.eeasa.dp.server;

import java.io.Serializable;
import java.util.Properties;

import javax.mail.BodyPart;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;

public class EnviarMail  implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public EnviarMail() {
	
		// TODO Auto-generated constructor stub
	}
	public String enviarSimpleMail(String inCorreoRecibe, String inAsunto, String inMensaje) {
	    String respuesta="false";    
	    
	    // La direcci�n de la cuenta de env�o (from)
	    String correo_sisgerh = "sisgerh@eeasa.com.ec";
	    	    
	    // El servidor (host). En este caso usamos localhost
	    String host = "172.16.1.21";

	    try{
	    // Obtenemos las propiedades del sistema
		    Properties propiedades = System.getProperties();	
		    // Configuramos el servidor de correo
		    propiedades.setProperty("mail.smtp.host", host);
		    propiedades.put("mail.smtp.host", host);
		    propiedades.put("mail.smtp.port", "25");
	
		    // Obtenemos la sesi�n por defecto
		    Session sesion = Session.getDefaultInstance(propiedades);

	    
		      // Creamos un objeto mensaje tipo MimeMessage por defecto.
		      MimeMessage mensaje = new MimeMessage(sesion);
	
		      // Asignamos el �de o from� al header del correo.
		      mensaje.setFrom(new InternetAddress(correo_sisgerh));
	
		      // Asignamos el �para o to� al header del correo.	      	      
		      mensaje.addRecipient(Message.RecipientType.TO, new InternetAddress(inCorreoRecibe));	      		      	          	      
	
		      // Asignamos el asunto
		      mensaje.setSubject(inAsunto);

		      // Creamos un cuerpo del correo con ayuda de la clase BodyPart
		      BodyPart cuerpoMensaje = new MimeBodyPart();
	
		      // Asignamos el texto del correo
		      cuerpoMensaje.setContent(inMensaje,"text/html");
	
		      // Creamos un multipart al correo
		      Multipart multipart = new MimeMultipart();
	
		      // Agregamos el texto al cuerpo del correo multiparte
		      multipart.addBodyPart(cuerpoMensaje);		      

	      // Asignamos al mensaje todas las partes que creamos anteriormente
	      mensaje.setContent(multipart);
	      
	      // Enviamos el correo
	      Transport.send(mensaje);
	      respuesta = "true";
	    } catch (MessagingException e) {	      
	      respuesta = e.getMessage();
	      e.printStackTrace();	    
		}
	    
	    return respuesta;
	  }	
}
