package ar.proyecto.boleto.service.imp;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;

import ar.proyecto.boleto.service.IEmailService;

public class EmailServiceImp implements IEmailService{

	@Autowired
	private JavaMailSender mailSender;
	
	@Override
	public void sendEmail(String correoDestino, String titulo, String cuerpo) {
		
		SimpleMailMessage mail = new SimpleMailMessage();
		
		mail.setTo(correoDestino);
		mail.setSubject(titulo);
		mail.setText(cuerpo);
		
		mailSender.send(mail);
	}

}
